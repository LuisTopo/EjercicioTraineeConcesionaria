
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisr
 */
public class ComparaPrecioMayorAMenor implements Comparator<Vehiculo> {
    
    public int compare(Vehiculo v1,Vehiculo v2){
        if(v1.getPrecio() < v2.getPrecio()){
            return 1;
        }
        if(v1.getPrecio() > v2.getPrecio()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
