import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showInputDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You are " + age+ "years old");

        double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
    }
}