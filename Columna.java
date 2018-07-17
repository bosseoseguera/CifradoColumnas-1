package Mensaje;

import InterfazAlfabeto.InterfaceAlfabeto;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Columna {
Set<Character> columna ;
InterfaceAlfabeto alfabeto;

public Columna(){
    columna= new LinkedHashSet<>();
         
}
    public Integer TamañoMensaje() {
     return columna.size();
    }

  
    public Character getPost(Integer pos) {
      
       Integer indice=1;
        for (Character caracter : columna) {
            if(indice==pos)
                return caracter;                        
        }
        return null;
    }


    public InterfaceAlfabeto getAfabeto() {
        return  alfabeto;
    }
}
