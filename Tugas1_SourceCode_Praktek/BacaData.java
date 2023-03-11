/* Arsuci Fidyawati
 * 13020210297
 */

package com.mycompany.bacadata;

import java.util.Scanner;


public class BacaData {

    /**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan;
/* Program */
System.out.print ("Contoh membaca dan menulis, ketik nilaiinteger: \n");
masukan = new Scanner(System.in);
a = masukan.nextInt(); /* coba ketik : 
masukan.nextInt(); 
Apa akibatnya ?*/
System.out.print ("Nilai yang dibaca : "+ a);
        
    }
}
