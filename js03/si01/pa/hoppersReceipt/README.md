## Hopper's Receipt

## Learning Objective:

- Render data from your Controller

Grace Hopper is giving a talk at MIT. But first she needs to order some thin metal wires to represent nanoseconds to help her audience understand the speed of signals. As it happens, Market2, a new third-party purchasing app has all her needs covered, as well as anyone else who needs to order from a small local business.

[video](https://youtu.be/9eyFDBPk4Yw)


## Assignment:
For this assignment we will take data from our controller and render it to show a receipt for a single item purchase.


Controller starter code:
```java
// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
    
        return "index.jsp";
    }
    //...

```
## Quick Tips for Debugging:

Check that you've added the correct dependencies for rendering JSP and JSTL in both your pom.xml and index.jsp files.

```xml
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
    </dependency>
    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    </dependency>

```
And in your index.jsp:

```jsp

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

```
- Be sure you have a WEB-INF folder within your webapp folder, and that it is added to the configurations in your application.properties file so Tomcat knows where to look:
```
spring.mvc.view.prefix=/WEB-INF/copy

```
- Double check the @Controller annotation in your controller is present.
- Check your imports.
- If values aren't showing up on the page, double check the key value pair names from your controller to the variable names used in your template (index.jsp) and also double-check the c:out tag syntax.


- [ ] Create a new Spring Starter Project.

- [ ] Create a controllers package and a [controller]() within it.

- [ ] Go through all the setup requirements for adding JSP and JSTL to your project.

- [ ] Render the purchase information on the page.

- [ ] Change the variable values from "Grace Hopper", "Copper Wire", etc. to other values to thoroughly test your code.