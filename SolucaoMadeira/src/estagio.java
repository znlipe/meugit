import java.util.Scanner;

public class estagio {

    public static void main(String[] args) {
        String c;
        int enun;
        Scanner ler = new Scanner(System.in);
        System.out.println("Favor digite seu nome: ");
        c = ler.nextLine();

        System.out.println("Olá " + c + ", eu me chamo Felipe, tenho 23 anos\nSou estudante de Análise e Desenvolvimento de sistemas pela Uniavan,\nMoro em Itajaí, Santa Catarina.\n ");

        do {
            System.out.println("Se deseja saber mais sobre mim, escolha de 1 a 4 e, para sair, digite 5.");
            enun = ler.nextInt();

            if (enun == 1) {
                System.out.println("Você escolheu opção 1: No que eu acredito!");
                System.out.println("-> Eu acredito em mim!\n-> Acredito que posso alcançar minhas metas e sonhos.\n");
            } else if (enun == 2) {
                System.out.println("Você escolheu opção 2: Qual a minha aspiração!");
                System.out.println("-> Minha aspiração é me tornar um grande desenvolvedor Java e ser um exemplo na minha área.\n");
            } else if (enun == 3){
                System.out.println("Você ecolheu opção 3: Qual o meu propósito!");
                System.out.println("-> Meu propósito é agregar valor ao segmento da tecnologia e desenvolvimento, é facilitar " +
                        "e melhorar a qualidade de vida das pessoas através da programação.\n");
            } else if (enun == 4){
                System.out.println("Você ecolheu opção 4: Como estou buscando meu propósito e aspiração através dessa oportunidade?");
                System.out.println("-> Através desta oportunidade, sei que estarei um passo mais próximo de alcançar minha meta de " +
                        "crescimento profissional \ncaminhando juntamente com a empresa que busca liderar a evolução das soluções de experiência" +
                        "do mercado.");
            }

        } while (enun != 5);

        System.out.println("\nMuito obrigado " + c + ", por sua atenção!");
    }
}
