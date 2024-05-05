package Main;

class Calculos {
    public double soma(double num1, double num2) {
        double total = num1 + num2;
        System.out.printf("O resultado da soma é: %.2f%n", total);
        return total;
    }

    public double sub(double num1, double num2) {
        double total = num1 - num2;
        System.out.printf("O resultado da subtração é: %.2f%n", total);
        return total;
    }

    public double multi(double num1, double num2) {
        double total = num1 * num2;
        System.out.printf("O resultado da multiplicação é: %.2f%n", total);
        return total;
    }

    public double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN; // retornam NaN para indicar um erro.
        }
        double total = num1 / num2;
        System.out.printf("O resultado da divisão é: %.2f%n", total);
        return total;
    }

    public double poten(double base, double expoente) {
        double total = Math.pow(base, expoente);
        System.out.printf("O resultado da potenciação é: %.2f%n", total);
        return total;
    }

    public double raiz(double num) {
        if (num < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; 
        }
        double total = Math.sqrt(num);
        System.out.printf("O resultado da raiz quadrada é: %.2f%n", total);
        return total;
    }
}
