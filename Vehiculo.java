
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisr
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String toString(){
        return "Marca: "+this.getMarca()+" // "+"Modelo: "+this.getModelo()+" // "+
                "Precio: "+String.format("%.2f",this.precio);
    }
    
    public static void imprimirVehículos(List<Vehiculo>listaVehículo){
        for(Vehiculo v: listaVehículo){
            System.out.println(v);
        }
        
    }
    
    public static void buscarVehiculoPorLetraEnModelo(List<Vehiculo>listaVehiculo,String s){
        int flagModelo = 0;
        System.out.printf("Vehículo que contiene en el modelo la letra `"+s+"´: ");
        for(Vehiculo v: listaVehiculo){   
            if(v.getModelo().contains(s)){//CaseSensitive
                System.out.printf(v.marca+" "+v.modelo+" "+String.valueOf(v.precio)+"\n");
                flagModelo = 1;
            }
        }
        if(flagModelo == 0){
            System.out.printf("No hubo coincidencias\n");
        }
    }
    
    public static void mostrarVehiculoMasCaro(List<Vehiculo>listaVehiculos){
        listaVehiculos.sort(new ComparaPrecioMayorAMenor());
        System.out.println("Vehículo más caro: "+listaVehiculos.get(0).marca+" "+listaVehiculos.get(0).modelo);
    }
    
    public static void mostrarVehiculoMasBarato(List<Vehiculo>listaVehiculos){
        listaVehiculos.sort(new ComparaPrecioMenorAMayor());
        System.out.println("Vehículo más barato: "+listaVehiculos.get(0).marca+" "+listaVehiculos.get(0).modelo);
       
    }
    
    public static void mostrarVehiculosPorPrecioDeMayorAMenor(List<Vehiculo>listaVehiculos){
        listaVehiculos.sort(new ComparaPrecioMayorAMenor());
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for(Vehiculo v: listaVehiculos){
            System.out.println(v.marca+" "+v.modelo);
        }
    }
    
    public static List<Vehiculo> cargarVehiculos(){
        List<Vehiculo>listaVehiculos = new ArrayList();
        listaVehiculos.add(new Auto(4,"Peugeot","206",(float)200000.00));
        listaVehiculos.add(new Moto(125,"Honda","Titan",(float)60000.00));
        listaVehiculos.add(new Auto(5,"Peugeot","208",(float)250000.00));
        listaVehiculos.add(new Moto(160,"Yamaha","YBR",(float)80500.00));
        return listaVehiculos;
    }
}
