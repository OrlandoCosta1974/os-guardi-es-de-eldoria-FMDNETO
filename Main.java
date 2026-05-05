//Criação da classe Main onde o programa irá inciar
public class Main {
    //Aqui definimos o método construtor da classe main
    public static void main(String[] args) {

        //Criação dos objetos e seus atributos
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Merlin", "Mago", 20, 100, 20);
        Personagem heroi3 = new Personagem("Enéias", "Sábio", 56, 200, 100);


        //Execução do método Exibir Status da classe personagem
        heroi1.exibirStatus();
        heroi2.exibirStatus();
        heroi3.exibirStatus();
    }
}
