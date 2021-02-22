package com.actify.data_labs.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy= GenerationType.TABLE, generator="employee_tab")
    private Long id;

    @JsonProperty("name")
    private String name;
}
