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
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.tei-c.org/ns/1.0}model.pLike" maxOccurs="unbounded"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.personPart"/&gt;
 *           &lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&gt;
 *           &lt;element ref="{http://www.tei-c.org/ns/1.0}ptr"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.sortable.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.editLike.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&gt;
 *       &lt;attribute name="role"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction&gt;
 *             &lt;simpleType&gt;
 *               &lt;list&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                     &lt;pattern value="[^\p{C}\p{Z}]+"/&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/simpleType&gt;
 *               &lt;/list&gt;
 *             &lt;/simpleType&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="sex"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction&gt;
 *             &lt;simpleType&gt;
 *               &lt;list&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                     &lt;pattern value="[^\p{C}\p{Z}]+"/&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/simpleType&gt;
 *               &lt;/list&gt;
 *             &lt;/simpleType&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="gender"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction&gt;
 *             &lt;simpleType&gt;
 *               &lt;list&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                     &lt;pattern value="[^\p{C}\p{Z}]+"/&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/simpleType&gt;
 *               &lt;/list&gt;
 *             &lt;/simpleType&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="age"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;pattern value="[^\p{C}\p{Z}]+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "biblsAndBiblStructsAndListBibls",
    "psAndAbs"
})
@XmlRootElement(name = "person")
public class Person {

    @XmlElements({
        @XmlElement(name = "bibl", type = Bibl.class),
        @XmlElement(name = "biblStruct", type = BiblStruct.class),
        @XmlElement(name = "listBibl", type = ListBibl.class),
        @XmlElement(name = "biblFull", type = BiblFull.class),
        @XmlElement(name = "msDesc", type = MsDesc.class),
        @XmlElement(name = "event", type = Event.class),
        @XmlElement(name = "listEvent", type = ListEvent.class),
        @XmlElement(name = "persName", type = PersName.class),
        @XmlElement(name = "affiliation", type = Affiliation.class),
        @XmlElement(name = "age", type = Age.class),
        @XmlElement(name = "education", type = Education.class),
        @XmlElement(name = "faith", type = Faith.class),
        @XmlElement(name = "floruit", type = Floruit.class),
        @XmlElement(name = "gender", type = Gender.class),
        @XmlElement(name = "langKnowledge", type = LangKnowledge.class),
        @XmlElement(name = "nationality", type = Nationality.class),
        @XmlElement(name = "occupation", type = Occupation.class),
        @XmlElement(name = "persona", type = Persona.class),
        @XmlElement(name = "persPronouns", type = PersPronouns.class),
        @XmlElement(name = "residence", type = Residence.class),
        @XmlElement(name = "sex", type = Sex.class),
        @XmlElement(name = "socecStatus", type = SocecStatus.class),
        @XmlElement(name = "state", type = State.class),
        @XmlElement(name = "trait", type = Trait.class),
        @XmlElement(name = "name", type = Name.class),
        @XmlElement(name = "idno", type = Idno.class),
        @XmlElement(name = "birth", type = Birth.class),
        @XmlElement(name = "death", type = Death.class),
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
        @XmlElement(name = "ptr", type = Ptr.class)
    })
    protected List<java.lang.Object> biblsAndBiblStructsAndListBibls;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ab", type = Ab.class)
    })
    protected List<java.lang.Object> psAndAbs;
    @XmlAttribute(name = "role")
    protected List<java.lang.String> roles;
    @XmlAttribute(name = "sex")
    protected List<java.lang.String> sices;
    @XmlAttribute(name = "gender")
    protected List<java.lang.String> genders;
    @XmlAttribute(name = "age")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String age;
    @XmlAttribute(name = "sortKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String sortKey;
    @XmlAttribute(name = "instant")
    protected java.lang.String instant;
    @XmlAttribute(name = "evidence")
    protected List<java.lang.String> evidences;
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
     * Gets the value of the biblsAndBiblStructsAndListBibls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the biblsAndBiblStructsAndListBibls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiblsAndBiblStructsAndListBibls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddSpan }
     * {@link Affiliation }
     * {@link Age }
     * {@link Alt }
     * {@link AltGrp }
     * {@link Anchor }
     * {@link App }
     * {@link Bibl }
     * {@link BiblFull }
     * {@link BiblStruct }
     * {@link Birth }
     * {@link Cb }
     * {@link Certainty }
     * {@link DamageSpan }
     * {@link Death }
     * {@link DelSpan }
     * {@link Education }
     * {@link Ellipsis }
     * {@link Event }
     * {@link FLib }
     * {@link Faith }
     * {@link Figure }
     * {@link Floruit }
     * {@link Fs }
     * {@link FvLib }
     * {@link Fw }
     * {@link Gap }
     * {@link Gb }
     * {@link Gender }
     * {@link Idno }
     * {@link Incident }
     * {@link Index }
     * {@link Interp }
     * {@link InterpGrp }
     * {@link Join }
     * {@link JoinGrp }
     * {@link Kinesic }
     * {@link LangKnowledge }
     * {@link Lb }
     * {@link Link }
     * {@link LinkGrp }
     * {@link ListBibl }
     * {@link ListEvent }
     * {@link ListTranspose }
     * {@link Metamark }
     * {@link Milestone }
     * {@link MsDesc }
     * {@link Name }
     * {@link Nationality }
     * {@link NotatedMusic }
     * {@link Note }
     * {@link NoteGrp }
     * {@link Occupation }
     * {@link Pause }
     * {@link Pb }
     * {@link PersName }
     * {@link PersPronouns }
     * {@link Persona }
     * {@link Precision }
     * {@link Ptr }
     * {@link Residence }
     * {@link Respons }
     * {@link Sex }
     * {@link Shift }
     * {@link SocecStatus }
     * {@link Space }
     * {@link Span }
     * {@link SpanGrp }
     * {@link State }
     * {@link SubstJoin }
     * {@link Timeline }
     * {@link Trait }
     * {@link Vocal }
     * {@link WitDetail }
     * {@link Writing }
     * 
     * 
     */
    public List<java.lang.Object> getBiblsAndBiblStructsAndListBibls() {
        if (biblsAndBiblStructsAndListBibls == null) {
            biblsAndBiblStructsAndListBibls = new ArrayList<java.lang.Object>();
        }
        return this.biblsAndBiblStructsAndListBibls;
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
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getRoles() {
        if (roles == null) {
            roles = new ArrayList<java.lang.String>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the sices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getSices() {
        if (sices == null) {
            sices = new ArrayList<java.lang.String>();
        }
        return this.sices;
    }

    /**
     * Gets the value of the genders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the genders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getGenders() {
        if (genders == null) {
            genders = new ArrayList<java.lang.String>();
        }
        return this.genders;
    }

    /**
     * Ruft den Wert der age-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAge() {
        return age;
    }

    /**
     * Legt den Wert der age-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAge(java.lang.String value) {
        this.age = value;
    }

    /**
     * Ruft den Wert der sortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSortKey() {
        return sortKey;
    }

    /**
     * Legt den Wert der sortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSortKey(java.lang.String value) {
        this.sortKey = value;
    }

    /**
     * Ruft den Wert der instant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getInstant() {
        if (instant == null) {
            return "false";
        } else {
            return instant;
        }
    }

    /**
     * Legt den Wert der instant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setInstant(java.lang.String value) {
        this.instant = value;
    }

    /**
     * Gets the value of the evidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the evidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getEvidences() {
        if (evidences == null) {
            evidences = new ArrayList<java.lang.String>();
        }
        return this.evidences;
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
