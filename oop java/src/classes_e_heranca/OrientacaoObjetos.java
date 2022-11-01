package classes_e_heranca;

public class OrientacaoObjetos {

    public static void main(String[] args) {

        Conta conta = new Conta("Ronaldo","12345",true,5,100.0);

        conta.autoDeposito(50);
        System.out.println(conta.getSaldo());

        conta.setNomeLimpo(false);
        conta.autoDeposito(50);

    }
}