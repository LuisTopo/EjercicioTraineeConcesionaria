/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisr
 */
public class Auto extends Vehiculo {
    
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    
    /**
     * @return the cantidadDePuertas
     */
    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    /**
     * @param cantidadDePuertas the cantidadDePuertas to set
     */
    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    @Override
    public String toString(){
        return "Marca: "+this.getMarca()+" // "+"Modelo: "+this.getModelo()+" // "+"Puertas: "+
                String.valueOf(this.cantidadDePuertas)+" // "+"Precio: "+String.format("%.2f",this.getPrecio());
    }
    
}
