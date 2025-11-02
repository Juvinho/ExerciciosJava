import java.util.*;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor1 = sc.nextDouble();

        System.out.println("Digite um valor:");
        double valor2 = sc.nextDouble();

        System.out.println("Digite um valor:");
        double valor3 = sc.nextDouble();

        double media =  (valor1 + valor2 + valor3)/3;
        System.out.println("A média é: " + media);
        sc.close();
        System.exit(0);
        
    }
}
