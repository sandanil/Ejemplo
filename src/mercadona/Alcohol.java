/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author DaniL
 */
public class Alcohol extends Bebida{
    private double graduacion;
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Graduación: "+this.graduacion);
    }

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }
    
    
}
