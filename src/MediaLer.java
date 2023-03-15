import  javax.swing.JOptionPane;

public class MediaLer {
    public static void main(String[] args) throws NumberFormatException {
        float nota1, nota2, calculaMedia;

        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Primeira nota: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Segunda nota: "));

        calculaMedia = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "Resultado da média: "+calculaMedia);

    }
}
