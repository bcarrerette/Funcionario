package models.calculadoraBonus;
import models.Funcionario;
import models.Bonus;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CalculadoraTempoDeEmpresa implements ICalculadoraBonus {
    private long dias;
    private LocalDate agora;
    private Date admissao;
    @Override
    public void calcula(Funcionario F){
        
        admissao = F.getAdmissao();
        LocalDate d1 = admissao.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        double dias = ChronoUnit.DAYS.between(d1, agora);
        if(dias >= 365 && dias <= 2189){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.02 - F.getSalarioBase(), "Tempo de Empresa"));
            }
            else if (dias >= 2190 && dias <= 4014){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.03 - F.getSalarioBase(), "Tempo de Empresa"));
            }
            else if (dias >= 4015 && dias <= 5839){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.08 - F.getSalarioBase(), "Tempo de Empresa"));
            }
            else if (dias >= 5840 && dias <= 7299){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.1 - F.getSalarioBase(), "Tempo de Empresa"));
            }
            else if (dias >= 7300){
                F.getBonus().add(new Bonus(F.getSalarioBase()*1.15 - F.getSalarioBase(), "Tempo de Empresa"));
            }
            else {
                System.out.println("Não há bonus de Tempo de Empresa");            
            }        
    }
}
