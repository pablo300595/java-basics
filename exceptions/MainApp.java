package exceptions;

import java.io.FileInputStream;
import java.util.Properties;

public class MainApp {
    public Usuario login(String username, String password) throws ErrorFisicoException {
        try(FileInputStream fis = new FileInputStream("usuario.properties")) {
            Properties props = new Properties();
            // fis = new FileInputStream("usuario.properties");
            props.load(fis);

            String usr = props.getProperty("username");
            String pwd = props.getProperty("password");

            Usuario usuario = null;

            if (usr.equals(username) && pwd.equals(password)) {
                usuario = new Usuario();

                usuario.setUsername(username);
                usuario.setPassword(password);
                usuario.setName(props.getProperty("name"));
                usuario.setPassword(props.getProperty("email"));
            }

            fis.close();
            return usuario;

        } catch (Exception ex) {
            throw new ErrorFisicoException(ex);
        } finally {
            // try {
            //     if(fis!= null) fis.close();
            // } catch (Exception ex) {
            //     throw new RuntimeException(ex);
            // }
        }
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();

        try {
            Usuario pablo = app.login("pabloeng05@gmail.com", "securepassword");
            if (pablo == null) {
                System.out.println("Usuario o password incorrecto");
            } else {
                System.out.println("Login exitoso!");
            }
        } catch (Exception ex) {
            System.out.println("Occurrio un error");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("finalizacion del programa");
        }  

    }
}
