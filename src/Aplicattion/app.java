package Aplicattion;
import java.lang.String;
import java.util.Scanner;
import Extensao.mat;

public class app {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        mat extensao = new mat();
        
        System.out.println("num:");
        int num1 = sc.nextInt();
        System.out.println("Digite seu nome:");
        extensao.totalletras = sc.next();
        System.out.println("Seu nome é > " + extensao.totalletras);
        System.out.println("Seu numero é > " + num1);
        
        int letras = extensao.Calcletras();

        System.out.println("O seu nome tem: " + letras + " letras ao total");

        sc.close();
    }
}
