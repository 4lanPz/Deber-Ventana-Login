# deber_login
# Alan Perez
Para este trabajo se utilizo 2 clases Java GUI, en el uno se encuentra la parte del ingreso de datos
y en el otro se encuentra la parte del login
En el primero se incluye los botones de guardar datos y los cuadros en donde se ingresa
los datos JTextField, estos valores se tienen que aponer por teclado y *DAR ENTER* para que funcione
de alli al dar a guardar se va a crear un archivo, esto se realiza al crear el archivo indicando donde
se va a crear y luego con BufferdWriter que es una lase que nos permite escribir texto en un Outputstream, utilizando un buffer para proporcionar una escritura eficiente de caracteres, arrays y strings o sea que permite guardar los datos que pongamos en el JTextField como String,
esto se va a escribir, pero al momento de guardar se va a guardar de la siguiente manera
(usuario:contraseña) con un salto de linea, esto para luego verificar en el programa de login, los datos del usuario se guardan en el archivo.dat 
Luego en el boton login lo que hace es ejecutar el JPanel que se explica a continuacion

En el Gui JPanel de login se hace lo mismo pero lo que cambia es el boton de login, ya que en este lo que se hace es abrir el archivo.dat y se va a comparar linea por linea y ya que al ingresar los datos
para el login se van a poner en el mismo formato que antes (usuario:contraseña), esto se va a comparar
en el archivo.dat para indicar si existe o no dentro del archivo, si existe se imprime en el programa 
un loguin correcto y si no se imprime un error en el programa.
