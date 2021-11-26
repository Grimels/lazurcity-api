package com.grimels.lazurcityapi.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class UserCredentials {

    private String name;
    private String password;

}
