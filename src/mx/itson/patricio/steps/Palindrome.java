package mx.itson.patricio.steps;

import mx.itson.patricio.ui.NewJFrame;

/**
 * Contiene métodos para trabajar con frases o palabras palindromos
 *
 * @author Yols Martinez, José Alvarez
 */
public class Palindrome extends NewJFrame {
    /**
     * Remplaza el espacio de la frase o cualquier caracter
     * @param accommodate Si la frase tiene " ", va reemplazar por "", para
     * poder leer la frase.
     * @return Devuelve la varible "newOration" después de aplicar una serie de
     * reemplazos de caracteres en ella.
     */
    public String phrases(String accommodate) {
        String newOration = accommodate.replace(" ", "")
                .replace("ó", "o")
                .replace("á", "a")
                .replace("í", "i")
                .replace(",", "")
                .replace("!", "")
                .replace("¡", "");
        System.out.println(newOration);
        return newOration;
    }

    /**
     * Este método sirve para saber si una frase es palíndromo e invertir la
     * palabra modificada que ingresa el usuario
     *
     * @param phrase Se leera la frase limpia que ingresa el usuario al revés
     * para determinar si es palíndromo o no
     * @return Devuelve el resultado de la comparación entre la variable
     * "phrase" y la variable "reverce"
     */
    public boolean isPalindrome(String phrase) {
        /**
         * Ejemplo user: Amo la pacífica paloma
         *
         * a m o l a p a c i f i  c  a  p  a  l  o  m  a
         * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
         */
        char[] arrayChar = phrase.toCharArray();
        String reverce = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            reverce = reverce + arrayChar[i];
        }
        return phrase.equals(reverce);
        

    }

}
