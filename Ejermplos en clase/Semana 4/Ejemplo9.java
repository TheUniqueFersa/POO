import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejemplo9 {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha.toString());
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formato.format(fecha));

        Calendar calendario = Calendar.getInstance();
        String miFecha = "Hoy es el dia ";
        miFecha += calendario.get(Calendar.DAY_OF_MONTH) + " del mes ";
        miFecha += calendario.get(Calendar.MONTH) + 1 + " de ";
        miFecha += calendario.get(Calendar.YEAR);
        System.out.println(miFecha);
    }    
}