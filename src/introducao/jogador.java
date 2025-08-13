package introducao;

public class jogador {

    String nome;
    double pontuacao;
    int nivel;
    int novoNivel;

    public void subirNivel(){
            nivel += 1;
        System.out.println("o jogador " + nome + " subio de nivel " + nivel);

    }
}
