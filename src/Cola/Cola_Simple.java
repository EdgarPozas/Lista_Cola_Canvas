package Cola;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Cola_Simple {
    protected int INI,FIN;
    protected Object[] vector;
    private int tam_Cola;
    
    public Cola_Simple(int tam){
        vector=new Object[tam];
        INI=FIN=-1;
        tam_Cola=tam;
    }
    public boolean encolar(Object dato){
        if(esta_llena()) return false;
        FIN++;
        if(insertarPrimerElemento()) INI=0;
        vector[FIN]=dato;
        return true;
    }
    public boolean desencolar(){
        if(esta_vacia()) return false;
        INI++;
        if(INI>=FIN){
            INI=FIN=-1;
        }
        return true;
    }
    public boolean esta_llena(){
        return FIN==vector.length-1;
    }
    public boolean esta_vacia(){
        return INI==-1 && FIN==-1;
    }
    protected boolean insertarPrimerElemento(){
        return INI==-1;
    }
    public Object[] mostrar(){
        //for int i;i<<
        if(esta_vacia()) return null;
        Object[] aux=new Object[FIN-INI+1];
        for (int i = INI; i <=FIN; i++) {
            aux[i-INI]=vector[i];
        }
        return aux;
    }
    public Object[] getCola(){
        return vector;
    }
    public int getTamCola(){
        return this.tam_Cola;
    }
    public int getINI(){
        return INI;
    }
    public int getFIN(){
        return FIN;
    }
    
}
