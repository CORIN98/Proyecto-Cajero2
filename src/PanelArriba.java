
import java.awt.*;
import javax.swing.*;
/**
 * Este panel tiene el logo del cajero
 * @author Corin Viracacha y Isaac Gomez
 */
public class PanelArriba extends JPanel {
	/**
	 * Metodo constructor del panel
	 */
	public PanelArriba() {
		
		    setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );
	        ImageIcon icono = new ImageIcon( "images/logo.png" );
	      
	        
	        imagen.setIcon( icono );
	        //Define el icono que mostrará este componente.
	        imagen.setHorizontalAlignment( JLabel.CENTER );
	        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
	        
	        add( imagen, BorderLayout.CENTER );
	        //ubicacion de mi imagen dentro del panel
	       
	        
	        setBackground( Color.WHITE);
	}
}
