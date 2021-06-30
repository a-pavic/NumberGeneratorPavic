package pavic.fh;

//Imports siehe Projekt MaintananceMonitor
import javax.ws.rs.*;
import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.*;

@Path("/api")
public class GenerateRandomNumbers {

    //reference: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    @GET
    @Path("/createRandomNumber")
    @Produces(MediaType.TEXT_PLAIN)
    public int randomNumber() {
        int min = 500;
        int max = 600;
        //Generate random int value from 500 to 600
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
        return random_int;
    }


}
