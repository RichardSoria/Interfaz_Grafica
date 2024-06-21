import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario {
    private JPasswordField passwordField1;
    private JTextField textField1;
    public JPanel mainPanel;
    private JButton OKButton;
    private JButton borrarButton;

    public formulario() {

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1.getText();
                String contrasena = new String(passwordField1.getPassword());

                if (usuario.equals("java") && contrasena.equals("java")) {
                    JOptionPane.showMessageDialog(mainPanel, "Acceso permitido", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
    }
}
