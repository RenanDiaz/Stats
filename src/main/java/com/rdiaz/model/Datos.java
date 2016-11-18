package com.rdiaz.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Datos
{
    ArrayList<Double> datos;
    Map<Double, Integer> tabla;
    
    public Datos(ArrayList<Double> datos)
    {
        setDatos(datos);
    }
    
    public Datos(Double[] datos)
    {
        ArrayList<Double> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(datos));
        setDatos(lista);
    }

    public ArrayList<Double> getDatos()
    {
        return datos;
    }

    public void setDatos(ArrayList<Double> datos)
    {
        this.datos = datos;
    }
    
    public void armarTablaSencilla()
    {
        Collections.sort(datos);
        tabla = new TreeMap<>();
        for(final Double dato : datos)
        {
            if(tabla.containsKey(dato))
            {
                Integer nuevaCantidad = tabla.get(dato) + 1;
                tabla.replace(dato, nuevaCantidad);
            }
            else
            {
                tabla.put(dato, 1);
            }
        }
        System.out.println(tabla);
    }
}
