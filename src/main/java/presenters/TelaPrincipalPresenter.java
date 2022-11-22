package presenters;

import views.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipalPresenter {
    private TelaPrincipal tela1;
    private AdicionarFuncionarioPresenter p1;
    private BuscarFuncionarioPresenter p2;
    private CalcularSalarioPresenter p3;
    
    public TelaPrincipalPresenter(){
        tela1 = new TelaPrincipal();
        tela1.setVisible(true);
        tela1.getNovoFuncionarioMenuItem().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try {
                        p1 = new AdicionarFuncionarioPresenter();
                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(TelaPrincipalPresenter.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
        tela1.getBuscarFuncionarioMenuItem().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                p2 = new BuscarFuncionarioPresenter();
            }
        });
        tela1.getCalcularSalarioMenuItem().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                p3 = new CalcularSalarioPresenter();
            }
        });              
    }
}
    


