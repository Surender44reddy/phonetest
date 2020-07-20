package com.phone.test.controller;

import com.phone.test.model.PhoneRequest;
import com.phone.test.model.PhoneResponse;
import com.phone.test.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController()
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @PostMapping("/phone")
    public PhoneResponse phoneNumbers(@Valid  @RequestBody PhoneRequest request){
        return phoneService.process(request);
    }
}
