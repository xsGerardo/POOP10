/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author gerar
 */

// Creación del atributo Cuenta
public class Cuenta {
    // Creación del atributo saldo
    private float saldo;

    // Creación del constructor vacío
    public Cuenta() {
    }

    /**
     * 
     * @param saldo Inicialización del atributo saldo 
     */
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return Método get que permite obtener el saldo.
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo Método set que recibe el saldo.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
   
    /**
     * Método "depositar" que recibe como parametro un monto de tipo flotante, 
     * donde, dicho monto se agrega como deposito al saldo de la cuenta.
     * @param monto 
     */
    public void depositar(float monto){
        System.out.println("Se esta depositando..." + monto + " pesos");
        saldo += monto;
        consultar();
    }
   
    /**
     * Método "retirar" que recibe como parametro un monto de tipo flotante, donde,
     * se genera una excepción en caso de que el monto a retirar, sea mayor al
     * saldo existente en la cuenta.
     * @param monto
     * @throws SaldoInsuficienteException 
     */
    public void retirar(float monto) throws SaldoInsuficienteException{
        System.out.println("Se esta retirando...");

        if(monto > saldo){
            throw new SaldoInsuficienteException();
        }
        // saldo = saldo - monto
        saldo -= monto;
        consultar();
    }
   
    /**
     * Método que consulta el saldo e imprime el saldo, esto, concatenando el método
     * get para obtener el saldo.
     */
    public void consultar(){
        System.out.println("Tu saldo es: " + getSaldo());
    }

    /**
     * Método toString que imprime el saldo de la cuenta.
     * @return 
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
