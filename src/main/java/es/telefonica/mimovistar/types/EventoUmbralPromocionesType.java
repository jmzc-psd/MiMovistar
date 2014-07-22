
package es.telefonica.mimovistar.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventoUmbralPromocionesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventoUmbralPromocionesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{urn:es:telefonica:mimovistar:types}MSISDNType"/>
 *         &lt;element name="indicador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaEvento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="puertoServidor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="umbralXN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="umbralPromo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subindice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCombo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventoUmbralPromocionesType", propOrder = {
    "msisdn",
    "indicador",
    "fechaEvento",
    "puertoServidor",
    "umbralXN",
    "umbralPromo",
    "subindice",
    "idCombo"
})
public class EventoUmbralPromocionesType {

    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(required = true)
    protected String indicador;
    protected long fechaEvento;
    protected Integer puertoServidor;
    protected Integer umbralXN;
    protected Integer umbralPromo;
    protected Integer subindice;
    protected Integer idCombo;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the indicador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Sets the value of the indicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
    }

    /**
     * Gets the value of the fechaEvento property.
     * 
     */
    public long getFechaEvento() {
        return fechaEvento;
    }

    /**
     * Sets the value of the fechaEvento property.
     * 
     */
    public void setFechaEvento(long value) {
        this.fechaEvento = value;
    }

    /**
     * Gets the value of the puertoServidor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuertoServidor() {
        return puertoServidor;
    }

    /**
     * Sets the value of the puertoServidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuertoServidor(Integer value) {
        this.puertoServidor = value;
    }

    /**
     * Gets the value of the umbralXN property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUmbralXN() {
        return umbralXN;
    }

    /**
     * Sets the value of the umbralXN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUmbralXN(Integer value) {
        this.umbralXN = value;
    }

    /**
     * Gets the value of the umbralPromo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUmbralPromo() {
        return umbralPromo;
    }

    /**
     * Sets the value of the umbralPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUmbralPromo(Integer value) {
        this.umbralPromo = value;
    }

    /**
     * Gets the value of the subindice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubindice() {
        return subindice;
    }

    /**
     * Sets the value of the subindice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubindice(Integer value) {
        this.subindice = value;
    }

    /**
     * Gets the value of the idCombo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCombo() {
        return idCombo;
    }

    /**
     * Sets the value of the idCombo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCombo(Integer value) {
        this.idCombo = value;
    }

}
