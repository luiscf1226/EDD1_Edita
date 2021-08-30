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
public abstract class ListaTDA {
    protected ArrayList<Character>lista=new ArrayList();
    public ListaTDA() {
    }
    public abstract void Imprimir();
    public abstract void Mete(char data);
    public abstract void Vacia();
    public abstract char Tope();
    public abstract void Saca(int data);
    
    
    
    
    
}