package com.callicoder.pollingapp.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ChoiceRequest {

    @NotBlank
    @Size(max = 40)
    private String text;
}
