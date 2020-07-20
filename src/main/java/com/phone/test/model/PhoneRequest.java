package com.phone.test.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
public class PhoneRequest {
    @NotNull
    private String phoneNumber;
    private int pageNumber = 1;
    private int pageSize = 100;
}
