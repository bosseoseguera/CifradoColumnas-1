package AlfabetoRuso;

import InterfazAlfabeto.InterfaceAlfabeto;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class AlfabetoRuso implements InterfaceAlfabeto{
    Set<Character> alfabeto;   
       
    public AlfabetoRuso()
    {
        String alfabetoRuso="АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя'";
        generar(alfabetoRuso);
    }
    
    public void generar(String alfabeto1)
    { 
        alfabeto= new LinkedHashSet<>();
        for(Integer indice=0;indice<alfabeto1.length();indice++)
        {
            alfabeto.add(new Character(alfabeto1.charAt(indice)));
        }
    }

    @Override
    public boolean Pertenece(Character c)
    {
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

    