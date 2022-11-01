package classes_e_heranca;

public class Conta extends Pessoa {
    private int numeroConta;
    private double saldo;

    public Conta() {
    }

    public Conta(String nomeTitular, String cpf, boolean nomeLimpo, int numeroConta, double saldo) {
        super(nomeTitular, cpf, nomeLimpo);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(isNomeLimpo()) {
            this.saldo = saldo;
        }else{
            System.out.println("Impossivel realizar operacoes com nome sujo, Nome: "+this.getNomeTitular()+" cpf: "+this.getCpf());
        }
    }

    public void sacar(double valor) {
        if (this.isNomeLimpo()) {
            if (valor < 0) {
                System.out.println("Não é permitido o saque de valores negativos.");
            } else {
                if (valor > this.saldo) {
                    System.out.println("Não é permitido sacar um valor maior do que seu saldo atual.");
                } else {
                    this.saldo = this.saldo - valor;
                }
            }
        }else{
            System.out.println("Impossivel realizar operacoes com nome sujo, Nome: "+this.getNomeTitular()+" cpf: "+this.getCpf());
        }
    }

    public void autoDeposito(double valor) {
        if(isNomeLimpo()) {
            if (valor <= 0) {
                System.out.println("Não é permitido o deposito de valores negativos.");
            } else {
                this.saldo = this.saldo + valor;
                System.out.println("Deposito efetuado com sucesso");
            }
        }else{
            System.out.println("Impossivel realizar operacoes com nome sujo, Nome: "+this.getNomeTitular()+" cpf: "+this.getCpf());
        }
    }

    public void depositar(double valor, Conta destinatario) {
        if(isNomeLimpo()) {
            if (valor <= 0) {
                System.out.println("Não é permitido o deposito de valores negativos.");
            }
            if (destinatario.numeroConta <= 0) {
                System.out.println("Numero de conta invalido.");
            }
            if (valor > 0 && destinatario.numeroConta > 0) {
                destinatario.saldo = destinatario.saldo + valor;
            }
        }else{
            System.out.println("Impossivel realizar operacoes com nome sujo, Nome: "+this.getNomeTitular()+" cpf: "+this.getCpf());
        }
    }

    public void imprimeNomeTitular() {
        System.out.println(this.getNomeTitular());
    }

    public void transferir(Conta remetente, Conta destinatario, double valor) {
        if(isNomeLimpo()) {
            if (valor <= 0) {
                System.out.println("Não é permitido a transferencia de valores negativos.");
            }
            if (destinatario.numeroConta <= 0 || remetente.numeroConta <= 0) {
                System.out.println("Numero de conta invalido.");
            }
            if (remetente.getSaldo() < valor) {
                System.out.println("Saldo insuficiente");
            }
            if (valor > 0 && destinatario.numeroConta > 0 && remetente.numeroConta > 0 && remetente.getSaldo() > valor) {
                remetente.saldo -= valor;
                destinatario.saldo += valor;
                System.out.println("Transferencia realizada com sucesso "+remetente.getCpf()+" para "+ destinatario.getCpf());
            }
        }else{
            System.out.println("Impossivel realizar operacoes com nome sujo, Nome: "+this.getNomeTitular()+" cpf: "+this.getCpf());
        }

    }

}

