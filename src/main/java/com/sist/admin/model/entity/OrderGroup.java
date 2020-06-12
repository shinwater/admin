package com.sist.admin.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SequenceGenerator(
        name = "og_generator",
        sequenceName = "og_seq",
        initialValue = 1,allocationSize = 1
)
public class OrderGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "og_generator")
    private Long id;

    @Column(nullable = false, length = 50)
    private String status;
    @Column(nullable = false, length = 50)
    private String orderType;
    @Column(nullable = false)
    private String revAddress;
    @Column(length = 50)
    private String revName;
    @Column(nullable = false, length = 50)
    private String paymentType;


    @Column(nullable = false, precision = 12,scale = 4)
    private BigDecimal totalPrice;

    @Column(nullable = false)
    private int totalQuantity;

    private LocalDateTime orderAt;
    private LocalDateTime arrivalDate;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(length = 20, nullable = false)
    private String createdBy;

    private LocalDateTime updatedAt;

    @Column(length = 20)
    private String updatedBy;


    //
    private Long userId;
    //private List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
}
