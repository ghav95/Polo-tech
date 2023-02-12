package validadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarPlacaDeCarro {

    public static boolean isValido(String placa) {
        boolean result;
        Pattern pattern = Pattern.compile("[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}|[A-Z]{3}[0-9]{4}");
        Matcher mat = pattern.matcher(placa);
        result = ((Matcher) mat).matches();
        return result;
    }
}
