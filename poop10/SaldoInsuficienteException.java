/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author gerar
 */

/**
 * Creación de la excepción que indica que el saldo es insuficiente, esto en caso
 * de un retiro de mayor dinero del que se tenga en la cuenta.
 * @author gerar
 */
public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException() {
        super("Saldo insuficiente");
    }
}
