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
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&gt;
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.gaijiProp.attribute.version"/&gt;
 *       &lt;attribute name="name" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Age"/&gt;
 *             &lt;enumeration value="AHex"/&gt;
 *             &lt;enumeration value="Alpha"/&gt;
 *             &lt;enumeration value="Alphabetic"/&gt;
 *             &lt;enumeration value="ASCII_Hex_Digit"/&gt;
 *             &lt;enumeration value="bc"/&gt;
 *             &lt;enumeration value="Bidi_C"/&gt;
 *             &lt;enumeration value="Bidi_Class"/&gt;
 *             &lt;enumeration value="Bidi_Control"/&gt;
 *             &lt;enumeration value="Bidi_M"/&gt;
 *             &lt;enumeration value="Bidi_Mirrored"/&gt;
 *             &lt;enumeration value="Bidi_Mirroring_Glyph"/&gt;
 *             &lt;enumeration value="Bidi_Paired_Bracket"/&gt;
 *             &lt;enumeration value="Bidi_Paired_Bracket_Type"/&gt;
 *             &lt;enumeration value="blk"/&gt;
 *             &lt;enumeration value="Block"/&gt;
 *             &lt;enumeration value="bmg"/&gt;
 *             &lt;enumeration value="bpb"/&gt;
 *             &lt;enumeration value="bpt"/&gt;
 *             &lt;enumeration value="Canonical_Combining_Class"/&gt;
 *             &lt;enumeration value="Case_Folding"/&gt;
 *             &lt;enumeration value="Case_Ignorable"/&gt;
 *             &lt;enumeration value="Cased"/&gt;
 *             &lt;enumeration value="ccc"/&gt;
 *             &lt;enumeration value="CE"/&gt;
 *             &lt;enumeration value="cf"/&gt;
 *             &lt;enumeration value="Changes_When_Casefolded"/&gt;
 *             &lt;enumeration value="Changes_When_Casemapped"/&gt;
 *             &lt;enumeration value="Changes_When_Lowercased"/&gt;
 *             &lt;enumeration value="Changes_When_NFKC_Casefolded"/&gt;
 *             &lt;enumeration value="Changes_When_Titlecased"/&gt;
 *             &lt;enumeration value="Changes_When_Uppercased"/&gt;
 *             &lt;enumeration value="CI"/&gt;
 *             &lt;enumeration value="Comp_Ex"/&gt;
 *             &lt;enumeration value="Composition_Exclusion"/&gt;
 *             &lt;enumeration value="CWCF"/&gt;
 *             &lt;enumeration value="CWCM"/&gt;
 *             &lt;enumeration value="CWKCF"/&gt;
 *             &lt;enumeration value="CWL"/&gt;
 *             &lt;enumeration value="CWT"/&gt;
 *             &lt;enumeration value="CWU"/&gt;
 *             &lt;enumeration value="Dash"/&gt;
 *             &lt;enumeration value="Decomposition_Mapping"/&gt;
 *             &lt;enumeration value="Decomposition_Type"/&gt;
 *             &lt;enumeration value="Default_Ignorable_Code_Point"/&gt;
 *             &lt;enumeration value="Dep"/&gt;
 *             &lt;enumeration value="Deprecated"/&gt;
 *             &lt;enumeration value="DI"/&gt;
 *             &lt;enumeration value="Dia"/&gt;
 *             &lt;enumeration value="Diacritic"/&gt;
 *             &lt;enumeration value="dm"/&gt;
 *             &lt;enumeration value="dt"/&gt;
 *             &lt;enumeration value="ea"/&gt;
 *             &lt;enumeration value="East_Asian_Width"/&gt;
 *             &lt;enumeration value="EqUIdeo"/&gt;
 *             &lt;enumeration value="Equivalent_Unified_Ideograph"/&gt;
 *             &lt;enumeration value="Expands_On_NFC"/&gt;
 *             &lt;enumeration value="Expands_On_NFD"/&gt;
 *             &lt;enumeration value="Expands_On_NFKC"/&gt;
 *             &lt;enumeration value="Expands_On_NFKD"/&gt;
 *             &lt;enumeration value="Ext"/&gt;
 *             &lt;enumeration value="Extender"/&gt;
 *             &lt;enumeration value="FC_NFKC"/&gt;
 *             &lt;enumeration value="FC_NFKC_Closure"/&gt;
 *             &lt;enumeration value="Full_Composition_Exclusion"/&gt;
 *             &lt;enumeration value="gc"/&gt;
 *             &lt;enumeration value="GCB"/&gt;
 *             &lt;enumeration value="General_Category"/&gt;
 *             &lt;enumeration value="Gr_Base"/&gt;
 *             &lt;enumeration value="Gr_Ext"/&gt;
 *             &lt;enumeration value="Gr_Link"/&gt;
 *             &lt;enumeration value="Grapheme_Base"/&gt;
 *             &lt;enumeration value="Grapheme_Cluster_Break"/&gt;
 *             &lt;enumeration value="Grapheme_Extend"/&gt;
 *             &lt;enumeration value="Grapheme_Link"/&gt;
 *             &lt;enumeration value="Hangul_Syllable_Type"/&gt;
 *             &lt;enumeration value="Hex"/&gt;
 *             &lt;enumeration value="Hex_Digit"/&gt;
 *             &lt;enumeration value="hst"/&gt;
 *             &lt;enumeration value="Hyphen"/&gt;
 *             &lt;enumeration value="ID_Continue"/&gt;
 *             &lt;enumeration value="ID_Start"/&gt;
 *             &lt;enumeration value="IDC"/&gt;
 *             &lt;enumeration value="Ideo"/&gt;
 *             &lt;enumeration value="Ideographic"/&gt;
 *             &lt;enumeration value="IDS"/&gt;
 *             &lt;enumeration value="IDS_Binary_Operator"/&gt;
 *             &lt;enumeration value="IDS_Trinary_Operator"/&gt;
 *             &lt;enumeration value="IDSB"/&gt;
 *             &lt;enumeration value="IDST"/&gt;
 *             &lt;enumeration value="Indic_Positional_Category"/&gt;
 *             &lt;enumeration value="Indic_Syllabic_Category"/&gt;
 *             &lt;enumeration value="InPC"/&gt;
 *             &lt;enumeration value="InSC"/&gt;
 *             &lt;enumeration value="isc"/&gt;
 *             &lt;enumeration value="ISO_Comment"/&gt;
 *             &lt;enumeration value="Jamo_Short_Name"/&gt;
 *             &lt;enumeration value="jg"/&gt;
 *             &lt;enumeration value="Join_C"/&gt;
 *             &lt;enumeration value="Join_Control"/&gt;
 *             &lt;enumeration value="Joining_Group"/&gt;
 *             &lt;enumeration value="Joining_Type"/&gt;
 *             &lt;enumeration value="JSN"/&gt;
 *             &lt;enumeration value="jt"/&gt;
 *             &lt;enumeration value="kAccountingNumeric"/&gt;
 *             &lt;enumeration value="kCompatibilityVariant"/&gt;
 *             &lt;enumeration value="kIICore"/&gt;
 *             &lt;enumeration value="kIRG_GSource"/&gt;
 *             &lt;enumeration value="kIRG_HSource"/&gt;
 *             &lt;enumeration value="kIRG_JSource"/&gt;
 *             &lt;enumeration value="kIRG_KPSource"/&gt;
 *             &lt;enumeration value="kIRG_KSource"/&gt;
 *             &lt;enumeration value="kIRG_MSource"/&gt;
 *             &lt;enumeration value="kIRG_TSource"/&gt;
 *             &lt;enumeration value="kIRG_USource"/&gt;
 *             &lt;enumeration value="kIRG_VSource"/&gt;
 *             &lt;enumeration value="kOtherNumeric"/&gt;
 *             &lt;enumeration value="kPrimaryNumeric"/&gt;
 *             &lt;enumeration value="kRSUnicode"/&gt;
 *             &lt;enumeration value="lb"/&gt;
 *             &lt;enumeration value="lc"/&gt;
 *             &lt;enumeration value="Line_Break"/&gt;
 *             &lt;enumeration value="LOE"/&gt;
 *             &lt;enumeration value="Logical_Order_Exception"/&gt;
 *             &lt;enumeration value="Lower"/&gt;
 *             &lt;enumeration value="Lowercase"/&gt;
 *             &lt;enumeration value="Lowercase_Mapping"/&gt;
 *             &lt;enumeration value="Math"/&gt;
 *             &lt;enumeration value="na"/&gt;
 *             &lt;enumeration value="na1"/&gt;
 *             &lt;enumeration value="Name"/&gt;
 *             &lt;enumeration value="Name_Alias"/&gt;
 *             &lt;enumeration value="NChar"/&gt;
 *             &lt;enumeration value="NFC_QC"/&gt;
 *             &lt;enumeration value="NFC_Quick_Check"/&gt;
 *             &lt;enumeration value="NFD_QC"/&gt;
 *             &lt;enumeration value="NFD_Quick_Check"/&gt;
 *             &lt;enumeration value="NFKC_Casefold"/&gt;
 *             &lt;enumeration value="NFKC_CF"/&gt;
 *             &lt;enumeration value="NFKC_QC"/&gt;
 *             &lt;enumeration value="NFKC_Quick_Check"/&gt;
 *             &lt;enumeration value="NFKD_QC"/&gt;
 *             &lt;enumeration value="NFKD_Quick_Check"/&gt;
 *             &lt;enumeration value="Noncharacter_Code_Point"/&gt;
 *             &lt;enumeration value="nt"/&gt;
 *             &lt;enumeration value="Numeric_Type"/&gt;
 *             &lt;enumeration value="Numeric_Value"/&gt;
 *             &lt;enumeration value="nv"/&gt;
 *             &lt;enumeration value="OAlpha"/&gt;
 *             &lt;enumeration value="ODI"/&gt;
 *             &lt;enumeration value="OGr_Ext"/&gt;
 *             &lt;enumeration value="OIDC"/&gt;
 *             &lt;enumeration value="OIDS"/&gt;
 *             &lt;enumeration value="OLower"/&gt;
 *             &lt;enumeration value="OMath"/&gt;
 *             &lt;enumeration value="Other_Alphabetic"/&gt;
 *             &lt;enumeration value="Other_Default_Ignorable_Code_Point"/&gt;
 *             &lt;enumeration value="Other_Grapheme_Extend"/&gt;
 *             &lt;enumeration value="Other_ID_Continue"/&gt;
 *             &lt;enumeration value="Other_ID_Start"/&gt;
 *             &lt;enumeration value="Other_Lowercase"/&gt;
 *             &lt;enumeration value="Other_Math"/&gt;
 *             &lt;enumeration value="Other_Uppercase"/&gt;
 *             &lt;enumeration value="OUpper"/&gt;
 *             &lt;enumeration value="Pat_Syn"/&gt;
 *             &lt;enumeration value="Pat_WS"/&gt;
 *             &lt;enumeration value="Pattern_Syntax"/&gt;
 *             &lt;enumeration value="Pattern_White_Space"/&gt;
 *             &lt;enumeration value="PCM"/&gt;
 *             &lt;enumeration value="Prepended_Concatenation_Mark"/&gt;
 *             &lt;enumeration value="QMark"/&gt;
 *             &lt;enumeration value="Quotation_Mark"/&gt;
 *             &lt;enumeration value="Radical"/&gt;
 *             &lt;enumeration value="Regional_Indicator"/&gt;
 *             &lt;enumeration value="RI"/&gt;
 *             &lt;enumeration value="SB"/&gt;
 *             &lt;enumeration value="sc"/&gt;
 *             &lt;enumeration value="scf"/&gt;
 *             &lt;enumeration value="Script"/&gt;
 *             &lt;enumeration value="Script_Extensions"/&gt;
 *             &lt;enumeration value="scx"/&gt;
 *             &lt;enumeration value="SD"/&gt;
 *             &lt;enumeration value="Sentence_Break"/&gt;
 *             &lt;enumeration value="Sentence_Terminal"/&gt;
 *             &lt;enumeration value="Simple_Case_Folding"/&gt;
 *             &lt;enumeration value="Simple_Lowercase_Mapping"/&gt;
 *             &lt;enumeration value="Simple_Titlecase_Mapping"/&gt;
 *             &lt;enumeration value="Simple_Uppercase_Mapping"/&gt;
 *             &lt;enumeration value="slc"/&gt;
 *             &lt;enumeration value="Soft_Dotted"/&gt;
 *             &lt;enumeration value="stc"/&gt;
 *             &lt;enumeration value="STerm"/&gt;
 *             &lt;enumeration value="suc"/&gt;
 *             &lt;enumeration value="tc"/&gt;
 *             &lt;enumeration value="Term"/&gt;
 *             &lt;enumeration value="Terminal_Punctuation"/&gt;
 *             &lt;enumeration value="Titlecase_Mapping"/&gt;
 *             &lt;enumeration value="uc"/&gt;
 *             &lt;enumeration value="UIdeo"/&gt;
 *             &lt;enumeration value="Unicode_1_Name"/&gt;
 *             &lt;enumeration value="Unified_Ideograph"/&gt;
 *             &lt;enumeration value="Upper"/&gt;
 *             &lt;enumeration value="Uppercase"/&gt;
 *             &lt;enumeration value="Uppercase_Mapping"/&gt;
 *             &lt;enumeration value="Variation_Selector"/&gt;
 *             &lt;enumeration value="Vertical_Orientation"/&gt;
 *             &lt;enumeration value="vo"/&gt;
 *             &lt;enumeration value="VS"/&gt;
 *             &lt;enumeration value="WB"/&gt;
 *             &lt;enumeration value="White_Space"/&gt;
 *             &lt;enumeration value="Word_Break"/&gt;
 *             &lt;enumeration value="WSpace"/&gt;
 *             &lt;enumeration value="XID_Continue"/&gt;
 *             &lt;enumeration value="XID_Start"/&gt;
 *             &lt;enumeration value="XIDC"/&gt;
 *             &lt;enumeration value="XIDS"/&gt;
 *             &lt;enumeration value="XO_NFC"/&gt;
 *             &lt;enumeration value="XO_NFD"/&gt;
 *             &lt;enumeration value="XO_NFKC"/&gt;
 *             &lt;enumeration value="XO_NFKD"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "unicodeProp")
public class UnicodeProp {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String name;
    @XmlAttribute(name = "value", required = true)
    protected java.lang.String value;
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
    @XmlAttribute(name = "version")
    protected java.lang.String version;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
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
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }

}
