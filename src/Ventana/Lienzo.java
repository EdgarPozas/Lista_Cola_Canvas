package Ventana;

import Cola.Cola_Simple;
import Lista.ListaDoble;
import Lista.NodoDoble;
import Nodo_Figura.Medidas_Standard;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Lienzo extends Canvas implements Medidas_Standard{
    
    public void drawList(Graphics g,ListaDoble lista){
        int x=100,y=20;
        g.clearRect(0, 0, 1000, 1000);
        if(lista.cantidadNodos()==0){
            g.drawString("Cabecera", x-50, y-10);
            g.fillOval(x-50, y, r_circulo*2, r_circulo*2);
        }else{
            g.drawString("Cabecera", x, y-10);
        }
        for(NodoDoble nodo:lista.toArray()){
            
            if(x>400){
                x=100-r_circulo*4;
                y+=(r_circulo)*2+5;
            }
            
            nodo.dibujarNodo(g,x,y);
            nodo.dibujarTexto(g, nodo.valor.toString(), x, y);
            
            int altura_sig=y+r_circulo+10;
            int altura_ant=y+r_circulo-10;
            
            nodo.dibujarFlecha(g, x+r_circulo+10,altura_sig,x+r_circulo+tam_flecha,altura_sig);
            nodo.dibujarFlecha(g, x+r_circulo-10,altura_ant,x-10,altura_ant);
            
            x+=r_circulo*2+10;;
            
        }
        g.drawString("Fin", x-(r_circulo*2)+10,y+(r_circulo*2)+20);
    }
    public void drawCola(Graphics g,Cola_Simple cola){
        int x=100,y=20;
        g.clearRect(0, 0, 1000, 1000);
        
        int w_cola=400;
        int h_cola=200;
        int in_x=50,in_y=50;
        
        g.drawRect(in_x,in_y, w_cola, h_cola);
        
        //g.drawLine(in_x, 0,in_x,h_cola+ 50);
        g.setColor(Color.RED);
        int tam_celda=w_cola/cola.getTamCola();
        for (int i = 0; i < cola.getTamCola(); i++) {
            in_x+=tam_celda;
            g.drawLine(in_x, 50,in_x,h_cola+ 50);
        }
        
        g.setColor(Color.BLACK);
        
        in_x=60;
        in_y=40;
        //Dibujar INI y FIN
       
        if(cola.esta_vacia()){
            g.drawString("INI", in_x-tam_celda,in_y);
        }else{
            //System.out.println(cola.getINI());
            g.drawString("INI", in_x+(tam_celda*cola.getINI()),in_y);
        }
     
        in_x=20;
        for(Object dato:cola.getCola()){
            if(dato==null)continue;
            in_x+=tam_celda;
            
            g.drawString(dato.toString(), in_x, in_y+50);
            
        }
        in_x=60;
        
        g.drawString("FIN", in_x+(tam_celda*cola.getFIN()),in_y+h_cola+40);
    }
}
