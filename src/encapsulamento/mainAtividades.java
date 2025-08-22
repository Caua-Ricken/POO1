package encapsulamento;

public class mainAtividades {
    public static void main(String[] args) {

/* conta bancaria

        atividades ativi = new atividades(4562);
        ativi.setTitular("cauã");

        ativi.depositar(250);
        ativi.sacar(210.90);
        ativi.exibirSaldo();

 */

      /*  construtores */

        atividades ativi = new atividades("cauã", 20, 1142593445);
        System.out.println(ativi.getCpf());
        System.out.println(ativi.getIdade());
        System.out.println(ativi.getNome());


    }
}
