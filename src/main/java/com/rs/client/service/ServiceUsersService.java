package com.rs.client.service;

import com.rs.client.generated.GetServiceUsersResponse;
import com.rs.client.generated.WayBills;
import com.rs.client.generated.WayBillsSoap;
import com.rs.client.model.ServiceUsers;
import com.rs.client.utils.XmlUnmarshaller;


public class ServiceUsersService {


    public ServiceUsers getServiceUsers(String userName, String userPassword) {

        WayBills wayBills = new WayBills();
        WayBillsSoap wayBillsSoap = wayBills.getWayBillsSoap();
        GetServiceUsersResponse.GetServiceUsersResult serviceUsers = wayBillsSoap.getServiceUsers(userName, userPassword);
        ServiceUsers users = XmlUnmarshaller.getObjectFromXml(serviceUsers.getContent().get(0), ServiceUsers.class);
        assert users != null;
        users.getServiceUsers().forEach(e -> System.out.println(e.toString()));
        return users;
    }



}
