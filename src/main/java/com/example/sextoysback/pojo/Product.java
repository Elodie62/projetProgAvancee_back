package com.example.sextoysback.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Base64;
import java.util.Date;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long catalogue_id;
    private String name;
    private Base64 image;
    private Date release_date;
    private Long width;
    private Long length;
    private Long thickness;
    private String description;
    private Long price;
    private String brand;

}