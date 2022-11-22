package models.calculadoraBonus;
import models.Funcionario;
import models.Bonus;

public class CalculadoraGraduacao implements ICalculadoraBonus {

    @Override
    public void calcula(Funcionario F){

        if(F.getGraduacao().equals("Doutorado")){
                F.getBonus().add(new Bonus(300, "Graduação"));
            }
        else if(F.getGraduacao().equals("Mestrado")){
                F.getBonus().add(new Bonus(200, "Graduação"));
            }
        else if(F.getGraduacao().equals("Técnico")){
                F.getBonus().add(new Bonus(50, "Graduação"));
            }
        else 
            System.out.println("Não há bonus de Graduação criados");
            
    }
}