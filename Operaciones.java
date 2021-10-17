import javax.swing.JOptionPane;

public class Operaciones {

    public static void main(String[] args) {
        
        String Figura= JOptionPane.showInputDialog("Dame Figura: ");

        switch(Figura){

            case "circulo": 
            int radio= Integer.parseInt(JOptionPane.showInputDialog("Dame radio: "));
            double Area= Math.PI * radio * radio;
            System.out.printf("Area: %.2f" ,Area);
            break;

            case "cuadrado": int lado= Integer.parseInt(JOptionPane.showInputDialog("Dame Lado: "));
            double Area2= lado * lado;
            System.out.printf("Area %.2f", Area2);

            default: System.out.println("Triangulo");

        }

    }
    
}
