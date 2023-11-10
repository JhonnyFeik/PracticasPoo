/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Esta clase muestra varios escenarios de manejo de excepciones en Java.
 * Explora diferentes tipos de excepciones y sus respectivos mecanismos de manejo.
 *
 * @author hecman
 */
public class POOP10 {

    /**
     * El método principal que sirve como punto de entrada del programa.
     *
     * @param args los argumentos de línea de comandos
     */
    public static void main(String[] args) {
 String mensajes[]= {"Primero", "Segundo", "Tercero"};
        
        // Manejo de ArrayIndexOutOfBoundsException
        try{
            for (int i = 0; i <=3; i++) {
                System.out.println(mensajes[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        System.out.println("Hola mundo 2");
        
        // Manejo de ArithmeticException (división por cero)
        try{
            float equis= 0/0;
            System.out.println(equis);
        }
        catch(ArithmeticException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        
        // Bloques de captura múltiple para diferentes excepciones
        try{
            float equis= 0/0;
            System.out.println(equis);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        
        catch(ArithmeticException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        
        catch(Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        
        // Uso de e.printStackTrace() para detalles de la excepción
        try{
            float equis= 0/0;
            System.out.println(equis);
        }
        catch(ArithmeticException e){
            System.out.println("error");
            e.printStackTrace();
        }
        
        System.out.println("Hola mundo 3");
        
        // Manejo de UnsupportedOperationException lanzado desde el método 'Metodo'
        try{
            double division = Metodo(4f,0.06);
        }
        catch(UnsupportedOperationException e){
            System.out.println("error");
            System.out.println(e.getMessage());   
        }
        
    }
    
    /**
     * Un método que lanza una UnsupportedOperationException.
     *
     * @param f un valor float
     * @param d un valor double
     * @return un valor double
     * @throws UnsupportedOperationException cuando se llama
     */
    
    private static double Metodo(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}