/*
 * MIT License
 *
 * Copyright (c) 2023 Staatsbibliothek zu Berlin - Preußischer Kulturbesitz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.4.0-SNAPSHOT generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.03.03 um 05:11:39 PM CET 
//


package org.tei_c.ns._1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java-Klasse für anonymous complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.gLike"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}title"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.ptrLike"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}editor"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}respStmt"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}biblScope"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}idno"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}textLang"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}availability"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "series")
public class Series {

    @XmlElementRefs({
        @XmlElementRef(name = "g", namespace = "http://www.tei-c.org/ns/1.0", type = G.class),
        @XmlElementRef(name = "title", namespace = "http://www.tei-c.org/ns/1.0", type = Title.class),
        @XmlElementRef(name = "ptr", namespace = "http://www.tei-c.org/ns/1.0", type = Ptr.class),
        @XmlElementRef(name = "ref", namespace = "http://www.tei-c.org/ns/1.0", type = Ref.class),
        @XmlElementRef(name = "editor", namespace = "http://www.tei-c.org/ns/1.0", type = Editor.class),
        @XmlElementRef(name = "respStmt", namespace = "http://www.tei-c.org/ns/1.0", type = RespStmt.class),
        @XmlElementRef(name = "biblScope", namespace = "http://www.tei-c.org/ns/1.0", type = BiblScope.class),
        @XmlElementRef(name = "idno", namespace = "http://www.tei-c.org/ns/1.0", type = Idno.class),
        @XmlElementRef(name = "textLang", namespace = "http://www.tei-c.org/ns/1.0", type = TextLang.class),
        @XmlElementRef(name = "index", namespace = "http://www.tei-c.org/ns/1.0", type = Index.class),
        @XmlElementRef(name = "span", namespace = "http://www.tei-c.org/ns/1.0", type = Span.class),
        @XmlElementRef(name = "spanGrp", namespace = "http://www.tei-c.org/ns/1.0", type = SpanGrp.class),
        @XmlElementRef(name = "interp", namespace = "http://www.tei-c.org/ns/1.0", type = Interp.class),
        @XmlElementRef(name = "interpGrp", namespace = "http://www.tei-c.org/ns/1.0", type = InterpGrp.class),
        @XmlElementRef(name = "precision", namespace = "http://www.tei-c.org/ns/1.0", type = Precision.class),
        @XmlElementRef(name = "certainty", namespace = "http://www.tei-c.org/ns/1.0", type = Certainty.class),
        @XmlElementRef(name = "respons", namespace = "http://www.tei-c.org/ns/1.0", type = Respons.class),
        @XmlElementRef(name = "fs", namespace = "http://www.tei-c.org/ns/1.0", type = Fs.class),
        @XmlElementRef(name = "fLib", namespace = "http://www.tei-c.org/ns/1.0", type = FLib.class),
        @XmlElementRef(name = "fvLib", namespace = "http://www.tei-c.org/ns/1.0", type = FvLib.class),
        @XmlElementRef(name = "link", namespace = "http://www.tei-c.org/ns/1.0", type = Link.class),
        @XmlElementRef(name = "linkGrp", namespace = "http://www.tei-c.org/ns/1.0", type = LinkGrp.class),
        @XmlElementRef(name = "timeline", namespace = "http://www.tei-c.org/ns/1.0", type = Timeline.class),
        @XmlElementRef(name = "join", namespace = "http://www.tei-c.org/ns/1.0", type = Join.class),
        @XmlElementRef(name = "joinGrp", namespace = "http://www.tei-c.org/ns/1.0", type = JoinGrp.class),
        @XmlElementRef(name = "alt", namespace = "http://www.tei-c.org/ns/1.0", type = Alt.class),
        @XmlElementRef(name = "altGrp", namespace = "http://www.tei-c.org/ns/1.0", type = AltGrp.class),
        @XmlElementRef(name = "substJoin", namespace = "http://www.tei-c.org/ns/1.0", type = SubstJoin.class),
        @XmlElementRef(name = "listTranspose", namespace = "http://www.tei-c.org/ns/1.0", type = ListTranspose.class),
        @XmlElementRef(name = "milestone", namespace = "http://www.tei-c.org/ns/1.0", type = Milestone.class),
        @XmlElementRef(name = "gb", namespace = "http://www.tei-c.org/ns/1.0", type = Gb.class),
        @XmlElementRef(name = "pb", namespace = "http://www.tei-c.org/ns/1.0", type = Pb.class),
        @XmlElementRef(name = "lb", namespace = "http://www.tei-c.org/ns/1.0", type = Lb.class),
        @XmlElementRef(name = "cb", namespace = "http://www.tei-c.org/ns/1.0", type = Cb.class),
        @XmlElementRef(name = "anchor", namespace = "http://www.tei-c.org/ns/1.0", type = Anchor.class),
        @XmlElementRef(name = "fw", namespace = "http://www.tei-c.org/ns/1.0", type = Fw.class),
        @XmlElementRef(name = "note", namespace = "http://www.tei-c.org/ns/1.0", type = Note.class),
        @XmlElementRef(name = "gap", namespace = "http://www.tei-c.org/ns/1.0", type = Gap.class),
        @XmlElementRef(name = "app", namespace = "http://www.tei-c.org/ns/1.0", type = App.class),
        @XmlElementRef(name = "witDetail", namespace = "http://www.tei-c.org/ns/1.0", type = WitDetail.class),
        @XmlElementRef(name = "addSpan", namespace = "http://www.tei-c.org/ns/1.0", type = AddSpan.class),
        @XmlElementRef(name = "damageSpan", namespace = "http://www.tei-c.org/ns/1.0", type = DamageSpan.class),
        @XmlElementRef(name = "delSpan", namespace = "http://www.tei-c.org/ns/1.0", type = DelSpan.class),
        @XmlElementRef(name = "space", namespace = "http://www.tei-c.org/ns/1.0", type = Space.class),
        @XmlElementRef(name = "notatedMusic", namespace = "http://www.tei-c.org/ns/1.0", type = NotatedMusic.class),
        @XmlElementRef(name = "figure", namespace = "http://www.tei-c.org/ns/1.0", type = Figure.class),
        @XmlElementRef(name = "pause", namespace = "http://www.tei-c.org/ns/1.0", type = Pause.class),
        @XmlElementRef(name = "vocal", namespace = "http://www.tei-c.org/ns/1.0", type = Vocal.class),
        @XmlElementRef(name = "kinesic", namespace = "http://www.tei-c.org/ns/1.0", type = Kinesic.class),
        @XmlElementRef(name = "incident", namespace = "http://www.tei-c.org/ns/1.0", type = Incident.class),
        @XmlElementRef(name = "writing", namespace = "http://www.tei-c.org/ns/1.0", type = Writing.class),
        @XmlElementRef(name = "shift", namespace = "http://www.tei-c.org/ns/1.0", type = Shift.class),
        @XmlElementRef(name = "metamark", namespace = "http://www.tei-c.org/ns/1.0", type = Metamark.class),
        @XmlElementRef(name = "availability", namespace = "http://www.tei-c.org/ns/1.0", type = Availability.class)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "rend")
    protected List<java.lang.String> rends;
    @XmlAttribute(name = "rendition")
    protected List<java.lang.String> renditions;
    @XmlAttribute(name = "style")
    protected java.lang.String style;
    @XmlAttribute(name = "facs")
    protected List<java.lang.String> facs;
    @XmlAttribute(name = "next")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String next;
    @XmlAttribute(name = "synch")
    protected List<java.lang.String> synches;
    @XmlAttribute(name = "prev")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String prev;
    @XmlAttribute(name = "exclude")
    protected List<java.lang.String> excludes;
    @XmlAttribute(name = "sameAs")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String sameAs;
    @XmlAttribute(name = "copyOf")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String copyOf;
    @XmlAttribute(name = "corresp")
    protected List<java.lang.String> corresps;
    @XmlAttribute(name = "select")
    protected List<java.lang.String> selects;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String base;
    @XmlAttribute(name = "ana")
    protected List<java.lang.String> anas;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(name = "change")
    protected List<java.lang.String> changes;
    @XmlAttribute(name = "resp")
    protected List<java.lang.String> resps;
    @XmlAttribute(name = "cert")
    protected java.lang.String cert;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String lang;
    @XmlAttribute(name = "source")
    protected List<java.lang.String> sources;
    @XmlAttribute(name = "n")
    protected java.lang.String n;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String space;

    /**
     * Gets the value of the content property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the content property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link G }
     * {@link Title }
     * {@link Ptr }
     * {@link Ref }
     * {@link Editor }
     * {@link RespStmt }
     * {@link BiblScope }
     * {@link Idno }
     * {@link TextLang }
     * {@link Index }
     * {@link Span }
     * {@link SpanGrp }
     * {@link Interp }
     * {@link InterpGrp }
     * {@link Precision }
     * {@link Certainty }
     * {@link Respons }
     * {@link Fs }
     * {@link FLib }
     * {@link FvLib }
     * {@link Link }
     * {@link LinkGrp }
     * {@link Timeline }
     * {@link Join }
     * {@link JoinGrp }
     * {@link Alt }
     * {@link AltGrp }
     * {@link SubstJoin }
     * {@link ListTranspose }
     * {@link Milestone }
     * {@link Gb }
     * {@link Pb }
     * {@link Lb }
     * {@link Cb }
     * {@link Anchor }
     * {@link Fw }
     * {@link Note }
     * {@link Gap }
     * {@link App }
     * {@link WitDetail }
     * {@link AddSpan }
     * {@link DamageSpan }
     * {@link DelSpan }
     * {@link Space }
     * {@link NotatedMusic }
     * {@link Figure }
     * {@link Pause }
     * {@link Vocal }
     * {@link Kinesic }
     * {@link Incident }
     * {@link Writing }
     * {@link Shift }
     * {@link Metamark }
     * {@link Availability }
     * {@link java.lang.String }
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
     * Gets the value of the rends property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rends property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRends().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the renditions property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the renditions property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRenditions().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the facs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFacs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the synches property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the synches property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSynches().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the excludes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExcludes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the corresps property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the corresps property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCorresps().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the selects property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the selects property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSelects().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the anas property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the anas property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnas().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the changes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the changes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getChanges().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the resps property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resps property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getResps().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * Gets the value of the sources property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sources property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSources().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

    @Override
    public java.lang.String toString() {
        return new StringJoiner(", ", Series.class.getSimpleName() + "[", "]")
            .add("content=" + content)
            .add("rends=" + rends)
            .add("renditions=" + renditions)
            .add("style='" + style + "'")
            .add("facs=" + facs)
            .add("next='" + next + "'")
            .add("synches=" + synches)
            .add("prev='" + prev + "'")
            .add("excludes=" + excludes)
            .add("sameAs='" + sameAs + "'")
            .add("copyOf='" + copyOf + "'")
            .add("corresps=" + corresps)
            .add("selects=" + selects)
            .add("base='" + base + "'")
            .add("anas=" + anas)
            .add("id='" + id + "'")
            .add("changes=" + changes)
            .add("resps=" + resps)
            .add("cert='" + cert + "'")
            .add("lang='" + lang + "'")
            .add("sources=" + sources)
            .add("n='" + n + "'")
            .add("space='" + space + "'")
            .toString();
    }
}
