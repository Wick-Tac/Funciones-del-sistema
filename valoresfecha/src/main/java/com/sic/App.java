package com.sic;
import java.time.*;
public class App {
    public static void main(String[] args) {
        System.out.println( "Día actual: " + LocalDate.now().getDayOfWeek());
        System.out.println( "Mes actual: " + LocalDate.now().getMonth());
        System.out.println( "Año actual: " + LocalDate.now().getYear());
        System.out.println( "Hora actual: " + LocalTime.now().getHour());
        System.out.println( "Minuto actual: " + LocalTime.now().getMinute());
        System.out.println( "Segundo actual: " + LocalTime.now().getSecond());
        System.out.println( "Nanosegundo actual: " + LocalTime.now().getNano());
    }
}