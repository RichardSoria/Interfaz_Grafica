import javax.swing.*;
public class Main
{
    public static void main(String[] args)
    {
        // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane
       /*String primerNumero = JOptionPane.showInputDialog( "Introduzca el primer entero" );
       String segundoNumero = JOptionPane.showInputDialog( "Introduzca el segundo entero" );

       // convierte las entradas String en valores int para usarlos en un cálculo
        int numero1 = Integer.parseInt( primerNumero );
        int numero2 = Integer.parseInt( segundoNumero );
        int suma = numero1 * numero2; // suma números

        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        // muestra los resultados en un diálogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog( null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog( null, "La resta es " + resta, "Resta de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog( null, "La multiplicación es " + multiplicacion, "Multiplicación de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog( null, "La división es " + division, "División de dos enteros", JOptionPane.PLAIN_MESSAGE );*/

        JFrame frame = new JFrame("Mi aplicación");
        frame.setContentPane(new form_1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

    }
}