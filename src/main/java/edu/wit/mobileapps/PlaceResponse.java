package edu.wit.mobileapps;

import java.util.List;

public class PlaceResponse {
    private List<Place> placeList;

    public List<Place> getPlaceList() {
        return this.placeList;
    }

    public void setPlaceList(final List<Place> placeList) {
        this.placeList = placeList;
    }
}
