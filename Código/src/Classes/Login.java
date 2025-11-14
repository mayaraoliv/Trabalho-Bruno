package Classes;

import java.util.HashMap;
import java.util.Map;

public class Login {

    public static final Map<String, String> usuarios = new HashMap<>();

    static {
        usuarios.put("Aline", "aline.querino@gmail.com");
        usuarios.put("Lilian", "lilian@gmail.com");
    }

    public static boolean verificarLogin(String nome, String email) {
        return usuarios.containsKey(nome) && usuarios.get(nome).equals(email);
    }
}
