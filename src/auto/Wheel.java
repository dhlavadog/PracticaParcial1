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
public class Wheel 
{
    private String tipo;
    private int ancho;
    
    Wheel(String t, int a)
    {
        this.tipo = t;
        this.ancho = a;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public int getAncho()
    {
        return this.ancho;
    }
    
    
}
