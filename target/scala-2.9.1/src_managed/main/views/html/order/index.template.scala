
package views.html.order

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[PizzaOrder],Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(orders: List[PizzaOrder])(implicit flash: Flash):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages("order.index.title"))/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""
	"""),_display_(Seq[Any](/*6.3*/flash/*6.8*/.get("success").map/*6.27*/ { message =>_display_(Seq[Any](format.raw/*6.40*/("""
        <p class="alert alert-success">
          	"""),_display_(Seq[Any](/*8.13*/message)),format.raw/*8.20*/("""
        </p>
    """)))})),format.raw/*10.6*/("""
	<a class="btn" href=""""),_display_(Seq[Any](/*11.24*/controllers/*11.35*/.routes.PizzaOrderController.newOrder)),format.raw/*11.72*/(""""><i class="icon-plus-sign"></i> """),_display_(Seq[Any](/*11.106*/Messages("order.index.create.text"))),format.raw/*11.141*/("""</a>
	<a class="btn" href=""""),_display_(Seq[Any](/*12.24*/controllers/*12.35*/.routes.PizzaController.index)),format.raw/*12.64*/(""""><i class="icon-adjust"></i> """),_display_(Seq[Any](/*12.95*/Messages("pizza.index.create.text"))),format.raw/*12.130*/("""</a>
	
	"""),_display_(Seq[Any](/*14.3*/if(orders.isEmpty)/*14.21*/{_display_(Seq[Any](format.raw/*14.22*/("""
		<br/><br/><p><i class="icon-info-sign"></i> """),_display_(Seq[Any](/*15.48*/Messages("order.index.no_orders"))),format.raw/*15.81*/("""</p>
	""")))}/*16.3*/else/*16.7*/{_display_(Seq[Any](format.raw/*16.8*/("""
		<div class="table_scrollable-area">
			<table class="table table-striped table-bordered table-condensed">
				<thead>
					<tr>
						<th class="crud_column"></th>
						<th class="crud_column"></th>
						<th>"""),_display_(Seq[Any](/*23.12*/Messages("order.index.pizzaName.text"))),format.raw/*23.50*/("""</th>
						<th>"""),_display_(Seq[Any](/*24.12*/Messages("order.index.quantity.text"))),format.raw/*24.49*/("""</th>
						<th>"""),_display_(Seq[Any](/*25.12*/Messages("order.index.customerName.text"))),format.raw/*25.53*/("""</th>
						<th>"""),_display_(Seq[Any](/*26.12*/Messages("order.index.remarks.text"))),format.raw/*26.48*/("""</th>
						<th>"""),_display_(Seq[Any](/*27.12*/Messages("order.index.orderDate.text"))),format.raw/*27.50*/("""</th>
					</tr>
				</thead>
				<tbody>		
					"""),_display_(Seq[Any](/*31.7*/orders/*31.13*/.map/*31.17*/ { order =>_display_(Seq[Any](format.raw/*31.28*/("""
						<tr>
							<td>
							"""),_display_(Seq[Any](/*34.9*/form(routes.PizzaOrderController.deleteOrder(order.orderID.get), 'onsubmit -> "return confirm('Bent u zeker dat u deze bestelling wilt verwijderen?')")/*34.160*/ {_display_(Seq[Any](format.raw/*34.162*/("""
									<button type="submit" class="btn"><i class="icon-remove"></i></button>
								""")))})),format.raw/*36.10*/("""
							</td>
							<td>
							"""),_display_(Seq[Any](/*39.9*/form(routes.PizzaOrderController.sendOrder(order.orderID.get))/*39.71*/ {_display_(Seq[Any](format.raw/*39.73*/("""
									<button type="submit" class="btn"><i class="icon-share-alt"></i></button>
								""")))})),format.raw/*41.10*/("""
							</td>
							<td>"""),_display_(Seq[Any](/*43.13*/order/*43.18*/.pizza.pizzaName)),format.raw/*43.34*/("""</td>
							<td>"""),_display_(Seq[Any](/*44.13*/order/*44.18*/.quantity)),format.raw/*44.27*/("""</td>
							<td>"""),_display_(Seq[Any](/*45.13*/order/*45.18*/.customerName)),format.raw/*45.31*/("""</td>
							<td>"""),_display_(Seq[Any](/*46.13*/order/*46.18*/.remarks)),format.raw/*46.26*/("""</td>
							<td>"""),_display_(Seq[Any](/*47.13*/order/*47.18*/.orderDate)),format.raw/*47.28*/("""</td>
			    		</tr>
			    	""")))})),format.raw/*49.10*/("""
		    	</tbody>
			</table>
		</div>
	""")))})),format.raw/*53.3*/("""
""")))})))}
    }
    
    def render(orders:List[PizzaOrder],flash:Flash) = apply(orders)(flash)
    
    def f:((List[PizzaOrder]) => (Flash) => play.api.templates.Html) = (orders) => (flash) => apply(orders)(flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 10 21:41:30 CEST 2012
                    SOURCE: /Users/yannickdt/Desktop/pizza-applicatie/app/views/order/index.scala.html
                    HASH: eea7dd17e9001be015a51951b54566d5e026b6dd
                    MATRIX: 527->1|669->50|697->69|733->71|776->106|815->108|852->111|864->116|891->135|941->148|1029->201|1057->208|1107->227|1167->251|1187->262|1246->299|1317->333|1375->368|1439->396|1459->407|1510->436|1577->467|1635->502|1679->511|1706->529|1745->530|1829->578|1884->611|1909->618|1921->622|1959->623|2209->837|2269->875|2322->892|2381->929|2434->946|2497->987|2550->1004|2608->1040|2661->1057|2721->1095|2806->1145|2821->1151|2834->1155|2883->1166|2950->1198|3111->1349|3152->1351|3274->1441|3343->1475|3414->1537|3454->1539|3579->1632|3641->1658|3655->1663|3693->1679|3747->1697|3761->1702|3792->1711|3846->1729|3860->1734|3895->1747|3949->1765|3963->1770|3993->1778|4047->1796|4061->1801|4093->1811|4155->1841|4226->1881
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|27->6|27->6|27->6|27->6|29->8|29->8|31->10|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|35->14|35->14|35->14|36->15|36->15|37->16|37->16|37->16|44->23|44->23|45->24|45->24|46->25|46->25|47->26|47->26|48->27|48->27|52->31|52->31|52->31|52->31|55->34|55->34|55->34|57->36|60->39|60->39|60->39|62->41|64->43|64->43|64->43|65->44|65->44|65->44|66->45|66->45|66->45|67->46|67->46|67->46|68->47|68->47|68->47|70->49|74->53
                    -- GENERATED --
                */
            