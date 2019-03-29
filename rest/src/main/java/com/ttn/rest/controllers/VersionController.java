package com.ttn.rest.controllers;

import com.ttn.rest.versioning.Name;
import com.ttn.rest.versioning.StudentV1;
import com.ttn.rest.versioning.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    //URI Versioning

    @GetMapping("/student/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("Ritesh Singh");
    }

    @GetMapping("/student/V2")
    StudentV2 getStudentV2() {
        return new StudentV2(new Name("Ritesh","Singh"));
    }

    //Parameter Versioning
    
    @GetMapping(value = "/student/param",params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("Ritesh Singh");
    }

    @GetMapping(value = "/student/param",params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2(new Name("Ritesh","Singh"));
    }


    //Header Versioning

    @GetMapping(value = "/student/header",headers = "API-VERSION=1")
    StudentV1 getStudentHeader1() {
        return new StudentV1("Ritesh Singh");
    }

    @GetMapping(value = "/student/header",headers = "API-VERSION=2")
    StudentV2 getStudentHeader2() {
        return new StudentV2(new Name("Ritesh","Singh"));
    }
}
