import java.util.Scanner;

public class estagio {

    public static void main(String[] args) {
        String c;
        int enun;
        Scanner ler = new Scanner(System.in);
        System.out.println("Favor digite seu nome: ");
        c = ler.nextLine();

        System.out.println("Ol� " + c + ", eu me chamo Felipe, tenho 23 anos\nSou estudante de An�lise e Desenvolvimento de sistemas pela Uniavan,\nMoro em Itaja�, Santa Catarina.\n ");

        do {
            System.out.println("Se deseja saber mais sobre mim, escolha de 1 a 4 e, para sair, digite 5.");
            enun = ler.nextInt();

            if (enun == 1) {
                System.out.println("Voc� escolheu op��o 1: No que eu acredito!");
                System.out.println("-> Eu acredito em mim!\n-> Acredito que posso alcan�ar minhas metas e sonhos.\n");
            } else if (enun == 2) {
                System.out.println("Voc� escolheu op��o 2: Qual a minha aspira��o!");
                System.out.println("-> Minha aspira��o � me tornar um grande desenvolvedor Java e ser um exemplo na minha �rea.\n");
            } else if (enun == 3){
                System.out.println("Voc� ecolheu op��o 3: Qual o meu prop�sito!");
                System.out.println("-> Meu prop�sito � agregar valor ao segmento da tecnologia e desenvolvimento, � facilitar " +
                        "e melhorar a qualidade de vida das pessoas atrav�s da programa��o.\n");
            } else if (enun == 4){
                System.out.println("Voc� ecolheu op��o 4: Como estou buscando meu prop�sito e aspira��o atrav�s dessa oportunidade?");
                System.out.println("-> Atrav�s desta oportunidade, sei que estarei um passo mais pr�ximo de alcan�ar minha meta de " +
                        "crescimento profissional \ncaminhando juntamente com a empresa que busca liderar a evolu��o das solu��es de experi�ncia" +
                        "do mercado.");
            }

        } while (enun != 5);

        System.out.println("\nMuito obrigado " + c + ", por sua aten��o!");
    }
}
