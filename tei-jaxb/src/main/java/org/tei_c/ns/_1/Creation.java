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
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.limitedPhrase"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}listChange"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.datable.attributes"/&amp;gt;
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
@XmlRootElement(name = "creation")
public class Creation {

    @XmlElementRefs({
        @XmlElementRef(name = "hi", namespace = "http://www.tei-c.org/ns/1.0", type = Hi.class),
        @XmlElementRef(name = "foreign", namespace = "http://www.tei-c.org/ns/1.0", type = Foreign.class),
        @XmlElementRef(name = "emph", namespace = "http://www.tei-c.org/ns/1.0", type = Emph.class),
        @XmlElementRef(name = "distinct", namespace = "http://www.tei-c.org/ns/1.0", type = Distinct.class),
        @XmlElementRef(name = "mentioned", namespace = "http://www.tei-c.org/ns/1.0", type = Mentioned.class),
        @XmlElementRef(name = "soCalled", namespace = "http://www.tei-c.org/ns/1.0", type = SoCalled.class),
        @XmlElementRef(name = "gloss", namespace = "http://www.tei-c.org/ns/1.0", type = Gloss.class),
        @XmlElementRef(name = "term", namespace = "http://www.tei-c.org/ns/1.0", type = Term.class),
        @XmlElementRef(name = "title", namespace = "http://www.tei-c.org/ns/1.0", type = Title.class),
        @XmlElementRef(name = "code", namespace = "http://www.tei-c.org/ns/1.0", type = Code.class),
        @XmlElementRef(name = "ident", namespace = "http://www.tei-c.org/ns/1.0", type = Ident.class),
        @XmlElementRef(name = "catchwords", namespace = "http://www.tei-c.org/ns/1.0", type = Catchwords.class),
        @XmlElementRef(name = "dimensions", namespace = "http://www.tei-c.org/ns/1.0", type = Dimensions.class),
        @XmlElementRef(name = "heraldry", namespace = "http://www.tei-c.org/ns/1.0", type = Heraldry.class),
        @XmlElementRef(name = "locus", namespace = "http://www.tei-c.org/ns/1.0", type = Locus.class),
        @XmlElementRef(name = "locusGrp", namespace = "http://www.tei-c.org/ns/1.0", type = LocusGrp.class),
        @XmlElementRef(name = "material", namespace = "http://www.tei-c.org/ns/1.0", type = Material.class),
        @XmlElementRef(name = "objectType", namespace = "http://www.tei-c.org/ns/1.0", type = ObjectType.class),
        @XmlElementRef(name = "origDate", namespace = "http://www.tei-c.org/ns/1.0", type = OrigDate.class),
        @XmlElementRef(name = "origPlace", namespace = "http://www.tei-c.org/ns/1.0", type = OrigPlace.class),
        @XmlElementRef(name = "secFol", namespace = "http://www.tei-c.org/ns/1.0", type = SecFol.class),
        @XmlElementRef(name = "signatures", namespace = "http://www.tei-c.org/ns/1.0", type = Signatures.class),
        @XmlElementRef(name = "stamp", namespace = "http://www.tei-c.org/ns/1.0", type = Stamp.class),
        @XmlElementRef(name = "watermark", namespace = "http://www.tei-c.org/ns/1.0", type = Watermark.class),
        @XmlElementRef(name = "choice", namespace = "http://www.tei-c.org/ns/1.0", type = Choice.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.tei-c.org/ns/1.0", type = Abbr.class),
        @XmlElementRef(name = "expan", namespace = "http://www.tei-c.org/ns/1.0", type = Expan.class),
        @XmlElementRef(name = "ex", namespace = "http://www.tei-c.org/ns/1.0", type = Ex.class),
        @XmlElementRef(name = "am", namespace = "http://www.tei-c.org/ns/1.0", type = Am.class),
        @XmlElementRef(name = "subst", namespace = "http://www.tei-c.org/ns/1.0", type = Subst.class),
        @XmlElementRef(name = "ptr", namespace = "http://www.tei-c.org/ns/1.0", type = Ptr.class),
        @XmlElementRef(name = "ref", namespace = "http://www.tei-c.org/ns/1.0", type = Ref.class),
        @XmlElementRef(name = "att", namespace = "http://www.tei-c.org/ns/1.0", type = Att.class),
        @XmlElementRef(name = "gi", namespace = "http://www.tei-c.org/ns/1.0", type = Gi.class),
        @XmlElementRef(name = "tag", namespace = "http://www.tei-c.org/ns/1.0", type = Tag.class),
        @XmlElementRef(name = "val", namespace = "http://www.tei-c.org/ns/1.0", type = Val.class),
        @XmlElementRef(name = "date", namespace = "http://www.tei-c.org/ns/1.0", type = Date.class),
        @XmlElementRef(name = "time", namespace = "http://www.tei-c.org/ns/1.0", type = Time.class),
        @XmlElementRef(name = "num", namespace = "http://www.tei-c.org/ns/1.0", type = Num.class),
        @XmlElementRef(name = "measure", namespace = "http://www.tei-c.org/ns/1.0", type = Measure.class),
        @XmlElementRef(name = "measureGrp", namespace = "http://www.tei-c.org/ns/1.0", type = MeasureGrp.class),
        @XmlElementRef(name = "unit", namespace = "http://www.tei-c.org/ns/1.0", type = Unit.class),
        @XmlElementRef(name = "dim", namespace = "http://www.tei-c.org/ns/1.0", type = Dim.class),
        @XmlElementRef(name = "height", namespace = "http://www.tei-c.org/ns/1.0", type = Height.class),
        @XmlElementRef(name = "depth", namespace = "http://www.tei-c.org/ns/1.0", type = Depth.class),
        @XmlElementRef(name = "width", namespace = "http://www.tei-c.org/ns/1.0", type = Width.class),
        @XmlElementRef(name = "geo", namespace = "http://www.tei-c.org/ns/1.0", type = Geo.class),
        @XmlElementRef(name = "email", namespace = "http://www.tei-c.org/ns/1.0", type = Email.class),
        @XmlElementRef(name = "address", namespace = "http://www.tei-c.org/ns/1.0", type = Address.class),
        @XmlElementRef(name = "affiliation", namespace = "http://www.tei-c.org/ns/1.0", type = Affiliation.class),
        @XmlElementRef(name = "name", namespace = "http://www.tei-c.org/ns/1.0", type = Name.class),
        @XmlElementRef(name = "orgName", namespace = "http://www.tei-c.org/ns/1.0", type = OrgName.class),
        @XmlElementRef(name = "persName", namespace = "http://www.tei-c.org/ns/1.0", type = PersName.class),
        @XmlElementRef(name = "offset", namespace = "http://www.tei-c.org/ns/1.0", type = Offset.class),
        @XmlElementRef(name = "geogFeat", namespace = "http://www.tei-c.org/ns/1.0", type = GeogFeat.class),
        @XmlElementRef(name = "placeName", namespace = "http://www.tei-c.org/ns/1.0", type = PlaceName.class),
        @XmlElementRef(name = "bloc", namespace = "http://www.tei-c.org/ns/1.0", type = Bloc.class),
        @XmlElementRef(name = "country", namespace = "http://www.tei-c.org/ns/1.0", type = Country.class),
        @XmlElementRef(name = "region", namespace = "http://www.tei-c.org/ns/1.0", type = Region.class),
        @XmlElementRef(name = "settlement", namespace = "http://www.tei-c.org/ns/1.0", type = Settlement.class),
        @XmlElementRef(name = "district", namespace = "http://www.tei-c.org/ns/1.0", type = District.class),
        @XmlElementRef(name = "geogName", namespace = "http://www.tei-c.org/ns/1.0", type = GeogName.class),
        @XmlElementRef(name = "climate", namespace = "http://www.tei-c.org/ns/1.0", type = Climate.class),
        @XmlElementRef(name = "location", namespace = "http://www.tei-c.org/ns/1.0", type = Location.class),
        @XmlElementRef(name = "population", namespace = "http://www.tei-c.org/ns/1.0", type = Population.class),
        @XmlElementRef(name = "state", namespace = "http://www.tei-c.org/ns/1.0", type = State.class),
        @XmlElementRef(name = "terrain", namespace = "http://www.tei-c.org/ns/1.0", type = Terrain.class),
        @XmlElementRef(name = "trait", namespace = "http://www.tei-c.org/ns/1.0", type = Trait.class),
        @XmlElementRef(name = "rs", namespace = "http://www.tei-c.org/ns/1.0", type = Rs.class),
        @XmlElementRef(name = "lang", namespace = "http://www.tei-c.org/ns/1.0", type = Lang.class),
        @XmlElementRef(name = "idno", namespace = "http://www.tei-c.org/ns/1.0", type = Idno.class),
        @XmlElementRef(name = "surname", namespace = "http://www.tei-c.org/ns/1.0", type = Surname.class),
        @XmlElementRef(name = "forename", namespace = "http://www.tei-c.org/ns/1.0", type = Forename.class),
        @XmlElementRef(name = "genName", namespace = "http://www.tei-c.org/ns/1.0", type = GenName.class),
        @XmlElementRef(name = "nameLink", namespace = "http://www.tei-c.org/ns/1.0", type = NameLink.class),
        @XmlElementRef(name = "addName", namespace = "http://www.tei-c.org/ns/1.0", type = AddName.class),
        @XmlElementRef(name = "roleName", namespace = "http://www.tei-c.org/ns/1.0", type = RoleName.class),
        @XmlElementRef(name = "objectName", namespace = "http://www.tei-c.org/ns/1.0", type = ObjectName.class),
        @XmlElementRef(name = "listChange", namespace = "http://www.tei-c.org/ns/1.0", type = ListChange.class)
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
    @XmlAttribute(name = "datingMethod")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String datingMethod;
    @XmlAttribute(name = "when-custom")
    protected List<java.lang.String> whenCustoms;
    @XmlAttribute(name = "from-custom")
    protected List<java.lang.String> fromCustoms;
    @XmlAttribute(name = "notAfter-custom")
    protected List<java.lang.String> notAfterCustoms;
    @XmlAttribute(name = "datingPoint")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String datingPoint;
    @XmlAttribute(name = "to-custom")
    protected List<java.lang.String> toCustoms;
    @XmlAttribute(name = "notBefore-custom")
    protected List<java.lang.String> notBeforeCustoms;
    @XmlAttribute(name = "from")
    protected java.lang.String from;
    @XmlAttribute(name = "when")
    protected java.lang.String when;
    @XmlAttribute(name = "notBefore")
    protected java.lang.String notBefore;
    @XmlAttribute(name = "notAfter")
    protected java.lang.String notAfter;
    @XmlAttribute(name = "to")
    protected java.lang.String to;
    @XmlAttribute(name = "calendar")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String calendar;
    @XmlAttribute(name = "period")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String period;
    @XmlAttribute(name = "to-iso")
    protected java.lang.String toIso;
    @XmlAttribute(name = "from-iso")
    protected java.lang.String fromIso;
    @XmlAttribute(name = "notAfter-iso")
    protected java.lang.String notAfterIso;
    @XmlAttribute(name = "when-iso")
    protected java.lang.String whenIso;
    @XmlAttribute(name = "notBefore-iso")
    protected java.lang.String notBeforeIso;

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
     * {@link Hi }
     * {@link Foreign }
     * {@link Emph }
     * {@link Distinct }
     * {@link Mentioned }
     * {@link SoCalled }
     * {@link Gloss }
     * {@link Term }
     * {@link Title }
     * {@link Code }
     * {@link Ident }
     * {@link Catchwords }
     * {@link Dimensions }
     * {@link Heraldry }
     * {@link Locus }
     * {@link LocusGrp }
     * {@link Material }
     * {@link ObjectType }
     * {@link OrigDate }
     * {@link OrigPlace }
     * {@link SecFol }
     * {@link Signatures }
     * {@link Stamp }
     * {@link Watermark }
     * {@link Choice }
     * {@link Abbr }
     * {@link Expan }
     * {@link Ex }
     * {@link Am }
     * {@link Subst }
     * {@link Ptr }
     * {@link Ref }
     * {@link Att }
     * {@link Gi }
     * {@link Tag }
     * {@link Val }
     * {@link Date }
     * {@link Time }
     * {@link Num }
     * {@link Measure }
     * {@link MeasureGrp }
     * {@link Unit }
     * {@link Dim }
     * {@link Height }
     * {@link Depth }
     * {@link Width }
     * {@link Geo }
     * {@link Email }
     * {@link Address }
     * {@link Affiliation }
     * {@link Name }
     * {@link OrgName }
     * {@link PersName }
     * {@link Offset }
     * {@link GeogFeat }
     * {@link PlaceName }
     * {@link Bloc }
     * {@link Country }
     * {@link Region }
     * {@link Settlement }
     * {@link District }
     * {@link GeogName }
     * {@link Climate }
     * {@link Location }
     * {@link Population }
     * {@link State }
     * {@link Terrain }
     * {@link Trait }
     * {@link Rs }
     * {@link Lang }
     * {@link Idno }
     * {@link Surname }
     * {@link Forename }
     * {@link GenName }
     * {@link NameLink }
     * {@link AddName }
     * {@link RoleName }
     * {@link ObjectName }
     * {@link ListChange }
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

    /**
     * Ruft den Wert der datingMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDatingMethod() {
        return datingMethod;
    }

    /**
     * Legt den Wert der datingMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDatingMethod(java.lang.String value) {
        this.datingMethod = value;
    }

    /**
     * Gets the value of the whenCustoms property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the whenCustoms property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWhenCustoms().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getWhenCustoms() {
        if (whenCustoms == null) {
            whenCustoms = new ArrayList<java.lang.String>();
        }
        return this.whenCustoms;
    }

    /**
     * Gets the value of the fromCustoms property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fromCustoms property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFromCustoms().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getFromCustoms() {
        if (fromCustoms == null) {
            fromCustoms = new ArrayList<java.lang.String>();
        }
        return this.fromCustoms;
    }

    /**
     * Gets the value of the notAfterCustoms property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the notAfterCustoms property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNotAfterCustoms().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getNotAfterCustoms() {
        if (notAfterCustoms == null) {
            notAfterCustoms = new ArrayList<java.lang.String>();
        }
        return this.notAfterCustoms;
    }

    /**
     * Ruft den Wert der datingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDatingPoint() {
        return datingPoint;
    }

    /**
     * Legt den Wert der datingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDatingPoint(java.lang.String value) {
        this.datingPoint = value;
    }

    /**
     * Gets the value of the toCustoms property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the toCustoms property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getToCustoms().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getToCustoms() {
        if (toCustoms == null) {
            toCustoms = new ArrayList<java.lang.String>();
        }
        return this.toCustoms;
    }

    /**
     * Gets the value of the notBeforeCustoms property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the notBeforeCustoms property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNotBeforeCustoms().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getNotBeforeCustoms() {
        if (notBeforeCustoms == null) {
            notBeforeCustoms = new ArrayList<java.lang.String>();
        }
        return this.notBeforeCustoms;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFrom(java.lang.String value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der when-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getWhen() {
        return when;
    }

    /**
     * Legt den Wert der when-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setWhen(java.lang.String value) {
        this.when = value;
    }

    /**
     * Ruft den Wert der notBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNotBefore() {
        return notBefore;
    }

    /**
     * Legt den Wert der notBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNotBefore(java.lang.String value) {
        this.notBefore = value;
    }

    /**
     * Ruft den Wert der notAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNotAfter() {
        return notAfter;
    }

    /**
     * Legt den Wert der notAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNotAfter(java.lang.String value) {
        this.notAfter = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTo(java.lang.String value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der calendar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCalendar() {
        return calendar;
    }

    /**
     * Legt den Wert der calendar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCalendar(java.lang.String value) {
        this.calendar = value;
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPeriod(java.lang.String value) {
        this.period = value;
    }

    /**
     * Ruft den Wert der toIso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getToIso() {
        return toIso;
    }

    /**
     * Legt den Wert der toIso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setToIso(java.lang.String value) {
        this.toIso = value;
    }

    /**
     * Ruft den Wert der fromIso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFromIso() {
        return fromIso;
    }

    /**
     * Legt den Wert der fromIso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFromIso(java.lang.String value) {
        this.fromIso = value;
    }

    /**
     * Ruft den Wert der notAfterIso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNotAfterIso() {
        return notAfterIso;
    }

    /**
     * Legt den Wert der notAfterIso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNotAfterIso(java.lang.String value) {
        this.notAfterIso = value;
    }

    /**
     * Ruft den Wert der whenIso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getWhenIso() {
        return whenIso;
    }

    /**
     * Legt den Wert der whenIso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setWhenIso(java.lang.String value) {
        this.whenIso = value;
    }

    /**
     * Ruft den Wert der notBeforeIso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNotBeforeIso() {
        return notBeforeIso;
    }

    /**
     * Legt den Wert der notBeforeIso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNotBeforeIso(java.lang.String value) {
        this.notBeforeIso = value;
    }

    @Override
    public java.lang.String toString() {
        return new StringJoiner(", ", Creation.class.getSimpleName() + "[", "]")
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
            .add("datingMethod='" + datingMethod + "'")
            .add("whenCustoms=" + whenCustoms)
            .add("fromCustoms=" + fromCustoms)
            .add("notAfterCustoms=" + notAfterCustoms)
            .add("datingPoint='" + datingPoint + "'")
            .add("toCustoms=" + toCustoms)
            .add("notBeforeCustoms=" + notBeforeCustoms)
            .add("from='" + from + "'")
            .add("when='" + when + "'")
            .add("notBefore='" + notBefore + "'")
            .add("notAfter='" + notAfter + "'")
            .add("to='" + to + "'")
            .add("calendar='" + calendar + "'")
            .add("period='" + period + "'")
            .add("toIso='" + toIso + "'")
            .add("fromIso='" + fromIso + "'")
            .add("notAfterIso='" + notAfterIso + "'")
            .add("whenIso='" + whenIso + "'")
            .add("notBeforeIso='" + notBeforeIso + "'")
            .toString();
    }
}
