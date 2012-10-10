
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
    <div class="control-group """),_display_(Seq[Any](/*6.32*/if(elements.hasErrors)/*6.54*/ {_display_(Seq[Any](format.raw/*6.56*/("""error""")))})),format.raw/*6.62*/("""">
      <label class="control-label" for=""""),_display_(Seq[Any](/*7.42*/elements/*7.50*/.id)),format.raw/*7.53*/("""">"""),_display_(Seq[Any](/*7.56*/elements/*7.64*/.label)),format.raw/*7.70*/("""</label>
      <div class="controls">
        """),_display_(Seq[Any](/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
        """),_display_(Seq[Any](/*10.10*/if(elements.hasErrors)/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
        	<p class="help-block">"""),_display_(Seq[Any](/*11.33*/elements/*11.41*/.errors.mkString(", "))),format.raw/*11.63*/("""</p>
        """)))})),format.raw/*12.10*/("""
      </div>
    </div>"""))}
    }
    
    def render(elements:helper.FieldElements) = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 08 21:37:00 CEST 2012
                    SOURCE: /Users/yannickdt/Desktop/pizza-applicatie/app/views/twitterBootstrapInput.scala.html
                    HASH: ee2e20b1e6f5faa1c680f8264de9bb327f6d081e
                    MATRIX: 535->1|644->33|673->190|740->222|770->244|809->246|846->252|925->296|941->304|965->307|1003->310|1019->318|1046->324|1128->371|1144->379|1171->385|1217->395|1248->417|1288->419|1357->452|1374->460|1418->482|1464->496
                    LINES: 19->1|22->1|24->5|25->6|25->6|25->6|25->6|26->7|26->7|26->7|26->7|26->7|26->7|28->9|28->9|28->9|29->10|29->10|29->10|30->11|30->11|30->11|31->12
                    -- GENERATED --
                */
            