package com.rs.client.service;

import com.rs.client.generated.GetWaybillsResponse;
import com.rs.client.generated.WayBills;
import com.rs.client.generated.WayBillsSoap;
import com.rs.client.model.WayBillsResponse;
import com.rs.client.util.XmlUnmarshaller;

public class WayBillService {


    public WayBillsResponse getWayBills(String su, String sp) {

        WayBills wayBills = new WayBills();
        WayBillsSoap wayBillsSoap = wayBills.getWayBillsSoap();

        GetWaybillsResponse.GetWaybillsResult waybillsResult = wayBillsSoap.getWaybills(su, sp, "2", null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null);
        WayBillsResponse wayBillsResponse = XmlUnmarshaller.getObjectFromXml(waybillsResult.getContent().get(0), WayBillsResponse.class);

        return wayBillsResponse;
    }

}
