// Classe de entrada da aplicação.
public class Main {
    // Método principal responsável por iniciar a execução do programa.
    public static void main(String[] args) {

        // Instancia personagens com dados iniciais para demonstração.
        Guerreiro guerreiro1 = new Guerreiro("Kratos", 1, 100, 10.5, 30);
        Mago mago1 = new Mago("Merlin", 20, 100, 20, 20);
        Guerreiro guerreiro2 = new Guerreiro("Enéias",  56, 200, 100, 10);


        // Exibe no console o estado atual de cada personagem.
        guerreiro1.exibirStatus();
        mago1.exibirStatus();
        guerreiro2.exibirStatus();

        //Inicia os métodos especiais de cada classe com base no método da superclasse
        guerreiro1.usarHabilidadeEspecial();
        mago1.usarHabilidadeEspecial();
        guerreiro2.usarHabilidadeEspecial();

    }
}
