package com.rs.client.service;

import com.rs.client.generated.*;
import com.rs.client.model.*;
import com.rs.client.utils.XmlUnmarshaller;
import com.rs.client.utils.XmlUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.List;

public class WayBillService {

    private WayBillsSoap wayBillsSoap;

    private WayBillsSoap getWayBillsSoap() {
        if (wayBillsSoap == null) {
            synchronized (WayBillsSoap.class) {
                if (wayBillsSoap == null) {
                    wayBillsSoap = new WayBills().getWayBillsSoap();
                }
            }
        }
        return wayBillsSoap;
    }

    public WayBillsResponse getWayBills(String su, String sp, String iTypes, String buyerTin, Date beginDateS, Date beginDateE, String wayBillNumber) {

        XMLGregorianCalendar beginDateStart = XmlUtils.getXmlDateFormat(beginDateS);
        XMLGregorianCalendar beginDateEnd = XmlUtils.getXmlDateFormat(beginDateE);

        GetWaybillsResponse.GetWaybillsResult waybillsResult = getWayBillsSoap().getWaybills(su, sp, iTypes, buyerTin, null, null, beginDateStart,
                beginDateEnd, beginDateStart, beginDateEnd, null, null, null,
                null, wayBillNumber, null, null, null, null);
        WayBillsResponse wayBillsResponse = XmlUnmarshaller.getObjectFromXml(waybillsResult.getContent().get(0), WayBillsResponse.class);

        return wayBillsResponse;
    }

    public WayBillById getWaybillById(String su, String sp, int waybillId) {
        WayBillById wayBillById = XmlUnmarshaller.getObjectFromXml(getWayBillsSoap().getWaybill(su, sp, waybillId).getContent().get(0), WayBillById.class);
        return wayBillById;

    }

    public Result saveWaybill(String su, String sp, WayBillById billById) {
        SaveWaybill.Waybill waybill = new SaveWaybill.Waybill();

        waybill.getContent().add(billById);
        SaveWaybillResponse.SaveWaybillResult saveWaybillResult = getWayBillsSoap().saveWaybill(su, sp, waybill);
        Integer someint;
        return XmlUnmarshaller.getObjectFromXml(saveWaybillResult.getContent().get(0), Result.class);


    }

    public WayBillById getWaybillById(String su, String sp, Integer waybillId) {
        GetWaybillResponse.GetWaybillResult waybill = getWayBillsSoap().getWaybill(su, sp, waybillId);
        WayBillById wayBillById = (WayBillById) waybill.getContent().get(0);


//        WayBillById objectFromXml = XmlUnmarshaller.getObjectFromXml(waybill.getContent().get(0), WayBillById.class);

        return wayBillById;

    }

    public Boolean confirmWaybill(String su, String sp, Integer waybillId) {
        boolean confirmWaybill = getWayBillsSoap().confirmWaybill(su, sp, waybillId);
        return confirmWaybill;
    }


    public String activateWaybill(String su, String sp, Integer waybillId) {
        return getWayBillsSoap().sendWaybill(su, sp, waybillId);
    }

    public void getErrorCodes(String su, String sp) {
        Object errorCodes = getWayBillsSoap().getErrorCodes(su, sp).getContent().get(0);
        ERROR_CODES error_codes = XmlUnmarshaller.getObjectFromXml(errorCodes, ERROR_CODES.class);
        List<ERROR_CODE> ec = error_codes.getERROR_CODE();
        for (int i = 0; i < ec.size(); i++) {
            ERROR_CODE code = ec.get(i);
            if (code.TYPE == 1) {
                System.out.println("NEEDSTOADDVALUE" + i + "(\"" + code.getTEXT() + "\"," + 400 + "," + code.getID() + "),");

            }
        }
    }

}
