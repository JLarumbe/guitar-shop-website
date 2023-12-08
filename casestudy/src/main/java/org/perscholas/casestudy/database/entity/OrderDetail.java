package org.perscholas.casestudy.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "quantity")
    private Integer quantity;
}
