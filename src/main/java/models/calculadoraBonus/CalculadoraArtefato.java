package models.calculadoraBonus;
import models.Funcionario;
import models.Bonus;

public class CalculadoraArtefato implements ICalculadoraBonus {

    @Override
    public void calcula(Funcionario F){

        if(F.getArtefato() >= 5){
                F.getBonus().add(new Bonus(100, "Artefato"));
            }
            else if (F.getArtefato() >= 4 ){
                F.getBonus().add(new Bonus(75, "Artefato"));
            }
            else if (F.getArtefato() >= 3){
                F.getBonus().add(new Bonus(50, "Artefato"));
            }
            else if (F.getArtefato() >= 2){
                System.out.println("Não há bonus de Artefatos criados");
            }
    }
}