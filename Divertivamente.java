import java.util.Scanner;

public class Divertivamente{
    public static void main(String[] args) {
        double pontosAlegria = 0;
        double pontosTristeza = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas amizades a Riley fez: ");
        int amizadesFeitas = scanner.nextInt() * 10;

        if (amizadesFeitas > 0) {
            pontosAlegria += amizadesFeitas;
        } else {
            pontosTristeza += 30;
        }

        System.out.println("Quanto a Riley tirou na prova A1: ");
        double notaA1 = scanner.nextDouble();

        System.out.println("Quanto a Riley tirou na prova A2: ");
        double notaA2 = scanner.nextDouble();

        System.out.println("Quanto a Riley tirou na prova A3: ");
        double notaA3 = scanner.nextDouble();

        double media = (notaA1 + notaA2 + notaA3) / 3;

        if (media >= 7) {
            System.out.println("Riley foi aprovada!");
            pontosAlegria += 50;
        } else {
            System.out.println("Riley foi reprovada! :(");
            pontosTristeza += 50;
        }

        System.out.println("Quantos exécicios a Riley conseguiu fazer: ");
        int exerciciosResolvido = scanner.nextInt() * 10;

        pontosAlegria += exerciciosResolvido;
        pontosTristeza += (exerciciosResolvido - 10);

        if (pontosAlegria > pontosTristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        System.out.println("Pontos Alegria: " + pontosAlegria);
        System.out.println("Pontos Tristeza: " + pontosTristeza);

        System.out.println(pontosAlegria);

        scanner.close();
    }
}