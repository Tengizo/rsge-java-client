package com.rs.client.utils;

import com.rs.client.exceptions.ExceptionType;
import com.rs.client.exceptions.RsClientException;
import com.rs.client.model.Result;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.w3c.dom.Node;

public class XmlUnmarshaller {

    public static <T> T getObjectFromXml(Object xmlObj, Class<T> cls) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(cls);
            Unmarshaller um = jaxbContext.createUnmarshaller();
            Object unmarshal = um.unmarshal((Node) xmlObj);
            T result = cls.cast(unmarshal);
            if (cls == Result.class) {
                errorCheck((Result) result);
            }
            return result;
        } catch (JAXBException e) {
            try {
                JAXBContext context = JAXBContext.newInstance(Result.class);
                Unmarshaller umError = context.createUnmarshaller();
                Result result = (Result) umError.unmarshal((Node) xmlObj);

                ExceptionType exType = ExceptionType.findByStatusCode(result.getSTATUS());
                if (exType != null) {
                    throw new RsClientException(exType.getKeyWord(), exType, exType.getRsStatus());
                }

            } catch (JAXBException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return null;
    }

    private static void errorCheck(Result cast) {
        ExceptionType exType = ExceptionType.findByStatusCode(cast.getSTATUS());
        if (exType != null) {
            throw new RsClientException(exType.getKeyWord(), exType, exType.getRsStatus());
        }
    }


}
