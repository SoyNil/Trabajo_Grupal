package trabajo_2;
//Import JoptionPane
import javax.swing.JOptionPane;

public class Trabajo_2 {
    public static void main(String[] args) {
        //Panel Principal
        float n1;
        float n2;
        float resultado;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número")); 
        int op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número\n1.- Suma\n2.- Resta\n3.- Multiplicación\n4.- División"));
        //Condicionales
        if (op==2){
            resultado=n1-n2;
            JOptionPane.showMessageDialog(null,"Los números que ingresaste son "+n1+" y "+n2+", la resta de estos es "+ resultado);
        }
        if (op==4){
            resultado=n1/n2;
            JOptionPane.showMessageDialog(null,"Los números que ingresaste son "+n1+" y "+n2+", la división de estos es "+resultado);
        }
}
}
