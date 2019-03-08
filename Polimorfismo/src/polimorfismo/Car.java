/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Duvan
 */
public class Car extends PoweredVehicle{
    private String myEngineSize;

     /**
     * @description: Contructor que inicializa la variable
     * @param myEngineSize
     * @param myBrand
     * @param myModel 
     */
    public Car(String myEngineSize, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineSize = myEngineSize;
    }
    /**
     * metodo que imprime los atributos solicitados por la clase padre y su propio atributo
     */
    public void imprimirCar(){
        System.out.println("\nClase Car\n");
        System.out.println("myEngineSize:" + myEngineSize + "myFuelType:" + myFuelType + "myBrand:" + myBrand + "myModel:" + myModel);
    }

    /**
     * @return the myEngineSize
     */
    public String getMyEngineSize() {
        return myEngineSize;
    }

    /**
     * @param myEngineSize the myEngineSize to set
     */
    public void setMyEngineSize(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }
    
}
