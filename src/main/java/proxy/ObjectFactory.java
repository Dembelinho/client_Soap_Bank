
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _ConversionResponse_QNAME = new QName("http://ws/", "conversionResponse");
    private final static QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private final static QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private final static QName _ListofComptes_QNAME = new QName("http://ws/", "listofComptes");
    private final static QName _ListofComptesResponse_QNAME = new QName("http://ws/", "listofComptesResponse");
    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");
    private final static QName _Conversion_QNAME = new QName("http://ws/", "conversion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ListofComptes }
     * 
     */
    public ListofComptes createListofComptes() {
        return new ListofComptes();
    }

    /**
     * Create an instance of {@link ListofComptesResponse }
     * 
     */
    public ListofComptesResponse createListofComptesResponse() {
        return new ListofComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<ConversionResponse>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListofComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listofComptes")
    public JAXBElement<ListofComptes> createListofComptes(ListofComptes value) {
        return new JAXBElement<ListofComptes>(_ListofComptes_QNAME, ListofComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListofComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listofComptesResponse")
    public JAXBElement<ListofComptesResponse> createListofComptesResponse(ListofComptesResponse value) {
        return new JAXBElement<ListofComptesResponse>(_ListofComptesResponse_QNAME, ListofComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<Conversion>(_Conversion_QNAME, Conversion.class, null, value);
    }

}
