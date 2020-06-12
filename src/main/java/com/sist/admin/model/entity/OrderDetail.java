package com.sist.admin.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@SequenceGenerator(
        name = "od_generator",
        sequenceName = "od_seq",
        initialValue = 1,allocationSize = 1
)
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "od_generator")
    private Long id;

    @Column(nullable = false,length = 50)
    private String status;
    private LocalDateTime arrivalDate;
    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false, precision = 12,scale = 4)
    private BigDecimal totalPrice;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(length = 20, nullable = false)
    private String createdBy;

    private LocalDateTime updatedAt;

    @Column(length = 20)
    private String updatedBy;


    //연결고리 1인방향:Long타입, n인방향:컬렉션프레임ㅋ워크
    private Long itemId;
    private Long OrderGroupId;

}
