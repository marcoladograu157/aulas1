class Funcionario {
    public String nome;
    public int idade;
    public int q_filhos;
    public double salario;
    public double tempo;

    Funcionario(String nome, int idade, int q_filhos, double salario, double tempo) {
        this.nome = nome;
        this.idade = idade;
        this.q_filhos = q_filhos;
        this.salario = salario;
        this.tempo = tempo;
    }

    public void aumentar() {
        if (salario > 1500 && idade > 27) {
            System.out.println("Novo salário: " + (salario * 1.25));
        } else {
            System.out.println("Sem aumento");
        }
    }

    public void demitir() {
        if (idade > 55 && q_filhos < 2 && tempo < 10) {
            System.out.println("Demitido");
        } else {
            System.out.println("Não demitido");
        }
    }
}