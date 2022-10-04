import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner numero = new Scanner(System.in);

        System.out.print("Informe um número:");
        float numeral = numero.nextFloat();
        Float number = numero.nextFloat();

        final Float resultado = number + numeral;

        System.out.print("A soma é :" + resultado);

    }
}