// A classe Mago herda da classe Personagem
// Isso significa que Mago possui os atributos e métodos de Personagem
public class Mago extends Personagem {

    // Construtor da classe Mago
    // Ele recebe nome, nível, pontos de vida e poder base
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {

        // super chama o construtor da classe Personagem
        // Aqui definimos automaticamente a classe como "Mago"
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    // Sobrescrita do método usarHabilidade
    // O Mago terá uma habilidade específica
    @Override
    public String usarHabilidade() {
        return getNome() + " conjura um feitiço de proteção!";
    }
}
