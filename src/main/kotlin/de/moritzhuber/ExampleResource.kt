package de.moritzhuber

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Response
import java.net.URI

@Path("/")
class ExampleResource {
    @GET
    fun hello(): Response {
        return Response.temporaryRedirect(URI.create("/rooms")).build()
    }
}