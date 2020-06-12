package com.sist.admin.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SequenceGenerator(
        name = "partner_generator",
        sequenceName = "partner_seq",
        initialValue = 1,allocationSize = 1

)
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partner_generator")
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 50)
    private String status;
    @Column(nullable = false, length = 100)
    private String address;
    @Column(length = 13)
    private String callCenter;
    @Column(length = 13)
    private String partnerNumber;
    @Column(length = 16)
    private String businessNumber;
    @Column(length = 20)
    private String ceoName;

    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(length = 20, nullable = false)
    private String createdBy;

    private LocalDateTime updatedAt;

    @Column(length = 20)
    private String updatedBy;



    //연결고리
    private Long categoryId;
    //private List<Item> itemList= new ArrayList<Item>();


}
