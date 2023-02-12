package com.example.sextoysback.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

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
    @Lob
    private String image;
    private Date release_date;
    private Long width;
    private Long length;
    private Long thickness;
    private String description;
    private Long price;
    private String brand;

}