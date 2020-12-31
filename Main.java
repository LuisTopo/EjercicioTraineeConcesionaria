
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
public class Main {
    
    public static void main(String[] args){
       
        List<Vehiculo>listaVehiculos = Vehiculo.cargarVehiculos();
        Vehiculo.cargarVehiculos();
        Vehiculo.imprimirVehículos(listaVehiculos);
        System.out.println("=============================");
        Vehiculo.mostrarVehiculoMasCaro(listaVehiculos);
        Vehiculo.mostrarVehiculoMasBarato(listaVehiculos);
        Vehiculo.buscarVehiculoPorLetraEnModelo(listaVehiculos, "Y");
        System.out.println("=============================");
        Vehiculo.mostrarVehiculosPorPrecioDeMayorAMenor(listaVehiculos);
    }
}
