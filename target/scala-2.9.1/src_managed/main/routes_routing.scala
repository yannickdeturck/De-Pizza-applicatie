// @SOURCE:/Users/yannickdt/Desktop/pizza-applicatie/conf/routes
// @HASH:f819b59179ceb308ef42c13c8b1de5964b7f11cd
// @DATE:Wed Oct 10 22:03:39 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_PizzaController_index1 = Route("GET", PathPattern(List(StaticPart("/pizza"))))
                    

// @LINE:10
val controllers_PizzaController_deletePizza2 = Route("POST", PathPattern(List(StaticPart("/pizza/"),DynamicPart("pizzaID", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:11
val controllers_PizzaController_newPizza3 = Route("GET", PathPattern(List(StaticPart("/pizza/create"))))
                    

// @LINE:12
val controllers_PizzaController_createPizza4 = Route("POST", PathPattern(List(StaticPart("/pizza/create"))))
                    

// @LINE:13
val controllers_PizzaController_lookUp5 = Route("GET", PathPattern(List(StaticPart("/json/pizzas"))))
                    

// @LINE:16
val controllers_PizzaOrderController_index6 = Route("GET", PathPattern(List(StaticPart("/orders"))))
                    

// @LINE:17
val controllers_PizzaOrderController_newOrder7 = Route("GET", PathPattern(List(StaticPart("/orders/create"))))
                    

// @LINE:18
val controllers_PizzaOrderController_createOrder8 = Route("POST", PathPattern(List(StaticPart("/orders/create"))))
                    

// @LINE:19
val controllers_PizzaOrderController_deleteOrder9 = Route("POST", PathPattern(List(StaticPart("/orders/"),DynamicPart("orderID", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:20
val controllers_PizzaOrderController_sendOrder10 = Route("POST", PathPattern(List(StaticPart("/orders/"),DynamicPart("orderID", """[^/]+"""),StaticPart("/sendOrder"))))
                    

// @LINE:23
val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/pizza""","""controllers.PizzaController.index"""),("""POST""","""/pizza/$pizzaID<[^/]+>/delete""","""controllers.PizzaController.deletePizza(pizzaID:Long)"""),("""GET""","""/pizza/create""","""controllers.PizzaController.newPizza"""),("""POST""","""/pizza/create""","""controllers.PizzaController.createPizza"""),("""GET""","""/json/pizzas""","""controllers.PizzaController.lookUp"""),("""GET""","""/orders""","""controllers.PizzaOrderController.index"""),("""GET""","""/orders/create""","""controllers.PizzaOrderController.newOrder"""),("""POST""","""/orders/create""","""controllers.PizzaOrderController.createOrder"""),("""POST""","""/orders/$orderID<[^/]+>/delete""","""controllers.PizzaOrderController.deleteOrder(orderID:Long)"""),("""POST""","""/orders/$orderID<[^/]+>/sendOrder""","""controllers.PizzaOrderController.sendOrder(orderID:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_PizzaController_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaController.index, HandlerDef(this, "controllers.PizzaController", "index", Nil))
   }
}
                    

// @LINE:10
case controllers_PizzaController_deletePizza2(params) => {
   call(params.fromPath[Long]("pizzaID", None)) { (pizzaID) =>
        invokeHandler(_root_.controllers.PizzaController.deletePizza(pizzaID), HandlerDef(this, "controllers.PizzaController", "deletePizza", Seq(classOf[Long])))
   }
}
                    

// @LINE:11
case controllers_PizzaController_newPizza3(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaController.newPizza, HandlerDef(this, "controllers.PizzaController", "newPizza", Nil))
   }
}
                    

// @LINE:12
case controllers_PizzaController_createPizza4(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaController.createPizza, HandlerDef(this, "controllers.PizzaController", "createPizza", Nil))
   }
}
                    

// @LINE:13
case controllers_PizzaController_lookUp5(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaController.lookUp, HandlerDef(this, "controllers.PizzaController", "lookUp", Nil))
   }
}
                    

// @LINE:16
case controllers_PizzaOrderController_index6(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaOrderController.index, HandlerDef(this, "controllers.PizzaOrderController", "index", Nil))
   }
}
                    

// @LINE:17
case controllers_PizzaOrderController_newOrder7(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaOrderController.newOrder, HandlerDef(this, "controllers.PizzaOrderController", "newOrder", Nil))
   }
}
                    

// @LINE:18
case controllers_PizzaOrderController_createOrder8(params) => {
   call { 
        invokeHandler(_root_.controllers.PizzaOrderController.createOrder, HandlerDef(this, "controllers.PizzaOrderController", "createOrder", Nil))
   }
}
                    

// @LINE:19
case controllers_PizzaOrderController_deleteOrder9(params) => {
   call(params.fromPath[Long]("orderID", None)) { (orderID) =>
        invokeHandler(_root_.controllers.PizzaOrderController.deleteOrder(orderID), HandlerDef(this, "controllers.PizzaOrderController", "deleteOrder", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_PizzaOrderController_sendOrder10(params) => {
   call(params.fromPath[Long]("orderID", None)) { (orderID) =>
        invokeHandler(_root_.controllers.PizzaOrderController.sendOrder(orderID), HandlerDef(this, "controllers.PizzaOrderController", "sendOrder", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                