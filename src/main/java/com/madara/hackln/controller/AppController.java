package com.madara.hackln.controller;

import com.madara.hackln.dto.Request;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @RequestMapping(value = "/app2", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String app1(@RequestBody Request request) {

        String default_ = "other";
        if (request.getGender().equals("M")){

            return "Mr".concat(request.getName());
        }
        if (request.getGender().equals("F")){
            return  "Ms".concat(request.getName());
        }
        else
            return default_;

    }
}
