import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
//se crean todos los botones del JPanel
public class login {
    String Usuario, Contra;
    public JPanel pantallal;
    private JTextField TUsuario;
    private JTextField TContra;
    private JButton BInicio;
    private JLabel LTitulo;
    private JLabel LUsuario;
    private JLabel LContra;
    private JLabel Verificacion;

    public login() {
        /*se crea el codigo de los botones que van a tener los valores que se
        * ingresa por teclado que van a compararse para entrar dar correcto
        al login*/
        TUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario=TUsuario.getText();
            }
        });
        TContra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contra=TContra.getText();
            }
        });
        /*Este boton lo que hace es abrir el archivo .dat que tiene la informacion del otro
         JPanel, en este caso se lo usa para verificar los datos que se ingreso antes estan
         dentro de ese archivo, si los datos ingresados si se encuentran dentro, nos vamos
         a logear correctamente y nos muestra un texto indicando eso*/
        BInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cambiar la direccion a la misma direccion de donde se guarda los datos
                File file= new File("C://Users//alans//Documents//archivo.dat");
                boolean found = false;
                String line = null;
                try {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String Verifi = Usuario+":"+Contra;
                    while((line = bufferedReader.readLine()) != null) {
                        if(line.equals(Verifi)) {
                            found = true;
                            break;
                        }
                    }
                    bufferedReader.close();
                } catch(FileNotFoundException ex) {
                    System.out.println("No se pudo abrir el archivo '" + file + "'");
                } catch(IOException ex) {
                    System.out.println("Error al leer el archivo '" + file + "'");
                }
                if(found) {
                    Verificacion.setText("Bienvenido "+Usuario);
                } else {
                    Verificacion.setText("<html>¡¡DATOS INCORRECTOS!!<br>¡¡Verifique los datos!!<html>");
                }
            }
        });
    }
}
