// Classe de entrada da aplicação.
public class Main {
    // Método principal responsável por iniciar a execução do programa.
    public static void main(String[] args) {

        // Instancia personagens com dados iniciais para demonstração.
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Merlin", "Mago", 20, 100, 20);
        Personagem heroi3 = new Personagem("Enéias", "Sábio", 56, 200, 100);


        // Exibe no console o estado atual de cada personagem.
        heroi1.exibirStatus();
        heroi2.exibirStatus();
        heroi3.exibirStatus();
    }
}
