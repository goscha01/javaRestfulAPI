package test;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayHelloXML()
    {
        String resource="<? xml version='1.0' ?>" +
                "<hello> Hello from XML</hello>";
        return resource;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHelloJSON()
    {
        String resource="Hello from JSON";
        return resource;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("Card no") String Card_no, @QueryParam("Amount") int amount ) {
        System.out.println("Name is " + name);
        System.out.println("Ammount is " + amount);
        String response;

        if(amount>10000) {
            System.out.println("Amount is greater than 1 belrub");
            response = "Credit card is not approved";
        } else {
            System.out.println("Amount is less than 1 bel rub");
            response = "Cresit card is approved";
        }

        return "<html?" + "<title>" + "Cresit card autorisatino" + name + "</title>"
                +"<body><h1>" + response + "</h1></body" + "</html>";
    }
}
