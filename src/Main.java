import libro.cap02.fechas.Fecha;
import libro.cap02.fechas.Fecha2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Capitulo 2 del libro de java a fondo
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca la Fecha 1: dia, mes y año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Fecha f1 = new Fecha(dia,mes,anio);

        System.out.println("Introduzca la Fecha 2: dia, mes y año");
         dia = leer.nextInt();
         mes = leer.nextInt();
         anio = leer.nextInt();
        Fecha f2 = new Fecha(dia,mes,anio);

        //Asignar desde el constructor vacio
        Fecha f3 = new Fecha();
        f3.setDia(8);
        f3.setMes(12);
        f3.setAnio(1978);
        System.out.println(f3.toString());

        //Fecha fija para comparar
        //Fecha f2 = new Fecha(2,3,1983);

        if (f1.equals(f2)) {
            System.out.println("Las fechas son Iguales");

        }else {
            System.out.println("Las fechas son Distintas");
        }

        System.out.println("La fecha es: "+f1.toString());
        System.out.println("La fecha es: "+f2.toString());




    }
}