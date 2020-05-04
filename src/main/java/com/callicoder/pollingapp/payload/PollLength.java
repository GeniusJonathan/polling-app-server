package com.callicoder.pollingapp.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PollLength {

    @NotNull
    @Max(7)
    private Integer days;

    @NotNull
    @Max(7)
    private Integer hours;
}
