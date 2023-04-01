
package com.bai2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bai2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckOrderStatusResponse_QNAME = new QName("http://duc.com/", "checkOrderStatusResponse");
    private final static QName _CheckOrderStatus_QNAME = new QName("http://duc.com/", "checkOrderStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bai2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckOrderStatus }
     * 
     */
    public CheckOrderStatus createCheckOrderStatus() {
        return new CheckOrderStatus();
    }

    /**
     * Create an instance of {@link CheckOrderStatusResponse }
     * 
     */
    public CheckOrderStatusResponse createCheckOrderStatusResponse() {
        return new CheckOrderStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://duc.com/", name = "checkOrderStatusResponse")
    public JAXBElement<CheckOrderStatusResponse> createCheckOrderStatusResponse(CheckOrderStatusResponse value) {
        return new JAXBElement<CheckOrderStatusResponse>(_CheckOrderStatusResponse_QNAME, CheckOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://duc.com/", name = "checkOrderStatus")
    public JAXBElement<CheckOrderStatus> createCheckOrderStatus(CheckOrderStatus value) {
        return new JAXBElement<CheckOrderStatus>(_CheckOrderStatus_QNAME, CheckOrderStatus.class, null, value);
    }

}
