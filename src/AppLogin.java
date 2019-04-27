
import Login.LoginController;
import Login.LoginModel;
import Login.LoginView;


/**
 *
 * @author "Lucas HS"
 */
public class AppLogin {
    public static void main(String[] args) {
        LoginModel m = new LoginModel();
        LoginView v = new LoginView();
        LoginController c = new LoginController(m, v);
        c.initController();
    }
}
