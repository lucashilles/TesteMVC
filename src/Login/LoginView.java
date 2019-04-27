package Login;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author "Lucas HS"
 */
public class LoginView extends JFrame {

    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btLimpar;
    private JPasswordField pfSenha;

    public LoginView() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("Login no Sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        tfLogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lbSenha = new JLabel("Senha: ");
        lbLogin = new JLabel("Login: ");
        btLogar = new JButton("Logar");
        btLimpar = new JButton("Limpar");
        tfLogin.setBounds(100, 30, 120, 25);
        lbLogin.setBounds(30, 30, 80, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btLogar.setBounds(20, 120, 100, 25);
        btLimpar.setBounds(125, 120, 100, 25);
        add(tfLogin);
        add(lbSenha);
        add(lbLogin);
        add(btLogar);
        add(btLimpar);
        add(pfSenha);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        setVisible(true);
    }

    public JTextField getTfLogin() {
        return tfLogin;
    }

    public void setTfLogin(JTextField tfLogin) {
        this.tfLogin = tfLogin;
    }

    public JButton getBtLogar() {
        return btLogar;
    }

    public void setBtLogar(JButton btLogar) {
        this.btLogar = btLogar;
    }

    public JButton getBtLimpar() {
        return btLimpar;
    }

    public void setBtLimpar(JButton btLimpar) {
        this.btLimpar = btLimpar;
    }

    public JPasswordField getPfSenha() {
        return pfSenha;
    }

    public void setPfSenha(JPasswordField pfSenha) {
        this.pfSenha = pfSenha;
    }

}
