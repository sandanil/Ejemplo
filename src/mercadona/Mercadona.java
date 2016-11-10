/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

/**
 *
 * @author DaniL
 */
public class Mercadona {
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public static void rellenarDatos(){
        for (int i = 0; i < 10; i++) {
            Producto p = new Producto();
            p.setCodigo("COD "+i);
            p.setNombre("Nombre "+i);
            p.setPeso((int) Math.random());
            productos.add(p);
            
            Caduca pc = new Caduca();
            pc.setCodigo("COD "+2+i);
            pc.setFecha("Caduca el: "+(i+1));
            pc.setNombre("Nombre "+2+i);
            pc.setPeso((int) Math.random());
            productos.add(pc);
            
            Fresco fe = new Fresco();
            fe.setCodigo("COD "+1+i);
            fe.setFecha("Caduca el: "+(i+1));
            fe.setTemperatura(i);
            fe.setNombre("Nombre "+1+i);
            fe.setPeso((int) Math.random());
            productos.add(fe);
            
            Bebida be = new Bebida();
            be.setCodigo("COD "+50+i);
            be.setFecha("Caduca el: "+(i+1));
            be.setAzucar(i+25);
            be.setNombre("Nombre "+50+i);
            be.setPeso((int) Math.random());
            productos.add(be);
            
            Alcohol al = new Alcohol();
            al.setCodigo("COD "+66+i);
            al.setFecha("Caduca el: "+(i+1));
            al.setAzucar(i+10);
            al.setGraduacion(i+60);
            al.setNombre("Nombre "+60+i);
            al.setPeso((int) Math.random());
            productos.add(al);
            
            Empleado em = new Empleado();
            em.setNombre("Empleado "+(i+1));
            em.setEdad(i+20);
            empleados.add(em);
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarTodosLosProductos(){
        /*int i=1;
        for (Producto producto : productos) {
            System.out.println("Producto nº"+i+"  --> Código: " + producto.getCodigo());
            i++;
        }*/
        for (Producto producto : productos) {
            producto.mostrar();
            System.out.println("");
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarAzucardeTodasLasBebidas(){
        System.out.println("Azucar de nuestras bebidas:");
        for (int i=0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida){
                System.out.println("Código: "+((Bebida) productos.get(i)).getCodigo()+
                        " --> Azucar: "+((Bebida) productos.get(i)).getAzucar());
            }
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarAzucarBebidasNoALoholicas(){
        System.out.println("Azucar de las bebidas no alcoholicas:");
        for (int i=0; i < productos.size(); i++){
            if (productos.get(i) instanceof Bebida && !(productos.get(i) instanceof Alcohol)){
                System.out.println("Código: "+((Bebida) productos.get(i)).getCodigo()+
                        " --> Azucar: "+((Bebida) productos.get(i)).getAzucar());
            }
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarMediaGraduacionBebidas(){
        double suma=0;
        double cont=0;
        for (int i=0; i < productos.size(); i++){
            if (productos.get(i) instanceof Alcohol){
                suma = suma + ((Alcohol)productos.get(i)).getGraduacion();
                cont++;
            }
        }
        System.out.println("Graduación Media de nuestras bebidas alcoholicas: "+(suma/cont));
    }

//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodosLosProductos();
        //mostrarAzucardeTodasLasBebidas();
        //mostrarAzucarBebidasNoALoholicas();
        //mostrarMediaGraduacionBebidas();
    }
    
}
