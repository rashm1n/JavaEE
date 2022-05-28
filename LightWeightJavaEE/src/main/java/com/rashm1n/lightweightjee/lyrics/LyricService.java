package com.rashm1n.lightweightjee.lyrics;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class LyricService {
    public List<Lyric> getLyrics() {
        return Arrays.asList(new Lyric("Time", "Time Lyrics",5),
                new Lyric("Wish You Were Here", "WYWH Lyrics",5));
    }

    public void createLyric(Lyric lyric) {
        return;
    }
}
