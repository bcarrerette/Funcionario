package models;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario {
    private double id;
    private String nome;
    private double salarioBase;
    private double salario;
    private double idade;
    private String cargo;
    private ArrayList<Bonus> bonus = new ArrayList();
    private double bonusTotal;
    private double artefato;
    private double faltas;
    private String graduacao;
    private double tempoDeEmpresa;
    private Date admissao;

    public double getId() {
        return id;
    }

    public ArrayList<Bonus> getBonus() {
        return bonus;
    }

    public double getBonusTotal() {
        return bonusTotal;
    }

    public void setBonusTotal(double bonusTotal) {
        this.bonusTotal = bonusTotal;
    }
    
    public double getFaltas() {
        return faltas;
    }
    
    public void setId(double id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salario) {
        this.salarioBase = salario;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getArtefato() {
        return artefato;
    }

    public void setArtefato(double artefato) {
        this.artefato = artefato;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public double getTempoDeEmpresa() {
        return tempoDeEmpresa;
    }

    public void setTempoDeEmpresa(double tempoDeEmpresa) {
        this.tempoDeEmpresa = tempoDeEmpresa;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public double getSalario() {
        return salario;
    }
    
    

    public Funcionario(String nome, double id, double salarioBase, double idade, String cargo, String graduacao, Date admissao) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
        this.cargo = cargo;
        this.graduacao = graduacao;
        this.admissao = admissao;
        this.faltas = 0;
        
    }
    
        public Funcionario(String nome, double id, double salarioBase, double idade, String cargo, String graduacao) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
        this.cargo = cargo;
        this.graduacao = graduacao;
        this.faltas = 0;
        
    }
     
    public void addBonus(Bonus bonus){
        
    }
    
    
    
    
    
    
}
