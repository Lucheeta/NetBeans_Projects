/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerobjeto;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaBancaria cb = new CuentaBancaria();
       
       
       
       cb.CBU = "2340974823309388402948";
       cb.alias = "caro.pelo.zanco";
       cb.saldo = 34.987;
 cb.mostrarDatos(); // ya nos aparece el método creado y nos va a servir para cualquier cuenta bancaria creada.
    }
    
}
