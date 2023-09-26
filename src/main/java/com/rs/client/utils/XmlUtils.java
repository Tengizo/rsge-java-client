package com.rs.client.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rs.client.exceptions.ExceptionType;
import com.rs.client.exceptions.RsClientException;
import com.rs.client.model.Result;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.w3c.dom.Node;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;

public class XmlUtils {

    public static <T> Object mapObjectToXml(Object obj){

        XmlMapper xmlMapper = new XmlMapper();

        String value = null;
        try {
            value = xmlMapper.writeValueAsString(obj);
        }  catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return value;

    }

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

    public static <T> Object  getXmlFromObject(Object obj, Class<T> cls) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(cls);
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
