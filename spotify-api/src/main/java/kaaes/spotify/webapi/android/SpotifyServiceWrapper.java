package kaaes.spotify.webapi.android;

import java.util.HashMap;

import kaaes.spotify.webapi.android.models.TracksPager;

/**
 * Created by Admin on 12/31/2017.
 */

public class SpotifyServiceWrapper {
    public static class Options extends HashMap<String, Object> {
    }

    public static TracksPager searchTracks(SpotifyService spotifyService, String searchParam, Options options) {
        return spotifyService.searchTracks(searchParam, options);
    }
}
