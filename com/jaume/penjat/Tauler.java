package com.jaume.penjat;

public class Tauler {

    String paraulaSecreta;
    String letra;
    String paraula;
    Integer intents;

    public void reiniciar() {

    }

    public void inicialitzarPartida(String paraula, Integer intents) {
        this.paraula=paraula;
        this.intents=intents;

    }

    public boolean hasGuanyat() {
        if (paraulaSecreta==paraula) {
            return true;
        } else
        return false;
    }

    public boolean imprimir() {
     return
    }

    public String verificar(String letra) {
        if (letra.length() > 1) {
            return "Lletra incorrecte";
        } else {
            boolean exist = false;

                for (int i = 0; i < paraulaSecreta.length(); i++) {
                    if (paraulaSecreta[i] == letra.charAt(0)) {
                        exist = true;
                        String[] palabraEndevinada;
                        palabraEndevinada[i] = letra;
                    }
                }
                if (!exist) {
                    restarIntent();
                }
            }
            return "";
        }

        public boolean imprimirVides() {
        }

        public int getIntents() {
        }

        public char[] getParaulaSecreta() {
        }

        public Object[] getPalabraEndevinada() {
        }

        private void restarIntent() {
        }


}
