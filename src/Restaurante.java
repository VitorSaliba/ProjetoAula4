import  javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Informe o Pedido");

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o que você deseja: \n 1. Hamburguer \n 2. Pizza \n 3. Sair"));

        switch(opcao){
            case 1:
                String nomeH = JOptionPane.showInputDialog(null, "Nome: ");
                Double valorH = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
                boolean artesanal = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "É artesanal? (true/false): "));
                Hamburguer hamburguer = new Hamburguer(nomeH, valorH, artesanal);
                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: R$"+hamburguer.valor);
                break;

            case 2:
                String nomeP = JOptionPane.showInputDialog(null, "Nome: ");
                Double valorP = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
                boolean borda = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Tem borda? (true/false): "));
                Pizza pizza = new Pizza(nomeP, valorP, borda);
                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: R$"+pizza.valor);
                break;

            case 3:
                break;
        }

    }
}
