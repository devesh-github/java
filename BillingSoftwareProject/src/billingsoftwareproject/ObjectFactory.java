
package billingsoftwareproject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the billingsoftwareproject package. 
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

    private final static QName _Response_QNAME = new QName("http://BillingSoftwareProject/", "Response");
    private final static QName _Request_QNAME = new QName("http://BillingSoftwareProject/", "Request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: billingsoftwareproject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Output }
     * 
     */
    public Output createOutput() {
        return new Output();
    }

    /**
     * Create an instance of {@link Input }
     * 
     */
    public Input createInput() {
        return new Input();
    }

    /**
     * Create an instance of {@link Icecreams }
     * 
     */
    public Icecreams createIcecreams() {
        return new Icecreams();
    }

    /**
     * Create an instance of {@link Colddrinks }
     * 
     */
    public Colddrinks createColddrinks() {
        return new Colddrinks();
    }

    /**
     * Create an instance of {@link Fries }
     * 
     */
    public Fries createFries() {
        return new Fries();
    }

    /**
     * Create an instance of {@link Toys }
     * 
     */
    public Toys createToys() {
        return new Toys();
    }

    /**
     * Create an instance of {@link GetMenu }
     * 
     */
    public GetMenu createGetMenu() {
        return new GetMenu();
    }

    /**
     * Create an instance of {@link Burgher }
     * 
     */
    public Burgher createBurgher() {
        return new Burgher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Output }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BillingSoftwareProject/", name = "Response")
    public JAXBElement<Output> createResponse(Output value) {
        return new JAXBElement<Output>(_Response_QNAME, Output.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Input }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BillingSoftwareProject/", name = "Request")
    public JAXBElement<Input> createRequest(Input value) {
        return new JAXBElement<Input>(_Request_QNAME, Input.class, null, value);
    }

}
