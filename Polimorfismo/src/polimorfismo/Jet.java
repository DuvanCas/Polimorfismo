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
public class Jet extends PoweredVehicle{
    private String myEngineCount;

        /**
     * @description: Contructor que inicializa la variable
     * @param myEngineCount
     * @param myBrand
     * @param myModel 
     */
    public Jet(String myEngineCount, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineCount = myEngineCount;
    }
    /**
    * metodo imprimir especializado de la clase padre
    */
    @Override
    public void imprimir()
    {
        System.out.println("\nAcá imprimí la especializacion para la clase Jet\n");
    }
    /**
     * metodo que imprime los atributos solicitados por la clase padre y su propio atributo
    */
    public void imprimirJet(){
        System.out.println("\nClase Jet\n");
        System.out.println("myEngineCount:" + myEngineCount + "myFuelType:" + myFuelType + "myBrand:" + myBrand + "myModel:" + myModel);
    }

    /**
     * @return the myEngineCount
     */
    public String getMyEngineCount() {
        return myEngineCount;
    }

    /**
     * @param myEngineCount the myEngineCount to set
     */
    public void setMyEngineCount(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }
}
