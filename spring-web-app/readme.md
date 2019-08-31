# [Exercise] Creating a web application

## Overview
In this exercise we are going to create a basic web application. We are going to try and use a lot of what we learned in this section along the way.


## Exercise
* Create a new application using the Spring Initializr --DONE
  * Select Web dependency
  * Select Template dependency (your choice which one)
* Create an index.html template in the static folder --DONE
  * what happens when you run the app and go to http://localhost:8080
* Create a controller package --DONE
  * create a controller (@Controller)
  * create a couple of methods with request mappings
* Create a service package --DONE
  * create a service (don't forget the @Service annotation)
  * create a method that will return some data (any data)
* Views
  * create some templates (in the templates folder) that will be displayed and match your controller requests --DONE
  * create some static content to include in those views (css/images/js) --DONE
  * add static content to your views using one or more of the following --SKIP
    * manually (example: download bootstrap and drop it in your project)
    * Webjars
    * bower
* Error Handling --DONE
  * create a custom error handler template
  * create a cool 404 page
* Exception Handling --DONE
  * have one of your controller methods throw an exception
  * catch that exception in the controller using @ExceptionHandler
  * catch the exception using Controller Advice

