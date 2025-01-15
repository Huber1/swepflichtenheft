package de.moritzhuber

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/rooms")
class RoomResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun rooms(): List<Room> {
        val room1 = Room(
            id = 1,
            description = "2 Bettzimmer mit Aussicht auf die Berge",
            betten = 2,
            price = 80.0F,
            available = true,
        )

        val room2 = Room(
            id = 2,
            description = "4 Bettzimmer mit Aussicht auf die Berge",
            betten = 4,
            price = 150.0F,
            available = false,
        )

        val room3 = Room(
            id = 3,
            description = "2 Bettzimmer mit Balkon",
            betten = 2,
            price = 110.0F,
            available = true,
        )

        return listOf(room1, room2, room3)
    }
}