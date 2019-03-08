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
public class Skateboard extends Vehicle{
    private String myBoardLength;
    /**
     * @description: Contructor que inicializa la variable
     * @param myBoardLength
     * @param myBrand
     * @param myModel 
     */
    public Skateboard(String myBoardLength, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myBoardLength = myBoardLength;
    }
    /**
     * metodo que imprime los atributos solicitados por la clase padre y su propio atributo
     */
    public void imprimirSkate(){
        System.out.println("\nClase Skateboard\n");
        System.out.println("myBoardLength:" + myBoardLength + "myBrand:" + myBrand + "myModel:" + myModel);  
    }
    /**
     * Metodo imprimir especializado de la interfaz
     */
    @Override
    public void apagar()
    {
        System.out.println("\nLa patineta esta apagada..\n");
    }
    /**
    * Metodo imprimir especializado de la interfaz
    */
    @Override
    public void encender()
    {
        System.out.println("\nLa patineta esta encendida..\n");
    }
    /**
     * @return the myBoardLength
     */
    public String getMyBoardLength() {
        return myBoardLength;
    }

    /**
     * @param myBoardLength the myBoardLength to set
     */
    public void setMyBoardLength(String myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}
