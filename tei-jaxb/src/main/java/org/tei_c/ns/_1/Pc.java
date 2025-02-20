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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{http://www.tei-c.org/ns/1.0}model.gLike"/&gt;
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}c"/&gt;
 *         &lt;group ref="{http://www.tei-c.org/ns/1.0}model.pPart.edit"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.typed.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.linguistic.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.segLike.attributes"/&gt;
 *       &lt;attribute name="force"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="strong"/&gt;
 *             &lt;enumeration value="weak"/&gt;
 *             &lt;enumeration value="inter"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unit"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;pattern value="[^\p{C}\p{Z}]+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pre" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "pc")
public class Pc {

    @XmlElementRefs({
        @XmlElementRef(name = "g", namespace = "http://www.tei-c.org/ns/1.0", type = G.class, required = false),
        @XmlElementRef(name = "c", namespace = "http://www.tei-c.org/ns/1.0", type = C.class, required = false),
        @XmlElementRef(name = "choice", namespace = "http://www.tei-c.org/ns/1.0", type = Choice.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.tei-c.org/ns/1.0", type = Abbr.class, required = false),
        @XmlElementRef(name = "expan", namespace = "http://www.tei-c.org/ns/1.0", type = Expan.class, required = false),
        @XmlElementRef(name = "ex", namespace = "http://www.tei-c.org/ns/1.0", type = Ex.class, required = false),
        @XmlElementRef(name = "am", namespace = "http://www.tei-c.org/ns/1.0", type = Am.class, required = false),
        @XmlElementRef(name = "subst", namespace = "http://www.tei-c.org/ns/1.0", type = Subst.class, required = false),
        @XmlElementRef(name = "sic", namespace = "http://www.tei-c.org/ns/1.0", type = Sic.class, required = false),
        @XmlElementRef(name = "corr", namespace = "http://www.tei-c.org/ns/1.0", type = Corr.class, required = false),
        @XmlElementRef(name = "reg", namespace = "http://www.tei-c.org/ns/1.0", type = Reg.class, required = false),
        @XmlElementRef(name = "orig", namespace = "http://www.tei-c.org/ns/1.0", type = Orig.class, required = false),
        @XmlElementRef(name = "add", namespace = "http://www.tei-c.org/ns/1.0", type = Add.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://www.tei-c.org/ns/1.0", type = Del.class, required = false),
        @XmlElementRef(name = "unclear", namespace = "http://www.tei-c.org/ns/1.0", type = Unclear.class, required = false),
        @XmlElementRef(name = "damage", namespace = "http://www.tei-c.org/ns/1.0", type = Damage.class, required = false),
        @XmlElementRef(name = "handShift", namespace = "http://www.tei-c.org/ns/1.0", type = HandShift.class, required = false),
        @XmlElementRef(name = "restore", namespace = "http://www.tei-c.org/ns/1.0", type = Restore.class, required = false),
        @XmlElementRef(name = "supplied", namespace = "http://www.tei-c.org/ns/1.0", type = Supplied.class, required = false),
        @XmlElementRef(name = "surplus", namespace = "http://www.tei-c.org/ns/1.0", type = Surplus.class, required = false),
        @XmlElementRef(name = "secl", namespace = "http://www.tei-c.org/ns/1.0", type = Secl.class, required = false),
        @XmlElementRef(name = "mod", namespace = "http://www.tei-c.org/ns/1.0", type = Mod.class, required = false),
        @XmlElementRef(name = "redo", namespace = "http://www.tei-c.org/ns/1.0", type = Redo.class, required = false),
        @XmlElementRef(name = "retrace", namespace = "http://www.tei-c.org/ns/1.0", type = Retrace.class, required = false),
        @XmlElementRef(name = "undo", namespace = "http://www.tei-c.org/ns/1.0", type = Undo.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "force")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String force;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String unit;
    @XmlAttribute(name = "pre")
    protected Boolean pre;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String type;
    @XmlAttribute(name = "subtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String subtype;
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
    @XmlAttribute(name = "lemma")
    protected java.lang.String lemma;
    @XmlAttribute(name = "msd")
    protected java.lang.String msd;
    @XmlAttribute(name = "pos")
    protected java.lang.String pos;
    @XmlAttribute(name = "norm")
    protected java.lang.String norm;
    @XmlAttribute(name = "orig")
    protected java.lang.String orig;
    @XmlAttribute(name = "lemmaRef")
    protected java.lang.String lemmaRef;
    @XmlAttribute(name = "join")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String join;
    @XmlAttribute(name = "met")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String met;
    @XmlAttribute(name = "rhyme")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String rhyme;
    @XmlAttribute(name = "real")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String real;
    @XmlAttribute(name = "function")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String function;
    @XmlAttribute(name = "datcat")
    protected List<java.lang.String> datcats;
    @XmlAttribute(name = "valueDatcat")
    protected List<java.lang.String> valueDatcats;
    @XmlAttribute(name = "targetDatcat")
    protected List<java.lang.String> targetDatcats;
    @XmlAttribute(name = "part")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String part;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * {@link Abbr }
     * {@link Add }
     * {@link Am }
     * {@link C }
     * {@link Choice }
     * {@link Corr }
     * {@link Damage }
     * {@link Del }
     * {@link Ex }
     * {@link Expan }
     * {@link G }
     * {@link HandShift }
     * {@link Mod }
     * {@link Orig }
     * {@link Redo }
     * {@link Reg }
     * {@link Restore }
     * {@link Retrace }
     * {@link Secl }
     * {@link Sic }
     * {@link Subst }
     * {@link Supplied }
     * {@link Surplus }
     * {@link Unclear }
     * {@link Undo }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Ruft den Wert der force-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getForce() {
        return force;
    }

    /**
     * Legt den Wert der force-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setForce(java.lang.String value) {
        this.force = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUnit(java.lang.String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der pre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPre() {
        return pre;
    }

    /**
     * Legt den Wert der pre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPre(Boolean value) {
        this.pre = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der subtype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSubtype() {
        return subtype;
    }

    /**
     * Legt den Wert der subtype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSubtype(java.lang.String value) {
        this.subtype = value;
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

    /**
     * Ruft den Wert der lemma-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLemma() {
        return lemma;
    }

    /**
     * Legt den Wert der lemma-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLemma(java.lang.String value) {
        this.lemma = value;
    }

    /**
     * Ruft den Wert der msd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMsd() {
        return msd;
    }

    /**
     * Legt den Wert der msd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMsd(java.lang.String value) {
        this.msd = value;
    }

    /**
     * Ruft den Wert der pos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPos() {
        return pos;
    }

    /**
     * Legt den Wert der pos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPos(java.lang.String value) {
        this.pos = value;
    }

    /**
     * Ruft den Wert der norm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNorm() {
        return norm;
    }

    /**
     * Legt den Wert der norm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNorm(java.lang.String value) {
        this.norm = value;
    }

    /**
     * Ruft den Wert der orig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOrig() {
        return orig;
    }

    /**
     * Legt den Wert der orig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOrig(java.lang.String value) {
        this.orig = value;
    }

    /**
     * Ruft den Wert der lemmaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLemmaRef() {
        return lemmaRef;
    }

    /**
     * Legt den Wert der lemmaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLemmaRef(java.lang.String value) {
        this.lemmaRef = value;
    }

    /**
     * Ruft den Wert der join-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getJoin() {
        return join;
    }

    /**
     * Legt den Wert der join-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setJoin(java.lang.String value) {
        this.join = value;
    }

    /**
     * Ruft den Wert der met-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMet() {
        return met;
    }

    /**
     * Legt den Wert der met-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMet(java.lang.String value) {
        this.met = value;
    }

    /**
     * Ruft den Wert der rhyme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRhyme() {
        return rhyme;
    }

    /**
     * Legt den Wert der rhyme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRhyme(java.lang.String value) {
        this.rhyme = value;
    }

    /**
     * Ruft den Wert der real-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getReal() {
        return real;
    }

    /**
     * Legt den Wert der real-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setReal(java.lang.String value) {
        this.real = value;
    }

    /**
     * Ruft den Wert der function-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFunction() {
        return function;
    }

    /**
     * Legt den Wert der function-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFunction(java.lang.String value) {
        this.function = value;
    }

    /**
     * Gets the value of the datcats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the datcats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatcats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getDatcats() {
        if (datcats == null) {
            datcats = new ArrayList<java.lang.String>();
        }
        return this.datcats;
    }

    /**
     * Gets the value of the valueDatcats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the valueDatcats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueDatcats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getValueDatcats() {
        if (valueDatcats == null) {
            valueDatcats = new ArrayList<java.lang.String>();
        }
        return this.valueDatcats;
    }

    /**
     * Gets the value of the targetDatcats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the targetDatcats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetDatcats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getTargetDatcats() {
        if (targetDatcats == null) {
            targetDatcats = new ArrayList<java.lang.String>();
        }
        return this.targetDatcats;
    }

    /**
     * Ruft den Wert der part-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPart() {
        if (part == null) {
            return "N";
        } else {
            return part;
        }
    }

    /**
     * Legt den Wert der part-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPart(java.lang.String value) {
        this.part = value;
    }

}
