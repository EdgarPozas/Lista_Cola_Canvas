package Lista;


//1 y 1 de modo grafico

public class ListaDoble {
    
    private NodoDoble cab,fin;
    
    public ListaDoble(){
        cab=fin=null;
    }
    public boolean insertar(Object dato){
        NodoDoble temp=new NodoDoble(dato);
        if(temp==null) return false;
        if(esVacio()){
           cab=fin=temp;
           return true;
        }
        fin.sig=temp;
        fin.sig.ant=fin;
        fin=temp;
        return true;
    }
    public int cantidadNodos(){
        int datos=0;
        for(NodoDoble i=cab;i!=null;i=i.sig) datos++;
        return datos;
    }
    
    public boolean eliminar(){
        if(esVacio()) return false;
        if(cab.equals(fin)){
            cab=fin=null;
            return true;
        }
        fin=fin.ant;
        fin.sig=null;
        return true;
    }
    
     public boolean eliminar(Object dato){
        if(esVacio()) return false;
        if(cab.equals(fin)){
            if(cab.valor.equals(dato)){
                cab=fin=null;
                return true;
            }
            return false;
        }
        if(fin.valor.equals(dato)){
            fin=fin.ant;
            fin.sig.ant=null;
            fin.sig=null;
            return true;
        }
        
        for (NodoDoble i = cab; i!=null;i=i.sig) {
             if(i.valor.equals(dato)){
                 i.ant.sig=i.sig;
                 i.sig.ant=i.ant;
                 i.ant=null;
                 i.sig=null;
                 return true;
             }
         }
       
        return false;
    }
     
    public boolean eliminarPrimero(){
        if(esVacio()) return false;
        if(cab.equals(fin)){
            cab=fin=null;
            return true;
        }
        cab=cab.sig;
        cab.ant=null;
        return true;
    }
    
    private boolean esVacio(){
        return cab==null && fin==null;
    }
    public NodoDoble[] toArray(){
        NodoDoble[] nodos=new NodoDoble[cantidadNodos()];
        int con=0;
        for (NodoDoble i = cab; i!=null;i=i.sig,con++) {
             nodos[con]=i;
        }
        return nodos;
    }
    
}
