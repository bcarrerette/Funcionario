package models.calculadoraBonus;
import models.Funcionario;
import models.Bonus;

public class CalculadoraAssiduidade implements ICalculadoraBonus {

    @Override
    public void calcula(Funcionario F){

        if(F.getFaltas() == 0){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.05 - F.getSalarioBase(), "Assiduidade"));
            }
            else if (F.getFaltas() >= 1 && F.getFaltas() <= 3){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.03 - F.getSalarioBase(), "Assiduidade"));
            }
            else if (F.getFaltas() >= 4 && F.getFaltas() <= 5){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.01 - F.getSalarioBase(), "Assiduidade"));
            }
            else if (F.getFaltas() >= 6){
                System.out.println("Não há bonus de Assiduidade");
            }
    }
}