//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.10.10 um 01:11:20 PM CEST 
//


package org.tei_c.ns._1;

import java.util.ArrayList;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.frontPart"/&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.pLike.front"/&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.pLike"/&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.listLike"/&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.tei-c.org/ns/1.0}model.div1Like"/&gt;
 *             &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *               &lt;group ref="{http://www.tei-c.org/ns/1.0}model.frontPart"/&gt;
 *               &lt;group ref="{http://www.tei-c.org/ns/1.0}model.div1Like"/&gt;
 *               &lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.tei-c.org/ns/1.0}model.divLike"/&gt;
 *             &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *               &lt;group ref="{http://www.tei-c.org/ns/1.0}model.frontPart"/&gt;
 *               &lt;group ref="{http://www.tei-c.org/ns/1.0}model.divLike"/&gt;
 *               &lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.divBottomPart"/&gt;
 *           &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;group ref="{http://www.tei-c.org/ns/1.0}model.divBottomPart"/&gt;
 *             &lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.declaring.attributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setsAndProloguesAndEpilogues"
})
@XmlRootElement(name = "back")
public class Back {

    @XmlElements({
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "prologue", type = Prologue.class),
        @XmlElement(name = "epilogue", type = Epilogue.class),
        @XmlElement(name = "performance", type = Performance.class),
        @XmlElement(name = "castList", type = CastList.class),
        @XmlElement(name = "listBibl", type = ListBibl.class),
        @XmlElement(name = "divGen", type = DivGen.class),
        @XmlElement(name = "titlePage", type = TitlePage.class),
        @XmlElement(name = "schemaSpec", type = SchemaSpec.class),
        @XmlElement(name = "head", type = Head.class),
        @XmlElement(name = "byline", type = Byline.class),
        @XmlElement(name = "dateline", type = Dateline.class),
        @XmlElement(name = "argument", type = Argument.class),
        @XmlElement(name = "epigraph", type = Epigraph.class),
        @XmlElement(name = "docTitle", type = DocTitle.class),
        @XmlElement(name = "titlePart", type = TitlePart.class),
        @XmlElement(name = "docAuthor", type = DocAuthor.class),
        @XmlElement(name = "docEdition", type = DocEdition.class),
        @XmlElement(name = "docImprint", type = DocImprint.class),
        @XmlElement(name = "docDate", type = DocDate.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ab", type = Ab.class),
        @XmlElement(name = "list", type = org.tei_c.ns._1.List.class),
        @XmlElement(name = "listApp", type = ListApp.class),
        @XmlElement(name = "listWit", type = ListWit.class),
        @XmlElement(name = "listOrg", type = ListOrg.class),
        @XmlElement(name = "listEvent", type = ListEvent.class),
        @XmlElement(name = "listPerson", type = ListPerson.class),
        @XmlElement(name = "listPlace", type = ListPlace.class),
        @XmlElement(name = "listRelation", type = ListRelation.class),
        @XmlElement(name = "listObject", type = ListObject.class),
        @XmlElement(name = "listNym", type = ListNym.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "index", type = Index.class),
        @XmlElement(name = "span", type = Span.class),
        @XmlElement(name = "spanGrp", type = SpanGrp.class),
        @XmlElement(name = "interp", type = Interp.class),
        @XmlElement(name = "interpGrp", type = InterpGrp.class),
        @XmlElement(name = "substJoin", type = SubstJoin.class),
        @XmlElement(name = "listTranspose", type = ListTranspose.class),
        @XmlElement(name = "link", type = Link.class),
        @XmlElement(name = "linkGrp", type = LinkGrp.class),
        @XmlElement(name = "timeline", type = Timeline.class),
        @XmlElement(name = "join", type = Join.class),
        @XmlElement(name = "joinGrp", type = JoinGrp.class),
        @XmlElement(name = "alt", type = Alt.class),
        @XmlElement(name = "altGrp", type = AltGrp.class),
        @XmlElement(name = "fs", type = Fs.class),
        @XmlElement(name = "fLib", type = FLib.class),
        @XmlElement(name = "fvLib", type = FvLib.class),
        @XmlElement(name = "precision", type = Precision.class),
        @XmlElement(name = "certainty", type = Certainty.class),
        @XmlElement(name = "respons", type = Respons.class),
        @XmlElement(name = "milestone", type = Milestone.class),
        @XmlElement(name = "gb", type = Gb.class),
        @XmlElement(name = "pb", type = Pb.class),
        @XmlElement(name = "lb", type = Lb.class),
        @XmlElement(name = "cb", type = Cb.class),
        @XmlElement(name = "fw", type = Fw.class),
        @XmlElement(name = "anchor", type = Anchor.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "noteGrp", type = NoteGrp.class),
        @XmlElement(name = "gap", type = Gap.class),
        @XmlElement(name = "ellipsis", type = Ellipsis.class),
        @XmlElement(name = "addSpan", type = AddSpan.class),
        @XmlElement(name = "damageSpan", type = DamageSpan.class),
        @XmlElement(name = "delSpan", type = DelSpan.class),
        @XmlElement(name = "space", type = Space.class),
        @XmlElement(name = "app", type = App.class),
        @XmlElement(name = "witDetail", type = WitDetail.class),
        @XmlElement(name = "pause", type = Pause.class),
        @XmlElement(name = "vocal", type = Vocal.class),
        @XmlElement(name = "kinesic", type = Kinesic.class),
        @XmlElement(name = "incident", type = Incident.class),
        @XmlElement(name = "writing", type = Writing.class),
        @XmlElement(name = "shift", type = Shift.class),
        @XmlElement(name = "metamark", type = Metamark.class),
        @XmlElement(name = "notatedMusic", type = NotatedMusic.class),
        @XmlElement(name = "figure", type = Figure.class),
        @XmlElement(name = "div1", type = Div1 .class),
        @XmlElement(name = "div", type = Div.class),
        @XmlElement(name = "trailer", type = Trailer.class),
        @XmlElement(name = "closer", type = Closer.class),
        @XmlElement(name = "signed", type = Signed.class),
        @XmlElement(name = "postscript", type = Postscript.class)
    })
    protected java.util.List<java.lang.Object> setsAndProloguesAndEpilogues;
    @XmlAttribute(name = "resp")
    protected java.util.List<java.lang.String> resps;
    @XmlAttribute(name = "cert")
    protected java.lang.String cert;
    @XmlAttribute(name = "prev")
    protected java.lang.String prev;
    @XmlAttribute(name = "exclude")
    protected java.util.List<java.lang.String> excludes;
    @XmlAttribute(name = "next")
    protected java.lang.String next;
    @XmlAttribute(name = "sameAs")
    protected java.lang.String sameAs;
    @XmlAttribute(name = "copyOf")
    protected java.lang.String copyOf;
    @XmlAttribute(name = "select")
    protected java.util.List<java.lang.String> selects;
    @XmlAttribute(name = "synch")
    protected java.util.List<java.lang.String> synches;
    @XmlAttribute(name = "corresp")
    protected java.util.List<java.lang.String> corresps;
    @XmlAttribute(name = "rendition")
    protected java.util.List<java.lang.String> renditions;
    @XmlAttribute(name = "rend")
    protected java.util.List<java.lang.String> rends;
    @XmlAttribute(name = "style")
    protected java.lang.String style;
    @XmlAttribute(name = "facs")
    protected java.util.List<java.lang.String> facs;
    @XmlAttribute(name = "change")
    protected java.util.List<java.lang.String> changes;
    @XmlAttribute(name = "n")
    protected java.lang.String n;
    @XmlAttribute(name = "ana")
    protected java.util.List<java.lang.String> anas;
    @XmlAttribute(name = "source")
    protected java.util.List<java.lang.String> sources;
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
    @XmlAttribute(name = "decls")
    protected java.util.List<java.lang.String> decls;

    /**
     * Gets the value of the setsAndProloguesAndEpilogues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the setsAndProloguesAndEpilogues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetsAndProloguesAndEpilogues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ab }
     * {@link AddSpan }
     * {@link Alt }
     * {@link AltGrp }
     * {@link Anchor }
     * {@link App }
     * {@link Argument }
     * {@link Byline }
     * {@link CastList }
     * {@link Cb }
     * {@link Certainty }
     * {@link Closer }
     * {@link DamageSpan }
     * {@link Dateline }
     * {@link DelSpan }
     * {@link Div }
     * {@link Div1 }
     * {@link DivGen }
     * {@link DocAuthor }
     * {@link DocDate }
     * {@link DocEdition }
     * {@link DocImprint }
     * {@link DocTitle }
     * {@link Ellipsis }
     * {@link Epigraph }
     * {@link Epilogue }
     * {@link FLib }
     * {@link Figure }
     * {@link Fs }
     * {@link FvLib }
     * {@link Fw }
     * {@link Gap }
     * {@link Gb }
     * {@link Head }
     * {@link Incident }
     * {@link Index }
     * {@link Interp }
     * {@link InterpGrp }
     * {@link Join }
     * {@link JoinGrp }
     * {@link Kinesic }
     * {@link Lb }
     * {@link Link }
     * {@link LinkGrp }
     * {@link org.tei_c.ns._1.List }
     * {@link ListApp }
     * {@link ListBibl }
     * {@link ListEvent }
     * {@link ListNym }
     * {@link ListObject }
     * {@link ListOrg }
     * {@link ListPerson }
     * {@link ListPlace }
     * {@link ListRelation }
     * {@link ListTranspose }
     * {@link ListWit }
     * {@link Metamark }
     * {@link Milestone }
     * {@link NotatedMusic }
     * {@link Note }
     * {@link NoteGrp }
     * {@link P }
     * {@link Pause }
     * {@link Pb }
     * {@link Performance }
     * {@link Postscript }
     * {@link Precision }
     * {@link Prologue }
     * {@link Respons }
     * {@link SchemaSpec }
     * {@link Set }
     * {@link Shift }
     * {@link Signed }
     * {@link Space }
     * {@link Span }
     * {@link SpanGrp }
     * {@link SubstJoin }
     * {@link Table }
     * {@link Timeline }
     * {@link TitlePage }
     * {@link TitlePart }
     * {@link Trailer }
     * {@link Vocal }
     * {@link WitDetail }
     * {@link Writing }
     * 
     * 
     */
    public java.util.List<java.lang.Object> getSetsAndProloguesAndEpilogues() {
        if (setsAndProloguesAndEpilogues == null) {
            setsAndProloguesAndEpilogues = new ArrayList<java.lang.Object>();
        }
        return this.setsAndProloguesAndEpilogues;
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
    public java.util.List<java.lang.String> getResps() {
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
    public java.util.List<java.lang.String> getExcludes() {
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
    public java.util.List<java.lang.String> getSelects() {
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
    public java.util.List<java.lang.String> getSynches() {
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
    public java.util.List<java.lang.String> getCorresps() {
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
    public java.util.List<java.lang.String> getRenditions() {
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
    public java.util.List<java.lang.String> getRends() {
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
    public java.util.List<java.lang.String> getFacs() {
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
    public java.util.List<java.lang.String> getChanges() {
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
    public java.util.List<java.lang.String> getAnas() {
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
    public java.util.List<java.lang.String> getSources() {
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
     * Gets the value of the decls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the decls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public java.util.List<java.lang.String> getDecls() {
        if (decls == null) {
            decls = new ArrayList<java.lang.String>();
        }
        return this.decls;
    }

}
