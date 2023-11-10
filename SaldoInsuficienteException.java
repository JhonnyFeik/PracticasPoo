/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Esta clase representa una excepción específica, SaldoInsuficienteException, que hereda de la clase Exception.
 *
 * @author poo08alu10
 */
public class SaldoInsuficienteException extends Exception {
    /**
     * Constructor de SaldoInsuficienteException que establece un mensaje predeterminado: "Saldo insuficiente".
     */
    public SaldoInsuficienteException(){
        super("Saldo insuficiente");
    }
    /**
     * Constructor de SaldoInsuficienteException que permite definir un mensaje personalizado y proporciona
     * opciones adicionales para manejar la excepción.
     *
     * @param message               Mensaje personalizado para la excepción
     * @param cause                 Causa que originó la excepción
     * @param enableSuppression     Activación de supresión
     * @param writableStackTrace    Activación del rastreo de pila modificable
     */
    public SaldoInsuficienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
