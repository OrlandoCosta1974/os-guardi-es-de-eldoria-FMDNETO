// A classe Guerreiro herda da classe Personagem
// Isso significa que Guerreiro também é um tipo de Personagem
public class Guerreiro extends Personagem {

    // Construtor da classe Guerreiro
    // Ele recebe os dados do guerreiro
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {

        // super chama o construtor da classe Personagem
        // Aqui definimos automaticamente a classe como "Guerreiro"
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // Sobrescrita do método usarHabilidade
    // O Guerreiro terá uma habilidade própria
    @Override
    public String usarHabilidade() {
        return getNome() + " realiza um ataque poderoso com sua espada!";
    }
}
