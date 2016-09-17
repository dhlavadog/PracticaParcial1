/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author PC
 */

import java.util.Scanner;
public class Auto 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        Wheel rearA =new Wheel("F",13);
        Wheel rearB = new Wheel("D",25);
        Wheel rearC = new Wheel("su madre",12);
        Wheel rearD = new Wheel("xd",8);
        Wheel rearE = new Wheel ("ja", 10);
        Wheel rearF =new Wheel ("je", 11);
        Engine motor = new Engine(rearA,rearB,"eje");
        Engine motor2 = new Engine(rearC,rearD,"otro eje");
        Engine motor3= new Engine (rearE,rearF,"otro gato");
        
       
        int cilindraje;
        cilindraje = leer.nextInt();
        motor.setCilindraje(cilindraje);
        System.out.println(motor.getCilindraje());
        
        
        
         
         
         
        
   
    }
    
}
