package com.rashm1n.lightweightjee.lyrics;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * LyricResource class. JAX-RS and CDI is used in writing. Java-EE JSON-P is used to process/build JSONs, without
 * using any external dependencies.
 */
@Path("lyrics")
public class LyricResource {

    @Inject
    LyricService lyricService;

    @GET
    public JsonArray getLyrics() {
        return lyricService.getLyrics().stream().map(l ->
                Json.createObjectBuilder()
                        .add("songName",l.getSongName())
                        .add("content",l.getContent())
                        .build()).collect(Json::createArrayBuilder, JsonArrayBuilder::add, JsonArrayBuilder::add)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void setLyric(@NotNull @Valid final Lyric lyric) {
        lyricService.createLyric(lyric);
    }
}
