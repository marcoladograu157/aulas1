import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas:");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();


        System.out.println("Insira o total de aulas e o total de faltas:");
        double t_a = scanner.nextDouble();
        double t_f = scanner.nextDouble();


        Aula a1 = new Aula(n1, n2, n3, n4, t_a, t_f);


        a1.avaliar();
        a1.avaliar_faltas();

    double t_al = scanner.nextDouble();
    double t_ap = scanner.nextDouble();
    double t_aula = scanner.nextDouble();

    Professor p1= new Professor(t_al,t_ap,t_aula);
    p1.promover();
    p1.bonificar();

}
    }
