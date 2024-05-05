package com.zwash.common.shared;

import java.io.Serializable;

public class GetUserRequest implements Serializable {
 private long userId;

 public GetUserRequest() {
 }

 public GetUserRequest(long userId) {
     this.userId = userId;
 }

 public long getUserId() {
     return userId;
 }

 public void setUserId(long userId) {
     this.userId = userId;
 }
}

