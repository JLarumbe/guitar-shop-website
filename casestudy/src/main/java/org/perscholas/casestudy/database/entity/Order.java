package org.perscholas.casestudy.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "status")
    private String status;

    @Column(name = "credit_card")
    private String creditCard;

    @Column(name = "shipping_address")
    private String shippingAddress;
}
