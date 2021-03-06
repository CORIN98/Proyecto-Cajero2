

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * Esta clase se encarga de realizar las operaciones y todo el movimiento del cajero
 * @author Corin Viracacha y Isaac Gomez
 */
public class PanelAbajo extends JPanel {
	/**
	 * Creo variables de tipo estatico con el fin de acceder a cualquier metodo estatico 
	 */
	static boolean val;
	static Usuario usuario;
    static JButton btnOpcion1,registrar2,limpiar,registrar16,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton02,boton01,continuar,salir,cancelar,continuar1,continuar12;
    static JLabel etiqueta52,saldo1,foto112;
	static int bandera=0,cedula,valor,claveerronea=0,b=0,i,a=0,contador=0,validar=1,bandera1=0,validar2=0,validar3=0,er=0;
	/**
	 *  es una bandera que me indica en que operacion esta
	 */
	// 1 retiro, 2 consulta, 3 cambio de clave, 5 transacciones, 6 pagos
	static GridBagConstraints contenido;
	static JPasswordField clave1;
	static JTextField cajadetexto,clave4,numeropag,valorpag,nombretra,ncuenta,valort;
	static String clavevalidar="", clavevalidar1="",bcs,vocales;
	static ImageIcon imagen1;
	/**
	 * ImagenIcon es para insertar una imagen
	 */
	static Timer timer12;
	/**
	 * esta funcion Timer me sirve para indicar el contenido que va a quedar detenido segun el instante de tiempo determinado
	 */
	static TimerTask time2;
	/**
	 * TimerTask sirve para determinar la velocidad con la que se efecturan el cambio de imagenes
	 */
	static AudioClip sonido;
	/**
	 * AudioClip es para insertar un audio
	 */
	
	
	/**
	 * Metodo constructor del panel
	 */
	
	public PanelAbajo() {
	/**
	 * java.applet.Applet.newAudioClip(getClass().getResource("/sonido2.wav")) me permite generar un sonido
	 */

	sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonido2.wav"));
	sonido.play();
	//una vez obtenida la informacion le doy play para que suene
		
	/**
	 * 	GridBagLayout() es la organizacion de nuestro panel
	 */
	Border borde = BorderFactory.createTitledBorder( "" );
    setBorder( borde );
	setLayout(new GridBagLayout());
	contenido = new GridBagConstraints();
	
	JLabel etiqueta = new JLabel("  ");
	etiqueta.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.CENTER;
	contenido.weightx = 86;
	contenido.weighty = 0.003;
	contenido.gridx = 0;
	contenido.gridy = 0;
	add(etiqueta, contenido);
	
	
			
	JLabel etiqueta1 = new JLabel("");
	etiqueta1.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.BOTH;
	contenido.weightx =86;
	contenido.weighty = 0.003;
	contenido.gridx = 5;
	contenido.gridy = 0;
	add(etiqueta1, contenido);
	
	
	//Boton del 1
	boton1 = new JButton();
	boton1 .setBackground(Color.ORANGE);
	boton1.setSize(5, 5);
	boton1 .setText("1");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.003;
	contenido.weightx =0.2;
	contenido.gridx = 1;
	contenido.gridy = 1;
	add(boton1 , contenido);
	

	//Boton del 2
	boton2  = new JButton();
	boton2.setBackground(Color.ORANGE);
	boton2.setSize(5, 5);
	boton2.setText("2");

	contenido.fill =  GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.00003;
	contenido.weightx =0.2;
	contenido.gridx = 2;
	contenido.gridy = 1;
	add(boton2, contenido);
	
	// Boton del 3
	
	boton3  = new JButton();
	boton3.setBackground(Color.ORANGE);
	boton2.setSize(5, 5);
	boton3.setText("3");
	contenido.fill = GridBagConstraints.CENTER;
	contenido.weighty = 0.3;
	contenido.gridx = 3;
	contenido.gridy = 1;
	add(boton3, contenido);
	
	//Boton del 4
	boton4  = new JButton();
	boton4.setBackground(Color.ORANGE);
	boton4.setText("4");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 2;
	add(boton4, contenido);

	//Boton del 5
	boton5  = new JButton();
	boton5.setAlignmentX(CENTER_ALIGNMENT);
	boton5.setBackground(Color.ORANGE);
	boton5.setText("5");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 2;
	add(boton5, contenido);
	
	//Boton del 6
	boton6  = new JButton();
	boton6.setBackground(Color.ORANGE);
	boton6.setText("6");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 3;
	contenido.gridy = 2;
	add(boton6, contenido);
	
	//Boton del 7
	boton7  = new JButton();
	boton7.setBackground(Color.ORANGE);
	boton7.setText("7");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 3;
	add(boton7, contenido);
	
	//Boton del 8
	boton8  = new JButton();
	boton8.setBackground(Color.ORANGE);
	boton8.setText("8");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 3;
	add(boton8, contenido);
	
	//Boton del 9
	boton9  = new JButton();
	boton9.setBackground(Color.ORANGE);
	boton9.setText("9");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 3;
	contenido.gridy = 3;
	add(boton9, contenido);
	
	//Boton del cancelar es decir me vuelve al inicio del cajero
	cancelar = new JButton();
	cancelar.setForeground(Color.WHITE);
	cancelar.setBackground(Color.red);
	cancelar.setText("CANCELAR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 1;
	add(cancelar, contenido);
	
	//limpiar me limpia las cajas de texto cuando el usuario lo desee
	limpiar = new JButton();
	limpiar.setForeground(Color.WHITE);
	limpiar.setBackground(Color.red);
	limpiar.setText("LIMPIAR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 2;
	add(limpiar, contenido);
	
	
	//salir cierra la seccion del usuario
	salir = new JButton();
	salir.setForeground(Color.WHITE);
	salir.setBackground(Color.red);
	salir.setText("SALIR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 3;
	add(salir, contenido);

	boton01 = new JButton();
	boton01.setBackground(Color.ORANGE);
	boton01.setText("#");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 4;
	add(boton01, contenido);
	
	boton02 = new JButton();
	boton02.setBackground(Color.ORANGE);
	boton02.setText("0");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 4;
	add(boton02, contenido);
	
	JButton boton03 = new JButton();
	boton03.setBackground(Color.ORANGE);
	boton03.setText("*");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 1;
	contenido.weightx = 1;
	contenido.gridx = 3;
	contenido.gridy = 4;
	add(boton03, contenido);
	
	JLabel etiqueta42 = new JLabel("     ");
	etiqueta42.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 5;
	add(etiqueta42, contenido);
	
	
	JLabel etiqueta12 = new JLabel("RETIRE SU DINERO:                  ");
	etiqueta12.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 8;
	add(etiqueta12, contenido);
	

	
	
	
	JLabel etiqueta13 = new JLabel("INGRESE SU TARJETA");
	etiqueta13.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 1;
	contenido.weighty = 1;
	contenido.gridx = 5;
	contenido.gridy = 6;
	add(etiqueta13, contenido);
	
	//cajadetexto me guarda el numero de la tarjeta que es igual al numero de la cedula
	cajadetexto = new JTextField();
	cajadetexto.setText("");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 0.03;
	contenido.gridx = 5;
	contenido.gridy = 7;
	add(cajadetexto, contenido);
	cajadetexto.addKeyListener(new KeyAdapter() {	
		/**
		 * Metodo generado por el addKeyListener para validar datos numericos
		 */
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if (Character.isLetter(c)) {	
				JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
	            e.consume();
	             }
		}
	});
	
	//este boton me permite acceder al cajero y a realizar operaciones
	registrar2 = new JButton();
	registrar2.setBackground(Color.ORANGE);
	registrar2.setText(">>");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 6;
	contenido.gridy = 7;
	add(registrar2, contenido);
	
	
	JLabel etiqueta14 = new JLabel("AGREGAR USUARIO NUEVO");
	etiqueta14.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 5;
	contenido.gridy = 8;
	add(etiqueta14, contenido);
	
	
	
	//Este boton me permite agregar usuario
	registrar16 = new JButton();
	registrar16.setBackground(Color.ORANGE);
	registrar16.setText("AGREGAR USUARIO");
	registrar16.setAlignmentX(LEFT_ALIGNMENT);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 5;
	contenido.gridy = 9;
	add(registrar16, contenido);
	
	// en esta etiqueta iran los mensajes de cada operacion
	etiqueta52 = new JLabel("MENSAJE ");
	etiqueta52.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx =3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 9;
	add(etiqueta52, contenido);
	
	
	
	
	 // JTextArea en la fila 0, columna 0 y que ocupa dos filas y dos
	 // columnas de ancho.

	
	JLabel registrar = new JLabel("");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.ipady = 0;       //reset to default
	contenido.weighty = 1.0;   //request any extra vertical space
	contenido.anchor = GridBagConstraints.PAGE_END; //bottom of space
	contenido.insets = new Insets(10,5,10,5);  //top padding
	contenido.gridx = 6;       //aligned with button 2
	contenido.gridwidth = 2;   //2 columns wide
	contenido.gridy = 15;       //third row
	add(registrar, contenido);
	
	// si escucha este boton accede al cajero 
	registrar2.addActionListener (new ActionListener(){
		/**
		 * Metodo para ingresar al metodo ingresar
		 */
		public void actionPerformed(ActionEvent e){	
			ingresar(2);
	}});
	// cuando escucha este boton ingresa a un JFrame nuevo de tipo usuario donde compleatara unos datos de registro
	registrar16.addActionListener (new ActionListener(){
		/**
		 * Metodo para crear nuevo usuario apartir del listener del boton nuevo usuario
		 */
		public void actionPerformed(ActionEvent e){
			usuario = new Usuario("USUARIO");
			
	}});
	// si escucha este boton una vez halla ingresado al cajero el me devuelve al inicio
	cancelar.addActionListener (new ActionListener(){
		/**
		 * Metodo para volver al menu principal a partir del listener del boton cancelar
		 */
		public void actionPerformed(ActionEvent e){	
			if(a==1|| a==2 || a==3 || a==5 || a==6) {
				ingresar(1);}
	}});
	
	//salir es para salir totalmente del sistema
	salir.addActionListener(new ActionListener() {
		/**
		 * Metodo para salir del cajero
		 */
		public void actionPerformed(ActionEvent e) {
			a=0;
			salir();
	}});
	/**
	 * Metodos para los botones numericos 
	 */
	boton1.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"1";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
			
		}

}});
	boton2.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try {
			clavevalidar=clavevalidar+"2";
			clave1.setText(clavevalidar);
			}
			catch(java.lang.NullPointerException c) {
				
			}
		}
});
	boton3.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try {
			clavevalidar=clavevalidar+"3";
			clave1.setText(clavevalidar);
			}
			catch(java.lang.NullPointerException c) {
				
			}
		}
});
	boton4.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"4";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}
}
});
	boton5.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"5";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton6.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try {
			clavevalidar=clavevalidar+"6";
			clave1.setText(clavevalidar);
			}
			catch(java.lang.NullPointerException c) {
	}}
});
	boton7.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"7";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton8.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"8";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton9.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"9";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton02.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"0";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	
}

/**
 * Este metodo es invocado cuando escucha el boton salir
 */

public static void salir() {
		validar2=0;
		validar3=0;
		Principal.obj1.setVisible(false);
		cajadetexto.setText("");
		Principal.ventananuev();		
		a=0;
		}

/**
	 * Este metodo me recorre la lista y me la valida si el usuario se encuentra registrado
	 *  @return val: que indica si la busqueda de usuario se encontro o no
*/
public static boolean validarUsuario() {
	validar2=0;
	validar3=0;
	
		System.out.println("lista validar"+Usuario.lista.size());
		for(int i=0;i<Usuario.lista.size();i++) {			
			try {
			
				if(Usuario.lista.get(i).getcedula()==Integer.parseInt(cajadetexto.getText())) {
					
					System.out.println("esta aqui la cc "+cajadetexto.getText());
					validar2++;
					cedula=i;
					System.out.println("La cedula pasor"+validar2);
					
				}
				else {
					validar3++;					
				}
			}catch(java.lang.NumberFormatException sd){
					validar3++;
			}
		}
	
		
		if(validar2==1) {
			bandera=1;	
			val= true;
			System.out.println("VERDADERO");
		}else {
			if(validar3==Usuario.lista.size()) {
			bandera=3;
			val= false;
		
			System.out.println("FALSO");
		}}
		return val;
	
	}
	
/**
 * Este metodo me muestra las operaciones del cajero
 * @param bandera me indica si encontro algun usuario o no
 * @throws esto para indicar si la lisyta esta vacia
 */
public static void ingresar(int rec) {
		cancelar.setEnabled(true);
		 salir.setEnabled(true);
		try {
			
			if(validarUsuario()==false) {
				if(bandera==3) {
					etiqueta52.setText("Procesando información.");
					rec = 0;
					System.out.println("0."+bandera);
					System.out.println("1."+rec);
					cajadetexto.setText("");
					JOptionPane.showMessageDialog(null, "((!)El numero de la tarjeta es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
					sonido.play();
					etiqueta52.setText("Ingrese su tarjeta");
				}			
			}else {
	
			if(validarUsuario()==true) {
				cajadetexto.setEnabled(false);
				rec = 1;
				System.out.println("2."+bandera);
				System.out.println("3."+rec);
				registrar2.setEnabled(true);
				registrar16.setEnabled(false);
			//}
			bandera = rec;
			System.out.println("welcome"+bandera);
			etiqueta52.setText("BIENVENIDO");
			 
				if(bandera==1) {
					
					//repintamos el panel del centro aqui ponemos las operaciones a realizar
					etiqueta52.setText("BIENVENIDO "+Usuario.lista.get(i).getNombre());
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					VentanaJFrame.panelBusqueda.removeAll();
					VentanaJFrame.panelBusqueda.repaint();
					VentanaJFrame.panelFormulario.removeAll();
					VentanaJFrame.panelFormulario.repaint();
					registrar2.setEnabled(false);
					
					JLabel etiqueta42 = new JLabel("     ");
					etiqueta42.setForeground(Color.BLACK);
					etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weightx =0.03;
					contenido.weighty = 0.03;
					contenido.gridx = 0;
					contenido.gridy = 0;
					VentanaJFrame.panelCentro.add(etiqueta42, contenido);
					
					JLabel retiro = new JLabel();
					retiro.setFont(new java.awt.Font("Tahoma", 1, 16));
					retiro.setBackground(Color.ORANGE);
					retiro.setText("RETIRO EN EFECTIVO");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.5;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 0;
					VentanaJFrame.panelCentro.add(retiro, contenido);
					
					JLabel consulta = new JLabel();
					consulta.setBackground(Color.ORANGE);
					consulta.setFont(new java.awt.Font("Tahoma", 1, 16));
					consulta.setText("CONSULTAR SALDO");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelCentro.add(consulta,contenido);
					
					JLabel transferencias = new JLabel();
					transferencias.setBackground(Color.ORANGE);
					transferencias.setFont(new java.awt.Font("Tahoma", 1, 16));
					transferencias.setText("TRANSFERENCIAS");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelCentro.add(transferencias,contenido);
					
					JLabel pagos = new JLabel();
					pagos.setBackground(Color.ORANGE);
					pagos.setText("              	     PAGOS");
					pagos.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.0000003;
					contenido.gridx = 3;
					contenido.gridy = 0;
					VentanaJFrame.panelCentro.add(pagos,contenido);
					
					JLabel cambiodeclave = new JLabel();
					cambiodeclave.setBackground(Color.ORANGE);
					cambiodeclave.setFont(new java.awt.Font("Tahoma", 1, 16));
					cambiodeclave.setText("CAMBIO DE CLAVE");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.0000003;
					contenido.gridx = 3;
					contenido.gridy = 1;
					VentanaJFrame.panelCentro.add(cambiodeclave,contenido );
					
					VentanaJFrame.panelFormulario.retiroef = new JButton();
					VentanaJFrame.panelFormulario.retiroef.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.retiroef.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.5;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.retiroef,contenido);
					
					VentanaJFrame.panelFormulario.consultarsa= new JButton();
					VentanaJFrame.panelFormulario.consultarsa.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.consultarsa.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.consultarsa,contenido);
					
					VentanaJFrame.panelFormulario.transferencias = new JButton();
					VentanaJFrame.panelFormulario.transferencias.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.transferencias.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 3;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.transferencias,contenido);
					
					VentanaJFrame.panelBusqueda.pagos = new JButton();
					VentanaJFrame.panelBusqueda.pagos.setBackground(Color.ORANGE);
					VentanaJFrame.panelBusqueda.pagos.setText("<<");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelBusqueda.add(VentanaJFrame.panelBusqueda.pagos,contenido);
					
					VentanaJFrame.panelBusqueda.cambiocl= new JButton();
					VentanaJFrame.panelBusqueda.cambiocl.setBackground(Color.ORANGE);
					VentanaJFrame.panelBusqueda.cambiocl.setText("<<");
					contenido.weighty = 0.2;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelBusqueda.add(VentanaJFrame.panelBusqueda.cambiocl,contenido);
					
					JLabel registrar12 = new JLabel(" ");
					registrar12.setBackground(Color.ORANGE);
					registrar12.setText("");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 3;
					VentanaJFrame.panelBusqueda.add(registrar12, contenido);
					
					//aqui es cuando el usuario selecciona algun boton de la operacion
					VentanaJFrame.panelFormulario.retiroef.addActionListener (new ActionListener(){
						public void actionPerformed(ActionEvent e){
							retiro();
							
						}});
					VentanaJFrame.panelFormulario.transferencias.addActionListener (new ActionListener(){
						public void actionPerformed(ActionEvent e){
							transferir();
							
						}});
					VentanaJFrame.panelBusqueda.pagos.addActionListener (new ActionListener(){
						public void actionPerformed(ActionEvent e){
							realizarpagos();
							
						}});
					VentanaJFrame.panelFormulario.consultarsa.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								a=2;
								validarclave();
								
							}});
					VentanaJFrame.panelBusqueda.cambiocl.addActionListener (new ActionListener(){
						public void actionPerformed(ActionEvent e){
							a=3;
							validarclave();
							
					}});	
				}
				
			
		}
				
		}
						
			
		}
		catch(java.lang.NullPointerException sd) {
			
			etiqueta52.setText("Procesando información.");
			rec = 0;
			System.out.println("0."+bandera);
			System.out.println("1."+rec);
			cajadetexto.setText("");
			JOptionPane.showMessageDialog(null, "No hay usuarios registrados", "Error", JOptionPane.ERROR_MESSAGE);
			sonido.play();
			etiqueta52.setText("Ingrese su tarjeta");				
			sonido.play();
		}
	}
	
	/**
	 *  Metodo para mostrar el proceso del retiro del dinero
	 *  @param etiqueta52 es para indicar el mensaje del proceso
	 *  @param timer es para recorrer imagenes en un determinado tiempo
	 *  @param tic es para indicar los tiempos y por cada tiempo realizar acciones
	 */
private static void retirodinero() {
		System.out.println("Retiro 2");
		VentanaJFrame.panelBusqueda.removeAll();
		VentanaJFrame.panelBusqueda.repaint();
		VentanaJFrame.panelFormulario.removeAll();
		VentanaJFrame.panelFormulario.repaint();
		etiqueta52.setText("-");
		int velocidad=2;
		//Es la velocidad del tic
		int velocidad2=velocidad*1000;
		// es una funcion que regula los tiempos
		time2 = new TimerTask() {
			int tic = 0;
			@Override
			//aqui empieza a correr el tiempo y a ejecutar los tiempos
			public void run() {
				if(tic==0) {
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					etiqueta52.setText("Procesando operacion");
					JLabel q = new JLabel();
					q.setText("				            ");
					q.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 22;
					contenido.gridx = 0;
					contenido.gridy = 0;	
					VentanaJFrame.panelCentro.add(q,contenido);	
					imagen1 = new ImageIcon("images/retiroplata.png");	
					foto112 = new JLabel(imagen1);
					foto112.setForeground(Color.BLACK);
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weightx = 7;
					contenido.weighty = 1;
					contenido.gridx = 0;
					contenido.gridy = 1;
					VentanaJFrame.panelCentro.add(foto112, contenido);
					etiqueta52.setText("PROCESANDO DATOS..");
					System.out.println(tic);
					etiqueta52.setText("PROCESANDO DATOS..");
					
					
								
				}
				if(tic==1) {
						VentanaJFrame.panelCentro.removeAll();
						VentanaJFrame.panelCentro.repaint();
						etiqueta52.setText("Procesando operacion");
						JLabel q = new JLabel();
						q.setText("				            ");
						q.setFont(new java.awt.Font("Tahoma", 1, 16));
						contenido.weighty = 0.3;
						contenido.weightx = 22;
						contenido.gridx = 0;
						contenido.gridy = 0;	
						VentanaJFrame.panelCentro.add(q,contenido);	
						System.out.println(tic);
						etiqueta52.setText("TRANSFERENCIA EXITOSA");		
						ImageIcon imagen112 = new ImageIcon( "images/retiroplata2.png");		
						foto112 = new JLabel(imagen112);
						foto112.setForeground(Color.BLACK);
						contenido.fill = GridBagConstraints.HORIZONTAL;
						contenido.weightx = 7;
						contenido.weighty = 1;
						contenido.gridx = 0;
						contenido.gridy = 1;
						VentanaJFrame.panelCentro.add(foto112, contenido);
						etiqueta52.setText("PROCESANDO DATOS..");foto112.setIcon(imagen112);
						AudioClip sonido1=java.applet.Applet.newAudioClip(getClass().getResource("/retiro.wav"));
						sonido1.play();
						
				}
				if(tic==2) {
					etiqueta52.setText("transaccion exitosa.....");
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					etiqueta52.setText(".....transaccion exitosa......");
					transaccionExitosa();
				}
						
				tic++;	
						
						
			}
		};
		// cada tic es cada vez que recorre
		timer12=new Timer();
		timer12.schedule(time2, 0,3500);
		// aqui indico que empieza desde 0 y va a una velocidad de 3500
		
	
		
		
	}
	
	/**
	 * Metodo para que el usuario escojo el monto a retirar
	 *  @param "a" es una bandera para indicar que es un retiro
	 * 
	 */
private static void retiro() {
		a=1;
		VentanaJFrame.panelCentro.removeAll();
		VentanaJFrame.panelCentro.repaint();
		VentanaJFrame.panelBusqueda.removeAll();
		VentanaJFrame.panelBusqueda.repaint();
		VentanaJFrame.panelFormulario.removeAll();
		VentanaJFrame.panelFormulario.repaint();
		registrar2.setEnabled(false);
		etiqueta52.setText(" BIENVENIDO.");
		
		JLabel etiqueta42 = new JLabel("     ");
		etiqueta42.setForeground(Color.BLACK);
		etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx =0.03;
		contenido.weighty = 0.03;
		contenido.gridx = 0;
		contenido.gridy = 0;
		VentanaJFrame.panelCentro.add(etiqueta42, contenido);
		
		JLabel retiro6 = new JLabel();
		retiro6.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro6.setBackground(Color.ORANGE);
		retiro6.setText("600000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.5;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 0;
		VentanaJFrame.panelCentro.add(retiro6,contenido);
		
		JLabel retiro4 = new JLabel();
		retiro4.setBackground(Color.ORANGE);
		retiro4.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro4.setText("400000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		VentanaJFrame.panelCentro.add(retiro4,contenido);
		
		JLabel retiro2 = new JLabel();
		retiro2.setBackground(Color.ORANGE);
		retiro2.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro2.setText("200000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		VentanaJFrame.panelCentro.add(retiro2,contenido);
		
		JLabel retiro1 = new JLabel();
		retiro1.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro1.setBackground(Color.ORANGE);
		retiro1.setText("100000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.0000003;
		contenido.gridx = 3;
		contenido.gridy = 0;
		VentanaJFrame.panelCentro.add(retiro1,contenido);
		
		JLabel retiro5 = new JLabel();
		retiro5.setBackground(Color.ORANGE);
		retiro5.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro5.setText("50000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.0000003;
		contenido.gridx = 3;
		contenido.gridy = 1;
		VentanaJFrame.panelCentro.add(retiro5,contenido);
		
		JLabel retiro20 = new JLabel();
		retiro20.setBackground(Color.ORANGE);
		retiro20.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro20.setText("20000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.0000003;
		contenido.gridx = 3;
		contenido.gridy = 2;
		VentanaJFrame.panelCentro.add(retiro20,contenido);
		
		JButton cien = new JButton();
		cien.setBackground(Color.ORANGE);
		cien.setText("<<");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.5;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		VentanaJFrame.panelBusqueda.add(cien,contenido);
		
		JButton cinco= new JButton();
		cinco.setBackground(Color.ORANGE);
		cinco.setText("<<");
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		VentanaJFrame.panelBusqueda.add(cinco,contenido);
		
		JButton veinte = new JButton();
		veinte.setBackground(Color.ORANGE);
		veinte.setText("<<");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 3;
		VentanaJFrame.panelBusqueda.add(veinte,contenido);
		
		JButton seis = new JButton();
		seis.setBackground(Color.ORANGE);
		seis.setText(">>");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.5;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		VentanaJFrame.panelFormulario.add(seis,contenido);
		
		JButton cuatro = new JButton();
		cuatro.setBackground(Color.ORANGE);
		cuatro.setText(">>");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		VentanaJFrame.panelFormulario.add(cuatro,contenido);
		
		JButton dos = new JButton();
		dos.setBackground(Color.ORANGE);
		dos.setText(">>");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 3;
		VentanaJFrame.panelFormulario.add(dos,contenido);
		// Aqui escucha los valores a retirar los guarda en una variable y los envia a una funcion		
		dos.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=200000;
				clave(valor);			
			}});
		cien.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor=100000;
					clave(valor);
				}
		});
		veinte.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=20000;
				clave(valor);
			}
		});
		cinco.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=50000;
				clave(valor);
			}
	});
		seis.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=600000;
				clave(valor);
			}
	});
		cuatro.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=400000;
				clave(valor);
			}
	});
	}
	

/**
 * Metodo para validar que el saldo sea mayor a lo solicitado
 * 
 */
		
private static void clave(int valor) {
			if(Usuario.lista.get(cedula).getsueldo()>=valor) {
				validarclave();
			}
			else {
				etiqueta52.setText("DINERO INSUFICIENTE");
			}
			
		}

	
		private static void Sletras(JTextField clave1) {
			clave1.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) && (c != 32)) {
			            e.consume();
			             }
				}
			});}


	/**
	 * Metodo para validar clave de usuario
	 * @param segun la bandera "a" realizo las respectivas operaciones 
	 * @throws java.lang.NumberFormatException es para analizar si la clave esta vacia
	 * @param limpiar que es un boton reviso que no me ingresen claves vacias
	*/
private static void validarclave() {
			validar=1;
		
			try {
			registrar2.setEnabled(false);
			etiqueta52.setText("..");
			
			VentanaJFrame.panelCentro.removeAll();
			VentanaJFrame.panelCentro.repaint();
			VentanaJFrame.panelBusqueda.removeAll();
			VentanaJFrame.panelBusqueda.repaint();
			VentanaJFrame.panelFormulario.removeAll();
			VentanaJFrame.panelFormulario.repaint();
			
			JLabel q1 = new JLabel();
			q1.setText("									");
			q1.setFont(new java.awt.Font("Tahoma", 1, 16));
			contenido.weighty = 0.3;
			contenido.weightx = 34;
			contenido.gridx = 3;
			contenido.gridy = 1;	
			VentanaJFrame.panelCentro.add(q1,contenido);
			
			JLabel q = new JLabel();
			q.setText("				            ");
			q.setFont(new java.awt.Font("Tahoma", 1, 16));
			contenido.weighty = 0.3;
			contenido.weightx = 22;
			contenido.gridx = 0;
			contenido.gridy = 1;	
			VentanaJFrame.panelCentro.add(q,contenido);
			
			JLabel clave2 = new JLabel();
			clave2.setText("DIGITE SU CLAVE");		
			clave2.setFont(new java.awt.Font("Tahoma", 1, 16));
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 2;	
			VentanaJFrame.panelCentro.add(clave2,contenido);
			// aqui es donde me ingresa la clave 
			clave1 = new JPasswordField();
			Sletras(clave1);
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(clave1,contenido);
			//este metodo me valida que solo me ingrese datos
			clave1.addKeyListener(new KeyAdapter() {
				
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)|| Character.isDigit(c)) {				
			            e.consume();
			             }
				}
			});
			clavevalidar="";
			clave1.setText("");
			
	
			

			
			continuar=new JButton();
			continuar.setText("CONTINUAR");
			continuar.setForeground(Color.WHITE);
			continuar.setBackground(Color.red);
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 4;
			VentanaJFrame.panelCentro.add(continuar,contenido);

			claveerronea=0;
			
			// en este llamo el boton limpiar para que me quede limpio el jtextfield
			limpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				clavevalidar="";
				clave1.setText(null);
				}
			});
			
			// en continuar:
			continuar.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//Si es retiro aqui me llama el metodo para mostrar imagenes 
					if(a==1) {
					
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
						float sueldot=Usuario.lista.get(cedula).getsueldo()-valor;
						Usuario.lista.get(cedula).setsueldo(sueldot);
						bandera1=2;
						VentanaJFrame.panelCentro.removeAll();
						VentanaJFrame.panelCentro.repaint();
						etiqueta52.setText("Procesando operacion");
						JLabel q = new JLabel();
						q.setText("				            ");
						q.setFont(new java.awt.Font("Tahoma", 1, 16));
						contenido.weighty = 0.3;
						contenido.weightx = 22;
						contenido.gridx = 0;
						contenido.gridy = 0;	
						VentanaJFrame.panelCentro.add(q,contenido);			
						// llamo el metodo retirodinero
						retirodinero();

						
						
					
					
				
					}
					//si la clave es incorrecta me hace un acumulador hasta 3 vece no me deja digitar mas
					else {
						
						claveerronea++;
						if(claveerronea<=2) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							salir();//Aqui me va al metodo salir debido a que se le acabaron las oportunidades de ingreso
						}
					}
				}
				
					
				if(a==5 || a==6) {	
						if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
								etiqueta52.setText("TRANSFERENCIA EXITOSA");
								System.out.println("SUELDO"+Usuario.lista.get(cedula).getsueldo());
								System.out.println("CC");
								float sueldot=Usuario.lista.get(cedula).getsueldo()-valor;
								Usuario.lista.get(cedula).setsueldo(sueldot);
								System.out.println("NUEVO SUELDO"+Usuario.lista.get(cedula).getsueldo());
								System.out.println("LA CLAVE ES"+clave1.getText());
								clavevalidar="";
								clave1.setText("");
								transaccionExitosa();
								
					
						}
						else {
							
							claveerronea++;
							if(claveerronea<=2) {
							clavevalidar="";
							clave1.setText("");
							etiqueta52.setText("CLAVE ERRONEA");
							//ingresar();//AQUI QUIERO QUE SALGA?
							}
							else {
								JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
								salir();//AQUI QUIERO QUE SALGA?
							}
						}
					}
				//Este es validacion de clave para consultar a==2 es consultar saldo
				if(a==2) {
				try {
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
							//repinto el panel del centro
							VentanaJFrame.panelCentro.removeAll();
							VentanaJFrame.panelCentro.repaint();
							etiqueta52.setText("CONSULTANDO INFORMACION");
							JLabel saldo = new JLabel();
							saldo.setText("SU SALDO ES:  "+"     $"+Usuario.lista.get(cedula).getsueldo());
							saldo.setFont(new java.awt.Font("Tahoma", 1, 16));
							contenido.weighty = 1;
							contenido.weightx = 0;
							contenido.gridx = 3;
							contenido.gridy = 0;	
							VentanaJFrame.panelCentro.add(saldo,contenido);
							
							saldo1 = new JLabel("     ");				
							contenido.weighty = 0.3;
							contenido.weightx = 15;
							contenido.gridx = 2;
							contenido.gridy = 6;
							VentanaJFrame.panelCentro.add(saldo1,contenido);
							// este boton me permite volver al menu o salirme
							JButton  continuar = new JButton();
					          continuar.setText("CONTINUAR");
					          continuar.setForeground(Color.WHITE);
					          continuar.setBackground(Color.red);
					          contenido.weighty = 0.3;
					          contenido.weightx = 0.5;
					          contenido.gridx = 4;
					          contenido.gridy = 6;
					          VentanaJFrame.panelCentro.add(continuar,contenido);
					          
					          continuar.addActionListener (new ActionListener(){  
					            public void actionPerformed(ActionEvent e){
					              transaccionExitosa();
					              
					          }});
							
							
							}
					// si la clave es incorrecta me va sumando al acumulador hasta 3 intentos
					else {
						
						claveerronea++;
						if(claveerronea<=2) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							salir();//Sale por que se acabaron los 3 intentos
						}
					}
				}catch(java.lang.NumberFormatException sd) {
					JOptionPane.showMessageDialog(null, "La clave esta vacia", "error", JOptionPane.ERROR_MESSAGE); 
				}
				}
				//Este a==3 es para el cambio de clave
				if(a==3) {
					try {
					er=0;
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
					clavevalidar="";
					clave1.setText("");
					registrar2.setEnabled(false);
					etiqueta52.setText("  -");
					// repinto los paneles
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					VentanaJFrame.panelBusqueda.removeAll();
					VentanaJFrame.panelBusqueda.repaint();
					VentanaJFrame.panelFormulario.removeAll();
					VentanaJFrame.panelFormulario.repaint();
					
					//obtengo la antigua clave ingresada por el textarea
					int antigua=Usuario.lista.get(cedula).getclave();
					JLabel q1 = new JLabel();
					q1.setText("									");
					q1.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 34;
					contenido.gridx = 3;
					contenido.gridy = 1;	
					VentanaJFrame.panelCentro.add(q1,contenido);
					
					JLabel q = new JLabel();
					q.setText("				            ");
					q.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 22;
					contenido.gridx = 0;
					contenido.gridy = 1;	
					VentanaJFrame.panelCentro.add(q,contenido);
					
					JLabel clave3 = new JLabel();
					clave3.setText("DIGITE SU NUEVA CLAVE");
					clave3.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 2;	
					VentanaJFrame.panelCentro.add(clave3,contenido);
					//en este text area guardo la informacion de la nueva clave
					clave1 = new JPasswordField();				
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 3;
					VentanaJFrame.panelCentro.add(clave1,contenido);
					//validar letras 
					clave1.addKeyListener(new KeyAdapter() {					
						public void keyTyped(KeyEvent e) {
							char c=e.getKeyChar();
							if (Character.isLetter(c)|| Character.isDigit(c)) {				
					            e.consume();
					             }
						}
					});
					clavevalidar="";
					clave1.setText("");

					
					continuar12=new JButton();
					continuar12.setText("CONTINUAR");
					continuar12.setForeground(Color.WHITE);
					continuar12.setBackground(Color.red);
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 4;
					VentanaJFrame.panelCentro.add(continuar12,contenido);
					continuar12.addActionListener (new ActionListener(){	
						public void actionPerformed(ActionEvent e){
						
						er=0;
						//este try es por si la clave esta vacia 
						try {
						int nuevaaux=Integer.parseInt(clave1.getText());
						}catch(java.lang.NumberFormatException sd) {
							//creo una bandera
							er=1;
							
						}
						//si la bandera se cumple me manda un mensaje de advertencia
						if(er==1) {
							JOptionPane.showMessageDialog(null, "La nueva clave esta vacia", "error", JOptionPane.ERROR_MESSAGE);
						}
						//si no se cumple la condicion
						else {
						//creo una variable entera llamada nueva aqui almacena la nueva clave
						int nueva=Integer.parseInt(clave1.getText());
						//aqui llamo la lista segun la cedula es la posicion de la lista en la que se encuentra y hay le mando el nuevo valor
						Usuario.lista.get(cedula).setclave(nueva);
						cambioexitoso();
						}	
					}});
					}else {
						// si la clave es erronea el me permite realizar tres intentos y al tercero intento sale del cajero
						claveerronea++;
						if(claveerronea<=2) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							salir();//AQUI QUIERO QUE SALGA?
						}
					}
					
					
					// limpia las cajas de texto
					limpiar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							clavevalidar="";
							clave1.setText(null);
						}

					});
					}catch(java.lang.NumberFormatException sd) {
						JOptionPane.showMessageDialog(null, "La clave esta vacia", "error", JOptionPane.ERROR_MESSAGE); 
					}
					}		
			
				}
			});
			
			}
			catch(java.lang.NullPointerException a) {
				
			}
			
		


			
		}
		
		
	/**
	 * Metodo para realizar los pagos
	 * @param limpiar boton para limpiar datos de las cajas de texto
	 */
private static void realizarpagos() {
			a=6;
			VentanaJFrame.panelCentro.removeAll();
			VentanaJFrame.panelCentro.repaint();
			VentanaJFrame.panelBusqueda.removeAll();
			VentanaJFrame.panelBusqueda.repaint();
			VentanaJFrame.panelFormulario.removeAll();
			VentanaJFrame.panelFormulario.repaint();
			etiqueta52.setText("-");
			JLabel etiqueta42 = new JLabel("     ");
			etiqueta42.setForeground(Color.BLACK);
			etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.weighty = 0.03;
			contenido.gridx = 0;
			contenido.gridy = 0;
			VentanaJFrame.panelCentro.add(etiqueta42, contenido);
			
		
			
			JLabel etiquetaemp = new JLabel("EMPRESA ");
			etiquetaemp.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0000003;
			contenido.weighty = 0.00003;
			contenido.gridx = 1;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(etiquetaemp, contenido);
			// este es un selector para indicar la empresa a la cual le quiero hacer el pago
			JComboBox selectoremp = new JComboBox();
			selectoremp.setModel(new DefaultComboBoxModel(new String[] {"Seleccione empresa","Agua","Luz","Gas","Telefono","Internet"}));
			selectoremp.setSelectedIndex(0);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(selectoremp, contenido);
			
			JLabel etiqueta = new JLabel("NUMERO DE REFERENCIA ");
			etiqueta.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0000003;
			contenido.weighty = 0.00003;
			contenido.gridx = 1;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(etiqueta, contenido);
			
			numeropag= new JTextField();
			numeropag.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(numeropag, contenido);
			//Aqui valido los datos numericos del jtesfield
			numeropag.addKeyListener(new KeyAdapter() {					
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			JLabel etiqueta3 = new JLabel("VALOR A TRANSFERIR ");
			etiqueta3.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;	
			contenido.gridx = 1;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(etiqueta3, contenido);
			//Aqui se guarda el valor a pagar
			valorpag = new JTextField();
			valorpag.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(valorpag, contenido);
			//Valido que solo me ingresen datos numericos
			valorpag.addKeyListener(new KeyAdapter() {					
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			JButton continuar2= new JButton();
			continuar2.setBackground(Color.ORANGE);
			continuar2.setText("CONTINUAR CON PAGO");
			contenido.weighty = 0.00003;
			contenido.weightx = 0.0000000003;
			contenido.gridx = 4;
			contenido.gridy = 4;
			VentanaJFrame.panelCentro.add( continuar2,contenido);
			//cuando doy clic en el boton de continuar
			continuar2.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//aqui valido los campos en blanco y la seleccion del selector
					try {
						if(selectoremp.getSelectedIndex()==0) {
							JOptionPane.showMessageDialog(null, "Seleccione una empresa", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else if(numeropag.getText().isEmpty()||valorpag.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else {
							valor=Integer.parseInt(valorpag.getText());
							System.out.println("entro");
							clave(valor);
							}

					}catch(java.lang.NumberFormatException ds) {

						

					}

				}

		});
//Aqui borro las cajas de texto existentes en ese momento en el panel del centro
			limpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numeropag.setText(null);
					valorpag.setText(null);
					selectoremp.setSelectedItem(0);
				}

			});
		}
		
/**
 * Metodo para transferir dinero
 * el boton continuar14 me permite continuar y validar la informacion ingresada
 */
private static void transferir() {
			a=5;
			//
			VentanaJFrame.panelCentro.removeAll();
			VentanaJFrame.panelCentro.repaint();
			VentanaJFrame.panelBusqueda.removeAll();
			VentanaJFrame.panelBusqueda.repaint();
			VentanaJFrame.panelFormulario.removeAll();
			VentanaJFrame.panelFormulario.repaint();
			etiqueta52.setText("transferir");
			
			JLabel etiqueta42 = new JLabel("     ");
			etiqueta42.setForeground(Color.BLACK);
			etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.weighty = 0.03;
			contenido.gridx = 0;
			contenido.gridy = 0;
			VentanaJFrame.panelCentro.add(etiqueta42, contenido);
			
			
			
			JLabel etiqueta = new JLabel("NOMBRE ");
			etiqueta.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0000003;
			contenido.weighty = 0.00003;
			contenido.gridx = 1;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(etiqueta, contenido);
			
			nombretra= new JTextField();
			nombretra.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(nombretra, contenido);
			//Aqui valido que el nombre solo sea letras
			nombretra.addKeyListener(new KeyAdapter() {					
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isDigit(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos alfabeticos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			JLabel etiqueta1 = new JLabel("N DE CUENTA ");
			etiqueta1.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx =  0.00003;
			contenido.weighty = 0.03;
			contenido.gridx = 1;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(etiqueta1, contenido);
			
			ncuenta= new JTextField();
			ncuenta.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(ncuenta, contenido);
			// En este valido que el numero de cuenta solo sean datos numericos
			ncuenta.addKeyListener(new KeyAdapter() {					
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			
			JLabel etiqueta3 = new JLabel("VALOR A TRANSFERIR ");
			etiqueta3.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;	
			contenido.gridx = 1;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(etiqueta3, contenido);
			// es un selector en el cual el usuario escojera el monto a transferir
			JComboBox valort = new JComboBox();
			valort.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un valor","10000","20000","50000","100000","200000","500000"}));
			valort.setSelectedIndex(0);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(valort, contenido);
			
			
			JButton continuar14= new JButton();
			continuar14.setBackground(Color.ORANGE);
			continuar14.setText("CONTINUAR TRANSFERENCIA");
			contenido.weighty = 0.00003;
			contenido.weightx = 0.0000000003;
			contenido.gridx = 4;
			contenido.gridy = 4;
			VentanaJFrame.panelCentro.add( continuar14,contenido);
			System.out.println("entro");
			// este boton es para limiar las cajas del transferir plata
			limpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					nombretra.setText(null);
					ncuenta.setText(null);
					valort.setSelectedItem(0);
				}

			});
			// Aqui es cuando escucha el boton de continuar con la operacion
			continuar14.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
					//Aqui valido que alla seleccionado algun valor 
					if(valort.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "Seleccione un valor", "Error",	JOptionPane.ERROR_MESSAGE);

					}
					//aqui valido que las cajas de texto no este vacias
					else if(ncuenta.getText().isEmpty()||nombretra.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

					}

					else {
					//Aqui convierto la seleccion del usuario en string y luego en entero para mandarla a validar si esta dentro del rango del saldo del usuario
					String valoraux=(String) valort.getSelectedItem();
					valor=Integer.parseInt(valoraux);
					System.out.println(valor);
					System.out.println("entro");
					clave(valor);
					

					}

					}catch(java.lang.NumberFormatException ds) {

						

					}

				}

		});
			
		
		}
		
/**
 * Metodo para indicar que la transaccion ha sido exitosa
 */
		public static void transaccionExitosa() {
			//imprimo que la transaccion ha sido exitosa 
			 etiqueta52.setText("..transaccion exitosa!.........");
			//desactivo los botones cancelar y salir del teclado numerico
			 cancelar.setEnabled(false);
			 salir.setEnabled(false);
			 //repinto la pantalla
			  VentanaJFrame.panelCentro.removeAll(); 
			  VentanaJFrame.panelCentro.repaint(); 
			  VentanaJFrame.panelBusqueda.removeAll(); 
			  VentanaJFrame.panelBusqueda.repaint(); 
			  VentanaJFrame.panelFormulario.removeAll(); 
			  VentanaJFrame.panelFormulario.repaint(); 
			  etiqueta52.setText("TRANSACCION EXITOSA......");
			 
			  etiqueta52.setText("TRANSACCION EXITOSA!..");
			

			   
			  JLabel q1 = new JLabel(); 
			  q1.setText("                  "); 
			  q1.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 34; 
			  contenido.gridx = 3; 
			  contenido.gridy = 1;   
			  VentanaJFrame.panelCentro.add(q1,contenido); 
			   
			  JLabel q = new JLabel(); 
			  q.setText("                    "); 
			  q.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 22; 
			  contenido.gridx = 0; 
			  contenido.gridy = 1;   
			  VentanaJFrame.panelCentro.add(q,contenido); 
			   
			  JLabel clave3 = new JLabel(); 
			  clave3.setText("SU TRANSACCION HA SIDO TERMINADA");
			  clave3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 1; 
			  contenido.gridx = 2; 
			  contenido.gridy = 2;   
			  VentanaJFrame.panelCentro.add(clave3,contenido); 
			 //Este boton me lleva al menu principal
			  continuar12=new JButton(); 
			  continuar12.setText("MENU PRINCIPAL"); 
			  continuar12.setForeground(Color.WHITE); 
			  continuar12.setBackground(Color.red); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 0.5; 
			  contenido.gridx = 1; 
			  contenido.gridy = 4; 
			  VentanaJFrame.panelCentro.add(continuar12,contenido); 
			   
			  JLabel q3 = new JLabel(); 
			  q3.setText("-------------------------------------------------"); 
			  q3.setForeground(Color.orange);
			  q3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 1; 
			  contenido.weightx = 2; 
			  contenido.gridx = 2; 
			  contenido.gridy = 4;   
			  VentanaJFrame.panelCentro.add(q3,contenido); 
			  // este boton es para salir del cajero
			  JButton salir1 = new JButton(); 
			  salir1.setText("SALIR"); 
			  salir1.setForeground(Color.WHITE); 
			  salir1.setBackground(Color.red); 
			  contenido.weighty = 0; 
			  contenido.weightx = 0; 
			  contenido.gridx = 4; 
			  contenido.gridy = 4; 
			  VentanaJFrame.panelCentro.add(salir1,contenido); 
			  //Aqui pongo a correr un audio que indica que la transferencia ha sido exitosa
			  URL url =PanelAbajo.class.getResource("transferencia.wav");
			   AudioClip clip = Applet.newAudioClip(url);
			    clip.play(); 
			   
			  continuar12.addActionListener (new ActionListener(){   
			    public void actionPerformed(ActionEvent e){ 
			    //este ingresar es para volver al menu
			    ingresar(1); 
			       
			  }}); 
			  salir1.addActionListener (new ActionListener(){   
			    public void actionPerformed(ActionEvent e){ 
			    // llamo a la funcion salir del cajero
			    salir(); 
			       
			  }}); 
			  
	
			} 
/**
 * Metodo para indicar un cambio de clave exitoso	   
 */
		public static void cambioexitoso() {
			
			//desactivo los botones cancelar y salir del teclado numerico
			 cancelar.setEnabled(false);
			 salir.setEnabled(false);
			 //repinto la pantalla
			  VentanaJFrame.panelCentro.removeAll(); 
			  VentanaJFrame.panelCentro.repaint(); 
			  VentanaJFrame.panelBusqueda.removeAll(); 
			  VentanaJFrame.panelBusqueda.repaint(); 
			  VentanaJFrame.panelFormulario.removeAll(); 
			  VentanaJFrame.panelFormulario.repaint(); 
			  etiqueta52.setText("CAMBIO DE CLAVE EXITOSO");
			 
			  etiqueta52.setText("CAMBIO DE CLAVE EXITOSO..");   
			  JLabel q1 = new JLabel(); 
			  q1.setText("                  "); 
			  q1.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 34; 
			  contenido.gridx = 3; 
			  contenido.gridy = 1;   
			  VentanaJFrame.panelCentro.add(q1,contenido); 
			   
			  JLabel q = new JLabel(); 
			  q.setText("                    "); 
			  q.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 22; 
			  contenido.gridx = 0; 
			  contenido.gridy = 1;   
			  VentanaJFrame.panelCentro.add(q,contenido); 
			   
			  JLabel clave3 = new JLabel(); 
			  clave3.setText("SU CLAVE HA SIDO MODIFICADA CON EXITO");
			  clave3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 1; 
			  contenido.gridx = 2; 
			  contenido.gridy = 2;   
			  VentanaJFrame.panelCentro.add(clave3,contenido); 
			  //Este boton es para retornar al menu principal
			  continuar12=new JButton(); 
			  continuar12.setText("MENU PRINCIPAL"); 
			  continuar12.setForeground(Color.WHITE); 
			  continuar12.setBackground(Color.red); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 0.5; 
			  contenido.gridx = 1; 
			  contenido.gridy = 4; 
			  VentanaJFrame.panelCentro.add(continuar12,contenido); 
			   
			  JLabel q3 = new JLabel(); 
			  q3.setText("-------------------------------------------------"); 
			  q3.setForeground(Color.orange);
			  q3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 1; 
			  contenido.weightx = 2; 
			  contenido.gridx = 2; 
			  contenido.gridy = 4;   
			  VentanaJFrame.panelCentro.add(q3,contenido); 
			  //Este boton es para salir del cajero
			  JButton salir1 = new JButton(); 
			  salir1.setText("SALIR"); 
			  salir1.setForeground(Color.WHITE); 
			  salir1.setBackground(Color.red); 
			  contenido.weighty = 0; 
			  contenido.weightx = 0; 
			  contenido.gridx = 4; 
			  contenido.gridy = 4; 
			  VentanaJFrame.panelCentro.add(salir1,contenido); 
			  
			
			   
			  continuar12.addActionListener (new ActionListener(){   
			    public void actionPerformed(ActionEvent e){ 
			   //este ingresar es para volver al menu
			    ingresar(1); 
			       
			  }}); 
			  salir1.addActionListener (new ActionListener(){   
			    public void actionPerformed(ActionEvent e){ 
			     // llamo a la funcion salir del cajero
			    salir(); 
			       
			  }}); 
			  
	
			} 
		
		
		
	
	
}
				
			
		
	
			