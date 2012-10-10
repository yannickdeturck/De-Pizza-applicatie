
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Pizza],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(pizzas: List[Pizza]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages("pizza.index.title"))/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""
	<a class="btn" href=""""),_display_(Seq[Any](/*6.24*/controllers/*6.35*/.routes.PizzaController.newPizza)),format.raw/*6.67*/(""""><i class="icon-plus-sign"></i> """),_display_(Seq[Any](/*6.101*/Messages("pizza.index.create.text"))),format.raw/*6.136*/("""</a>
	"""),_display_(Seq[Any](/*7.3*/if(pizzas.isEmpty)/*7.21*/{_display_(Seq[Any](format.raw/*7.22*/("""
		<br/><br/><p><i class="icon-info-sign"></i> """),_display_(Seq[Any](/*8.48*/Messages("pizza.index.no_pizzas"))),format.raw/*8.81*/("""</p>
	""")))}/*9.3*/else/*9.7*/{_display_(Seq[Any](format.raw/*9.8*/("""
		<div class="table_scrollable-area">
			<table class="table table-striped table-bordered table-condensed">
				<thead>
					<tr>
						<th class="crud_column"></th>
						<th>"""),_display_(Seq[Any](/*15.12*/Messages("pizza.index.pizzaName.text"))),format.raw/*15.50*/("""</th>
						<th>"""),_display_(Seq[Any](/*16.12*/Messages("pizza.index.hasTomato.text"))),format.raw/*16.50*/("""</th>
						<th>"""),_display_(Seq[Any](/*17.12*/Messages("pizza.index.hasMozzarella.text"))),format.raw/*17.54*/("""</th>
						<th>"""),_display_(Seq[Any](/*18.12*/Messages("pizza.index.hasCheese.text"))),format.raw/*18.50*/("""</th>
						<th>"""),_display_(Seq[Any](/*19.12*/Messages("pizza.index.hasHam.text"))),format.raw/*19.47*/("""</th>
						<th>"""),_display_(Seq[Any](/*20.12*/Messages("pizza.index.hasSalami.text"))),format.raw/*20.50*/("""</th>
					</tr>
				</thead>
				<tbody>		
					"""),_display_(Seq[Any](/*24.7*/pizzas/*24.13*/.map/*24.17*/ { pizza =>_display_(Seq[Any](format.raw/*24.28*/("""
						<tr>
							<td>
							"""),_display_(Seq[Any](/*27.9*/form(routes.PizzaController.deletePizza(pizza.pizzaID.get), 'onsubmit -> "return confirm('Bent u zeker dat u deze pizza wilt verwijderen?')")/*27.150*/ {_display_(Seq[Any](format.raw/*27.152*/("""
									<button type="submit" class="btn"><i class="icon-remove"></i></button>
								""")))})),format.raw/*29.10*/("""
							</td>
							<td>"""),_display_(Seq[Any](/*31.13*/pizza/*31.18*/.pizzaName)),format.raw/*31.28*/("""</td>
							<td>"""),_display_(Seq[Any](/*32.13*/pizza/*32.18*/.hasTomato)),format.raw/*32.28*/("""</td>
							<td>"""),_display_(Seq[Any](/*33.13*/pizza/*33.18*/.hasMozzarella)),format.raw/*33.32*/("""</td>
							<td>"""),_display_(Seq[Any](/*34.13*/pizza/*34.18*/.hasCheese)),format.raw/*34.28*/("""</td>
							<td>"""),_display_(Seq[Any](/*35.13*/pizza/*35.18*/.hasHam)),format.raw/*35.25*/("""</td>
							<td>"""),_display_(Seq[Any](/*36.13*/if(pizza.hasSalami)/*36.32*/{_display_(Seq[Any](format.raw/*36.33*/("""
								het heeft salami
							""")))}/*38.9*/else/*38.13*/{_display_(Seq[Any](format.raw/*38.14*/("""
								geen salami
							""")))})),format.raw/*40.9*/("""
							</td>
			    		</tr>
			    	""")))})),format.raw/*43.10*/("""
		    	</tbody>
			</table>
		</div>
	""")))})),format.raw/*47.3*/("""
""")))})))}
    }
    
    def render(pizzas:List[Pizza]) = apply(pizzas)
    
    def f:((List[Pizza]) => play.api.templates.Html) = (pizzas) => apply(pizzas)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 10 21:31:14 CEST 2012
                    SOURCE: /Users/yannickdt/Desktop/pizza-applicatie/app/views/pizza/index.scala.html
                    HASH: 52a2d83d4a4a7a3b72b4726e0b8e3082379350ce
                    MATRIX: 516->1|630->22|658->41|694->43|737->78|776->80|835->104|854->115|907->147|977->181|1034->216|1075->223|1101->241|1139->242|1222->290|1276->323|1300->330|1311->334|1348->335|1562->513|1622->551|1675->568|1735->606|1788->623|1852->665|1905->682|1965->720|2018->737|2075->772|2128->789|2188->827|2273->877|2288->883|2301->887|2350->898|2417->930|2568->1071|2609->1073|2731->1163|2793->1189|2807->1194|2839->1204|2893->1222|2907->1227|2939->1237|2993->1255|3007->1260|3043->1274|3097->1292|3111->1297|3143->1307|3197->1325|3211->1330|3240->1337|3294->1355|3322->1374|3361->1375|3413->1409|3426->1413|3465->1414|3525->1443|3595->1481|3666->1521
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|27->6|27->6|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|30->9|30->9|30->9|36->15|36->15|37->16|37->16|38->17|38->17|39->18|39->18|40->19|40->19|41->20|41->20|45->24|45->24|45->24|45->24|48->27|48->27|48->27|50->29|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|59->38|59->38|59->38|61->40|64->43|68->47
                    -- GENERATED --
                */
            