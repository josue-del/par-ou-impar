package parouimpar;

import entities.ParImpar;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author josue
 * Algoritmo realiza uma operação mostrando se o número digitado é par ou impar
 */
public class Parouimpar {
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ParImpar parimpar = new ParImpar();
        
        System.out.print("Ditite um número para verificar se é Par ou Impar: ");
        parimpar.numero = sc.nextInt();
        if(parimpar.verifica()==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
        sc.close();
    }
}