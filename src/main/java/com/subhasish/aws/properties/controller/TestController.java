package com.subhasish.aws.properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Subhasish Sahu
 * @date : 27/03/2020
 **/
@RestController
@RequestMapping(value = "/api/tests")
public class TestController {


    @Value(value = "${environment}")
    private String environment;


    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> getProperties(HttpServletRequest request) {

        final Map<String, Object> map = new HashMap<>();
         map.put("environment", environment);
        return map;
    }


}
