
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class IMC {
    
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            float altura;
            int peso;
            float imc;
            
            System.out.println("Digite o peso: ");
            peso = sc.nextInt();
            System.out.println("Digite a altura: ");
            altura = sc.nextFloat();
            
            imc = (float) peso/(altura*altura);
            
            System.out.println("IMC: " + imc);
            
            if( imc > 18.5 && imc < 25){
                System.out.println("Peso ideal.");
            } else {
                System.out.println("Fora do ideal.");
                
            }
        }
}
    
}
