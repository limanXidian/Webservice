
package xidian.services.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xidian.services.webservice package. 
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

    private final static QName _HelloserverResponse_QNAME = new QName("http://server.services.xidian/", "helloserverResponse");
    private final static QName _Helloserver_QNAME = new QName("http://server.services.xidian/", "helloserver");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xidian.services.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Helloserver }
     * 
     */
    public Helloserver createHelloserver() {
        return new Helloserver();
    }

    /**
     * Create an instance of {@link HelloserverResponse }
     * 
     */
    public HelloserverResponse createHelloserverResponse() {
        return new HelloserverResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloserverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.services.xidian/", name = "helloserverResponse")
    public JAXBElement<HelloserverResponse> createHelloserverResponse(HelloserverResponse value) {
        return new JAXBElement<HelloserverResponse>(_HelloserverResponse_QNAME, HelloserverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Helloserver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.services.xidian/", name = "helloserver")
    public JAXBElement<Helloserver> createHelloserver(Helloserver value) {
        return new JAXBElement<Helloserver>(_Helloserver_QNAME, Helloserver.class, null, value);
    }

}
