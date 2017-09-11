/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafici;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author utente
 */
public class DrawingPanel extends JPanel 
{

   private double ux,uy; 
   private final double MAXX = 10;
   private final double MINX = -10;
   private final double MAXY = 10;
   private final double MINY = -10;
   
   private int deltax,deltay;
   
   private int npunti;
   private double passox;
   
    
   @Override
   public void paint(Graphics g )
   {
       ux = getWidth()/(MAXX-MINX);
       uy = - getHeight()/(MAXY-MINY);
       
       deltax = 10; // getWidth() / 2;
       deltay = getHeight()-10;  //getHeight() / 2;
       
       npunti=100;
       passox = (MAXX-MINX)/npunti;
       
       
       
       g.setColor(Color.BLACK);
       g.fillRect(0, 0, this.getWidth(), this.getHeight());
       g.setColor(Color.WHITE);
       
       
       g.drawLine(deltax, 0, deltax, getHeight());
       g.drawLine(0, deltay, getWidth(),deltay);
       
       double cur_x = MINX;
       
       for(int i=0;i<npunti;i++)
       {
           // y = 2*x;
           
           double calc_y = cur_x*cur_x;
           
           int gx,gy;
           
           gx = (int) (cur_x * ux + deltax);
           gy = (int) (calc_y * uy + deltay);
                  
           g.fillOval(gx, gy, 2, 2);
           
           
           
           cur_x+=passox;
           
           
       }
       
       
       
       
       
       
       
   }
    
    
}
