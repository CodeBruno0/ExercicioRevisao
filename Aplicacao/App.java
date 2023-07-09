package Aplicacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import Modelo.Food;

public class App {

    Scanner scan = new Scanner(System.in);
    List<Food> comida = new ArrayList<>();
List<String> ingredientes = new ArrayList<>();

    int opcao;

    public void loopPrincipal() {

        do {
            opcoesMenu();
            switch (opcao) {
                case 1:
                    obterFood();
                    voltarMenu();
                    break;
                    case 2:
                    listarCadastrados();
                    voltarMenu();
                    break;
                    case 3:
                    //vender

                    break;
                    case 4:
                    //listar vendas

                    break;
                    case 5:
                    //resumo de vendas

                    break;

                default:
                
                    break;
            }

        } while (opcao != 0);
    }

    public void opcoesMenu() {
        System.out.println("<===================>");
        System.out.println("Bem vindo, Chef!");
        System.out.println("<===================>");
        System.out.println("1 - Cadastrar Food.");
        System.out.println("2 - Listar cadastrados.");
        System.out.println("3 - Vendas.");

        opcao = scan.nextInt();
        scan.nextLine();

    }

    public void voltarMenu() {
        System.out.println("Digite ENTER para voltar ao menu.");
        scan.nextLine();
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void obterFood() {
        Food f = new Food();

        System.out.println("Qual o tipo de comida? ");
        f.setNome(scan.nextLine());

        System.out.println("Qual o valor da comida? ");
        f.setValor((scan.nextDouble()));
        scan.nextLine();
        obterIngredientes();
        f.setIngredientes(ingredientes);//posso usar esse parametro pra adicionar a string list em food?
        boolean encontrei = false;

        for (Food food : comida) {//aqui ele nao esta verificando e impedindo o cadastro de informacoes iguais
            if (f.equals(food)) {
                encontrei = false;
                System.out.println("Ja temos uma comida cadastrada com esse nome, Chef!");
                break;
            
        }

        }
        if (!encontrei) {
            comida.add(f);
            
            System.out.println("Otima criacao! Comida cadastrada com sucesso!\nVamos aos ingredientes?");
        }

    }

    public void obterIngredientes(){
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

        
    }

    public void listarCadastrados(){
        if (comida.isEmpty()) {
            System.out.println("Que pena! Nao temos nenhuma comida cadastrada!");
        }

        System.out.println("Lista de Foods");
        for (Food food : comida) {
            System.out.println(food);
        }
    }
}