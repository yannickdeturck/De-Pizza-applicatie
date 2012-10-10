
package views.html.pizza

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Pizza],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(pizzaForm: Form[Pizza]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{FieldConstructor(twitterBootstrapInput.f)}};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*5.73*/("""

"""),_display_(Seq[Any](/*7.2*/main(Messages("pizza.create.title"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
	"""),_display_(Seq[Any](/*8.3*/form(action = routes.PizzaController.createPizza, 'class -> "form-horizontal")/*8.81*/ {_display_(Seq[Any](format.raw/*8.83*/("""
	    """),_display_(Seq[Any](/*9.7*/inputText(pizzaForm("pizzaNaam"), '_label -> Messages("pizza.create.pizzaNaam.text")))),format.raw/*9.92*/("""
	    """),_display_(Seq[Any](/*10.7*/checkbox(pizzaForm("hasTomato"), '_label -> Messages("pizza.create.hasTomato.text")))),format.raw/*10.91*/("""
	    """),_display_(Seq[Any](/*11.7*/checkbox(pizzaForm("hasMozzarella"), '_label -> Messages("pizza.create.hasMozzarella.text")))),format.raw/*11.99*/("""
	    """),_display_(Seq[Any](/*12.7*/checkbox(pizzaForm("hasCheese"), '_label -> Messages("pizza.create.hasCheese.text")))),format.raw/*12.91*/("""
	    """),_display_(Seq[Any](/*13.7*/checkbox(pizzaForm("hasHam"), '_label -> Messages("pizza.create.hasHam.text")))),format.raw/*13.85*/("""
	    """),_display_(Seq[Any](/*14.7*/checkbox(pizzaForm("hasSalami"), '_label -> Messages("pizza.create.hasSalami.text")))),format.raw/*14.91*/("""
	    <div class="form-actions">
	     	<button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*16.55*/Messages("create.text"))),format.raw/*16.78*/("""</button>
	     	<a class="btn" href=""""),_display_(Seq[Any](/*17.30*/controllers/*17.41*/.routes.PizzaController.index)),format.raw/*17.70*/("""">"""),_display_(Seq[Any](/*17.73*/Messages("cancel.text"))),format.raw/*17.96*/("""</a>
	    </div>
    """)))})),format.raw/*19.6*/("""
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(pizzaForm:Form[Pizza]) = apply(pizzaForm)
    
    def f:((Form[Pizza]) => play.api.templates.Html) = (pizzaForm) => apply(pizzaForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 10 21:18:31 CEST 2012
                    SOURCE: /Users/yannickdt/Desktop/pizza-applicatie/app/views/pizza/create.scala.html
                    HASH: 4b7faf388d6901525b5db8ca31be95e6beeb7813
                    MATRIX: 517->1|660->79|692->103|769->25|798->150|835->153|879->189|918->191|955->194|1041->272|1080->274|1121->281|1227->366|1269->373|1375->457|1417->464|1531->556|1573->563|1679->647|1721->654|1821->732|1863->739|1969->823|2092->910|2137->933|2212->972|2232->983|2283->1012|2322->1015|2367->1038|2420->1060|2453->1062
                    LINES: 19->1|24->5|24->5|25->1|27->5|29->7|29->7|29->7|30->8|30->8|30->8|31->9|31->9|32->10|32->10|33->11|33->11|34->12|34->12|35->13|35->13|36->14|36->14|38->16|38->16|39->17|39->17|39->17|39->17|39->17|41->19|42->20
                    -- GENERATED --
                */
            