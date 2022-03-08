
package mywebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for input complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="input">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "input", propOrder = {
    "number1",
    "number2"
})
public class Input {

    protected Long number1;
    protected Long number2;

    /**
     * Gets the value of the number1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumber1(Long value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the number2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumber2(Long value) {
        this.number2 = value;
    }

}
