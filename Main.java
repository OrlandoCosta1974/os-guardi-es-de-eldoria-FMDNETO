// Classe principal do programa
// É aqui que o programa começa a executar
public class Main {

    // Método main
    // É o ponto de entrada do programa Java
    public static void main(String[] args) {

        // Criando um personagem do tipo Mago
        Mago heroi1 = new Mago("Eldoran", 7, 60, 18.0);

        // Criando um personagem do tipo Guerreiro
        Guerreiro heroi2 = new Guerreiro("Arthus", 1, 100, 10.5);

        // Exibindo o título do programa
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println();

        // Exibindo as informações do primeiro herói
        System.out.println("--- Herói 1 ---");
        System.out.println(heroi1);

        // Chamando o método usarHabilidade do Mago
        System.out.println("Habilidade: " + heroi1.usarHabilidade());
        System.out.println();

        // Exibindo as informações do segundo herói
        System.out.println("--- Herói 2 ---");
        System.out.println(heroi2);

        // Chamando o método usarHabilidade do Guerreiro
        System.out.println("Habilidade: " + heroi2.usarHabilidade());
    }
}