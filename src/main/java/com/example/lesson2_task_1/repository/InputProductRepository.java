package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.InputProduct;
import com.example.lesson2_task_1.projections.CustomInput;
import com.example.lesson2_task_1.projections.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
