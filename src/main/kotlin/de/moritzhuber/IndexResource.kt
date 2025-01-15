package de.moritzhuber

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Response
import java.net.URI

@Path("/")
class IndexResource {
    @GET
    fun hello(): Response = Response.temporaryRedirect(URI.create("/rooms")).build()
}