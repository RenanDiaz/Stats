package com.rdiaz.web.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
    private ArrayList<String> datos = new ArrayList<String>();
    
    @RequestMapping("/")
    @ResponseBody
    public String index()
    {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping(value = "/datos", method = RequestMethod.GET)
    public String datos(HttpServletRequest request)
    {
        request.setAttribute("datos", datos);
        return "datos";
    }
    
    @RequestMapping(value = "/datos", method = RequestMethod.POST)
    public void datos(@RequestParam("datos") String datos)
    {
        this.datos = new ArrayList<String>();
        this.datos.addAll(Arrays.asList(datos.split("\\r?\\n")));
        System.out.println(this.datos);
    }
}
