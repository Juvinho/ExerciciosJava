import java.util.Scanner;

public class Retangulop {
    public static void main(String[] args) {
        System.out.println("-=".repeat(14));
        System.out.println("Tamanho d'um retangulo :)");
        System.out.println("-=".repeat(14));

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o tamnhjo de um dos lados do retangulo: ");
        double ladoA = input.nextDouble();

        System.out.println("Insira o tamnho do outro lado: ");
        double ladoB = input.nextDouble();

        double area = (ladoA * ladoB);
        double perimetro = 2 * (ladoA + ladoB);

        System.out.println("O tamanho do retangulo é:" + ladoA + " x " + ladoB);
        System.out.println(area + "m² de área" + String.format("%.2f", area));
        System.out.println(perimetro + "De perimetro total");
        input.close();

        System.exit(0);
    }
}
