package org.example.openfeign.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User {
    @JsonIgnore
    private Long id;

    private String username;

    private String password;
}
