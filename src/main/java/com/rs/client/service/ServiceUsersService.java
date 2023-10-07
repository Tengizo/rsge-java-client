package com.rs.client.service;

import com.rs.client.generated.GetServiceUsersResponse;
import com.rs.client.generated.WayBills;
import com.rs.client.generated.WayBillsSoap;
import com.rs.client.model.CheckServiceUserResponse;
import com.rs.client.model.ServiceUser;
import com.rs.client.model.ServiceUsers;
import com.rs.client.utils.XmlUnmarshaller;
import jakarta.xml.ws.Holder;

import java.util.Optional;


public class ServiceUsersService {


    private static WayBillsSoap wayBillsSoap;

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

    public ServiceUser getCurrentUser(String userName, String userPassword, String serviceUsername) {

        GetServiceUsersResponse.GetServiceUsersResult serviceUsers = getWayBillsSoap().getServiceUsers(userName, userPassword);
        ServiceUsers users = XmlUnmarshaller.getObjectFromXml(serviceUsers.getContent().get(0), ServiceUsers.class);
        assert users != null;
        Optional<ServiceUser> currentUser = users.getServiceUsers().stream().filter(user -> user.getUSER_NAME().equals(serviceUsername)).findFirst();
        users.getServiceUsers().forEach(e -> System.out.println(e.toString()));
        return currentUser.get();
    }

    public CheckServiceUserResponse checkServiceUser(String su, String sp) {
        Holder<Integer> integerHolder = new Holder<>(1);
        Holder<Boolean> booleanHolder = new Holder<>(true);


        getWayBillsSoap().chekServiceUser(su, sp, booleanHolder, integerHolder, integerHolder);


        return null;
    }

}
