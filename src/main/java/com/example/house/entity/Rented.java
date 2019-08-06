package com.example.house.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Rented {
    private Integer id;

    private Integer renter;

    private Integer houseid;

    private Date begintime;

    private Date endtime;

    private Double charge;

    private Date optdate;

     private Integer state;
}