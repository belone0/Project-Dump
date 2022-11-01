package inheritance;

public class ExecutorClasses {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        System.out.println(funcionario.getBonificacao());
    }
}
