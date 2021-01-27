package com.example.sqlencoding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXAMPLE")
public class TableEntity {
    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
}