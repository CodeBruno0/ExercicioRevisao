package Model;

public class Ingredientes {
    private String tipoDeComida;
    private String massa;
    private String recheio;
    private String cobertura;
    
    public Ingredientes(String tipoDeComida, String massa, String recheio, String cobertura) {
        this.tipoDeComida = tipoDeComida;
        this.massa = massa;
        this.recheio = recheio;
        this.cobertura = cobertura;
    }
    public String getTipoDeComida() {
        return tipoDeComida;
    }
    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }
    public String getMassa() {
        return massa;
    }
    public void setMassa(String massa) {
        this.massa = massa;
    }
    public String getRecheio() {
        return recheio;
    }
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    @Override
    public String toString() {
        return "\nIngredientes:\nTipo de comida: " + tipoDeComida + ".\nMassa: \n" + massa + ".\nRecheio: \n" + recheio
                + "\nCobertura : \n" + cobertura;
    }
    

}
