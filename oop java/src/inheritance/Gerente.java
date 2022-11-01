package inheritance;


public class Gerente extends Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public Gerente() {

    }

    public int senha() {
        return senha;
    }

    public Gerente setSenha(int senha) {
        this.senha = senha;
        return this;
    }

    public int numeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public Gerente setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
        return this;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }
}



