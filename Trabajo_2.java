package trabajo_2;
//Import JoptionPane
import javax.swing.JOptionPane;

public class Trabajo_2 {
    public static void main(String[] args) {
        //Variables
        float n1;
        float n2;
        float suma;
        float resta;
        float multiplicacion;
        float division;
        //Opcion Elegida 
        int op;
        //Panel de Recoleccion de los Datos
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero")); 
        //Opciones
        op=Integer.parseInt(JOptionPane.showInputDialog("Eliga una Opcion:\n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division"));
        //Operacion Suma
        if (op==1){
            suma = n1 + n2;
            JOptionPane.showMessageDialog(null,"La Suma es: "+suma);
        }
        //Operacion Resta
        if (op==2){
            resta = n1 - n2;
            JOptionPane.showMessageDialog(null, "La Resta es: "+resta);
    }
        //Operacion Multiplicacion
        if (op==3){
            multiplicacion = n1 * n2;
            JOptionPane.showMessageDialog(null, "La Multiplicacion es: "+multiplicacion);  
        }
        //Operacion Division
        if (op==4){
            division = n1 / n2;
            JOptionPane.showMessageDialog(null, "La Division es: "+division);
        }
    }
}