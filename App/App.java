package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import App.Telas;
import Model.Ingredientes;
import Model.Food;
import Model.Vendas;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("<================>");
        System.out.println("Restaurante Massa DuChef ");
        System.out.println("<================>");

        List<Food> food = obterFood();
        List<Ingredientes> ingredientes = obterIngredientes();

        food.forEach(System.out::println);
        ingredientes.forEach(System.out::println);
food.add(new Food(null, 0, null));
    }

    public static List<Ingredientes> obterIngredientes() {
        Scanner scan = new Scanner(System.in);
        List<Ingredientes> ingredientes = new ArrayList<>();

        Ingredientes receita = new Ingredientes(null, null, null, null);
        System.out.println("Qual o tipo de comida que deseja cadastrar? ");
        receita.setTipoDeComida(scan.nextLine());
        System.out.println("Do que e feita a massa da comida? ");
        receita.setMassa(scan.nextLine());
        System.out.println("E o recheio? ");
        receita.setRecheio(scan.nextLine());
        System.out.println("E por fim, a cobertura: ");
        receita.setCobertura(scan.nextLine());

        Ingredientes receita2 = new Ingredientes(null, null, null, null);

        ingredientes.add(receita);
        ingredientes.add(receita2);
        return ingredientes;
    }

    public static List<Food> obterFood() {
        Scanner entrada = new Scanner(System.in);
        List<Food> food = new ArrayList<>();

        Food food1 = new Food(null, 0, null);
        System.out.println("Qual o nome da comida, Chef? ");
        food1.setNome(entrada.nextLine());
        System.out.println("Qual o valor? ");
        food1.setValor(entrada.nextDouble());
        entrada.nextLine();
food.add(new Food(null, 0, null));
        return food;
    }
}