/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Duvan
 * @description clase PoweredVehicle hereda atributos de la clase
 * padre y a su vez, es clase abstracta ya que sera clase padre para las clases
 * Car y Jet donde obtendra atributos para estas otras
 */
public abstract class PoweredVehicle extends Vehicle {
    protected String myFuelType;

    /**
     * @description:Constructor que inicializa la variable
     * @param myFuelType 
     */

    public PoweredVehicle(String myFuelType, String myBrand, String myModel)
    {
        super(myBrand, myModel);
        this.myFuelType = myFuelType;
    }
    /**
     * metodo imprimir que servira para imprimr en sus clases hijas
     */
    public void imprimirVehiculos() {
        System.out.println("aca imprimo los vehiculos potenciados..");
    }
    /**
     * @return the myFuelType
     */
    public String getMyFuelType() {
        return myFuelType;
    }
    /**
     * @param myFuelType the myFuelType to set
     */
    public void setMyFuelType(String myFuelType) {
        this.myFuelType = myFuelType;
    }
    
}
