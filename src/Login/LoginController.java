package Login;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author "Lucas HS"
 */
public class LoginController {

    private LoginModel model;
    private LoginView view;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;
    }

    public void initController() {
        view.getBtLogar().addActionListener(e -> login(e));
        view.getBtLimpar().addActionListener(e -> limpar(e));
    }

    private void login(ActionEvent e) {
        model.setSenha(String.valueOf(view.getPfSenha().getPassword()));
        model.setUsuario(view.getTfLogin().getText());
        if (model.getUsuario().equals("java") && model.getSenha().equals("java")) {
            //JOptionPane.showMessageDialog(null, "Acesso permitido!");
            view.setVisible(false);
            
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
        }
    }

    private void limpar(ActionEvent e) {
        view.getTfLogin().setText("");
        view.getPfSenha().setText("");
    }

}
