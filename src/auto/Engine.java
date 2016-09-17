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
public class Engine 
{
    private Wheel rearA;
    private Wheel rearB;
    private String axle;
    private int cilindraje;
    
    Engine (Wheel ra, Wheel rb, String ax)
    {
        this.rearA = ra;
        this.rearB = rb;
        this.axle = ax;
        
    }
    
    public void getRear()
    {
        System.out.println(rearA.getTipo());
        System.out.println(rearA.getAncho());
        System.out.println(rearB.getTipo());
        System.out.println(rearB.getAncho());
        
    }
    
    public void setCilindraje(int a)
    {
        this.cilindraje = a;
    }
    
    public int getCilindraje()
    {
        return this.cilindraje;
    }
    
    
}
