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
public class Bicyle extends Vehicle{
    private String myGearCount;
    /**
     * @description: Constructor que inicializa las variables
     * @param myGearCount
     * @param myBrand
     * @param myModel 
     */
    public Bicyle(String myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }    
    /**
     * metodo imprimir contiene los atributos heredados de su clase padre y a su vez su propio atributo
     */
    public void imprimirBicicleta(){
        System.out.println("\nClase Bicicleta\n");
        System.out.println("myGearCount:" + myGearCount + "myBrand:" + myBrand + "myModel:" + myModel);
    }
    /**
     * @return the myGearCount
     */
    public String getMyGearCount() {
        return myGearCount;
    }
    /**
     * @param myGearCount the myGearCount to set
     */
    public void setMyGearCount(String myGearCount) {
        this.myGearCount = myGearCount;
    }
}
