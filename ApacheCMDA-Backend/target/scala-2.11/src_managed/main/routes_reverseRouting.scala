// @SOURCE:/home/SOC-Fall-2015/ApacheCMDA-Backend/conf/routes
// @HASH:8e014a199f01ff4af64245b08d89291238e50346
// @DATE:Fri Nov 20 22:44:07 UTC 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:80
// @LINE:77
// @LINE:76
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers {

// @LINE:80
class ReverseAssets {


// @LINE:80
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:77
// @LINE:76
class ReverseAWrokflowController {


// @LINE:77
def getWorkflow(name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/get/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:76
def addWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/add")
}
                        

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseInstrumentController {


// @LINE:25
def getAllInstruments(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getAllInstruments/json")
}
                        

// @LINE:26
def getInstrument(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:27
def addInstrument(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "instrument/addInstrument")
}
                        

// @LINE:28
def updateInstrumentById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "instrument/updateInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:29
def deleteInstrument(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "instrument/deleteInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:73
// @LINE:72
// @LINE:71
class ReverseAGroupController {


// @LINE:71
def addUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "group/adduser")
}
                        

// @LINE:73
def getGroup(groupname:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "group/get/" + implicitly[PathBindable[String]].unbind("groupname", dynamicString(groupname)))
}
                        

// @LINE:72
def createGroup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "group/create")
}
                        

}
                          

// @LINE:61
class ReverseBtestController {


// @LINE:61
def addBtest(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tests/tag")
}
                        

}
                          

// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseUserController {


// @LINE:50
def addUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/add")
}
                        

// @LINE:49
def getUser(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:51
def updateUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "users/update/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:53
def getAllUsers(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getAllUsers/json")
}
                        

// @LINE:52
def deleteUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:55
def deleteUserByUserNameandPassword(userName:String, password:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/userName/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/password/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                        

// @LINE:54
def isUserValid(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/isUserValid")
}
                        

}
                          

// @LINE:58
class ReverseATaskController {


// @LINE:58
def addATask(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tasks/add")
}
                        

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseParameterController {


// @LINE:40
def getAllParameters(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getAllParameters/json")
}
                        

// @LINE:42
def getParameterById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:44
def updateParameterById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:41
def getParameterByName(id:Long, name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:45
def updateParameterByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:46
def deleteParameterByName(id:Long, name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "parameter/deleteParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:43
def addParameter(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "parameter/addParameter")
}
                        

}
                          

// @LINE:68
// @LINE:67
// @LINE:66
class ReverseAUserController {


// @LINE:68
def getUser(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "user/get/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:67
def register(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "home/register")
}
                        

// @LINE:66
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "home/login")
}
                        

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseDatasetController {


// @LINE:33
def getDataset(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:32
def getAllDatasets(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getAllDatasets/json")
}
                        

// @LINE:37
def queryDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/queryDataset")
}
                        

// @LINE:36
def deleteDataset(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "dataset/deleteDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:34
def addDataset(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/addDataset")
}
                        

// @LINE:35
def updateDatasetById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "dataset/updateDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByCreateTime/json")
}
                        

// @LINE:21
def deleteClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def getAllClimateServicesOrderByCount(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostUsedClimateServices/json")
}
                        

// @LINE:18
def addServiceEntry(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addServiceEntry")
}
                        

// @LINE:16
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addClimateService")
}
                        

// @LINE:12
def getAllClimateServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllClimateServices/json")
}
                        

// @LINE:10
def getClimateService(name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:19
def updateClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def getClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json")
}
                        

// @LINE:17
def getAllServiceEntries(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllServiceEntries/json")
}
                        

// @LINE:20
def updateClimateServiceByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:22
def deleteClimateServiceByName(name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

}
                          

// @LINE:63
// @LINE:62
// @LINE:60
class ReverseAtestController {


// @LINE:62
def getAtest(name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tests/pageget/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:60
def addAtest(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tests/pageadd")
}
                        

// @LINE:63
def updateTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tests/pageupdate")
}
                        

}
                          
}
                  


// @LINE:80
// @LINE:77
// @LINE:76
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:80
class ReverseAssets {


// @LINE:80
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:77
// @LINE:76
class ReverseAWrokflowController {


// @LINE:77
def getWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AWrokflowController.getWorkflow",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/get/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:76
def addWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AWrokflowController.addWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/add"})
      }
   """
)
                        

}
              

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseInstrumentController {


// @LINE:25
def getAllInstruments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getAllInstruments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getAllInstruments/json"})
      }
   """
)
                        

// @LINE:26
def getInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getInstrument",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:27
def addInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.addInstrument",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/addInstrument"})
      }
   """
)
                        

// @LINE:28
def updateInstrumentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.updateInstrumentById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/updateInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def deleteInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.deleteInstrument",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/deleteInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:73
// @LINE:72
// @LINE:71
class ReverseAGroupController {


// @LINE:71
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AGroupController.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/adduser"})
      }
   """
)
                        

// @LINE:73
def getGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AGroupController.getGroup",
   """
      function(groupname) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/get/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("groupname", encodeURIComponent(groupname))})
      }
   """
)
                        

// @LINE:72
def createGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AGroupController.createGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/create"})
      }
   """
)
                        

}
              

// @LINE:61
class ReverseBtestController {


// @LINE:61
def addBtest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BtestController.addBtest",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tests/tag"})
      }
   """
)
                        

}
              

// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseUserController {


// @LINE:50
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/add"})
      }
   """
)
                        

// @LINE:49
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.updateUser",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:53
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAllUsers/json"})
      }
   """
)
                        

// @LINE:52
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUser",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:55
def deleteUserByUserNameandPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUserByUserNameandPassword",
   """
      function(userName,password) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/userName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

// @LINE:54
def isUserValid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.isUserValid",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/isUserValid"})
      }
   """
)
                        

}
              

// @LINE:58
class ReverseATaskController {


// @LINE:58
def addATask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ATaskController.addATask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/add"})
      }
   """
)
                        

}
              

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseParameterController {


// @LINE:40
def getAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getAllParameters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getAllParameters/json"})
      }
   """
)
                        

// @LINE:42
def getParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:44
def updateParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:41
def getParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterByName",
   """
      function(id,name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:45
def updateParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:46
def deleteParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.deleteParameterByName",
   """
      function(id,name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/deleteParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:43
def addParameter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.addParameter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/addParameter"})
      }
   """
)
                        

}
              

// @LINE:68
// @LINE:67
// @LINE:66
class ReverseAUserController {


// @LINE:68
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AUserController.getUser",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/get/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:67
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AUserController.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/register"})
      }
   """
)
                        

// @LINE:66
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AUserController.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/login"})
      }
   """
)
                        

}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseDatasetController {


// @LINE:33
def getDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getDataset",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:32
def getAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getAllDatasets/json"})
      }
   """
)
                        

// @LINE:37
def queryDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.queryDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/queryDataset"})
      }
   """
)
                        

// @LINE:36
def deleteDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.deleteDataset",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/deleteDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def addDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.addDataset",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/addDataset"})
      }
   """
)
                        

// @LINE:35
def updateDatasetById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.updateDatasetById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/updateDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCreateTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByCreateTime/json"})
      }
   """
)
                        

// @LINE:21
def deleteClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def getAllClimateServicesOrderByCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostUsedClimateServices/json"})
      }
   """
)
                        

// @LINE:18
def addServiceEntry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addServiceEntry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addServiceEntry"})
      }
   """
)
                        

// @LINE:16
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addClimateService"})
      }
   """
)
                        

// @LINE:12
def getAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllClimateServices/json"})
      }
   """
)
                        

// @LINE:10
def getClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateService",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:19
def updateClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def getClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateServiceById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByLatestAccessTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"})
      }
   """
)
                        

// @LINE:17
def getAllServiceEntries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllServiceEntries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllServiceEntries/json"})
      }
   """
)
                        

// @LINE:20
def updateClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:22
def deleteClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceByName",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

}
              

// @LINE:63
// @LINE:62
// @LINE:60
class ReverseAtestController {


// @LINE:62
def getAtest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AtestController.getAtest",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tests/pageget/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:60
def addAtest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AtestController.addAtest",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tests/pageadd"})
      }
   """
)
                        

// @LINE:63
def updateTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AtestController.updateTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tests/pageupdate"})
      }
   """
)
                        

}
              
}
        


// @LINE:80
// @LINE:77
// @LINE:76
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.ref {


// @LINE:80
class ReverseAssets {


// @LINE:80
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:77
// @LINE:76
class ReverseAWrokflowController {


// @LINE:77
def getWorkflow(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AWrokflowController]).getWorkflow(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.AWrokflowController", "getWorkflow", Seq(classOf[String]), "GET", """""", _prefix + """workflow/get/$name<[^/]+>""")
)
                      

// @LINE:76
def addWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AWrokflowController]).addWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AWrokflowController", "addWorkflow", Seq(), "POST", """Aworkflow""", _prefix + """workflow/add""")
)
                      

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseInstrumentController {


// @LINE:25
def getAllInstruments(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]), "GET", """ Instrument""", _prefix + """instrument/getAllInstruments/json""")
)
                      

// @LINE:26
def getInstrument(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """instrument/getInstrument/id/$id<[^/]+>/json""")
)
                      

// @LINE:27
def addInstrument(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument(), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Seq(), "POST", """""", _prefix + """instrument/addInstrument""")
)
                      

// @LINE:28
def updateInstrumentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]), "PUT", """""", _prefix + """instrument/updateInstrument/id/$id<[^/]+>""")
)
                      

// @LINE:29
def deleteInstrument(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]), "DELETE", """""", _prefix + """instrument/deleteInstrument/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:73
// @LINE:72
// @LINE:71
class ReverseAGroupController {


// @LINE:71
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AGroupController]).addUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AGroupController", "addUser", Seq(), "POST", """ AGroup""", _prefix + """group/adduser""")
)
                      

// @LINE:73
def getGroup(groupname:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AGroupController]).getGroup(groupname), HandlerDef(this.getClass.getClassLoader, "", "controllers.AGroupController", "getGroup", Seq(classOf[String]), "GET", """""", _prefix + """group/get/$groupname<[^/]+>""")
)
                      

// @LINE:72
def createGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AGroupController]).createGroup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AGroupController", "createGroup", Seq(), "POST", """""", _prefix + """group/create""")
)
                      

}
                          

// @LINE:61
class ReverseBtestController {


// @LINE:61
def addBtest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BtestController]).addBtest(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BtestController", "addBtest", Seq(), "POST", """""", _prefix + """tests/tag""")
)
                      

}
                          

// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseUserController {


// @LINE:50
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "addUser", Seq(), "POST", """""", _prefix + """users/add""")
)
                      

// @LINE:49
def getUser(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getUser", Seq(classOf[Long], classOf[String]), "GET", """ Users""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:51
def updateUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "updateUser", Seq(classOf[Long]), "PUT", """""", _prefix + """users/update/$id<[^/]+>""")
)
                      

// @LINE:53
def getAllUsers(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]), "GET", """""", _prefix + """users/getAllUsers/json""")
)
                      

// @LINE:52
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]), "DELETE", """""", _prefix + """users/delete/$id<[^/]+>""")
)
                      

// @LINE:55
def deleteUserByUserNameandPassword(userName:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""")
)
                      

// @LINE:54
def isUserValid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "isUserValid", Seq(), "POST", """""", _prefix + """users/isUserValid""")
)
                      

}
                          

// @LINE:58
class ReverseATaskController {


// @LINE:58
def addATask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ATaskController]).addATask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ATaskController", "addATask", Seq(), "POST", """ test""", _prefix + """tasks/add""")
)
                      

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseParameterController {


// @LINE:40
def getAllParameters(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]), "GET", """ Parameter""", _prefix + """parameter/getAllParameters/json""")
)
                      

// @LINE:42
def getParameterById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/id/$id<[^/]+>/json""")
)
                      

// @LINE:44
def updateParameterById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]), "PUT", """""", _prefix + """parameter/updateParameter/id/$id<[^/]+>""")
)
                      

// @LINE:41
def getParameterByName(id:Long, name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""")
)
                      

// @LINE:45
def updateParameterByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]), "PUT", """""", _prefix + """parameter/updateParameter/name/$oldName<[^/]+>""")
)
                      

// @LINE:46
def deleteParameterByName(id:Long, name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""")
)
                      

// @LINE:43
def addParameter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Seq(), "POST", """""", _prefix + """parameter/addParameter""")
)
                      

}
                          

// @LINE:68
// @LINE:67
// @LINE:66
class ReverseAUserController {


// @LINE:68
def getUser(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AUserController]).getUser(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.AUserController", "getUser", Seq(classOf[String]), "GET", """""", _prefix + """user/get/$email<[^/]+>""")
)
                      

// @LINE:67
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AUserController]).register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AUserController", "register", Seq(), "POST", """""", _prefix + """home/register""")
)
                      

// @LINE:66
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AUserController]).login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AUserController", "login", Seq(), "POST", """ AUser""", _prefix + """home/login""")
)
                      

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseDatasetController {


// @LINE:33
def getDataset(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """dataset/getDataset/id/$id<[^/]+>/json""")
)
                      

// @LINE:32
def getAllDatasets(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]), "GET", """ Dataset""", _prefix + """dataset/getAllDatasets/json""")
)
                      

// @LINE:37
def queryDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Seq(), "POST", """""", _prefix + """dataset/queryDataset""")
)
                      

// @LINE:36
def deleteDataset(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]), "DELETE", """""", _prefix + """dataset/deleteDataset/id/$id<[^/]+>""")
)
                      

// @LINE:34
def addDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Seq(), "POST", """""", _prefix + """dataset/addDataset""")
)
                      

// @LINE:35
def updateDatasetById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]), "PUT", """""", _prefix + """dataset/updateDataset/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json""")
)
                      

// @LINE:21
def deleteClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]), "DELETE", """""", _prefix + """climateService/deleteClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:15
def getAllClimateServicesOrderByCount(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostUsedClimateServices/json""")
)
                      

// @LINE:18
def addServiceEntry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Seq(), "POST", """""", _prefix + """climateService/addServiceEntry""")
)
                      

// @LINE:16
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/addClimateService""")
)
                      

// @LINE:12
def getAllClimateServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllClimateServices/json""")
)
                      

// @LINE:10
def getClimateService(name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]), "GET", """ Climate Service""", _prefix + """climateService/getClimateService/$name<[^/]+>/json""")
)
                      

// @LINE:19
def updateClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]), "PUT", """""", _prefix + """climateService/updateClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:11
def getClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]), "GET", """""", _prefix + """climateService/getClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""")
)
                      

// @LINE:17
def getAllServiceEntries(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllServiceEntries/json""")
)
                      

// @LINE:20
def updateClimateServiceByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]), "PUT", """""", _prefix + """climateService/updateClimateService/name/$oldName<[^/]+>""")
)
                      

// @LINE:22
def deleteClimateServiceByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]), "DELETE", """""", _prefix + """climateService/deleteClimateService/name/$name<[^/]+>""")
)
                      

}
                          

// @LINE:63
// @LINE:62
// @LINE:60
class ReverseAtestController {


// @LINE:62
def getAtest(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AtestController]).getAtest(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.AtestController", "getAtest", Seq(classOf[String]), "GET", """""", _prefix + """tests/pageget/$name<[^/]+>""")
)
                      

// @LINE:60
def addAtest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AtestController]).addAtest(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AtestController", "addAtest", Seq(), "POST", """""", _prefix + """tests/pageadd""")
)
                      

// @LINE:63
def updateTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AtestController]).updateTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AtestController", "updateTag", Seq(), "POST", """""", _prefix + """tests/pageupdate""")
)
                      

}
                          
}
        
    