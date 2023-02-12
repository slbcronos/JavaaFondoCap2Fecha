package libro.cap02.fechas;

public class Fecha2 {
    private int dia;
    private int mes;
    private int anio;

    public Fecha2(String s) {
        // buscar la primera ocurrencia de /
        int pos1=s.indexOf("/");

        // buscar la segunda ocurrencia de /
        int pos2=s.indexOf("/");

        //proceso del dia
        String sDia = s.substring(0,pos1);
        dia = Integer.parseInt(sDia);

        //proceso del mes
        String sMes = s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        //proceso del anio
        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt(sAnio);

    }



}
