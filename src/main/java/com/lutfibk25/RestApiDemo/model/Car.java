package com.lutfibk25.RestApiDemo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car{
    @JsonIgnore //ignores this in Response
    private String previousOwner;

    @JsonProperty("brand") //Uses this instead of variable name in the request
    private String Maker;

    private String model;
    private Integer year;
    private String bodyStyle;
    private String transmission;
    private Integer Mileage;
    private String Engine;
    private String InteriorColor;
    private String exteriorColor;
    private String location; //We can get from Seller Location


}
