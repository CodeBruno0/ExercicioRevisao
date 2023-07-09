package Modelo;

import java.util.List;

public class Food {
    
    private String nome;
    private double valor;
    private List<String>ingredientes;
    
    public List<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<String> ingredientes) {
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
    

    @Override
    public String toString() {
        return String.format("Food: %s\nValor: R$ %.2f\nIngredientes: %s\n",nome , valor, ingredientes);
        
    }
    @Override
    public boolean equals(Object obj) {
        Food f = (Food)obj;
        return getNome() == f.getNome();
    }
    public void setIngredientes(Object obterIngredientes) {
    }
    
    
}
