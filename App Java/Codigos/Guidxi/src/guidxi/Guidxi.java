/*
Programa que ejecuta las funciones de venta de cada usuario registrado
 */
package guidxi;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel aranda gonzalez
 */
public class Guidxi {

    public static void main(String[] args) {
        String user, pass;
        char cliente, type, proveedor;
        JOptionPane.showMessageDialog(null,"Bienvenido a Guidxi");
        JOptionPane.showMessageDialog(null,"Para Iniciar, ingresa tus datos");
        user = JOptionPane.showInputDialog("ingresa tu usuario: ");
        pass = JOptionPane.showInputDialog("ingresa tu contraseña: ");
        type = JOptionPane.showInputDialog("Selecciona tu Perfil. Usa estas opciones: \n P como proveedor \n C como cliente ").charAt(0);
        
        
        switch (type){
            case 'p':
            case 'P':  proveedor = JOptionPane.showInputDialog("Ahora selecciona la operación que deseas realizar. Usa estas opciones: \n P Para registrar producto \n S Para registra Servicio \n D Para modificar datos \n E para Salir: ").charAt(0);  
                       JOptionPane.showMessageDialog(null,"Operación Realizada con éxito");
                       break;
            
           
            case 'C':
            case 'c':  JOptionPane.showInputDialog("Ahora selecciona la operación que deseas realizar. Usa estas opciones: \n P Para solicitar producto \n S Para solicitar Servicio \n T Para efectuar Trueque \n D Para modificar datos \n E para Salir: ").charAt(0);
                       JOptionPane.showMessageDialog(null,"Operación Realizada con éxito");
                       break;
                       
            case 'e':
            case 'E': JOptionPane.showMessageDialog(null,"Gracias ¡Vuelve pronto!");
                        System.exit(0); 
            
            default: JOptionPane.showMessageDialog(null,"Error, operación errónea o inexistente. Vuelve a ejecutar el programa"); break;
        }System.exit(0);
    }
    
}
