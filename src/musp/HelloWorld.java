package musp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import javax.ws.rs.core.Response; 

@Path("/hello/")
public class HelloWorld {

	
	/** This method will return your message that you passes in the method argument .
	 * URL = http://localhost:8081/Restfullwebservice/rest/hello/NiRaKaR
	 * @param msg
	 * @return
	 */
	@GET
	@Path("/{param}")
	public String getMsg(@PathParam("param") String msg) {
 
		String output = "Restfull Webservice says--- : " + msg;
 
		return output;
 
	}
	/** This method will lower all the character that you passed .
	 * URL = http://localhost:8081/Restfullwebservice/rest/hello/ToLowercase/NiRaKaR
	 * @param msg
	 * @return
	 */
	@Path("/ToLowercase/{param}")
	@GET
	public String getToLowercase(@PathParam("param") String msg){		
 
		return msg.toLowerCase();
 
	}
	
	//http://localhost:8081/Restfullwebservice/rest/hello/GetToDate/2014/12/05
	@GET  
    @Path("/GetToDate/{year}/{month}/{day}")  
    public Response getToDate(@PathParam("year") int year,@PathParam("month") int month,@PathParam("day") int day) {  
   
       String date = year + "/" + month + "/" + day;  
   
       return Response.status(200)  
        .entity("getDate is called, year/month/day : " + date)  
        .build();  
    }  
	
}
