package com.jaume.penjat;
/*TODO he puesto todo por todo para no perdernos :) */
/*TODO Definir correctamente los atributos, que tipo de atributos queremos. Esta claro que:
*  - Paraules es de String
* - Si te fijas en el test, ParaulaSecreta es de (creo) tipo char siendo un array.
* - palabraEndevinada por lo mismo es String[] y tampoco podemos cambiarlo y hacer un array List creo pq no aparece aquí.
* - Intents es string pero lo convierte a Integer tengo dudas ajajajja
* - Por último, letra que será? ajajajja No tengo ni idea*/

public class Tauler {

    public String letra;
    public String paraula;
    public Integer intents;
   public char[] paraulaSecreta;
    public String[] palabraEndevinada;

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

    public Tauler(){

    }
    public Tauler(String letra, String paraula, Integer intents, char[] paraulaSecreta, String[] palabraEndevinada) {
        this.letra = letra;
        this.paraula = paraula;
        this.intents = intents;
        this.paraulaSecreta = paraulaSecreta;
        this.palabraEndevinada = palabraEndevinada;
    }

    //getters de los atributos

    public String getLetra() {
        return letra;
    }

    public String getParaula() {
        return paraula;
    }


    //setters
    public void setParaula(String paraula) {
        this.paraula = paraula;
    }

    public void setIntents(Integer intents) {
        this.intents = intents;
    }

    public String setLetra(String letra) {
        this.letra = letra;
        return letra;
    }


    public void inicialitzarPartida(String paraula, Integer vidas) {
        char[] parole = paraula.toCharArray();
        setParaulaSecreta(parole);
        setIntents(vidas);
    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public Integer getIntents() {
        return intents;
    }

    /*TODO siento que a verificar le falta algo más... Si te fijas, hay un else y luego un for... Quiza es demasiado largo Y DEBERIAMOS DIVIDIRLO EN DOS VERIFICAR??? */
    public String verificar (String letra) {
        String letraEnviada = setLetra(letra);
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

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }


    //imprimir estoy segura que esta bien. fijate que se crean _ cuando lo aciertas Pero si lo convertimos en VOID explotan 5 errores.
    public String imprimir() {
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i].equals("")) {
                System.out.print("_");
            } else {
                System.out.print(palabraEndevinada[i]);
            }
        }
        return imprimir();
    }

    /*TODO no entiendo porque pero no me coge el restarIntent grrrrr ALOMEJOR DEBE IR DENTRO O ANTES?*/
    public void restarIntent() {
            Integer restarIntent=intents--;
    }

    /*TODO Esta mal, pero debería ser te quedan intents X de X. me molaria coger restarIntent para aprovecharlo... Pero no se como hacerlo */
    public String imprimirVides() {
        String vidilla = String.format("Te quedan %s vidillas ", intents);
        if (1 == intents) vidilla = String.format("Te quedan %s vidilla", intents);
        return vidilla;
    }


    // Este ya estaría ! :D
    public boolean hasGuanyat() {
       /* if (paraulaSecreta == palabraEndevinada) {
            return true;
        } else
            return false;*/
        return hasGuanyat();
    }

}
