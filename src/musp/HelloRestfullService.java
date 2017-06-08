package musp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/helloRestfullService/")
public class HelloRestfullService {

	/**This method is called without any parameter
	 * Url - http://localhost:8081/Restfullwebservice/rest/helloRestfullService/
	 * @return
	 */
	@GET
	public Response echo() {

		return Response.status(200).entity("Echo Service is called !!!!!").build();

	}
	
	/** Url - http://localhost:8081/Restfullwebservice/rest/helloRestfullService/One
	 * @return
	 */
	@GET
	@Path("/One")
	public Response getEchoWithOutParameter() {

		return Response.status(200).entity("Echo Service is called twice!!!!!").build();

	}

	/**Url - http://localhost:8081/Restfullwebservice/rest/helloRestfullService/Nirakar
	 * @param msg
	 * @return
	 */
	@GET
	@Path("/{name}")
	public String helloName(@PathParam("name") String msg) {

			return "hey " + msg + " Welcome to Restfull Service !!!!";

	}

}
