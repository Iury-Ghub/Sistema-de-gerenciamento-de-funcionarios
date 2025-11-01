package model.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataUtils {
    public static int calcularAnosEntre(LocalDate inicio, LocalDate fim){
        return 0;
    }

    public static String formatarData(LocalDate data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatada = data.format(formato);
        return formatada;
    }

}
