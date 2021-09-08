package org.example.alibaba.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    @JsonIgnore
    private Long id;

    private String username;

    private String password;
}
