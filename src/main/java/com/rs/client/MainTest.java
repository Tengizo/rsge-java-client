package com.rs.client;

import com.rs.client.generated.*;

public class MainTest {
    public static void main(String[] args) {
        WayBills wayBills = new WayBills();
        WayBillsSoap soap = wayBills.getWayBillsSoap();
//        System.out.println(soap.whatIsMyIp());
//        GetErrorCodesResponse.GetErrorCodesResult errorCodes = soap.chekServiceUser("03001021696", "Vano.Gejadze10");
//        soap.chekServiceUser("itana:206322102", "123456", new Holder<>(true), new Holder<>(206322102), new Holder<>(206322102));
        GetWaybillTypesResponse.GetWaybillTypesResult waybillTypes = soap.getWaybillTypes("itana:206322102", "123456");
        GetWaybillsResponse.GetWaybillsResult result2 = soap.getWaybills("tbilisi", "123456",
                null, null, null, null,
                null, null, null, null, null,
                null, null, null, null,
                null, null, null, null);
        GetWaybillsV1Response.GetWaybillsV1Result result3 = soap.getWaybillsV1("tbilisi", "123456",
                null, null, null);
        System.out.println(result2);
    }
}
