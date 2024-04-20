package mx.utng.p2;

import java.util.Scanner;

public class SistemaVotacion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalVotos = 0;
            int votosValidos = 0;
            int votosNulos = 0;

            System.out.print("¿Cuántos votos se emitieron? ");
            totalVotos = scanner.nextInt();

            for (int i = 1; i <= totalVotos; i++) {
                System.out.print("Voto " + i + ": (Candidato / Nulo) ");
                String voto = scanner.next().toLowerCase();

                if (voto.equals("candidato")) {
                    votosValidos++;
                } else if (voto.equals("nulo")) {
                    votosNulos++;
                } else {
                    System.out.println("Voto inválido. Por favor, ingresa 'Candidato' o 'Nulo'.");
                    i--;
                }
            }

            double porcentajeNulos = (double) votosNulos / totalVotos * 100;
            System.out.println("Total de votos válidos: " + votosValidos);
            System.out.println("Total de votos nulos: " + votosNulos);
            System.out.println("Porcentaje de votos nulos: " + porcentajeNulos + "%");
        }
    }
}
