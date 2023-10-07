package com.rs.client;

import com.rs.client.model.*;
import com.rs.client.service.ServiceUsersService;
import com.rs.client.service.WayBillService;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
2        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpThreshold", "999999999");
//        WayBills wayBills = new WayBills();
//        WayBillsSoap soap = wayBills.getWayBillsSoap();
////        System.out.println(soap.whatIsMyIp());
////        GetErrorCodesResponse.GetErrorCodesResult errorCodes = soap.chekServiceUser("03001021696", "Vano.Gejadze10");
//        GetServiceUsersResponse.GetServiceUsersResult tbilisi = soap.getServiceUsers("tbilisi", "123456");
////        Object k = soap.chekServiceUser("", "123456");
//        System.out.println("");
//

        ServiceUsersService serviceUsersService = new ServiceUsersService();
        serviceUsersService.getCurrentUser("tbilisi", "123456", "KAXALAKALADZE:206322102");

        WayBillService wayBillService = new WayBillService();
//        Date beginDateS = new Date(System.currentTimeMillis() - 200000000);
//        Date beginDateE = new Date(System.currentTimeMillis());
//        WayBillsResponse resp = wayBillService.getWayBills("KAXALAKALADZE:206322102", "kaxala", "2", null, beginDateS, beginDateE, "0766277745/1");
//        resp.getWayBill().forEach(e -> System.out.println(e.toString()));
//        wayBillService.getWaybillById("KAXALAKALADZE:206322102", "kaxala", 804613329);

        Result result = wayBillService.saveWaybill("KAXALAKALADZE:206322102", "kaxala", createWaybill());

        WayBillById waybillById = wayBillService.getWaybillById("KAXALAKALADZE:206322102", "kaxala", result.getID());
        System.out.println(waybillById.toString());

        String waybillNumber = wayBillService.activateWaybill("KAXALAKALADZE:206322102", "kaxala", result.getID());
        System.out.println(" გააქტიურებული ზედნადების ნომერია:--->>> " + waybillNumber);

//        Boolean confirmation = wayBillService.confirmWaybill("KAXALAKALADZE:206322102", "kaxala", 807966716);
//        System.out.println(confirmation);


//        wayBillService.getErrorCodes("KAXALAKALADZE:206322102", "kaxala");

    }

    private static WayBillById createWaybill() {

        WayBillById wayBillById = new WayBillById();
        GOODS_LIST goods_list = new GOODS_LIST();
        GOODS goods = new GOODS();
        goods.setA_ID("0");
        goods.setID(4692880722L);
        goods.setSTATUS(1);
        goods.setAMOUNT(8.0);
        goods.setUNIT_ID(2);
        goods.setBAR_CODE("12");
        goods.setPRICE(2.0);
        goods.setQUANTITY(10.0);
        goods.setVAT_TYPE(0);
        goods.setW_NAME("MANGO");
        goods.setSTATUS(1);
        GOODS goods2 = new GOODS();
        goods2.setA_ID("0");
        goods2.setID(4692880723L);
        goods2.setSTATUS(1);
        goods2.setAMOUNT(400.0);
        goods2.setUNIT_ID(2);
        goods2.setBAR_CODE("1124");
        goods2.setPRICE(20.0);
        goods2.setQUANTITY(20.0);
        goods2.setVAT_TYPE(0);
        goods2.setW_NAME("ZANGO");
        goods2.setSTATUS(1);


        ArrayList<GOODS> goodsArrayList = new ArrayList<>();
        goodsArrayList.add(goods);
        goodsArrayList.add(goods2);
        goods_list.setGOODS(goodsArrayList);
        wayBillById.setGOODS_LIST(goods_list);

        wayBillById.setID("808092026");
        wayBillById.setWAYBILL_NUMBER("0770721640");
        wayBillById.setBUYER_NAME("სატესტოk სატესტოk");
        wayBillById.setBUYER_TIN("12345678910");
        wayBillById.setCHEK_BUYER_TIN(1);
        wayBillById.setDRIVER_NAME("ბახვა ხორავა");
        wayBillById.setDRIVER_TIN("11111111111");
        wayBillById.setCHEK_DRIVER_TIN(0);
        wayBillById.setCAR_NUMBER("BA152XV");
        wayBillById.setSTART_ADDRESS("გერმანიის #21");
        wayBillById.setEND_ADDRESS("საფრანგეთის #36");
        wayBillById.setTYPE(2);
        wayBillById.setID("0");
        wayBillById.setSELER_UN_ID("731937");
        wayBillById.setTRANS_ID("1");
//        wayBillById.setFULL_AMOUNT(8.0);
        wayBillById.setSTATUS(0);


        return wayBillById;


    }
}
