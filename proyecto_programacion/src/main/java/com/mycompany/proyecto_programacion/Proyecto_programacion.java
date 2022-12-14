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

    public static void main(String[] args) {
        
         int M[][] = {{6,4},{1,5},{9,8}};
         mayorcrec (M);
    }
    
    public static String Mortalidad (int c) {
        String res = "";
        switch (c) {
            case 0:
                res = "Nacimientos";
                break;
            case 1:
                res = "Fallecimientos";
                break;
            default:
                res = "ERROR INDEX CADENA";
        }
        return res;
    }
    
         public static String Ciudad (int f) {
        String res = "";
        switch (f) {
            case 0:
                res = "Cáceres";
                break;
            case 1:
                res = "Mérida";
                break;
            case 2:
                res = "Badajoz";
                break;
            default:
                res = "ERROR INDEX COLUMNA";
        }
        return res;
    }
   
    public static void crecimiento(int M[][]) {
        
        for (int f = 0; f < M.length; f++) 
        {
                if(M[f][0]>M[f][1])
                    System.out.println("La ciudad " + Ciudad(f) + " crece"); 
                else
                    System.out.println("La ciudad " + Ciudad(f) + " decrece"); 
        }                 
    }    
    
    public static void mayorcrec(int M[][]) {
        int dif = M[0][1] - M[0][0];
        int indexMayorDif = 0;
        for (int f = 1; f < M.length; f++) {
            if((M[f][1] - M[f][0]) > dif){
                dif = M[f][0] - M[f][1];
                indexMayorDif = f;
            }
        }
        if(dif > 0)
            System.out.println(Ciudad(indexMayorDif) + 
                    " es la ciudad de mayor crecimiento positivo (" +
                    dif + ")");
        else
            System.out.println("Ninguna ciudad presenta crecimiento");
    }
}

