package com.expeditors.musictracking.dao;

import com.expeditors.musictracking.model.Track;
import com.expeditors.musictracking.model.enumerator.Filters;
import com.expeditors.musictracking.model.enumerator.MediaType;

import java.util.List;

public interface TrackBaseDAO extends BaseDAO<Track> {
    List<Track> findByTitle(String title);

    List<Track> findByArtist(String artistName);

    List<Track> findByAlbum(String albumName);

    List<Track> findByDuration(double duration, Filters filters);

    List<Track> findByPrice(double price);

    List<Track> findMediaType(MediaType mediaType);

    List<Track> findByYear(int year);
}
