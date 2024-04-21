/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gerar
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de un arreglo de dos espacios
        int[] arr1 = new int [2];
        try{
            // Se recorre el arreglo de forma común
            for (int i=0; i<2; i++){
                arr1[i]=i;
            }
           
            /**
             * Se recorre el arreglo de forma normal, pero hay un detalle que
             * genera un error, puesto que la segunda condición donde existe un
             * i, significa donde termina el arreglo, y aquí tiene un menor o igual
             * lo que genera un error, pues implica que puede tener 3 espacios el 
             * arreglo ya que siempre se pone un simbolo de menor, ya que los arreglos
             * comienzan en 0, lo que genera un error.
             */
            for (int i=0; i<=2; i++){
                System.out.println(arr1[i]);
            }
        } /**
         * Se lanza un excepción que indica que el índice de  la matriz está 
         * fuera de los límites.
         */
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
       
        // Se imprime la posición 0 del arreglo
        System.out.println(arr1[0]);
        System.out.println("Hola mundo");
       
        // Fragmento de código que realiza una división sobre cero. 
        int a, b, c=10;
        try{
            a = 10;
            b = 0;
            c = a/b;
        } /**
         * Se lanza una excepción como la de arriba, para ver si este tipo excepción
         * puede entrar en este tipo de error de código (No puede entrar).
         */
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Codigo del ArrayIndexOutOfBoundsException");
        } /**
         * Se lanza un excepción aritmetica, para marcar el error 
         * (es la que va a solucionar el código).
         */ 
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Codigo del ArithmeticException");
        }
        
        // Se imprime la variable c.
        System.out.println(c);
        System.out.println("################");
       
        // Fragmento de código que indica que una división que no genera error.
        System.out.println("El resultado es: " + division(1,2));
       
        // Se crea un try para una división entre cero, la cual genera error.
        try{
           System.out.println("El resultado de la segunda division es: " + division(100,0));
           division(5,2);
        } // Se lanza una excepción aritmetica nuevamente para solucionar el error. 
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("##########");
        // Se crea un objeto cuenta de tipo cuenta, que tiene un saldo inicial de 100
        Cuenta cuenta = new Cuenta(100);
        // Se manda a llamar el método consultar, proveniente de la clase Cuenta
        cuenta.consultar();
        
        /**
         * Se genera un try, puesto que, no es posible retirar más dinero 
         * del que se tenía inicialmente.
         */
        try {
            cuenta.retirar(50);
            cuenta.retirar(100);
            cuenta.retirar(500);
        } // Se lanza una excepción que indica que no hay suficiente saldo en la cuenta.
        catch (SaldoInsuficienteException ex) {
            //Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        System.out.println("Despues de todo me sigo ejecutando");
    }

   
    /**
     * 
     * @param a dividendo de la división
     * @param b divisor de la división
     * @return resultado
     * @throws ArithmeticException 
     * 
     * Este código contiene una excepción que permite cualquier tipo de división, 
     * donde ya se incluye la división entre cero.
     */
    private static float division(int a, int b) throws ArithmeticException{
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        if (b == 0){
            throw new ArithmeticException("Error");
        } else{
            // Se castea el resultado a flotante puesto que la división de dos enteros, es un flotante.
            return (float)a/b;
        }
    }
}
