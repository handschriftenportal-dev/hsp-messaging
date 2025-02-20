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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.tei-c.org/ns/1.0}locus"/&gt;
 *           &lt;element ref="{http://www.tei-c.org/ns/1.0}locusGrp"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.pLike" maxOccurs="unbounded"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}respStmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}title" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}rubric" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}incipit" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}msItemStruct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}explicit" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}finalRubric" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}colophon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}decoNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}listBibl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *               &lt;element ref="{http://www.tei-c.org/ns/1.0}bibl"/&gt;
 *               &lt;element ref="{http://www.tei-c.org/ns/1.0}biblStruct"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}filiation" minOccurs="0"/&gt;
 *             &lt;group ref="{http://www.tei-c.org/ns/1.0}model.noteLike" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}textLang" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.msClass.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.msExcerpt.attributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locusGrp",
    "locus",
    "authors",
    "respStmts",
    "titles",
    "rubric",
    "incipit",
    "msItemStructs",
    "explicit",
    "finalRubric",
    "colophons",
    "decoNotes",
    "listBibls",
    "biblsAndBiblStructs",
    "filiation",
    "notesAndNoteGrps",
    "textLang",
    "psAndAbs"
})
@XmlRootElement(name = "msItemStruct")
public class MsItemStruct {

    protected LocusGrp locusGrp;
    protected Locus locus;
    @XmlElement(name = "author")
    protected List<Author> authors;
    @XmlElement(name = "respStmt")
    protected List<RespStmt> respStmts;
    @XmlElement(name = "title")
    protected List<Title> titles;
    protected Rubric rubric;
    protected Incipit incipit;
    @XmlElement(name = "msItemStruct")
    protected List<MsItemStruct> msItemStructs;
    protected Explicit explicit;
    protected FinalRubric finalRubric;
    @XmlElement(name = "colophon")
    protected List<Colophon> colophons;
    @XmlElement(name = "decoNote")
    protected List<DecoNote> decoNotes;
    @XmlElement(name = "listBibl")
    protected List<ListBibl> listBibls;
    @XmlElements({
        @XmlElement(name = "bibl", type = Bibl.class),
        @XmlElement(name = "biblStruct", type = BiblStruct.class)
    })
    protected List<java.lang.Object> biblsAndBiblStructs;
    protected Filiation filiation;
    @XmlElements({
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "noteGrp", type = NoteGrp.class)
    })
    protected List<java.lang.Object> notesAndNoteGrps;
    protected TextLang textLang;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ab", type = Ab.class)
    })
    protected List<java.lang.Object> psAndAbs;
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
    @XmlAttribute(name = "class")
    protected List<java.lang.String> clazzs;
    @XmlAttribute(name = "defective")
    protected java.lang.String defective;

    /**
     * Ruft den Wert der locusGrp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocusGrp }
     *     
     */
    public LocusGrp getLocusGrp() {
        return locusGrp;
    }

    /**
     * Legt den Wert der locusGrp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocusGrp }
     *     
     */
    public void setLocusGrp(LocusGrp value) {
        this.locusGrp = value;
    }

    /**
     * Ruft den Wert der locus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Locus }
     *     
     */
    public Locus getLocus() {
        return locus;
    }

    /**
     * Legt den Wert der locus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Locus }
     *     
     */
    public void setLocus(Locus value) {
        this.locus = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Author }
     * 
     * 
     */
    public List<Author> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<Author>();
        }
        return this.authors;
    }

    /**
     * Gets the value of the respStmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the respStmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespStmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespStmt }
     * 
     * 
     */
    public List<RespStmt> getRespStmts() {
        if (respStmts == null) {
            respStmts = new ArrayList<RespStmt>();
        }
        return this.respStmts;
    }

    /**
     * Gets the value of the titles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the titles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * 
     * 
     */
    public List<Title> getTitles() {
        if (titles == null) {
            titles = new ArrayList<Title>();
        }
        return this.titles;
    }

    /**
     * Ruft den Wert der rubric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rubric }
     *     
     */
    public Rubric getRubric() {
        return rubric;
    }

    /**
     * Legt den Wert der rubric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rubric }
     *     
     */
    public void setRubric(Rubric value) {
        this.rubric = value;
    }

    /**
     * Ruft den Wert der incipit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Incipit }
     *     
     */
    public Incipit getIncipit() {
        return incipit;
    }

    /**
     * Legt den Wert der incipit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Incipit }
     *     
     */
    public void setIncipit(Incipit value) {
        this.incipit = value;
    }

    /**
     * Gets the value of the msItemStructs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the msItemStructs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsItemStructs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsItemStruct }
     * 
     * 
     */
    public List<MsItemStruct> getMsItemStructs() {
        if (msItemStructs == null) {
            msItemStructs = new ArrayList<MsItemStruct>();
        }
        return this.msItemStructs;
    }

    /**
     * Ruft den Wert der explicit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Explicit }
     *     
     */
    public Explicit getExplicit() {
        return explicit;
    }

    /**
     * Legt den Wert der explicit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Explicit }
     *     
     */
    public void setExplicit(Explicit value) {
        this.explicit = value;
    }

    /**
     * Ruft den Wert der finalRubric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinalRubric }
     *     
     */
    public FinalRubric getFinalRubric() {
        return finalRubric;
    }

    /**
     * Legt den Wert der finalRubric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalRubric }
     *     
     */
    public void setFinalRubric(FinalRubric value) {
        this.finalRubric = value;
    }

    /**
     * Gets the value of the colophons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the colophons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColophons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colophon }
     * 
     * 
     */
    public List<Colophon> getColophons() {
        if (colophons == null) {
            colophons = new ArrayList<Colophon>();
        }
        return this.colophons;
    }

    /**
     * Gets the value of the decoNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the decoNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecoNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecoNote }
     * 
     * 
     */
    public List<DecoNote> getDecoNotes() {
        if (decoNotes == null) {
            decoNotes = new ArrayList<DecoNote>();
        }
        return this.decoNotes;
    }

    /**
     * Gets the value of the listBibls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listBibls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListBibls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListBibl }
     * 
     * 
     */
    public List<ListBibl> getListBibls() {
        if (listBibls == null) {
            listBibls = new ArrayList<ListBibl>();
        }
        return this.listBibls;
    }

    /**
     * Gets the value of the biblsAndBiblStructs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the biblsAndBiblStructs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiblsAndBiblStructs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bibl }
     * {@link BiblStruct }
     * 
     * 
     */
    public List<java.lang.Object> getBiblsAndBiblStructs() {
        if (biblsAndBiblStructs == null) {
            biblsAndBiblStructs = new ArrayList<java.lang.Object>();
        }
        return this.biblsAndBiblStructs;
    }

    /**
     * Ruft den Wert der filiation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Filiation }
     *     
     */
    public Filiation getFiliation() {
        return filiation;
    }

    /**
     * Legt den Wert der filiation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Filiation }
     *     
     */
    public void setFiliation(Filiation value) {
        this.filiation = value;
    }

    /**
     * Gets the value of the notesAndNoteGrps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notesAndNoteGrps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesAndNoteGrps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * {@link NoteGrp }
     * 
     * 
     */
    public List<java.lang.Object> getNotesAndNoteGrps() {
        if (notesAndNoteGrps == null) {
            notesAndNoteGrps = new ArrayList<java.lang.Object>();
        }
        return this.notesAndNoteGrps;
    }

    /**
     * Ruft den Wert der textLang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextLang }
     *     
     */
    public TextLang getTextLang() {
        return textLang;
    }

    /**
     * Legt den Wert der textLang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextLang }
     *     
     */
    public void setTextLang(TextLang value) {
        this.textLang = value;
    }

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
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<java.lang.String>();
        }
        return this.clazzs;
    }

    /**
     * Ruft den Wert der defective-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDefective() {
        return defective;
    }

    /**
     * Legt den Wert der defective-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDefective(java.lang.String value) {
        this.defective = value;
    }

}
