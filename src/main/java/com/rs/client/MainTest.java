package com.rs.client;

import com.rs.client.generated.*;
import com.rs.client.model.ServiceUsers;
import com.rs.client.model.WayBillsResponse;
import com.rs.client.service.ServiceUsersService;
import com.rs.client.service.WayBillService;
import jakarta.xml.ws.Holder;

public class MainTest {
    public static void main(String[] args) {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpThreshold", "999999999");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpThreshold", "999999999");
        WayBills wayBills = new WayBills();
        WayBillsSoap soap = wayBills.getWayBillsSoap();
//        System.out.println(soap.whatIsMyIp());
//        GetErrorCodesResponse.GetErrorCodesResult errorCodes = soap.chekServiceUser("03001021696", "Vano.Gejadze10");
        GetServiceUsersResponse.GetServiceUsersResult tbilisi = soap.getServiceUsers("tbilisi", "123456");
//        Object k = soap.chekServiceUser("", "123456");
        System.out.println("");


        ServiceUsersService serviceUsersService = new ServiceUsersService();
        serviceUsersService.getServiceUsers("tbilisi", "123456");

        WayBillService wayBillService = new WayBillService();
        WayBillsResponse resp = wayBillService.getWayBills("KAXALAKALADZE:206322102", "kaxala");
        resp.getWayBill().forEach(e-> System.out.println(e.toString()));
    }
}
