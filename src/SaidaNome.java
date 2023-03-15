import  javax.swing.JOptionPane;

public class SaidaNome {
    public static void main(String[] args) {
        String nome =  JOptionPane.showInputDialog("Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: ");

        String nomeCompleto = nome + " " + sobrenome;

        JOptionPane.showMessageDialog(null,"Nome completo: "+nomeCompleto );
    }
}
