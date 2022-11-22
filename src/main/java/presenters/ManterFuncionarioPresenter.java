package presenters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ManterFuncionario;

public class ManterFuncionarioPresenter {
    private ManterFuncionario tela1;
    
    ManterFuncionarioPresenter(){
        tela1 = new ManterFuncionario();
        tela1.setVisible(true);
    }
}
