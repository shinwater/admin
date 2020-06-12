package com.sist.admin.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SequenceGenerator(
        name = "category_generator",
        sequenceName = "category_seq",
        initialValue = 1,
        allocationSize = 1
)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_generator")
    private Long id;

    @Column(nullable = false, length = 50)
    private String type;

    @Column(length = 100)
    private String title;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(length = 20, nullable = false)
    private String createdBy;

    private LocalDateTime updatedAt;

    @Column(length = 20)
    private String updatedBy;


    //연결고리
    //@OneToMany(mappedBy = )
    //private List<Partner> partnerList= new ArrayList<Partner>();

}
