package models;
import java.time.LocalDate;


public class Bonus {
    private double valor;
    private String tipo;
    private LocalDate data;

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public Bonus(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    
    
    
    
}
