package classes_e_heranca;

public class Pessoa {

    private String nomeTitular;
    private String cpf;
    private boolean nomeLimpo;

    public Pessoa(String nomeTitular, String cpf, boolean nomeLimpo){
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.nomeLimpo = nomeLimpo;
    }
    public Pessoa(){}

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isNomeLimpo() {
        return nomeLimpo;
    }

    public void setNomeLimpo(boolean nomeLimpo) {
        this.nomeLimpo = nomeLimpo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomeLimpo=" + nomeLimpo +
                '}';
    }

}
