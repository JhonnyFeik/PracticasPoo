/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Esta clase, Cuenta, gestiona una cuenta bancaria con métodos para depositar, retirar y obtener el saldo.
 *
 * @author poo08alu10
 */
public class Cuenta {
    private double saldo;
    
    /**
     * Constructor predeterminado que inicializa el saldo en cero.
     */
    public Cuenta (){
        saldo=0;
    }
    
    /**
     * Método para depositar una cantidad específica en la cuenta.
     *
     * @param monto la cantidad a depositar
     */
    public void depositar(double monto){
        System.out.println("Depositando "+ monto);
        saldo += monto;
    }
    
    /**
     * Método para retirar una cantidad específica de la cuenta, lanzando una excepción SaldoInsuficienteException si el saldo es insuficiente.
     *
     * @param monto la cantidad a retirar
     * @throws SaldoInsuficienteException si el saldo es menor que el monto a retirar
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando" + monto);
        if (saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
    /**
     * Método para obtener el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta
     */
    public double getSaldo(){
        return saldo;
    }
}
