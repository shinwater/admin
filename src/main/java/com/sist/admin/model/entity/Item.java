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
        name ="item_generator",
        sequenceName = "item_seq",
        initialValue = 1,allocationSize = 1
)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
    private Long id;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 100)
    private String title;

    private String content;

    @Column(nullable = false, precision = 12,scale = 4)
    private BigDecimal price;

    @Column(length = 50)
    private String brandName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false, length = 20)
    private String createdBy;

    private LocalDateTime updatedAt;

    @Column(length = 20)
    private String updatedBy;

    //연결고리
    private Long partnerId;
    //private List<OrderDetail> orderDetailList= new ArrayList<OrderDetail>();




}
