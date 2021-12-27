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

    cadena = "manuel@correo.com"; 
    patronBuscado = ".*@hotmail.com"; 
    pat = Pattern.compile(patronBuscado); 
    mat = pat.matcher(cadena);                                                                      	  
    if (mat.matches()) { 
        System.out.println("SI"); 
    } else { 
        System.out.println("NO");                                                                           	  
    }  

    cadena = "manuel@correo.com"; 
    patronBuscado = "^[^@]+@[^@]+.[a-zA-Z]{2,}$"; 
    pat = Pattern.compile(patronBuscado); 
    mat = pat.matcher(cadena);                                                                      	  
    if (mat.matches()) { 
        System.out.println("SI"); 
    } else { 
        System.out.println("NO");                                                                           	  
    }  

    }
    

}
