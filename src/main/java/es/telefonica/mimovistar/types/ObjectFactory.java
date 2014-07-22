
package es.telefonica.mimovistar.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.telefonica.mimovistar.types package. 
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

    private final static QName _EventoContadorPromociones_QNAME = new QName("urn:es:telefonica:mimovistar:types", "eventoContadorPromociones");
    private final static QName _EventoUmbralPromocionesResponse_QNAME = new QName("urn:es:telefonica:mimovistar:types", "eventoUmbralPromocionesResponse");
    private final static QName _EventoUmbralPromociones_QNAME = new QName("urn:es:telefonica:mimovistar:types", "eventoUmbralPromociones");
    private final static QName _EventoContadorPromocionesResponse_QNAME = new QName("urn:es:telefonica:mimovistar:types", "eventoContadorPromocionesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.telefonica.mimovistar.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventoContadorPromocionesResponseType }
     * 
     */
    public EventoContadorPromocionesResponseType createEventoContadorPromocionesResponseType() {
        return new EventoContadorPromocionesResponseType();
    }

    /**
     * Create an instance of {@link EventoUmbralPromocionesResponseType }
     * 
     */
    public EventoUmbralPromocionesResponseType createEventoUmbralPromocionesResponseType() {
        return new EventoUmbralPromocionesResponseType();
    }

    /**
     * Create an instance of {@link EventoContadorPromocionesType }
     * 
     */
    public EventoContadorPromocionesType createEventoContadorPromocionesType() {
        return new EventoContadorPromocionesType();
    }

    /**
     * Create an instance of {@link EventoUmbralPromocionesType }
     * 
     */
    public EventoUmbralPromocionesType createEventoUmbralPromocionesType() {
        return new EventoUmbralPromocionesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoContadorPromocionesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:es:telefonica:mimovistar:types", name = "eventoContadorPromociones")
    public JAXBElement<EventoContadorPromocionesType> createEventoContadorPromociones(EventoContadorPromocionesType value) {
        return new JAXBElement<EventoContadorPromocionesType>(_EventoContadorPromociones_QNAME, EventoContadorPromocionesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoUmbralPromocionesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:es:telefonica:mimovistar:types", name = "eventoUmbralPromocionesResponse")
    public JAXBElement<EventoUmbralPromocionesResponseType> createEventoUmbralPromocionesResponse(EventoUmbralPromocionesResponseType value) {
        return new JAXBElement<EventoUmbralPromocionesResponseType>(_EventoUmbralPromocionesResponse_QNAME, EventoUmbralPromocionesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoUmbralPromocionesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:es:telefonica:mimovistar:types", name = "eventoUmbralPromociones")
    public JAXBElement<EventoUmbralPromocionesType> createEventoUmbralPromociones(EventoUmbralPromocionesType value) {
        return new JAXBElement<EventoUmbralPromocionesType>(_EventoUmbralPromociones_QNAME, EventoUmbralPromocionesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoContadorPromocionesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:es:telefonica:mimovistar:types", name = "eventoContadorPromocionesResponse")
    public JAXBElement<EventoContadorPromocionesResponseType> createEventoContadorPromocionesResponse(EventoContadorPromocionesResponseType value) {
        return new JAXBElement<EventoContadorPromocionesResponseType>(_EventoContadorPromocionesResponse_QNAME, EventoContadorPromocionesResponseType.class, null, value);
    }

}
