package com.example.mars_rover_photos.response;

import java.util.ArrayList;
import java.util.List;

public class ApiResponseRoverPhotos {
    @Override
    public String toString() {
        return "ApiResponseRoverPhotos{" +
                "photos=" + photos +
                '}';
    }

    List<MarsPhotos> photos = new ArrayList<>();

    public List<MarsPhotos> getPhotos() {
        return photos;
    }

    public void setPhotos(List<MarsPhotos> photos) {
        this.photos = photos;
    }
}
