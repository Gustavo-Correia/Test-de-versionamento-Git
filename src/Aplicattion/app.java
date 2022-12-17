package Aplicattion;
import java.lang.String;
import java.util.Scanner;
import Extensao.mat;

public class app {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        mat extensao = new mat();
        int num1[] = new int[11];
        
        System.out.println("primeiro número:");
        num1[0] = sc.nextInt();
        System.out.println("Seu numero é > " + num1[0]);
        System.out.println("Número em ordem crescente abaixo:");
        for (int x=0; x<11; x++){
            num1[x] = num1[0] + x;
            System.out.println(num1[x]);
        }
        System.out.println("Digite seu nome:");
        String totalletras = sc.next();
        System.out.println("Seu nome é > " + totalletras);
        
        
        int letras = extensao.Calcletras(totalletras);

        System.out.println("O seu nome tem: " + letras + " letras ao total");

        int vogais = extensao.Calcletras(totalletras,letras);
        System.out.println("total de vogais no seu nome: " + vogais);
        sc.close();
    }
}
