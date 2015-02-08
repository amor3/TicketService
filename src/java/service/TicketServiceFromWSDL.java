package service;

import java.util.UUID;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author AMore
 */
@WebService(serviceName = "TicketServiceService",
        portName = "TicketServicePort",
        endpointInterface = "org.netbeans.j2ee.wsdl.ticketservice.java.ticketservice.TicketServicePortType",
        targetNamespace = "http://j2ee.netbeans.org/wsdl/TicketService/java/TicketService",
        wsdlLocation = "WEB-INF/wsdl/TicketServiceFromWSDL/TicketService.wsdl")
@Stateless
public class TicketServiceFromWSDL {

    public java.lang.String ticketServiceOperation(java.lang.String ticketID) {

        // Fooling around
        String ticketIDUUID = UUID.randomUUID().toString();
        
        return ticketIDUUID;
    }

}
