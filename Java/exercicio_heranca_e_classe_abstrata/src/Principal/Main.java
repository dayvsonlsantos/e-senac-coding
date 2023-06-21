package Principal;

import Model.Homem;
import Model.Mulher;
import Model.PessoaIMC;

import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int tamanhoArray = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        PessoaIMC[] pessoas = new PessoaIMC[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("\n");
            System.out.print("Informe o tipo de objeto (Homem ou Mulher): ");
            String tipoObjeto = scanner.nextLine();

            if (tipoObjeto.equalsIgnoreCase("Homem")) {
                System.out.print("Informe o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Informe a data de nascimento: ");
                String dataNascimento = scanner.nextLine();

                System.out.print("Informe o peso: ");
                double peso = scanner.nextDouble();

                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer

                pessoas[i] = new Homem(nome, dataNascimento, peso, altura);
            } else if (tipoObjeto.equalsIgnoreCase("Mulher")) {
                System.out.print("Informe o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Informe a data de nascimento: ");
                String dataNascimento = scanner.nextLine();

                System.out.print("Informe o peso: ");
                double peso = scanner.nextDouble();

                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer

                pessoas[i] = new Mulher(nome, dataNascimento, peso, altura);
            } else {
                System.out.println("Tipo de objeto inválido. Digite Homem ou Mulher.");
                i--; // Repetir a iteração para ler o tipo de objeto corretamente
            }
        }

        for (PessoaIMC pessoa : pessoas) {
            System.out.println("\n");
            System.out.println("--------------------------");
            System.out.println(pessoa.toString());
            System.out.println(pessoa.resultIMC());
            System.out.println("--------------------------");
        }

    }
}