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
public class Caduca extends Producto{
    private String fecha;
    
    public void mostrar(){
        super.mostrar();
         /*Como la variable "codigo" de producto es protected y no
        private, podemos acceder a ella desde las clases hijas.
        Si mantenemos codigo como private, lo haríamos asi: 
        System.out.println(this.getCodigo());*/
         /*Si ponemos las variables como protected, lo hacemos 
         de la siguiente forma:System.out.println("Código: "+this.codigo);
         es decir, como lo hacemos normmalmente*/
        /*-->Otra forma de hacerlo, manteniendo codigo como private,
         ponemos super.mostrar(); y accedemos al metodo mostrar 
         de la clase padre Producto, donde muestra codigo.*/
        System.out.println(this.fecha);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
