// @SOURCE:/Users/yannickdt/Desktop/pizza-applicatie/conf/routes
// @HASH:b9b3fef93de4d16af6e2dd4563373c52e6848d27
// @DATE:Wed Oct 10 21:34:47 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReversePizzaController {
    


 
// @LINE:10
def deletePizza(pizzaID:Long) = {
   Call("POST", "/pizza/" + implicitly[PathBindable[Long]].unbind("pizzaID", pizzaID) + "/delete")
}
                                                        
 
// @LINE:12
def createPizza() = {
   Call("POST", "/pizza/create")
}
                                                        
 
// @LINE:9
def index() = {
   Call("GET", "/pizza")
}
                                                        
 
// @LINE:11
def newPizza() = {
   Call("GET", "/pizza/create")
}
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReversePizzaOrderController {
    


 
// @LINE:19
def sendOrder(orderID:Long) = {
   Call("POST", "/orders/" + implicitly[PathBindable[Long]].unbind("orderID", orderID) + "/sendOrder")
}
                                                        
 
// @LINE:16
def newOrder() = {
   Call("GET", "/orders/create")
}
                                                        
 
// @LINE:15
def index() = {
   Call("GET", "/orders")
}
                                                        
 
// @LINE:18
def deleteOrder(orderID:Long) = {
   Call("POST", "/orders/" + implicitly[PathBindable[Long]].unbind("orderID", orderID) + "/delete")
}
                                                        
 
// @LINE:17
def createOrder() = {
   Call("POST", "/orders/create")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReversePizzaController {
    


 
// @LINE:10
def deletePizza = JavascriptReverseRoute(
   "controllers.PizzaController.deletePizza",
   """
      function(pizzaID) {
      return _wA({method:"POST", url:"/pizza/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pizzaID", pizzaID) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:12
def createPizza = JavascriptReverseRoute(
   "controllers.PizzaController.createPizza",
   """
      function() {
      return _wA({method:"POST", url:"/pizza/create"})
      }
   """
)
                                                        
 
// @LINE:9
def index = JavascriptReverseRoute(
   "controllers.PizzaController.index",
   """
      function() {
      return _wA({method:"GET", url:"/pizza"})
      }
   """
)
                                                        
 
// @LINE:11
def newPizza = JavascriptReverseRoute(
   "controllers.PizzaController.newPizza",
   """
      function() {
      return _wA({method:"GET", url:"/pizza/create"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReversePizzaOrderController {
    


 
// @LINE:19
def sendOrder = JavascriptReverseRoute(
   "controllers.PizzaOrderController.sendOrder",
   """
      function(orderID) {
      return _wA({method:"POST", url:"/orders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("orderID", orderID) + "/sendOrder"})
      }
   """
)
                                                        
 
// @LINE:16
def newOrder = JavascriptReverseRoute(
   "controllers.PizzaOrderController.newOrder",
   """
      function() {
      return _wA({method:"GET", url:"/orders/create"})
      }
   """
)
                                                        
 
// @LINE:15
def index = JavascriptReverseRoute(
   "controllers.PizzaOrderController.index",
   """
      function() {
      return _wA({method:"GET", url:"/orders"})
      }
   """
)
                                                        
 
// @LINE:18
def deleteOrder = JavascriptReverseRoute(
   "controllers.PizzaOrderController.deleteOrder",
   """
      function(orderID) {
      return _wA({method:"POST", url:"/orders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("orderID", orderID) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:17
def createOrder = JavascriptReverseRoute(
   "controllers.PizzaOrderController.createOrder",
   """
      function() {
      return _wA({method:"POST", url:"/orders/create"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReversePizzaController {
    


 
// @LINE:10
def deletePizza(pizzaID:Long) = new play.api.mvc.HandlerRef(
   controllers.PizzaController.deletePizza(pizzaID), HandlerDef(this, "controllers.PizzaController", "deletePizza", Seq(classOf[Long]))
)
                              
 
// @LINE:12
def createPizza() = new play.api.mvc.HandlerRef(
   controllers.PizzaController.createPizza(), HandlerDef(this, "controllers.PizzaController", "createPizza", Seq())
)
                              
 
// @LINE:9
def index() = new play.api.mvc.HandlerRef(
   controllers.PizzaController.index(), HandlerDef(this, "controllers.PizzaController", "index", Seq())
)
                              
 
// @LINE:11
def newPizza() = new play.api.mvc.HandlerRef(
   controllers.PizzaController.newPizza(), HandlerDef(this, "controllers.PizzaController", "newPizza", Seq())
)
                              

                      
    
}
                            

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReversePizzaOrderController {
    


 
// @LINE:19
def sendOrder(orderID:Long) = new play.api.mvc.HandlerRef(
   controllers.PizzaOrderController.sendOrder(orderID), HandlerDef(this, "controllers.PizzaOrderController", "sendOrder", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def newOrder() = new play.api.mvc.HandlerRef(
   controllers.PizzaOrderController.newOrder(), HandlerDef(this, "controllers.PizzaOrderController", "newOrder", Seq())
)
                              
 
// @LINE:15
def index() = new play.api.mvc.HandlerRef(
   controllers.PizzaOrderController.index(), HandlerDef(this, "controllers.PizzaOrderController", "index", Seq())
)
                              
 
// @LINE:18
def deleteOrder(orderID:Long) = new play.api.mvc.HandlerRef(
   controllers.PizzaOrderController.deleteOrder(orderID), HandlerDef(this, "controllers.PizzaOrderController", "deleteOrder", Seq(classOf[Long]))
)
                              
 
// @LINE:17
def createOrder() = new play.api.mvc.HandlerRef(
   controllers.PizzaOrderController.createOrder(), HandlerDef(this, "controllers.PizzaOrderController", "createOrder", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                