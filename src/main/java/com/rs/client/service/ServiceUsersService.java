package com.rs.client.service;

import com.rs.client.generated.GetServiceUsersResponse;
import com.rs.client.generated.WayBills;
import com.rs.client.generated.WayBillsSoap;
import com.rs.client.model.ServiceUser;
import com.rs.client.model.ServiceUsers;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;


public class ServiceUsersService {


    public void getServiceUsers() {

        WayBills wayBills = new WayBills();
        WayBillsSoap wayBillsSoap = wayBills.getWayBillsSoap();
        GetServiceUsersResponse.GetServiceUsersResult serviceUsers = wayBillsSoap.getServiceUsers("tbili2si", "123456");
        ArrayList<ServiceUser> users = getObjectFromXml(serviceUsers.getContent());
        assert users != null;
        users.forEach(e -> System.out.println(e.toString()));

    }

    private ArrayList<ServiceUser> getObjectFromXml(List<Object> serviceUsers) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ServiceUsers.class);
            Unmarshaller um = jaxbContext.createUnmarshaller();
            ServiceUsers serviceUsersOBj = (ServiceUsers) um.unmarshal((Node) serviceUsers.get(0));
            return (ArrayList<ServiceUser>) serviceUsersOBj.getServiceUsers();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
