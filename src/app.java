import java.util.Scanner;
public class app {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("num:");
        int num1 = sc.nextInt();
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        System.out.println("Seu nome é >" + nome);
        System.out.println("Seu numero é >" + num1);
        
        sc.close();
    }
}
