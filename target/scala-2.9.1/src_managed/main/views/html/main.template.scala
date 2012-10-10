
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(subtitle: String)(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/(Messages("application.title") + " - " + subtitle))),format.raw/*7.67*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <link href=""""),_display_(Seq[Any](/*10.22*/routes/*10.28*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.67*/("""" rel="stylesheet">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*11.71*/(""""></script>
    </head>
    <body>

    	<div class="container">
			<section>
				<div class="page-header">
			    	<h1>"""),_display_(Seq[Any](/*18.14*/Messages("application.title"))),format.raw/*18.43*/("""</h1>
			    	<p>
					  <bold>&nbsp;&nbsp;&nbsp;&nbsp;"""),_display_(Seq[Any](/*20.39*/Messages("application.slogan"))),format.raw/*20.69*/("""</bold>
					</p>
			    </div>
			    <h2>"""),_display_(Seq[Any](/*23.13*/subtitle)),format.raw/*23.21*/("""</h2>
				"""),_display_(Seq[Any](/*24.6*/body)),format.raw/*24.10*/("""
			</section>
			<hr>
			<footer>
				<p>ABC-Groep Pizza applicatie &copy; ABC-Groep</p>
			</footer>
		</div>

		<script src=""""),_display_(Seq[Any](/*32.17*/routes/*32.23*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*32.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*33.17*/routes/*33.23*/.Assets.at("javascripts/bootstrap-collapse.js"))),format.raw/*33.70*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*34.17*/routes/*34.23*/.Assets.at("javascripts/bootstrap-dropdown.js"))),format.raw/*34.70*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*35.17*/routes/*35.23*/.Assets.at("javascripts/bootstrap-datepicker.js"))),format.raw/*35.72*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*36.17*/routes/*36.23*/.Assets.at("javascripts/bootstrap-combobox.js"))),format.raw/*36.70*/("""" type="text/javascript"></script>
    </body>
</html>
"""))}
    }
    
    def render(subtitle:String,body:Html) = apply(subtitle)(body)
    
    def f:((String) => (Html) => play.api.templates.Html) = (subtitle) => (body) => apply(subtitle)(body)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 08 21:37:00 CEST 2012
                    SOURCE: /Users/yannickdt/Desktop/pizza-applicatie/app/views/main.scala.html
                    HASH: ff987acf09d287415e873e6650b9012cf5d9bde6
                    MATRIX: 509->1|616->31|704->84|775->134|872->196|886->202|941->236|1037->297|1051->303|1104->335|1164->359|1179->365|1240->404|1318->446|1333->452|1397->494|1554->615|1605->644|1697->700|1749->730|1829->774|1859->782|1905->793|1931->797|2096->926|2111->932|2178->977|2265->1028|2280->1034|2349->1081|2436->1132|2451->1138|2520->1185|2607->1236|2622->1242|2693->1291|2780->1342|2795->1348|2864->1395
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|39->18|39->18|41->20|41->20|44->23|44->23|45->24|45->24|53->32|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36
                    -- GENERATED --
                */
            