/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class Cuenta {
   private double saldo;
   private String titular;
   
   
    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

   public void retirar_dinero(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el nombre del titular");
       
       if (titular.equalsIgnoreCase(leer.next())) {
           System.out.println("Su saldo es de "+saldo);
           System.out.println("Cuanto dinero quiere retirar?");
           double retiro = leer.nextDouble();
           if (0<=saldo-retiro) {
            saldo-=retiro;
               System.out.println("El titular "+titular+" retiro la cantidad en pesos de: "+retiro+ ".El saldo restante en la cuenta es de :"+saldo);
           }else{
               System.out.println("La cantidad que quiere retirar es mayor a la que tiene disponible en su cuenta, recuerde que su saldo es de "+saldo);
           }
       }else{
           System.out.println("Nombre incorrecto");
       }
       
   }
            
}
