package com.jaume.penjat;
/*TODO he puesto todo por todo para no perdernos :) */
/*TODO Definir correctamente los atributos, que tipo de atributos queremos. Esta claro que:
*  - Paraules es de String
* - Si te fijas en el test, ParaulaSecreta es de (creo) tipo char siendo un array.
* - palabraEndevinada por lo mismo es String[] y tampoco podemos cambiarlo y hacer un array List creo pq no aparece aquí.
* - Intents es string pero lo convierte a Integer tengo dudas ajajajja
* - Por último, letra que será? ajajajja No tengo ni idea*/

import java.util.ArrayList;

public class Tauler {

    public String letra;
    public String paraula;
    public Integer intents;
    //public String[] paraulaSecreta = paraula.split("");
    //public String[] palabraEndevinada = paraula.split("");

    public Tauler(String letra, String paraula, Integer intents, String[] paraulaSecreta, String[] palabraEndevinada) {
        this.letra = letra;
        this.paraula = paraula;
        this.intents = intents;
        //this.paraulaSecreta = paraulaSecreta;
        //this.palabraEndevinada = palabraEndevinada;
    }

    //getters de los atributos
    public String[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public String getLetra() {
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

    //setters
    public void setParaula(String paraula){this.paraula=paraula;}
    public void setIntents(Integer intents){this.intents=intents;}
    /*TODO He creado el constructor pero da problemas :( puedes borrarlo si te da rabia*/


    /*TODO aquí sinceramente no tengo ni idea de que poner para iniciar la partida */
    public void inicialitzarPartida(String paraula, Integer intents) {
        this.setParaula(paraula);
        this.setIntents(intents);
    }

    public boolean hasGuanyat() {
        if (paraulaSecreta == palabraEndevinada) {
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
                //String letraEnviada=setLetra(letra)
                if (letraEnviada.length() > 1) {
                    return ("Lletra incorrecta");
                } else {
                    boolean exist = false;

                    for (int j = 0; j < paraulaSecreta.length; j++) {

                        if (paraulaSecreta[j] == letra.charAt(0)) {
                            exist = true;
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
        private Integer restarIntent () {
            //necesitamos la palabra (palabraEndevinada = this.getPalabra())
            for (int j = 0; j<)
            if (letra == palabraEndevinada[j] ) {
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


