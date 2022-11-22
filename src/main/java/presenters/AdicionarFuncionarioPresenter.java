package presenters;
import views.AdicionarFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import models.Funcionario;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.calculadoraBonus.CalculadoraArtefato;
import models.calculadoraBonus.CalculadoraAssiduidade;
import models.calculadoraBonus.CalculadoraGraduacao;
import models.calculadoraBonus.CalculadoraTempoDeEmpresa;

public class AdicionarFuncionarioPresenter {
    private AdicionarFuncionario tela1;
    CalculadoraArtefato c1 = new CalculadoraArtefato();
    CalculadoraAssiduidade c2 = new CalculadoraAssiduidade();
    CalculadoraGraduacao c3 = new CalculadoraGraduacao();
    public AdicionarFuncionarioPresenter() throws UnsupportedEncodingException {
        tela1 = new AdicionarFuncionario();
        tela1.setVisible(true);
            tela1.getjButtonCancelar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tela1.dispose();
            }
        });
        tela1.getjButtonSalvar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    int soma = 0;
                    Funcionario f = new Funcionario(tela1.getjTextFieldNome().getText(),
                    Double.parseDouble(tela1.getjTextFieldID().getText()),                    
                    Double.parseDouble(tela1.getjTextFieldSalario().getText()), 
                    Double.parseDouble(tela1.getjTextFieldIdade().getText()), 
                    tela1.getjTextFieldCargo().getText(), tela1.getjTextFieldGraduacao().getText(),
                    format.parse(tela1.getjFormattedTextFieldAdmissao().getText()));
                    BufferedWriter bw = new BufferedWriter(new FileWriter("Funcionarios.txt", true));
                    bw.append("Nome: " + f.getNome() + "\nID: " + f.getId() + "\nSalario Base: R$" + 
                    f.getSalarioBase() + "\nIdade: " + f.getIdade() + "\nCargo: " + f.getCargo() + 
                    "\nGraduação: " + f.getGraduacao() + "\nData de Admissão: " + f.getAdmissao());
                    c1.calcula(f);
                    c2.calcula(f);
                    c3.calcula(f);
                    
                    bw.append("\nO Funcionario tem direito aos seguintes bonus:\n");
                    for(int i = 0; i <= f.getBonus().size() - 1; i++){
                        bw.append(f.getBonus().get(i).getTipo() + " ");
                    }
                    bw.append("\nO Bonus total desses bonus é: \n");
                    for(int i = 0; i <= f.getBonus().size() - 1; i++){
                        soma += f.getBonus().get(i).getValor();
                    }
                    bw.append(soma + "\n\n");
                    bw.close();
                    tela1.getjTextFieldID().setText("");
                    tela1.getjTextFieldNome().setText("");
                    tela1.getjTextFieldCargo().setText("");
                    tela1.getjTextFieldSalario().setText("");
                    tela1.getjTextFieldIdade().setText("");
                    tela1.getjTextFieldGraduacao().setText("");
                    tela1.getjFormattedTextFieldAdmissao().setText("");
                } 
                catch (IOException ex) {
                } catch (ParseException ex) {
                    Logger.getLogger(AdicionarFuncionarioPresenter.class.getName()).log(Level.SEVERE, null, ex);
                }              
            }
        });
    }
    
}
