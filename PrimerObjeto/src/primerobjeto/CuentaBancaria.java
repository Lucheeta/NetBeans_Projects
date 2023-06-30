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
public class CuentaBancaria {
    String CBU;
    String alias;
    double saldo;
    
/**acá voy a poner los métodos acompañado de void (vacío) porque 
 * no tiene que mostrar ningún parámetro, solo me tiene que mostrar 
 * en consola los datos de la cuenta
*/    
 
void mostrarDatos() {
    //acá vamos a tener en cuerpo de nuestro método
  System.out.println(CBU + " " + alias + " " + saldo);  
     }
double obtenerSaldo () {
    return saldo;
}
}
