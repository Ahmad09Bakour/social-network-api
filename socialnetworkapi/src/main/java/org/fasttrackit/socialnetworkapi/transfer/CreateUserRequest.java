package org.fasttrackit.socialnetworkapi.transfer;

import javax.validation.constraints.NotNull;

public class CreateUserRequest {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
