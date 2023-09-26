package com.rs.client.generated;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rs.client.model.SaveWaybillRequest;
import com.rs.client.model.WayBill;
import com.rs.client.model.WayBillById;
import com.rs.client.model.request.waybill;
import com.rs.client.utils.XmlUtils;

import java.util.ArrayList;

public class Mapper {


    public static SaveWaybill.Waybill getSoapModel(SaveWaybillRequest wayBill) {
        SaveWaybill.Waybill soapWayBill = new SaveWaybill.Waybill();
        ArrayList<Object> content = new ArrayList<>();


        String xml = (String)XmlUtils.getXmlFromObject(wayBill.getWAYBILL(), WayBillById.class);
        String substring = xml.substring(55);

//        content.add((Object) xml);
        content.add(wayBill.getWAYBILL());

//        content.add(XmlUtils.mapObjectToXml(wayBill));

//        content.add(wayBill.getWAYBILL());

        SaveWaybill saveWaybill = new SaveWaybill();
        saveWaybill.sp = "kaxala";
        saveWaybill.su = "KAXALAKALADZE:206322102";

        saveWaybill.setWaybill(soapWayBill);

        soapWayBill.content = content;

        Object xml1 = XmlUtils.getXmlFromObject(saveWaybill, SaveWaybill.class);
        return soapWayBill;
    }

}
