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
public class Fresco extends Caduca{
    private int temperatura;
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Temperatura: "+this.temperatura);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
}
