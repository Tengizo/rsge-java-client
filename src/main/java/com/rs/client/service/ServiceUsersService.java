package com.rs.client.service;

import com.rs.client.exceptions.RsClientException;
import com.rs.client.exceptions.ExceptionType;
import com.rs.client.generated.GetServiceUsersResponse;
import com.rs.client.generated.WayBills;
import com.rs.client.generated.WayBillsSoap;
import com.rs.client.model.Result;
import com.rs.client.model.ServiceUser;
import com.rs.client.model.ServiceUsers;
import com.rs.client.util.XmlUnmarshaller;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.w3c.dom.Node;

import java.util.ArrayList;


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
