package com.inn.cafe.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "category")
public class Category {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

}
