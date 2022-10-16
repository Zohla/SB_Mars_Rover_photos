package com.example.mars_rover_photos.dto;



public class HomeDto {
    /*@RequestParam(required = false) String marsApiRoverData,
    @RequestParam(required = false) Integer sol)*/
    private String marsApiRoverData;
    private Integer sol;
    private Boolean flexCheckDefault;

    public String getMarsApiRoverData() {
        return marsApiRoverData;
    }
    public void setMarsApiRoverData(String marsApiRoverData) {
        this.marsApiRoverData = marsApiRoverData;
    }
    public Integer getSol() {
        return sol;
    }
    public void setSol(Integer marsSol) {
        this.sol = marsSol;
    }

    public Boolean getFlexCheckDefault() {
        return flexCheckDefault;
    }

    public void setFlexCheckDefault(Boolean flexCheckDefault) {
        this.flexCheckDefault = flexCheckDefault;
    }
}
