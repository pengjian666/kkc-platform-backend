package com.kkcplatformbackend.common.controller;

import com.kkcplatformbackend.common.model.LocationCountryModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Region {

    @RequestMapping(value="/hello",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<LocationCountryModel> queryCountry(){
        List<LocationCountryModel> list = new ArrayList<LocationCountryModel>();
        return list;
    }
}
