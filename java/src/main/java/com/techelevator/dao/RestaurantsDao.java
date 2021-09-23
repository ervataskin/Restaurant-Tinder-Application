package com.techelevator.dao;

public interface RestaurantsDao {

    public String getDescriptionByRestaurantId(int restaurant_id);
    public String getPhoneNumberByRestaurantId(int restaurant_id);
    public String getAddressByRestaurantId( int restaurant_id);
    public String getStateByRestaurantId(int restaurant_id);
    public String getCityByRestaurantId(int restaurant_id);
    public String getRestaurantNameByRestaurantId(int restaurant_id);
    public int    getZipcodeByRestaurantId(int restaurant_id);
    public String getRatingByRestaurantId(int restaurant_id);

    
}
