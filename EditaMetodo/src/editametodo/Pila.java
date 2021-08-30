/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editametodo;

import java.util.ArrayList;

/**
 *
 * @author Luis Carlos Flores
 */

public class Pila extends ListaTDA {
    

    public Pila() {
    }

    public ArrayList<Character> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Character> lista) {
        this.lista = lista;
    }
    
     public void Imprimir(){
         if(lista.isEmpty()){
             System.out.println("LISTA VACIA");
         }else{
            System.out.print("ListaChar: ");
            for (int i = 0; i < this.lista.size(); i++) {
                System.out.print(lista.get(i));
            }
            System.out.println("");
         }
         
     }
    public void Mete(char data){
        
        lista.add(data);
        
    }
    public void Vacia(){
        lista.clear();
    }
    public char Tope(){
        
        
        return lista.get(lista.size()-1);
    }
    public void Saca(int  data){
        lista.remove(data);
    }
   
}
