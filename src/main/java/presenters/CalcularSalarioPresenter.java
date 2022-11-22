package presenters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.CalcularSalario;


public class CalcularSalarioPresenter {
    private CalcularSalario tela1;
        

    public CalcularSalarioPresenter() {
        tela1 = new CalcularSalario();
        tela1.setVisible(true);

        tela1.getjButtonFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tela1.dispose();
            }
        });
        tela1.getjButtonCalcular().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
    }
}
