package com.sist.admin.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SequenceGenerator(
        name = "user_generator",
        sequenceName = "user_seq",
        initialValue = 1,allocationSize = 1
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    private Long id;

    @Column(nullable = false, length = 12)
    private String account;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(length = 100)
    private String email;

    @Column(nullable = false, length = 13)
    private String phoneNumber;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false, length = 20)
    private String createdBy;

    private LocalDateTime updatedAt;

    @Column(length = 20)
    private String updatedBy;

    //
    //private List<OrderGroup> orderGroupList = new ArrayList<OrderGroup>();

}
