package org.perscholas.casestudy.database.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_MSRP")
    private Double productMSRP;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "product_category")
    private String productCategory;
}
