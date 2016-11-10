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
public class Bebida extends Caduca {
    private double azucar;
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Porcentaje de Azucar: "+this.azucar);
    }

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }
    
    
}
