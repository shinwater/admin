package com.sist.admin.repository;

import com.sist.admin.model.entity.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
@Transactional
@Rollback(false)
class CategoryRepositoryTest {
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void create(){
        String type = "COMPUTER";
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "admin 관리자";

        Category category = new Category();
        category.setType(type);
        category.setTitle(title);
        category.setCreatedAt(createdAt);
        category.setCreatedBy(createdBy);

        Category newCategory = categoryRepository.save(category);

        Assertions.assertNotNull(newCategory);//null값이 아니어야함.
        //데이터가 정확하게 들어갔는지 검증
        Assertions.assertEquals(category.getType(),type);
        Assertions.assertEquals(category.getTitle(),title);
       /* Assertions.assertEquals(category.getCreatedAt(),createdAt);
        Assertions.assertEquals(category.getCreatedBy(),createdBy);*/

    }

    @Test
    public void read(){
        Optional<Category> findCategory = categoryRepository.findById(1L);

        findCategory.ifPresent(category -> {
            System.out.println("id ==>"+category.getId());
            System.out.println("type ==>"+category.getType());
            System.out.println("title ==>"+category.getTitle());
        });
    }
}