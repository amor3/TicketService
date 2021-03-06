
package org.netbeans.j2ee.wsdl.ticketservice.java.ticketservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TicketServiceService", targetNamespace = "http://j2ee.netbeans.org/wsdl/TicketService/java/TicketService", wsdlLocation = "file:/Users/AMore/NetBeansProjects/TicketService/src/conf/xml-resources/web-services/TicketServiceFromWSDL/wsdl/TicketService.wsdl")
public class TicketServiceService
    extends Service
{

    private final static URL TICKETSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETSERVICESERVICE_EXCEPTION;
    private final static QName TICKETSERVICESERVICE_QNAME = new QName("http://j2ee.netbeans.org/wsdl/TicketService/java/TicketService", "TicketServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/AMore/NetBeansProjects/TicketService/src/conf/xml-resources/web-services/TicketServiceFromWSDL/wsdl/TicketService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETSERVICESERVICE_WSDL_LOCATION = url;
        TICKETSERVICESERVICE_EXCEPTION = e;
    }

    public TicketServiceService() {
        super(__getWsdlLocation(), TICKETSERVICESERVICE_QNAME);
    }

    public TicketServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETSERVICESERVICE_QNAME, features);
    }

    public TicketServiceService(URL wsdlLocation) {
        super(wsdlLocation, TICKETSERVICESERVICE_QNAME);
    }

    public TicketServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETSERVICESERVICE_QNAME, features);
    }

    public TicketServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketServicePortType
     */
    @WebEndpoint(name = "TicketServicePort")
    public TicketServicePortType getTicketServicePort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/TicketService/java/TicketService", "TicketServicePort"), TicketServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketServicePortType
     */
    @WebEndpoint(name = "TicketServicePort")
    public TicketServicePortType getTicketServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/TicketService/java/TicketService", "TicketServicePort"), TicketServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETSERVICESERVICE_EXCEPTION!= null) {
            throw TICKETSERVICESERVICE_EXCEPTION;
        }
        return TICKETSERVICESERVICE_WSDL_LOCATION;
    }

}
