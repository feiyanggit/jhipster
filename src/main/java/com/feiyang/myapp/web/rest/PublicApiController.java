package com.feiyang.myapp.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feiyang on 2019/4/16.
 */
@RestController
@RequestMapping("/public")
public class PublicApiController {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello FeiYang");
    }
}
