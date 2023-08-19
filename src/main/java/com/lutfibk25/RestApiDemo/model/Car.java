package com.lutfibk25.RestApiDemo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity //represent this class as the database table
@Table(name="tbl_cars") // table information
public class Car{
//    @JsonIgnore //ignores this in Response
//    private String previousOwner;
//    @JsonIgnore
//    private String vinNumber;

    @Id //because it is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //use the strategy of using the underlying table which is to use the increment
    @Column(name = "id")
    private Long id;


    @Column(name = "car_name")
    @JsonProperty("brand") //Uses this instead of variable name in the request
    private String Maker;

    @Column(name = "model")
    private String model;
    @Column(name = "make_year")
    private Integer year;
    @Column(name = "bodystyle")
    private String bodyStyle;
    @Column(name = "transmission")
    private String transmission;
    @Column(name = "engine_size")
    private String Engine;
    @Column(name = "interior_color")
    private String InteriorColor;
    @Column(name = "exterior_color")
    private String exteriorColor;
    // private String location; //We can get from Seller Location


}
