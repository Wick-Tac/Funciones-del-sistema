package com.sic;

import java.util.regex.*;

public class App 
{
    public static void main( String[] args )
    { 
    String cadena = "abc";
    String patronBuscado = "abc";
    Pattern pat = Pattern.compile(patronBuscado);
    Matcher mat = pat.matcher(cadena);                                                                           
    if (mat.matches()) {
        System.out.println("SI");
    } else {
        System.out.println("NO");                                                                                
    }
    }
}
