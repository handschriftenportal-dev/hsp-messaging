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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.tei_c.ns.examples.EgXML;


/**
 * <p>Java-Klasse für macro.limitedContent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="macro.limitedContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{http://www.tei-c.org/ns/1.0}model.limitedPhrase"/&gt;
 *         &lt;group ref="{http://www.tei-c.org/ns/1.0}model.inter"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "macro.limitedContent", propOrder = {
    "content"
})
@XmlSeeAlso({
    FDescr.class,
    FsDescr.class,
    TagUsage.class,
    Rendition.class,
    Desc.class,
    FigDesc.class,
    Meeting.class
})
public class MacroLimitedContent {

    @XmlElementRefs({
        @XmlElementRef(name = "hi", namespace = "http://www.tei-c.org/ns/1.0", type = Hi.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.tei-c.org/ns/1.0", type = Q.class, required = false),
        @XmlElementRef(name = "foreign", namespace = "http://www.tei-c.org/ns/1.0", type = Foreign.class, required = false),
        @XmlElementRef(name = "emph", namespace = "http://www.tei-c.org/ns/1.0", type = Emph.class, required = false),
        @XmlElementRef(name = "distinct", namespace = "http://www.tei-c.org/ns/1.0", type = Distinct.class, required = false),
        @XmlElementRef(name = "mentioned", namespace = "http://www.tei-c.org/ns/1.0", type = Mentioned.class, required = false),
        @XmlElementRef(name = "soCalled", namespace = "http://www.tei-c.org/ns/1.0", type = SoCalled.class, required = false),
        @XmlElementRef(name = "gloss", namespace = "http://www.tei-c.org/ns/1.0", type = Gloss.class, required = false),
        @XmlElementRef(name = "term", namespace = "http://www.tei-c.org/ns/1.0", type = Term.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.tei-c.org/ns/1.0", type = Title.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.tei-c.org/ns/1.0", type = Code.class, required = false),
        @XmlElementRef(name = "ident", namespace = "http://www.tei-c.org/ns/1.0", type = Ident.class, required = false),
        @XmlElementRef(name = "catchwords", namespace = "http://www.tei-c.org/ns/1.0", type = Catchwords.class, required = false),
        @XmlElementRef(name = "dimensions", namespace = "http://www.tei-c.org/ns/1.0", type = Dimensions.class, required = false),
        @XmlElementRef(name = "heraldry", namespace = "http://www.tei-c.org/ns/1.0", type = Heraldry.class, required = false),
        @XmlElementRef(name = "locus", namespace = "http://www.tei-c.org/ns/1.0", type = Locus.class, required = false),
        @XmlElementRef(name = "locusGrp", namespace = "http://www.tei-c.org/ns/1.0", type = LocusGrp.class, required = false),
        @XmlElementRef(name = "material", namespace = "http://www.tei-c.org/ns/1.0", type = Material.class, required = false),
        @XmlElementRef(name = "objectType", namespace = "http://www.tei-c.org/ns/1.0", type = ObjectType.class, required = false),
        @XmlElementRef(name = "origDate", namespace = "http://www.tei-c.org/ns/1.0", type = OrigDate.class, required = false),
        @XmlElementRef(name = "origPlace", namespace = "http://www.tei-c.org/ns/1.0", type = OrigPlace.class, required = false),
        @XmlElementRef(name = "secFol", namespace = "http://www.tei-c.org/ns/1.0", type = SecFol.class, required = false),
        @XmlElementRef(name = "signatures", namespace = "http://www.tei-c.org/ns/1.0", type = Signatures.class, required = false),
        @XmlElementRef(name = "stamp", namespace = "http://www.tei-c.org/ns/1.0", type = Stamp.class, required = false),
        @XmlElementRef(name = "watermark", namespace = "http://www.tei-c.org/ns/1.0", type = Watermark.class, required = false),
        @XmlElementRef(name = "choice", namespace = "http://www.tei-c.org/ns/1.0", type = Choice.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.tei-c.org/ns/1.0", type = Abbr.class, required = false),
        @XmlElementRef(name = "expan", namespace = "http://www.tei-c.org/ns/1.0", type = Expan.class, required = false),
        @XmlElementRef(name = "ex", namespace = "http://www.tei-c.org/ns/1.0", type = Ex.class, required = false),
        @XmlElementRef(name = "am", namespace = "http://www.tei-c.org/ns/1.0", type = Am.class, required = false),
        @XmlElementRef(name = "subst", namespace = "http://www.tei-c.org/ns/1.0", type = Subst.class, required = false),
        @XmlElementRef(name = "ptr", namespace = "http://www.tei-c.org/ns/1.0", type = Ptr.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://www.tei-c.org/ns/1.0", type = Ref.class, required = false),
        @XmlElementRef(name = "listRef", namespace = "http://www.tei-c.org/ns/1.0", type = ListRef.class, required = false),
        @XmlElementRef(name = "att", namespace = "http://www.tei-c.org/ns/1.0", type = Att.class, required = false),
        @XmlElementRef(name = "gi", namespace = "http://www.tei-c.org/ns/1.0", type = Gi.class, required = false),
        @XmlElementRef(name = "tag", namespace = "http://www.tei-c.org/ns/1.0", type = Tag.class, required = false),
        @XmlElementRef(name = "val", namespace = "http://www.tei-c.org/ns/1.0", type = Val.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://www.tei-c.org/ns/1.0", type = Date.class, required = false),
        @XmlElementRef(name = "time", namespace = "http://www.tei-c.org/ns/1.0", type = Time.class, required = false),
        @XmlElementRef(name = "num", namespace = "http://www.tei-c.org/ns/1.0", type = Num.class, required = false),
        @XmlElementRef(name = "measure", namespace = "http://www.tei-c.org/ns/1.0", type = Measure.class, required = false),
        @XmlElementRef(name = "measureGrp", namespace = "http://www.tei-c.org/ns/1.0", type = MeasureGrp.class, required = false),
        @XmlElementRef(name = "unit", namespace = "http://www.tei-c.org/ns/1.0", type = Unit.class, required = false),
        @XmlElementRef(name = "dim", namespace = "http://www.tei-c.org/ns/1.0", type = Dim.class, required = false),
        @XmlElementRef(name = "height", namespace = "http://www.tei-c.org/ns/1.0", type = Height.class, required = false),
        @XmlElementRef(name = "depth", namespace = "http://www.tei-c.org/ns/1.0", type = Depth.class, required = false),
        @XmlElementRef(name = "width", namespace = "http://www.tei-c.org/ns/1.0", type = Width.class, required = false),
        @XmlElementRef(name = "geo", namespace = "http://www.tei-c.org/ns/1.0", type = Geo.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://www.tei-c.org/ns/1.0", type = Email.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.tei-c.org/ns/1.0", type = Address.class, required = false),
        @XmlElementRef(name = "affiliation", namespace = "http://www.tei-c.org/ns/1.0", type = Affiliation.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.tei-c.org/ns/1.0", type = Name.class, required = false),
        @XmlElementRef(name = "orgName", namespace = "http://www.tei-c.org/ns/1.0", type = OrgName.class, required = false),
        @XmlElementRef(name = "persName", namespace = "http://www.tei-c.org/ns/1.0", type = PersName.class, required = false),
        @XmlElementRef(name = "offset", namespace = "http://www.tei-c.org/ns/1.0", type = Offset.class, required = false),
        @XmlElementRef(name = "geogFeat", namespace = "http://www.tei-c.org/ns/1.0", type = GeogFeat.class, required = false),
        @XmlElementRef(name = "placeName", namespace = "http://www.tei-c.org/ns/1.0", type = PlaceName.class, required = false),
        @XmlElementRef(name = "bloc", namespace = "http://www.tei-c.org/ns/1.0", type = Bloc.class, required = false),
        @XmlElementRef(name = "country", namespace = "http://www.tei-c.org/ns/1.0", type = Country.class, required = false),
        @XmlElementRef(name = "region", namespace = "http://www.tei-c.org/ns/1.0", type = Region.class, required = false),
        @XmlElementRef(name = "settlement", namespace = "http://www.tei-c.org/ns/1.0", type = Settlement.class, required = false),
        @XmlElementRef(name = "district", namespace = "http://www.tei-c.org/ns/1.0", type = District.class, required = false),
        @XmlElementRef(name = "geogName", namespace = "http://www.tei-c.org/ns/1.0", type = GeogName.class, required = false),
        @XmlElementRef(name = "climate", namespace = "http://www.tei-c.org/ns/1.0", type = Climate.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://www.tei-c.org/ns/1.0", type = Location.class, required = false),
        @XmlElementRef(name = "population", namespace = "http://www.tei-c.org/ns/1.0", type = Population.class, required = false),
        @XmlElementRef(name = "state", namespace = "http://www.tei-c.org/ns/1.0", type = State.class, required = false),
        @XmlElementRef(name = "terrain", namespace = "http://www.tei-c.org/ns/1.0", type = Terrain.class, required = false),
        @XmlElementRef(name = "trait", namespace = "http://www.tei-c.org/ns/1.0", type = Trait.class, required = false),
        @XmlElementRef(name = "rs", namespace = "http://www.tei-c.org/ns/1.0", type = Rs.class, required = false),
        @XmlElementRef(name = "idno", namespace = "http://www.tei-c.org/ns/1.0", type = Idno.class, required = false),
        @XmlElementRef(name = "lang", namespace = "http://www.tei-c.org/ns/1.0", type = Lang.class, required = false),
        @XmlElementRef(name = "surname", namespace = "http://www.tei-c.org/ns/1.0", type = Surname.class, required = false),
        @XmlElementRef(name = "forename", namespace = "http://www.tei-c.org/ns/1.0", type = Forename.class, required = false),
        @XmlElementRef(name = "genName", namespace = "http://www.tei-c.org/ns/1.0", type = GenName.class, required = false),
        @XmlElementRef(name = "nameLink", namespace = "http://www.tei-c.org/ns/1.0", type = NameLink.class, required = false),
        @XmlElementRef(name = "addName", namespace = "http://www.tei-c.org/ns/1.0", type = AddName.class, required = false),
        @XmlElementRef(name = "roleName", namespace = "http://www.tei-c.org/ns/1.0", type = RoleName.class, required = false),
        @XmlElementRef(name = "persPronouns", namespace = "http://www.tei-c.org/ns/1.0", type = PersPronouns.class, required = false),
        @XmlElementRef(name = "eventName", namespace = "http://www.tei-c.org/ns/1.0", type = EventName.class, required = false),
        @XmlElementRef(name = "objectName", namespace = "http://www.tei-c.org/ns/1.0", type = ObjectName.class, required = false),
        @XmlElementRef(name = "eg", namespace = "http://www.tei-c.org/ns/1.0", type = Eg.class, required = false),
        @XmlElementRef(name = "egXML", namespace = "http://www.tei-c.org/ns/Examples", type = EgXML.class, required = false),
        @XmlElementRef(name = "moduleSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ModuleSpec.class, required = false),
        @XmlElementRef(name = "specGrp", namespace = "http://www.tei-c.org/ns/1.0", type = SpecGrp.class, required = false),
        @XmlElementRef(name = "specGrpRef", namespace = "http://www.tei-c.org/ns/1.0", type = SpecGrpRef.class, required = false),
        @XmlElementRef(name = "elementSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ElementSpec.class, required = false),
        @XmlElementRef(name = "classSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ClassSpec.class, required = false),
        @XmlElementRef(name = "dataSpec", namespace = "http://www.tei-c.org/ns/1.0", type = DataSpec.class, required = false),
        @XmlElementRef(name = "macroSpec", namespace = "http://www.tei-c.org/ns/1.0", type = MacroSpec.class, required = false),
        @XmlElementRef(name = "outputRendition", namespace = "http://www.tei-c.org/ns/1.0", type = OutputRendition.class, required = false),
        @XmlElementRef(name = "constraintSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ConstraintSpec.class, required = false),
        @XmlElementRef(name = "bibl", namespace = "http://www.tei-c.org/ns/1.0", type = Bibl.class, required = false),
        @XmlElementRef(name = "biblStruct", namespace = "http://www.tei-c.org/ns/1.0", type = BiblStruct.class, required = false),
        @XmlElementRef(name = "listBibl", namespace = "http://www.tei-c.org/ns/1.0", type = ListBibl.class, required = false),
        @XmlElementRef(name = "biblFull", namespace = "http://www.tei-c.org/ns/1.0", type = BiblFull.class, required = false),
        @XmlElementRef(name = "msDesc", namespace = "http://www.tei-c.org/ns/1.0", type = MsDesc.class, required = false),
        @XmlElementRef(name = "desc", namespace = "http://www.tei-c.org/ns/1.0", type = Desc.class, required = false),
        @XmlElementRef(name = "label", namespace = "http://www.tei-c.org/ns/1.0", type = Label.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.tei-c.org/ns/1.0", type = org.tei_c.ns._1.List.class, required = false),
        @XmlElementRef(name = "listApp", namespace = "http://www.tei-c.org/ns/1.0", type = ListApp.class, required = false),
        @XmlElementRef(name = "listWit", namespace = "http://www.tei-c.org/ns/1.0", type = ListWit.class, required = false),
        @XmlElementRef(name = "listOrg", namespace = "http://www.tei-c.org/ns/1.0", type = ListOrg.class, required = false),
        @XmlElementRef(name = "listEvent", namespace = "http://www.tei-c.org/ns/1.0", type = ListEvent.class, required = false),
        @XmlElementRef(name = "listPerson", namespace = "http://www.tei-c.org/ns/1.0", type = ListPerson.class, required = false),
        @XmlElementRef(name = "listPlace", namespace = "http://www.tei-c.org/ns/1.0", type = ListPlace.class, required = false),
        @XmlElementRef(name = "listRelation", namespace = "http://www.tei-c.org/ns/1.0", type = ListRelation.class, required = false),
        @XmlElementRef(name = "listObject", namespace = "http://www.tei-c.org/ns/1.0", type = ListObject.class, required = false),
        @XmlElementRef(name = "listNym", namespace = "http://www.tei-c.org/ns/1.0", type = ListNym.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.tei-c.org/ns/1.0", type = Table.class, required = false),
        @XmlElementRef(name = "stage", namespace = "http://www.tei-c.org/ns/1.0", type = Stage.class, required = false),
        @XmlElementRef(name = "move", namespace = "http://www.tei-c.org/ns/1.0", type = Move.class, required = false),
        @XmlElementRef(name = "view", namespace = "http://www.tei-c.org/ns/1.0", type = View.class, required = false),
        @XmlElementRef(name = "camera", namespace = "http://www.tei-c.org/ns/1.0", type = Camera.class, required = false),
        @XmlElementRef(name = "sound", namespace = "http://www.tei-c.org/ns/1.0", type = Sound.class, required = false),
        @XmlElementRef(name = "caption", namespace = "http://www.tei-c.org/ns/1.0", type = Caption.class, required = false),
        @XmlElementRef(name = "tech", namespace = "http://www.tei-c.org/ns/1.0", type = Tech.class, required = false),
        @XmlElementRef(name = "quote", namespace = "http://www.tei-c.org/ns/1.0", type = Quote.class, required = false),
        @XmlElementRef(name = "cit", namespace = "http://www.tei-c.org/ns/1.0", type = Cit.class, required = false),
        @XmlElementRef(name = "said", namespace = "http://www.tei-c.org/ns/1.0", type = Said.class, required = false),
        @XmlElementRef(name = "floatingText", namespace = "http://www.tei-c.org/ns/1.0", type = FloatingText.class, required = false),
        @XmlElementRef(name = "castList", namespace = "http://www.tei-c.org/ns/1.0", type = CastList.class, required = false)
    })
    @XmlMixed
    protected java.util.List<java.lang.Object> content;

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
     * {@link AddName }
     * {@link Address }
     * {@link Affiliation }
     * {@link Am }
     * {@link Att }
     * {@link Bibl }
     * {@link BiblFull }
     * {@link BiblStruct }
     * {@link Bloc }
     * {@link Camera }
     * {@link Caption }
     * {@link CastList }
     * {@link Catchwords }
     * {@link Choice }
     * {@link Cit }
     * {@link ClassSpec }
     * {@link Climate }
     * {@link Code }
     * {@link ConstraintSpec }
     * {@link Country }
     * {@link DataSpec }
     * {@link Date }
     * {@link Depth }
     * {@link Desc }
     * {@link Dim }
     * {@link Dimensions }
     * {@link Distinct }
     * {@link District }
     * {@link Eg }
     * {@link ElementSpec }
     * {@link Email }
     * {@link Emph }
     * {@link EventName }
     * {@link Ex }
     * {@link Expan }
     * {@link FloatingText }
     * {@link Foreign }
     * {@link Forename }
     * {@link GenName }
     * {@link Geo }
     * {@link GeogFeat }
     * {@link GeogName }
     * {@link Gi }
     * {@link Gloss }
     * {@link Height }
     * {@link Heraldry }
     * {@link Hi }
     * {@link Ident }
     * {@link Idno }
     * {@link Label }
     * {@link Lang }
     * {@link org.tei_c.ns._1.List }
     * {@link ListApp }
     * {@link ListBibl }
     * {@link ListEvent }
     * {@link ListNym }
     * {@link ListObject }
     * {@link ListOrg }
     * {@link ListPerson }
     * {@link ListPlace }
     * {@link ListRef }
     * {@link ListRelation }
     * {@link ListWit }
     * {@link Location }
     * {@link Locus }
     * {@link LocusGrp }
     * {@link MacroSpec }
     * {@link Material }
     * {@link Measure }
     * {@link MeasureGrp }
     * {@link Mentioned }
     * {@link ModuleSpec }
     * {@link Move }
     * {@link MsDesc }
     * {@link Name }
     * {@link NameLink }
     * {@link Num }
     * {@link ObjectName }
     * {@link ObjectType }
     * {@link Offset }
     * {@link OrgName }
     * {@link OrigDate }
     * {@link OrigPlace }
     * {@link OutputRendition }
     * {@link PersName }
     * {@link PersPronouns }
     * {@link PlaceName }
     * {@link Population }
     * {@link Ptr }
     * {@link Q }
     * {@link Quote }
     * {@link Ref }
     * {@link Region }
     * {@link RoleName }
     * {@link Rs }
     * {@link Said }
     * {@link SecFol }
     * {@link Settlement }
     * {@link Signatures }
     * {@link SoCalled }
     * {@link Sound }
     * {@link SpecGrp }
     * {@link SpecGrpRef }
     * {@link Stage }
     * {@link Stamp }
     * {@link State }
     * {@link Subst }
     * {@link Surname }
     * {@link Table }
     * {@link Tag }
     * {@link Tech }
     * {@link Term }
     * {@link Terrain }
     * {@link Time }
     * {@link Title }
     * {@link Trait }
     * {@link Unit }
     * {@link Val }
     * {@link View }
     * {@link Watermark }
     * {@link Width }
     * {@link EgXML }
     * 
     * 
     */
    public java.util.List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

}
