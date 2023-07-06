package Model;

public class Food {
    
    private String nome;
    private double valor;
    private Ingredientes ingredientes;
    
    public Food(String nome, double valor, Ingredientes ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Ingredientes getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }
    @Override
    public String toString() {
        return "Food: \nNome: " + nome + ".\nValor: R$ " + valor + ".\nIngredientes: \n" + ingredientes;
    }
    
}
