package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SampleController {

    @GetMapping(value = "/getDate/")
    public String getDate() {
        final Date date = new Date();
        return date.toString();
    }
}
