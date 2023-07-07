package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Ingredientes;
import Model.Food;
import Model.Vendas;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("<================>");
        System.out.println("Restaurante Massa DuChef ");
        System.out.println("<================>");

        int opcao;
        do {
            System.out.println("Digite uma opcao: ");
            System.out.println("1 - Cadastrar Food:");
            System.out.println("2 - Listar cadastrados: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                List<Food> food = obterFood();
        
                    obterFood();
                    break;
                case 2:

                    break;
                default:
                    break;
            }
        } while (opcao != 0);

        List<String> ingredientes = obterIngredientes();

        food.forEach(System.out::println);
        ingredientes.forEach(System.out::println);
    }

    public static List<String> obterIngredientes() {
        Scanner scan = new Scanner(System.in);
        List<String> ingredientes = new ArrayList<>();

        String ingredientes0 = "Ingredientes:";
        System.out.println("Qual e a massa? ");
        String massa = scan.nextLine();
        System.out.println("De que e feito o recheio? ");
        String recheio = scan.nextLine();
        System.out.println("Por fim, a cobertura, de que e? ");
        String cobertura = scan.nextLine();

        String ingredientes1 = massa;
        String ingredientes2 = recheio;
        String ingredientes3 = cobertura;

        ingredientes.add(ingredientes0);
        ingredientes.add(ingredientes1);
        ingredientes.add(ingredientes2);
        ingredientes.add(ingredientes3);

        return ingredientes;
    }

    public static List<Food> obterFood() {

        List<Food> food = new ArrayList<>();

        Food comida = new Food(null, 0);

        comida.setNome("Empadinha");

        food.add(new Food("Massa de forno: Empadinha", 23.21));
        return food;
        
        }
        public static List<Food> listarCadastrados(List<Food>food){
            food.forEach(System.out::println);
        }
         

    }
