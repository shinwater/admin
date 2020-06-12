package com.sist.admin.repository;

import com.sist.admin.model.entity.OrderGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderGroupRepository extends JpaRepository<OrderGroup,Long> {

}
