package encapsulamento;

public class atividades {


    /* conta bancaria

    public atividades(int numeroConta){
        this.numeroConta = numeroConta;
    }
    private int numeroConta;
    private double saldo;
    private String titular;


    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }




    public void depositar(double valor){
        saldo += valor;
        System.out.println(saldo + " foi adicionado na conta " + numeroConta + " da pessoa " + titular);
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("saldo insuficiente");
        }else {
            saldo -= valor;
            System.out.println(valor + " foi removido da conta " + numeroConta + " da pessoa " + titular);
        }
    }

    public void exibirSaldo(){
        System.out.println("seu saldo é de : " + saldo);
    }

     */

    /* construtores */

    private String nome;
    private int idade;
    private int cpf;

    public atividades(String nome, int idade, int cpf){
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }


}
