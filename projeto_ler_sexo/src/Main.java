import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (Masculino/Feminino): ");
            String sexo = scanner.nextLine();

            
            if (sexo.equalsIgnoreCase("Masculino")) {
                listaMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                listaFeminino.add(nome);
            }
        }

        
        scanner.close();

        
        System.out.println("Pessoas do sexo masculino:");
        for (String nome : listaMasculino) {
            System.out.println(nome);
        }

        System.out.println("Pessoas do sexo feminino:");
        for (String nome : listaFeminino) {
            System.out.println(nome);
        }
    }
}



