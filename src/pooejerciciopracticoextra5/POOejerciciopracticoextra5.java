/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciopracticoextra5;

import entidad.Cuenta;

/**
 *
 * @author tinap
 */
public class POOejerciciopracticoextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(100000,"Agustina");
        c1.retirar_dinero();
    }
    
}
