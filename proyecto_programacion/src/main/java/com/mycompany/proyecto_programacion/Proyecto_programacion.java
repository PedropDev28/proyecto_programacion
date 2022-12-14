/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_programacion;

/**
 *
 * @author LaParca25
 */
public class Proyecto_programacion {

    public static String Mortalidad(int c) {
        String res = "";
        switch (c) {
            case 0:
                res = "Nacimientos";
                break;
            case 1:
                res = "Fallecimientos";
                break;
            default:
                res = "ERROR INDEX MORTALIDAD";
        }
        return res;
    }

    public static String Ciudad(int f) {
        String res = "";
        switch (f) {
            case 0:
                res = "Caceres";
                break;
            case 1:
                res = "Merida";
                break;
            case 2:
                res = "Badajoz";
                break;    
            default:
                res = "ERROR INDEX BANCO";
        }
        return res;
    }
    public static void main(String[] args) {
       int M[][]={{6,4},{1,5},{9,8}};
    }
}
