//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.10.10 um 01:11:20 PM CEST 
//


package org.tei_c.ns._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.tei-c.org/ns/1.0}model.pLike" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}objectDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}handDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}typeDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}scriptDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}musicNotation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}decoDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}additions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}bindingDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}sealDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}accMat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psAndAbs",
    "objectDesc",
    "handDesc",
    "typeDesc",
    "scriptDesc",
    "musicNotation",
    "decoDesc",
    "additions",
    "bindingDesc",
    "sealDesc",
    "accMat"
})
@XmlRootElement(name = "physDesc")
public class PhysDesc {

    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ab", type = Ab.class)
    })
    protected List<java.lang.Object> psAndAbs;
    protected ObjectDesc objectDesc;
    protected HandDesc handDesc;
    protected TypeDesc typeDesc;
    protected ScriptDesc scriptDesc;
    protected MusicNotation musicNotation;
    protected DecoDesc decoDesc;
    protected Additions additions;
    protected BindingDesc bindingDesc;
    protected SealDesc sealDesc;
    protected AccMat accMat;
    @XmlAttribute(name = "resp")
    protected List<java.lang.String> resps;
    @XmlAttribute(name = "cert")
    protected java.lang.String cert;
    @XmlAttribute(name = "prev")
    protected java.lang.String prev;
    @XmlAttribute(name = "exclude")
    protected List<java.lang.String> excludes;
    @XmlAttribute(name = "next")
    protected java.lang.String next;
    @XmlAttribute(name = "sameAs")
    protected java.lang.String sameAs;
    @XmlAttribute(name = "copyOf")
    protected java.lang.String copyOf;
    @XmlAttribute(name = "select")
    protected List<java.lang.String> selects;
    @XmlAttribute(name = "synch")
    protected List<java.lang.String> synches;
    @XmlAttribute(name = "corresp")
    protected List<java.lang.String> corresps;
    @XmlAttribute(name = "rendition")
    protected List<java.lang.String> renditions;
    @XmlAttribute(name = "rend")
    protected List<java.lang.String> rends;
    @XmlAttribute(name = "style")
    protected java.lang.String style;
    @XmlAttribute(name = "facs")
    protected List<java.lang.String> facs;
    @XmlAttribute(name = "change")
    protected List<java.lang.String> changes;
    @XmlAttribute(name = "n")
    protected java.lang.String n;
    @XmlAttribute(name = "ana")
    protected List<java.lang.String> anas;
    @XmlAttribute(name = "source")
    protected List<java.lang.String> sources;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String lang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String base;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String space;

    /**
     * Gets the value of the psAndAbs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the psAndAbs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSAndAbs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ab }
     * {@link P }
     * 
     * 
     */
    public List<java.lang.Object> getPSAndAbs() {
        if (psAndAbs == null) {
            psAndAbs = new ArrayList<java.lang.Object>();
        }
        return this.psAndAbs;
    }

    /**
     * Ruft den Wert der objectDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectDesc }
     *     
     */
    public ObjectDesc getObjectDesc() {
        return objectDesc;
    }

    /**
     * Legt den Wert der objectDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectDesc }
     *     
     */
    public void setObjectDesc(ObjectDesc value) {
        this.objectDesc = value;
    }

    /**
     * Ruft den Wert der handDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HandDesc }
     *     
     */
    public HandDesc getHandDesc() {
        return handDesc;
    }

    /**
     * Legt den Wert der handDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HandDesc }
     *     
     */
    public void setHandDesc(HandDesc value) {
        this.handDesc = value;
    }

    /**
     * Ruft den Wert der typeDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeDesc }
     *     
     */
    public TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Legt den Wert der typeDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDesc }
     *     
     */
    public void setTypeDesc(TypeDesc value) {
        this.typeDesc = value;
    }

    /**
     * Ruft den Wert der scriptDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScriptDesc }
     *     
     */
    public ScriptDesc getScriptDesc() {
        return scriptDesc;
    }

    /**
     * Legt den Wert der scriptDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptDesc }
     *     
     */
    public void setScriptDesc(ScriptDesc value) {
        this.scriptDesc = value;
    }

    /**
     * Ruft den Wert der musicNotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MusicNotation }
     *     
     */
    public MusicNotation getMusicNotation() {
        return musicNotation;
    }

    /**
     * Legt den Wert der musicNotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MusicNotation }
     *     
     */
    public void setMusicNotation(MusicNotation value) {
        this.musicNotation = value;
    }

    /**
     * Ruft den Wert der decoDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DecoDesc }
     *     
     */
    public DecoDesc getDecoDesc() {
        return decoDesc;
    }

    /**
     * Legt den Wert der decoDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DecoDesc }
     *     
     */
    public void setDecoDesc(DecoDesc value) {
        this.decoDesc = value;
    }

    /**
     * Ruft den Wert der additions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Additions }
     *     
     */
    public Additions getAdditions() {
        return additions;
    }

    /**
     * Legt den Wert der additions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Additions }
     *     
     */
    public void setAdditions(Additions value) {
        this.additions = value;
    }

    /**
     * Ruft den Wert der bindingDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BindingDesc }
     *     
     */
    public BindingDesc getBindingDesc() {
        return bindingDesc;
    }

    /**
     * Legt den Wert der bindingDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingDesc }
     *     
     */
    public void setBindingDesc(BindingDesc value) {
        this.bindingDesc = value;
    }

    /**
     * Ruft den Wert der sealDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SealDesc }
     *     
     */
    public SealDesc getSealDesc() {
        return sealDesc;
    }

    /**
     * Legt den Wert der sealDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SealDesc }
     *     
     */
    public void setSealDesc(SealDesc value) {
        this.sealDesc = value;
    }

    /**
     * Ruft den Wert der accMat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccMat }
     *     
     */
    public AccMat getAccMat() {
        return accMat;
    }

    /**
     * Legt den Wert der accMat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccMat }
     *     
     */
    public void setAccMat(AccMat value) {
        this.accMat = value;
    }

    /**
     * Gets the value of the resps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getResps() {
        if (resps == null) {
            resps = new ArrayList<java.lang.String>();
        }
        return this.resps;
    }

    /**
     * Ruft den Wert der cert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCert() {
        return cert;
    }

    /**
     * Legt den Wert der cert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCert(java.lang.String value) {
        this.cert = value;
    }

    /**
     * Ruft den Wert der prev-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPrev() {
        return prev;
    }

    /**
     * Legt den Wert der prev-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPrev(java.lang.String value) {
        this.prev = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the excludes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getExcludes() {
        if (excludes == null) {
            excludes = new ArrayList<java.lang.String>();
        }
        return this.excludes;
    }

    /**
     * Ruft den Wert der next-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNext() {
        return next;
    }

    /**
     * Legt den Wert der next-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNext(java.lang.String value) {
        this.next = value;
    }

    /**
     * Ruft den Wert der sameAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSameAs() {
        return sameAs;
    }

    /**
     * Legt den Wert der sameAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSameAs(java.lang.String value) {
        this.sameAs = value;
    }

    /**
     * Ruft den Wert der copyOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCopyOf() {
        return copyOf;
    }

    /**
     * Legt den Wert der copyOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCopyOf(java.lang.String value) {
        this.copyOf = value;
    }

    /**
     * Gets the value of the selects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the selects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getSelects() {
        if (selects == null) {
            selects = new ArrayList<java.lang.String>();
        }
        return this.selects;
    }

    /**
     * Gets the value of the synches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the synches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getSynches() {
        if (synches == null) {
            synches = new ArrayList<java.lang.String>();
        }
        return this.synches;
    }

    /**
     * Gets the value of the corresps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the corresps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorresps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getCorresps() {
        if (corresps == null) {
            corresps = new ArrayList<java.lang.String>();
        }
        return this.corresps;
    }

    /**
     * Gets the value of the renditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the renditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getRenditions() {
        if (renditions == null) {
            renditions = new ArrayList<java.lang.String>();
        }
        return this.renditions;
    }

    /**
     * Gets the value of the rends property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rends property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRends().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getRends() {
        if (rends == null) {
            rends = new ArrayList<java.lang.String>();
        }
        return this.rends;
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setStyle(java.lang.String value) {
        this.style = value;
    }

    /**
     * Gets the value of the facs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getFacs() {
        if (facs == null) {
            facs = new ArrayList<java.lang.String>();
        }
        return this.facs;
    }

    /**
     * Gets the value of the changes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the changes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getChanges() {
        if (changes == null) {
            changes = new ArrayList<java.lang.String>();
        }
        return this.changes;
    }

    /**
     * Ruft den Wert der n-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getN() {
        return n;
    }

    /**
     * Legt den Wert der n-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setN(java.lang.String value) {
        this.n = value;
    }

    /**
     * Gets the value of the anas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the anas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getAnas() {
        if (anas == null) {
            anas = new ArrayList<java.lang.String>();
        }
        return this.anas;
    }

    /**
     * Gets the value of the sources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getSources() {
        if (sources == null) {
            sources = new ArrayList<java.lang.String>();
        }
        return this.sources;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der lang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLang() {
        return lang;
    }

    /**
     * Legt den Wert der lang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLang(java.lang.String value) {
        this.lang = value;
    }

    /**
     * Ruft den Wert der base-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBase() {
        return base;
    }

    /**
     * Legt den Wert der base-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBase(java.lang.String value) {
        this.base = value;
    }

    /**
     * Ruft den Wert der space-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSpace() {
        return space;
    }

    /**
     * Legt den Wert der space-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSpace(java.lang.String value) {
        this.space = value;
    }

}
