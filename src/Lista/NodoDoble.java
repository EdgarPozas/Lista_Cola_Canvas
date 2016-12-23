package Lista;


import Nodo_Figura.Medidas_Standard;
import java.awt.Canvas;
import java.awt.Graphics;

public class NodoDoble extends Canvas implements Medidas_Standard{
    public Object valor;
    public NodoDoble ant,sig;
    
    public NodoDoble(Object val){
        valor=val;
        ant=sig=null;
    }
    public void dibujarNodo(Graphics g,int x_circulo,int y_circulo){
        g.setColor(color_circulo);
        g.fillOval(x_circulo, y_circulo, r_circulo*2, r_circulo*2);
    }
     public void dibujarFlecha(Graphics g,int x_inicio,int y_inicio,int x_fin,int y_fin){
        g.setColor(color_linea);
        g.drawLine(x_inicio, y_inicio, x_fin, y_fin);
    }
    public void dibujarTexto(Graphics g,String texto,int x,int y){
        g.setColor(color_fuente);
        g.drawString(texto, x+r_circulo-12, y+r_circulo-6);
    }
    
    
}
