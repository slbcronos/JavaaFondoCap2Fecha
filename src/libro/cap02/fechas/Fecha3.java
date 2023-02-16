package libro.cap02.fechas;

public class Fecha3 {
    private int dia;
    private int mes;
    private int anio;

// retorna la fecha expresada en dias
    private int fechaToDias(){
        return anio * 360 + mes * 30 + dia;
    }

    //asigna la decha expresada en dias a los atributos
    private void diasToFecha(int i){
        //dividimos por 360 y obtendremos el año
        anio = (int) i/360;

        //del resto de la divicion anterior podemos obtener el mes y el dia
        int resto = i % 360;

        //el mes es el resto dividido 30
        mes = (int)resto/30;

        // el resto de la division anterior son los dias
        dia= resto % 30;

        //ajuste por si el dia queda en 0
        if (dia == 0) {
            dia= 0;
            mes--;

        }
    }
    public void addDias(int d){
        //convierto la fecha a dias y le sumo d
        int sum = fechaToDias()+d;

        //la fecha resultante (sum) la separo en dia, mes y anio
        diasToFecha(sum);
    }
}
