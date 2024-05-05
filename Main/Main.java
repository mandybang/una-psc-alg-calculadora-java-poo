package Main;
 
 /**
  * Main
  */
import java.util.Scanner;


 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculos calcular = new Calculos();

        while (true) {
            System.out.println("Calculadora On. Escolha qual calculo fazer: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potenciação");
            System.out.println("6 - Raiz quadrada");
            System.out.println("'Q' para desligar a calculadora");

           String calculo = scanner.nextLine();
        
        switch (calculo.toUpperCase()) { //Uppercase é para converter todos os caracteres para letras maiúsculas
            case "1":
                System.out.println("Digite dois numeros para realizar a soma: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                calcular.soma(num1, num2);
                break;

            case "2":
                System.out.println("Digite dois números para realizar a subtração: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                calcular.sub(num1, num2);
                break;

            case "3":
                System.out.println("Digite dois números para realizar a multiplicação: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                calcular.multi(num1, num2);
                break;

            case "4":
                System.out.println("Digite dois números para realizar a divisão: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                calcular.div(num1, num2);
                break;

           case "5":
                System.out.println("Digite dois números para realizar a potencia: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                calcular.poten(num1, num2);
                break;
            
            case "6":
                System.out.println("Digite um número para realizar a raiz quadrada: ");
                num1 = scanner.nextDouble();   
                calcular.raiz(num1);             
                break; 

            case "Q":
                System.out.println("Calculadora desligada.");
                scanner.close(); 
                return; 
        default:
            System.out.println("Opção inválida.");
            break;
        }

    scanner.nextLine(); 
        }
    }
}
 