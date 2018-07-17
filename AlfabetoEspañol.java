/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlfabetoEspañol;

import InterfazAlfabeto.InterfaceAlfabeto;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class AlfabetoEspañol implements InterfaceAlfabeto{

 Set<Character> alfabeto;   
    public AlfabetoEspañol(String alfabetoEspañol)    {
        String alfabetoespañol=alfabetoEspañol;
        generar(alfabetoespañol);
    }
    public AlfabetoEspañol()    {
        String alfabetoEspañol="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        alfabetoEspañol+=alfabetoEspañol.toLowerCase();
        generar(alfabetoEspañol);
    }
    
    public void generar(String alfabeto1)    { 
        alfabeto= new LinkedHashSet<>();
        for(Integer indice=0;indice<alfabeto1.length();indice++)
        {
            alfabeto.add(new Character(alfabeto1.charAt(indice)));
        }
    }

 @Override
    public boolean Pertenece(Character c)  {
       Iterator<Character> iterator =alfabeto.iterator();
      
       while(iterator.hasNext())
       {
           if(iterator.next().charValue()==c.charValue())
               return true;
       }
       return false;
    }

    @Override
    public Integer size() {
        return alfabeto.size();
    }
}
