/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duvan
 */
public class Logica {
    /**
     * creo una nueva lista para la clase padre vehiculo
     */
    List<Vehicle> vehiculo =new ArrayList<Vehicle>();
    public Logica() {
        ingresar();
    }
    /**
     * metodo donde realizo insercion de datos para cada una de las clases
     * estos para atributos propios de cada clase y atributos heredados
     */
    public void ingresar(){
        /**
         * creo un objeto de tipo vehiculo necesario que obtendra un objeto del tipo de la
         * clase Bicyle y añadir los datos requeridos
         */
        Vehicle ciclas = new Bicyle("\nblue\n", "\ngear\n", "\nprueba\n");
        /**
        * creo un objeto de tipo vehiculo necesario que obtendra un objeto del tipo de la
        * clase Skateboard y añadir los datos requeridos
        */
        Vehicle skate = new Skateboard("\ntable\n", "\ntodoterreno\n", "\ngruesa\n");
        /**
        * creo un objeto de tipo vehiculo necesario que obtendra un objeto del tipo de la
        * clase Car y añadir los datos requeridos
        */
        Vehicle car = new Car("\nfull\n", "\nchecrolet\n", "\n2000\n", "\neste\n");
        /**
        * creo un objeto de tipo vehiculo necesario que obtendra un objeto del tipo de la
        * clase Jet y añadir los datos requeridos
        */
        Vehicle jet = new Jet("\ngrande\n", "\nrapido\n", "\nbacano\n","\nvolar\n");
        vehiculo.add(ciclas);
        vehiculo.add(car);
        vehiculo.add(skate);
        vehiculo.add(jet);
        /**
         * instancio aca el objeto padre con una variable auxiliar
         * hago una condicion para determinar si la instancia es correcta 
         * repecto a la clase que la quiero realizar
         * de ser asi, entra e imprime los metodos de la clase en particular
         * y el metodo de la clase padre a la que pertenezca
         * en caso contrario sigue recorriendo hasta encontrar la instancia correcta
         */
        for (Vehicle vehiculo1 : vehiculo) {
            if(vehiculo1 instanceof Bicyle)
            {
                Bicyle cicla = (Bicyle)vehiculo1;
                cicla.imprimir();
                cicla.imprimirBicicleta();
            }
            else if(vehiculo1 instanceof Skateboard)
                    {
                        Skateboard tabla = (Skateboard)vehiculo1;
                        tabla.imprimir();
                        tabla.imprimirSkate();
                    }
            else if(vehiculo1 instanceof Car)
            {
                Car carro = (Car)vehiculo1;
                carro.imprimir();
                carro.imprimirVehiculos();
                carro.imprimirCar();
            }
            else if(vehiculo1 instanceof Jet)
            {
                Jet avion = (Jet)vehiculo1;
                avion.imprimir();
                avion.imprimirVehiculos();
                avion.imprimirJet();
            }
        }
    }
}
