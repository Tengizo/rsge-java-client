package com.rs.client.utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;

public class XmlUtils {


    public static XMLGregorianCalendar getXmlDateFormat(Date date) {
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        try {
            xmlDate = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xmlDate;
    }

    public static String getXmlFromObject(Object obj) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
            Marshaller ma = jaxbContext.createMarshaller();
            StringWriter writer = new StringWriter();
            ma.marshal(obj, writer);

            return (writer.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
