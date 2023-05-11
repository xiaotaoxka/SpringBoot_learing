package com.wztedu.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

// @lombok
@Data
@Repository
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
