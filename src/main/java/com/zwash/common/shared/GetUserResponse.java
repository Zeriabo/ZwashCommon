package com.zwash.common.shared;

import java.io.Serializable;

import com.zwash.common.pojos.User;

public class GetUserResponse implements Serializable {
    private User user;

    public GetUserResponse() {
    }

    public GetUserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}