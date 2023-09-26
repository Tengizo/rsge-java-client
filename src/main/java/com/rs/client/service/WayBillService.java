package com.rs.client.service;

import com.rs.client.generated.*;
import com.rs.client.model.SaveWaybillRequest;
import com.rs.client.model.WayBill;
import com.rs.client.model.WayBillById;
import com.rs.client.model.WayBillsResponse;
import com.rs.client.model.request.waybill;
import com.rs.client.utils.XmlUnmarshaller;
import com.rs.client.utils.XmlUtils;
import jakarta.xml.ws.WebServiceFeature;

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

    public WayBillById saveWaybill(String su, String sp, SaveWaybillRequest wayBill) {

        SaveWaybillResponse.SaveWaybillResult saveWaybillResult = getWayBillsSoap().saveWaybill(su, sp, Mapper.getSoapModel(wayBill));
        WayBills wayBills = new WayBills();
//        WayBillsSoap wayBillsSoap12 = wayBills.getWayBillsSoap12();
//        SaveWaybillResponse.SaveWaybillResult waybillResult = wayBillsSoap12.saveWaybill(su, sp, Mapper.getSoapModel(wayBill));

        WayBillById wayBillById = XmlUnmarshaller.getObjectFromXml(saveWaybillResult.getContent().get(0), WayBillById.class);
        return wayBillById;


    }


}
