package com.rashm1n.lightweightjee.lyrics;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Lyric model class. A POJO which includes sample properties of a Lyric. Javax.Validation Bean validation is used to
 * verify the fields. Could be used with the @Valid annotation where a Lyric object is used.
 */
public class Lyric {

    @NotNull
    private String songName;

    @NotNull
    @Size(max = 4096)
    private String content;

    @Min(0)
    @Max(5)
    @NotNull
    private int rating;

    public Lyric(String songName, String content, int rating) {
        this.songName = songName;
        this.content = content;
        this.rating = rating;
    }

    public Lyric() {
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
