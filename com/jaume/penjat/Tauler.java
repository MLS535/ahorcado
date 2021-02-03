package com.jaume.penjat;

public class Tauler {

    String paraulaSecreta;

    public boolean hasGuanyat() {
    }

    public boolean imprimir() {
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

        private void restarIntent() {
        }

        public boolean verificar(String letra) {
        }

        public void inicialitzarPartida(String paraula, int parseInt) {
        }

        public boolean imprimirVides() {
        }

        public int getIntents() {
        }

        public char[] getParaulaSecreta() {
        }

        public Object[] getPalabraEndevinada() {
        }
    }

    private void restarIntent() {
    }

    public void inicialitzarPartida(String paraula, int parseInt) {
    }

}
