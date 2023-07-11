package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    /**
     * @star.route("/api/hello", methods=["GET", "POST"])
async def hello(request):
    if request.method == "GET":
        return Response(f"Hello, stranger.  I am {name} ({pod}).\n", 200)

    request_data = await request.json()
    requestor = request_data["name"]

    response_data = {
        "text": f"Hi, {requestor}.  I am {name} ({pod}).",
        "name": name,
    }

    return JSONResponse(response_data)
     * @return
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello, stranger.  I am {name} ({pod})";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {
        return "Hi, {requestor}.  I am {name} ({pod}).";
    }
}
