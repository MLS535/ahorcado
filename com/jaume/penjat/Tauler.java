package com.jaume.penjat;
/*TODO he puesto todo por todo para no perdernos :) */
/*TODO Definir correctamente los atributos, que tipo de atributos queremos. Esta claro que:
*  - Paraules es de String
* - Si te fijas en el test, ParaulaSecreta es de (creo) tipo char siendo un array.
* - palabraEndevinada por lo mismo es String[] y tampoco podemos cambiarlo y hacer un array List creo pq no aparece aquí.
* - Intents es string pero lo convierte a Integer tengo dudas ajajajja
* - Por último, letra que será? ajajajja No tengo ni idea*/

public class Tauler {

    String paraulaSecreta;
    char[] letra;
    String paraula;
    Integer intents;
    String[] palabraEndevinada;

    //getters de los atributos
    public String getParaulaSecreta() {
        return paraulaSecreta;
    }

    public char[] getLetra() {
        return letra;
    }

    public String getParaula() {
        return paraula;
    }

    public Integer getIntents() {
        return intents;
    }

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    /*TODO He creado el constructor pero da problemas :( puedes borrarlo si te da rabia*/
    public Tauler(String paraulaSecreta, char[] letra, String paraula, Integer intents, String[] palabraEndevinada) {
        this.paraulaSecreta = paraulaSecreta;
        this.letra = letra;
        this.paraula = paraula;
        this.intents = intents;
        this.palabraEndevinada = palabraEndevinada;
    }

    /*TODO aquí sinceramente no tengo ni idea de que poner para iniciar la partida */
    public void inicialitzarPartida(String paraula, Integer intents) {
        this.paraula = paraula;
        this.intents = intents;
    }

    public boolean hasGuanyat() {
        if (paraulaSecreta == paraula) {
            return true;
        } else
            return false;
    }

    //imprimir estoy segura que esta bien. fijate que se crean _ cuando lo aciertas Pero si lo convertimos en VOID explotan 5 errores.
    public char imprimir() {
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i].equals("")) {
                System.out.print("_");
            } else {
                System.out.print(palabraEndevinada[i]);
            }
        }
    }

            /*TODO siento que a verificar le falta algo más... Si te fijas, hay un else y luego un for... Quiza es demasiado largo Y DEBERIAMOS DIVIDIRLO EN DOS VERIFICAR??? */
            public String verificar (String letra)
            {
                if (letra.length() > 1) {
                    return System.out.print("Lletra incorrecte");
                } else {
                    boolean exist = false;

                    for (int j = 0; j < paraulaSecreta.length(); j++) {

                        if (paraulaSecreta[j] == letra.charAt(0)) {
                            exist = true;
                            String[] palabraEndevinada = new palabraEndevinada[0]; //me obliga a crear esto si no me da error
                            palabraEndevinada[j] = letra;
                        }
                    }

                    if (!exist) {
                        restarIntent();
                    }

                }
                return "";
            }
//aloha
        /*TODO no entiendo porque pero no me coge el restarIntent grrrrr ALOMEJOR DEBE IR DENTRO O ANTES?*/
        private void restarIntent () {
            if (letra == palabraEndevinada) {
                System.out.println("No has fallado la respuesta es correcta");
            } else {
                Integer restar = Integer.parseInt(String.valueOf(intents)) - 1;
                System.out.println("Has fallado y tienes" + restar);
            }
        }
        /*TODO Esta mal, pero debería ser te quedan intents X de X. me molaria coger restarIntent para aprovecharlo... Pero no se como hacerlo */
        public boolean imprimirVides() {
            /*if () {
                return true;
            } else
                return false;*/
            return imprimirVides(); //lo he hecho asi para que no este en rojo
        }
    }


