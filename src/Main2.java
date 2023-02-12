import libro.cap02.fechas.Fecha2;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){

        Fecha2 f1 = new Fecha2("02/03/1983");

        Fecha2 f2 = new Fecha2("02/03/1983");

        if (f1.equals(f2)) {
            System.out.println("Las Fechas son Iguales");

        }else {
            System.out.println("Las Fechas son Diferentes");
        }





    }
}
