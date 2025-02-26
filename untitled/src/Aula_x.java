import java.util.Scanner;

public class Aula_x {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a opção: 1-Funcionario 2-Cliente");
        int op = validador(entrada);
        System.out.println("Insira um nome");
        String nome = entrada.next();
        System.out.println("Insira a idade");
        int idade = entrada.nextInt();
        System.out.println("Insira a quantidade de filhos");
        int q_filhos = entrada.nextInt();
        System.out.println("Insira a renda");
        double salario = entrada.nextDouble();

        switch (op) {
            case 1:
                System.out.println("Insira o tempo de serviço");
                double tempo = entrada.nextDouble();
                Funcionario f1 = new Funcionario(nome, idade, q_filhos, salario, tempo);
                f1.aumentar();
                break;

            case 2:
                System.out.println("Cliente registrado!");

                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        entrada.close();
    }


    public static int validador(Scanner entrada) {
        int op;
        while (true) {
            op = entrada.nextInt();
            if (op == 1 || op == 2) {
                return op;
            } else {
                System.out.println("Opção inválida! Insira 1 para Funcionario ou 2 para Cliente.");
            }
        }
    }
}