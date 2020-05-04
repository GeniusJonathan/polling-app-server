package com.callicoder.pollingapp.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserIdentityAvailability {

    private Boolean availability;

    public UserIdentityAvailability(Boolean availability) {
        this.availability = availability;
    }
}
