package com.jaume.penjat;

public class Tauler {

    public String verificar(String letra) {
        if (letra.length() > 1) {
            return "Lletra incorrecte";
        } else {
            boolean exist = false;
            for (int i = 0; i < paraulaSecreta.length; i++) {
                if (paraulaSecreta[i] == letra.charAt(0)) {
                    exist = true;
                    palabraEndevinada[i] = letra;
                }
            }

            if (!exist) {
                restarIntent();
            }

        }
        return "";
    }

}
