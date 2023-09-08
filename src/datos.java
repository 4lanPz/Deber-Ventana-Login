import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class datos {
    int con1=0;
    String Usuario,Pasword , A1, A2;
    public JPanel pantalla;
    private JTextField TUsuario;
    private JTextField TPassword;
    private JButton guardardatosButton;
    private JLabel LTitulo;
    private JLabel LUsuario;
    private JLabel LPassword;
    private JLabel LContador;
    private JButton BLogin;
    private JButton cargar;
    private JTextField textField1;
    private JTextField textField2;

    public datos(String usuario, String pasword) {
        Usuario = usuario;
        Pasword = pasword;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public String getPasword() {
        return Pasword;
    }
    public void setPasword(String pasword) {
        Pasword = pasword;
    }

    public datos() {
        //la accion de el Jtextfield que va a obtener los datos de texto que
        //se ingrese en el programa y se va a almacenar en una variable
        TUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario=TUsuario.getText();
            }
        });
        //la accion de el Jtextfield que va a obtener los datos de texto que
        //se ingrese en el programa y se va a almacenar en una variable
        TPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pasword=TPassword.getText();
            }
        });
        /*En este caso se crea el boton que al dar click va a
        guardar un archivo.dat que va a contener los datos que se
        ingresaron en la parte anterior y nos da un error si esque no se pudo*/
        guardardatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con1++;
                LContador.setText("Se ha ingresado: "+con1+" Usuarios");
                /*CAMBIAR LA DIRECCION PARA QUE FUNCIONE, EL ARCHVO
                LOGIN TAMBIEN TOCA CAMBIAR A ESTA MISMA DIRECCION*/
                File file= new File("C://Users//alans//Documents//archivo.dat");
                try {
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(Usuario+":"+Pasword+"\n");
                    bufferedWriter.close();
                } catch(IOException ex) {
                    System.out.println("Error al escribir en el archivo '" + file + "'");
                }
            }
        });
        /* en este caso, este boton va a abrir el otro JPanel en donde se va a loguear
         el usuario, osea se va a ingresar los datos que se ingresaron antes y se
         comparan para comprobar de si existen*/
        BLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("login");
                frame.setContentPane(new login().pantallal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    /*main que tiene el ejecutable para que inicie el programa y el JPanel*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("datos");
        frame.setContentPane(new datos().pantalla);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

