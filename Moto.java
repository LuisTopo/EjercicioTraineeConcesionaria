/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisr
 */
public class Moto extends Vehiculo {
    
    private int cilindrada;

    public Moto(int cilindrada, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String toString(){
        return "Marca: "+this.getMarca()+" // "+"Modelo: "+this.getModelo()+" // "+"Cilindrada: "+
                String.valueOf(this.cilindrada)+"cc"+" // "+"Precio: "+String.format("%.2f",this.getPrecio());
    }
}
