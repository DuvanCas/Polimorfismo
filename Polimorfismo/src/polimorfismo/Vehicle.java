/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import InterfazVehiculos.Interfaz;

/**
 *
 * @author Duvan
 */
/***
 * 
 * @description Clase padre, sera aquella que contendra atributos para las clases hijas
 */
public abstract class Vehicle implements Interfaz{
    protected String myBrand;
    protected String myModel;
    /**
     * @description: Contructor que incializa las variables
     * @param myBrand
     * @param myModel 
     */
    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
    }
    /**
     * metodo imprimir que servira para imprimir en cada una de las clases hijas
     */
    public void imprimir(){
        System.out.println("¡Hola! esta es la funcion padre principal...\n");
    }
    
    /**
     * @return the myBrand
     */
    public String getMyBrand() {
        return myBrand;
    }
    /**
     * @param myBrand the myBrand to set
     */
    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }
    /**
     * @return the myModel
     */
    public String getMyModel() {
        return myModel;
    }
    /**
     * @param myModel the myModel to set
     */
    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
    @Override
    public void apagar()
    {
        System.out.println("\nEl vehiculo esta apagado\n");
    }
    @Override
    public void encender()
    {
        System.out.println("\nEl vehiculo esta encendido\n");
    }
}
