package com.xworkz.assoication.things;

public class City {
    private String cityName;
    private Area area;

    public City(String cityName, Area area) {
        this.cityName = cityName;
        this.area = area;
    }

    public void setarea(Area area) {
        this.area = area;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Area getarea() {
        return area;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", area=" + area +
                '}';
    }
}
