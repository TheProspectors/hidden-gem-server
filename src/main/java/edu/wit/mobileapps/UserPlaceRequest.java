package edu.wit.mobileapps;

public class UserPlaceRequest {
    private String userUid;

    private String userPlaceId;

    private String activityCategory;

    private Integer priceFilter;

    private Integer distanceFilter;

    private Integer ratingsFilter;

    public String getUserUid() {
        return this.userUid;
    }

    public void setUserUid(final String userUid) {
        this.userUid = userUid;
    }

    public String getUserPlaceId() {
        return this.userPlaceId;
    }

    public void setUserPlaceId(final String userPlaceId) {
        this.userPlaceId = userPlaceId;
    }

    public String getActivityCategory() {
        return this.activityCategory;
    }

    public void setActivityCategory(final String activityCategory) {
        this.activityCategory = activityCategory;
    }

    public Integer getPriceFilter() {
        return this.priceFilter;
    }

    public void setPriceFilter(final Integer priceFilter) {
        this.priceFilter = priceFilter;
    }

    public Integer getDistanceFilter() {
        return this.distanceFilter;
    }

    public void setDistanceFilter(final Integer distanceFilter) {
        this.distanceFilter = distanceFilter;
    }

    public Integer getRatingsFilter() {
        return this.ratingsFilter;
    }

    public void setRatingsFilter(final Integer ratingsFilter) {
        this.ratingsFilter = ratingsFilter;
    }
}
