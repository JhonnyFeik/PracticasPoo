/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;


/**
 * Esta clase, Cajero, simula un escenario de transacciones bancarias utilizando la clase Cuenta.
 * Realiza depósitos, retiros y gestiona excepciones de SaldoInsuficienteException.
 *
 * @author hecman
 */
public class Cajero {
    
    public static void main(String[] args){
       Cuenta cuenta = new Cuenta();
       try{
           cuenta.depositar(2000);
           cuenta.retirar(1000);
           cuenta.getSaldo();
           cuenta.retirar(1000);
           cuenta.getSaldo();
           cuenta.retirar(1000);
           cuenta.getSaldo();
           cuenta.depositar(200);
           cuenta.retirar(100);
       } catch (SaldoInsuficienteException e){
           e.printStackTrace();
       }
    }
    
}
