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
import org.tei_c.ns.examples.EgXML;


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
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.phrase"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.inter"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.gramPart"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.lexicographic.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.typed.attributes"/&amp;gt;
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
@XmlRootElement(name = "gramGrp")
public class GramGrp {

    @XmlElementRefs({
        @XmlElementRef(name = "g", namespace = "http://www.tei-c.org/ns/1.0", type = G.class),
        @XmlElementRef(name = "s", namespace = "http://www.tei-c.org/ns/1.0", type = S.class),
        @XmlElementRef(name = "cl", namespace = "http://www.tei-c.org/ns/1.0", type = Cl.class),
        @XmlElementRef(name = "phr", namespace = "http://www.tei-c.org/ns/1.0", type = Phr.class),
        @XmlElementRef(name = "w", namespace = "http://www.tei-c.org/ns/1.0", type = W.class),
        @XmlElementRef(name = "m", namespace = "http://www.tei-c.org/ns/1.0", type = M.class),
        @XmlElementRef(name = "c", namespace = "http://www.tei-c.org/ns/1.0", type = C.class),
        @XmlElementRef(name = "pc", namespace = "http://www.tei-c.org/ns/1.0", type = Pc.class),
        @XmlElementRef(name = "seg", namespace = "http://www.tei-c.org/ns/1.0", type = Seg.class),
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
        @XmlElementRef(name = "media", namespace = "http://www.tei-c.org/ns/1.0", type = Media.class),
        @XmlElementRef(name = "graphic", namespace = "http://www.tei-c.org/ns/1.0", type = Graphic.class),
        @XmlElementRef(name = "binaryObject", namespace = "http://www.tei-c.org/ns/1.0", type = BinaryObject.class),
        @XmlElementRef(name = "formula", namespace = "http://www.tei-c.org/ns/1.0", type = Formula.class),
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
        @XmlElementRef(name = "sic", namespace = "http://www.tei-c.org/ns/1.0", type = Sic.class),
        @XmlElementRef(name = "corr", namespace = "http://www.tei-c.org/ns/1.0", type = Corr.class),
        @XmlElementRef(name = "reg", namespace = "http://www.tei-c.org/ns/1.0", type = Reg.class),
        @XmlElementRef(name = "orig", namespace = "http://www.tei-c.org/ns/1.0", type = Orig.class),
        @XmlElementRef(name = "add", namespace = "http://www.tei-c.org/ns/1.0", type = Add.class),
        @XmlElementRef(name = "del", namespace = "http://www.tei-c.org/ns/1.0", type = Del.class),
        @XmlElementRef(name = "unclear", namespace = "http://www.tei-c.org/ns/1.0", type = Unclear.class),
        @XmlElementRef(name = "damage", namespace = "http://www.tei-c.org/ns/1.0", type = Damage.class),
        @XmlElementRef(name = "handShift", namespace = "http://www.tei-c.org/ns/1.0", type = HandShift.class),
        @XmlElementRef(name = "restore", namespace = "http://www.tei-c.org/ns/1.0", type = Restore.class),
        @XmlElementRef(name = "supplied", namespace = "http://www.tei-c.org/ns/1.0", type = Supplied.class),
        @XmlElementRef(name = "surplus", namespace = "http://www.tei-c.org/ns/1.0", type = Surplus.class),
        @XmlElementRef(name = "secl", namespace = "http://www.tei-c.org/ns/1.0", type = Secl.class),
        @XmlElementRef(name = "mod", namespace = "http://www.tei-c.org/ns/1.0", type = Mod.class),
        @XmlElementRef(name = "redo", namespace = "http://www.tei-c.org/ns/1.0", type = Redo.class),
        @XmlElementRef(name = "retrace", namespace = "http://www.tei-c.org/ns/1.0", type = Retrace.class),
        @XmlElementRef(name = "undo", namespace = "http://www.tei-c.org/ns/1.0", type = Undo.class),
        @XmlElementRef(name = "ptr", namespace = "http://www.tei-c.org/ns/1.0", type = Ptr.class),
        @XmlElementRef(name = "ref", namespace = "http://www.tei-c.org/ns/1.0", type = Ref.class),
        @XmlElementRef(name = "caesura", namespace = "http://www.tei-c.org/ns/1.0", type = Caesura.class),
        @XmlElementRef(name = "rhyme", namespace = "http://www.tei-c.org/ns/1.0", type = Rhyme.class),
        @XmlElementRef(name = "att", namespace = "http://www.tei-c.org/ns/1.0", type = Att.class),
        @XmlElementRef(name = "gi", namespace = "http://www.tei-c.org/ns/1.0", type = Gi.class),
        @XmlElementRef(name = "tag", namespace = "http://www.tei-c.org/ns/1.0", type = Tag.class),
        @XmlElementRef(name = "val", namespace = "http://www.tei-c.org/ns/1.0", type = Val.class),
        @XmlElementRef(name = "specList", namespace = "http://www.tei-c.org/ns/1.0", type = SpecList.class),
        @XmlElementRef(name = "specDesc", namespace = "http://www.tei-c.org/ns/1.0", type = SpecDesc.class),
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
        @XmlElementRef(name = "oRef", namespace = "http://www.tei-c.org/ns/1.0", type = ORef.class),
        @XmlElementRef(name = "pRef", namespace = "http://www.tei-c.org/ns/1.0", type = PRef.class),
        @XmlElementRef(name = "eg", namespace = "http://www.tei-c.org/ns/1.0", type = Eg.class),
        @XmlElementRef(name = "egXML", namespace = "http://www.tei-c.org/ns/Examples", type = EgXML.class),
        @XmlElementRef(name = "moduleSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ModuleSpec.class),
        @XmlElementRef(name = "specGrp", namespace = "http://www.tei-c.org/ns/1.0", type = SpecGrp.class),
        @XmlElementRef(name = "specGrpRef", namespace = "http://www.tei-c.org/ns/1.0", type = SpecGrpRef.class),
        @XmlElementRef(name = "elementSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ElementSpec.class),
        @XmlElementRef(name = "classSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ClassSpec.class),
        @XmlElementRef(name = "dataSpec", namespace = "http://www.tei-c.org/ns/1.0", type = DataSpec.class),
        @XmlElementRef(name = "macroSpec", namespace = "http://www.tei-c.org/ns/1.0", type = MacroSpec.class),
        @XmlElementRef(name = "listRef", namespace = "http://www.tei-c.org/ns/1.0", type = ListRef.class),
        @XmlElementRef(name = "outputRendition", namespace = "http://www.tei-c.org/ns/1.0", type = OutputRendition.class),
        @XmlElementRef(name = "constraintSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ConstraintSpec.class),
        @XmlElementRef(name = "bibl", namespace = "http://www.tei-c.org/ns/1.0", type = Bibl.class),
        @XmlElementRef(name = "biblStruct", namespace = "http://www.tei-c.org/ns/1.0", type = BiblStruct.class),
        @XmlElementRef(name = "listBibl", namespace = "http://www.tei-c.org/ns/1.0", type = ListBibl.class),
        @XmlElementRef(name = "biblFull", namespace = "http://www.tei-c.org/ns/1.0", type = BiblFull.class),
        @XmlElementRef(name = "msDesc", namespace = "http://www.tei-c.org/ns/1.0", type = MsDesc.class),
        @XmlElementRef(name = "desc", namespace = "http://www.tei-c.org/ns/1.0", type = Desc.class),
        @XmlElementRef(name = "label", namespace = "http://www.tei-c.org/ns/1.0", type = Label.class),
        @XmlElementRef(name = "list", namespace = "http://www.tei-c.org/ns/1.0", type = org.tei_c.ns._1.List.class),
        @XmlElementRef(name = "table", namespace = "http://www.tei-c.org/ns/1.0", type = Table.class),
        @XmlElementRef(name = "listOrg", namespace = "http://www.tei-c.org/ns/1.0", type = ListOrg.class),
        @XmlElementRef(name = "listEvent", namespace = "http://www.tei-c.org/ns/1.0", type = ListEvent.class),
        @XmlElementRef(name = "listPerson", namespace = "http://www.tei-c.org/ns/1.0", type = ListPerson.class),
        @XmlElementRef(name = "listPlace", namespace = "http://www.tei-c.org/ns/1.0", type = ListPlace.class),
        @XmlElementRef(name = "listRelation", namespace = "http://www.tei-c.org/ns/1.0", type = ListRelation.class),
        @XmlElementRef(name = "listObject", namespace = "http://www.tei-c.org/ns/1.0", type = ListObject.class),
        @XmlElementRef(name = "listNym", namespace = "http://www.tei-c.org/ns/1.0", type = ListNym.class),
        @XmlElementRef(name = "listApp", namespace = "http://www.tei-c.org/ns/1.0", type = ListApp.class),
        @XmlElementRef(name = "listWit", namespace = "http://www.tei-c.org/ns/1.0", type = ListWit.class),
        @XmlElementRef(name = "stage", namespace = "http://www.tei-c.org/ns/1.0", type = Stage.class),
        @XmlElementRef(name = "move", namespace = "http://www.tei-c.org/ns/1.0", type = Move.class),
        @XmlElementRef(name = "view", namespace = "http://www.tei-c.org/ns/1.0", type = View.class),
        @XmlElementRef(name = "camera", namespace = "http://www.tei-c.org/ns/1.0", type = Camera.class),
        @XmlElementRef(name = "sound", namespace = "http://www.tei-c.org/ns/1.0", type = Sound.class),
        @XmlElementRef(name = "caption", namespace = "http://www.tei-c.org/ns/1.0", type = Caption.class),
        @XmlElementRef(name = "tech", namespace = "http://www.tei-c.org/ns/1.0", type = Tech.class),
        @XmlElementRef(name = "quote", namespace = "http://www.tei-c.org/ns/1.0", type = Quote.class),
        @XmlElementRef(name = "cit", namespace = "http://www.tei-c.org/ns/1.0", type = Cit.class),
        @XmlElementRef(name = "said", namespace = "http://www.tei-c.org/ns/1.0", type = Said.class),
        @XmlElementRef(name = "q", namespace = "http://www.tei-c.org/ns/1.0", type = Q.class),
        @XmlElementRef(name = "floatingText", namespace = "http://www.tei-c.org/ns/1.0", type = FloatingText.class),
        @XmlElementRef(name = "castList", namespace = "http://www.tei-c.org/ns/1.0", type = CastList.class),
        @XmlElementRef(name = "gram", namespace = "http://www.tei-c.org/ns/1.0", type = Gram.class),
        @XmlElementRef(name = "gen", namespace = "http://www.tei-c.org/ns/1.0", type = Gen.class),
        @XmlElementRef(name = "number", namespace = "http://www.tei-c.org/ns/1.0", type = Number.class),
        @XmlElementRef(name = "case", namespace = "http://www.tei-c.org/ns/1.0", type = Case.class),
        @XmlElementRef(name = "per", namespace = "http://www.tei-c.org/ns/1.0", type = Per.class),
        @XmlElementRef(name = "tns", namespace = "http://www.tei-c.org/ns/1.0", type = Tns.class),
        @XmlElementRef(name = "mood", namespace = "http://www.tei-c.org/ns/1.0", type = Mood.class),
        @XmlElementRef(name = "iType", namespace = "http://www.tei-c.org/ns/1.0", type = IType.class),
        @XmlElementRef(name = "gramGrp", namespace = "http://www.tei-c.org/ns/1.0", type = GramGrp.class),
        @XmlElementRef(name = "pos", namespace = "http://www.tei-c.org/ns/1.0", type = Pos.class),
        @XmlElementRef(name = "subc", namespace = "http://www.tei-c.org/ns/1.0", type = Subc.class),
        @XmlElementRef(name = "colloc", namespace = "http://www.tei-c.org/ns/1.0", type = Colloc.class),
        @XmlElementRef(name = "usg", namespace = "http://www.tei-c.org/ns/1.0", type = Usg.class),
        @XmlElementRef(name = "lbl", namespace = "http://www.tei-c.org/ns/1.0", type = Lbl.class),
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
        @XmlElementRef(name = "metamark", namespace = "http://www.tei-c.org/ns/1.0", type = Metamark.class)
    })
    @XmlMixed
    protected java.util.List<java.lang.Object> content;
    @XmlAttribute(name = "norm")
    protected java.lang.String norm;
    @XmlAttribute(name = "valueDatcat", namespace = "http://www.isocat.org/ns/dcr")
    protected java.util.List<java.lang.String> valueDatcats;
    @XmlAttribute(name = "datcat", namespace = "http://www.isocat.org/ns/dcr")
    protected java.util.List<java.lang.String> datcats;
    @XmlAttribute(name = "split")
    protected java.lang.String split;
    @XmlAttribute(name = "value")
    protected java.lang.String value;
    @XmlAttribute(name = "orig")
    protected java.lang.String orig;
    @XmlAttribute(name = "opt")
    protected Boolean opt;
    @XmlAttribute(name = "expand")
    protected java.lang.String expand;
    @XmlAttribute(name = "location")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String location;
    @XmlAttribute(name = "mergedIn")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String mergedIn;
    @XmlAttribute(name = "rend")
    protected java.util.List<java.lang.String> rends;
    @XmlAttribute(name = "rendition")
    protected java.util.List<java.lang.String> renditions;
    @XmlAttribute(name = "style")
    protected java.lang.String style;
    @XmlAttribute(name = "facs")
    protected java.util.List<java.lang.String> facs;
    @XmlAttribute(name = "next")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String next;
    @XmlAttribute(name = "synch")
    protected java.util.List<java.lang.String> synches;
    @XmlAttribute(name = "prev")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String prev;
    @XmlAttribute(name = "exclude")
    protected java.util.List<java.lang.String> excludes;
    @XmlAttribute(name = "sameAs")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String sameAs;
    @XmlAttribute(name = "copyOf")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String copyOf;
    @XmlAttribute(name = "corresp")
    protected java.util.List<java.lang.String> corresps;
    @XmlAttribute(name = "select")
    protected java.util.List<java.lang.String> selects;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String base;
    @XmlAttribute(name = "ana")
    protected java.util.List<java.lang.String> anas;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(name = "change")
    protected java.util.List<java.lang.String> changes;
    @XmlAttribute(name = "resp")
    protected java.util.List<java.lang.String> resps;
    @XmlAttribute(name = "cert")
    protected java.lang.String cert;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String lang;
    @XmlAttribute(name = "source")
    protected java.util.List<java.lang.String> sources;
    @XmlAttribute(name = "n")
    protected java.lang.String n;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String space;
    @XmlAttribute(name = "subtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String subtype;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String type;

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
     * {@link S }
     * {@link Cl }
     * {@link Phr }
     * {@link W }
     * {@link M }
     * {@link C }
     * {@link Pc }
     * {@link Seg }
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
     * {@link Media }
     * {@link Graphic }
     * {@link BinaryObject }
     * {@link Formula }
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
     * {@link Sic }
     * {@link Corr }
     * {@link Reg }
     * {@link Orig }
     * {@link Add }
     * {@link Del }
     * {@link Unclear }
     * {@link Damage }
     * {@link HandShift }
     * {@link Restore }
     * {@link Supplied }
     * {@link Surplus }
     * {@link Secl }
     * {@link Mod }
     * {@link Redo }
     * {@link Retrace }
     * {@link Undo }
     * {@link Ptr }
     * {@link Ref }
     * {@link Caesura }
     * {@link Rhyme }
     * {@link Att }
     * {@link Gi }
     * {@link Tag }
     * {@link Val }
     * {@link SpecList }
     * {@link SpecDesc }
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
     * {@link ORef }
     * {@link PRef }
     * {@link Eg }
     * {@link EgXML }
     * {@link ModuleSpec }
     * {@link SpecGrp }
     * {@link SpecGrpRef }
     * {@link ElementSpec }
     * {@link ClassSpec }
     * {@link DataSpec }
     * {@link MacroSpec }
     * {@link ListRef }
     * {@link OutputRendition }
     * {@link ConstraintSpec }
     * {@link Bibl }
     * {@link BiblStruct }
     * {@link ListBibl }
     * {@link BiblFull }
     * {@link MsDesc }
     * {@link Desc }
     * {@link Label }
     * {@link org.tei_c.ns._1.List }
     * {@link Table }
     * {@link ListOrg }
     * {@link ListEvent }
     * {@link ListPerson }
     * {@link ListPlace }
     * {@link ListRelation }
     * {@link ListObject }
     * {@link ListNym }
     * {@link ListApp }
     * {@link ListWit }
     * {@link Stage }
     * {@link Move }
     * {@link View }
     * {@link Camera }
     * {@link Sound }
     * {@link Caption }
     * {@link Tech }
     * {@link Quote }
     * {@link Cit }
     * {@link Said }
     * {@link Q }
     * {@link FloatingText }
     * {@link CastList }
     * {@link Gram }
     * {@link Gen }
     * {@link Number }
     * {@link Case }
     * {@link Per }
     * {@link Tns }
     * {@link Mood }
     * {@link IType }
     * {@link GramGrp }
     * {@link Pos }
     * {@link Subc }
     * {@link Colloc }
     * {@link Usg }
     * {@link Lbl }
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
     * {@link java.lang.String }
     * 
     * 
     */
    public java.util.List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
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
     * Gets the value of the valueDatcats property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the valueDatcats property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getValueDatcats().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public java.util.List<java.lang.String> getValueDatcats() {
        if (valueDatcats == null) {
            valueDatcats = new ArrayList<java.lang.String>();
        }
        return this.valueDatcats;
    }

    /**
     * Gets the value of the datcats property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the datcats property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDatcats().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public java.util.List<java.lang.String> getDatcats() {
        if (datcats == null) {
            datcats = new ArrayList<java.lang.String>();
        }
        return this.datcats;
    }

    /**
     * Ruft den Wert der split-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSplit() {
        return split;
    }

    /**
     * Legt den Wert der split-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSplit(java.lang.String value) {
        this.split = value;
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
     * Ruft den Wert der opt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOpt() {
        if (opt == null) {
            return false;
        } else {
            return opt;
        }
    }

    /**
     * Legt den Wert der opt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpt(Boolean value) {
        this.opt = value;
    }

    /**
     * Ruft den Wert der expand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getExpand() {
        return expand;
    }

    /**
     * Legt den Wert der expand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setExpand(java.lang.String value) {
        this.expand = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLocation(java.lang.String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der mergedIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMergedIn() {
        return mergedIn;
    }

    /**
     * Legt den Wert der mergedIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMergedIn(java.lang.String value) {
        this.mergedIn = value;
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
    public java.util.List<java.lang.String> getRends() {
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
    public java.util.List<java.lang.String> getRenditions() {
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
    public java.util.List<java.lang.String> getFacs() {
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
    public java.util.List<java.lang.String> getSynches() {
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
    public java.util.List<java.lang.String> getExcludes() {
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
    public java.util.List<java.lang.String> getCorresps() {
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
    public java.util.List<java.lang.String> getSelects() {
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
    public java.util.List<java.lang.String> getAnas() {
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
    public java.util.List<java.lang.String> getChanges() {
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
    public java.util.List<java.lang.String> getSources() {
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

    @Override
    public java.lang.String toString() {
        return new StringJoiner(", ", GramGrp.class.getSimpleName() + "[", "]")
            .add("content=" + content)
            .add("norm='" + norm + "'")
            .add("valueDatcats=" + valueDatcats)
            .add("datcats=" + datcats)
            .add("split='" + split + "'")
            .add("value='" + value + "'")
            .add("orig='" + orig + "'")
            .add("opt=" + opt)
            .add("expand='" + expand + "'")
            .add("location='" + location + "'")
            .add("mergedIn='" + mergedIn + "'")
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
            .add("subtype='" + subtype + "'")
            .add("type='" + type + "'")
            .toString();
    }
}
