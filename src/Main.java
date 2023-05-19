import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horario de inicio do jogo:");
        int horaInicial = sc.nextInt();
        System.out.println("Digite o horario que terminou o jogo:");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas.");

        sc.close();
    }
}