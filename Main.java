import java.lang.Math;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("=-".repeat(14) + "\n");
        System.out.print("Diga que bola tens \n");
        System.out.print("=-".repeat(14) + "\n");
        System.out.print("E direi quem tu és \n");
        System.out.print("=-".repeat(14) + "\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite aqui o tamanho do raio:");
        double radius = sc.nextDouble();

        //calculo do circulo
        double area = Math.PI * (radius * radius);
        double diametro = (2 * radius);
        double circunferencia = (2 * Math.PI * radius);

        //Exibir resultados
        System.out.println("Resultado");
        System.out.print("=-".repeat(14) + "\n");
        System.out.print("O raio é de: " + radius + "\n");

        //Resultados gerais
        System.out.print("=-".repeat(14) + "\n");
        System.out.print("A área é de: " + area +"\n");
        System.out.print("A diametro é de: " + diametro +"\n");
        System.out.print("A circunferencia é de: " + circunferencia +"\n");
        System.out.print("=-".repeat(14) + "\n");

        sc.close();
        System.exit(0);

    }
}