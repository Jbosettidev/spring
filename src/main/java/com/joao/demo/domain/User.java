package com.joao.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //getters e setter gerados pelo lombok
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}