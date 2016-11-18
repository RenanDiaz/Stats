package com.rdiaz.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rdiaz.model.Datos;

@Controller
public class MainController
{
    private Datos datos;
    
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
    @ResponseBody public Datos datos(@RequestParam("lista[]") Double[] lista)
    {
        datos = new Datos(lista);
        datos.armarTablaSencilla();
        return datos;
    }
}
