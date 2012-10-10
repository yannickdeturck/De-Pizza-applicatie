
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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[PizzaOrder],List[Pizza],List[Int],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(orderForm: Form[PizzaOrder], pizzas: List[Pizza], quantity: List[Int]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{FieldConstructor(twitterBootstrapInput.f)}};
Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*5.73*/("""

"""),_display_(Seq[Any](/*7.2*/main(Messages("order.create.title"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
	"""),_display_(Seq[Any](/*8.3*/for(error <- orderForm.errors) yield /*8.33*/{_display_(Seq[Any](format.raw/*8.34*/("""
		"""),_display_(Seq[Any](/*9.4*/error)),format.raw/*9.9*/("""
	""")))})),format.raw/*10.3*/("""
	"""),_display_(Seq[Any](/*11.3*/form(action = routes.PizzaOrderController.createOrder, 'class -> "form-horizontal")/*11.86*/ {_display_(Seq[Any](format.raw/*11.88*/("""
	    """),_display_(Seq[Any](/*12.7*/select(
		  orderForm("pizzaID"),
		  pizzas.map{ pizza =>
		   	pizza.pizzaID.toString -> (pizza.pizzaName)
		  	  },
		  '_label -> Messages("order.create.pizzaName.text")
		))),format.raw/*18.4*/("""
		"""),_display_(Seq[Any](/*19.4*/select(
		  orderForm("quantity"),
		  quantity.map{ quantity =>
		   	quantity.toString -> quantity.toString
		  	  },
		  '_label -> Messages("order.create.quantity.text")
		))),format.raw/*25.4*/("""
	    """),_display_(Seq[Any](/*26.7*/inputText(orderForm("customerName"), '_label -> Messages("order.create.customerName.text")))),format.raw/*26.98*/("""
	    """),_display_(Seq[Any](/*27.7*/textarea(orderForm("remarks"), '_label -> Messages("order.create.remarks.text")))),format.raw/*27.87*/("""
	    <div class="form-actions">
	     	<button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*29.55*/Messages("create.text"))),format.raw/*29.78*/("""</button>
	     	<a class="btn" href=""""),_display_(Seq[Any](/*30.30*/controllers/*30.41*/.routes.PizzaOrderController.index)),format.raw/*30.75*/("""">"""),_display_(Seq[Any](/*30.78*/Messages("cancel.text"))),format.raw/*30.101*/("""</a>
	    </div>
    """)))})),format.raw/*32.6*/("""
""")))})))}
    }
    
    def render(orderForm:Form[PizzaOrder],pizzas:List[Pizza],quantity:List[Int]) = apply(orderForm,pizzas,quantity)
    
    def f:((Form[PizzaOrder],List[Pizza],List[Int]) => play.api.templates.Html) = (orderForm,pizzas,quantity) => apply(orderForm,pizzas,quantity)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 08 21:37:00 CEST 2012
                    SOURCE: /Users/yannickdt/Desktop/pizza-applicatie/app/views/order/create.scala.html
                    HASH: 59eb0f4e3c3c0a7867e6cc6bd42a8d7a808e5708
                    MATRIX: 544->1|734->126|766->150|843->72|872->197|909->200|953->236|992->238|1029->241|1074->271|1112->272|1150->276|1175->281|1209->284|1247->287|1339->370|1379->372|1421->379|1619->556|1658->560|1856->737|1898->744|2011->835|2053->842|2155->922|2278->1009|2323->1032|2398->1071|2418->1082|2474->1116|2513->1119|2559->1142|2612->1164
                    LINES: 19->1|24->5|24->5|25->1|27->5|29->7|29->7|29->7|30->8|30->8|30->8|31->9|31->9|32->10|33->11|33->11|33->11|34->12|40->18|41->19|47->25|48->26|48->26|49->27|49->27|51->29|51->29|52->30|52->30|52->30|52->30|52->30|54->32
                    -- GENERATED --
                */
            