// Classe principal chamada Personagem
// Ela representa um personagem genérico do jogo
public class Personagem {

    // Atributos privados da classe
    // private significa que esses dados só podem ser acessados dentro desta classe
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor da classe Personagem
    // O construtor é executado quando criamos um novo personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método getNome
    // Serve para acessar o nome do personagem
    public String getNome() {
        return nome;
    }

    // Método setNome
    // Serve para alterar o nome do personagem
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getClasse
    // Serve para acessar a classe do personagem
    public String getClasse() {
        return classe;
    }

    // Método setClasse
    // Serve para alterar a classe do personagem
    public void setClasse(String classe) {
        this.classe = classe;
    }

    // Método getNivel
    // Serve para acessar o nível do personagem
    public int getNivel() {
        return nivel;
    }

    // Método setNivel
    // Serve para alterar o nível do personagem
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Método getPontosDeVida
    // Serve para acessar os pontos de vida do personagem
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    // Método setPontosDeVida
    // Serve para alterar os pontos de vida do personagem
    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    // Método getPoderBase
    // Serve para acessar o poder base do personagem
    public double getPoderBase() {
        return poderBase;
    }

    // Método setPoderBase
    // Serve para alterar o poder base do personagem
    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    // Método usarHabilidade
    // Este método pode ser sobrescrito nas classes filhas
    public String usarHabilidade() {
        return nome + " usa uma habilidade básica!";
    }

    // Método toString
    // Serve para mostrar as informações do personagem de forma organizada
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Classe: " + classe + "\n" +
               "Nível: " + nivel + "\n" +
               "Pontos de Vida: " + pontosDeVida + "\n" +
               "Poder Base: " + poderBase;
    }
}