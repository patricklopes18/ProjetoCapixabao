/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class ProjetoDelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char C;
        //cadastro do cliente

        int tel, cpf;
        //Escolha de Lanche
        char X;

        //Forma de pagamento
        char n, cr, h, k;
        int m;
        //Confirmação Final
        int z, Z;

        String A, E, nome, uf, y, a = null, lanches = null, L = null, bebidas = null, B = null, F = null, N = null, NC = null, H = null, K = null;

        //CADASTRO DO CLIENTE
        do {
            JOptionPane.showMessageDialog(null, "Cadastre-se : ");
            nome = JOptionPane.showInputDialog("Nome Completo: ");
            cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
            tel = Integer.parseInt(JOptionPane.showInputDialog("Telefone: "));
            uf = JOptionPane.showInputDialog("Endereço: ");
            JOptionPane.showMessageDialog(null,
                    " Nome: " + nome
                    + "\n CPF: " + cpf
                    + "\n TEL: " + tel
                    + "\n Ender.: " + uf
            );
            y = JOptionPane.showInputDialog("O cadastro está correto, Digite (sim) ou Digite (não): ");
            y = y.toLowerCase();
        } while (!y.equals("sim"));
        //ESCOLHA DE LANCHE
        do {
            do {
                do {
                    L = JOptionPane.showInputDialog(null,
                            "Escolha seu lanche: "
                            + " (1) Hamburguer"
                            + " (2) X-Burguer"
                            + " (3) X-Tudo"
                    );
                    switch (L) {
                        case "1":
                            L = "Hamburger";
                            break;
                        case "2":
                            L = "X-Burger";
                            break;
                        case "3":
                            L = "X-Tudo";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Inexistente");
                    }
                } while ("1".equals(L) || "2".equals(L) || "3".equals(L));
                JOptionPane.showMessageDialog(null, "Seu lanche é: " + L);
                A = JOptionPane.showInputDialog("Certo?");
            } while (!"sim".equals(A));

            //ESCOLHA DE BEBIDA
            do {
                do {
                    B = JOptionPane.showInputDialog(null,
                            "Escolha sua Bebida: "
                            + " (1) Refrigerante"
                            + " (2) Suco"
                            + " (3) Agua"
                    );
                    switch (B) {
                        case "1":
                            B = "Refrigerante";
                            break;
                        case "2":
                            B = "Suco";
                            break;
                        case "3":
                            B = "Agua";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Inexistente");
                    }
                } while ("1".equals(B) || "2".equals(B) || "3".equals(B));
                JOptionPane.showMessageDialog(null, "Sua Bebida é: " + B);
                E = JOptionPane.showInputDialog("Certo?");
            } while (!"sim".equals(E));

            do {
                F = JOptionPane.showInputDialog(null, "Forma de pagamento: (1) Cartão ou (2) para dinheiro");

                if (F.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Informe seu dados do cartão");

                    N = JOptionPane.showInputDialog(null, "Nome completo");
                    NC = JOptionPane.showInputDialog(null, "Numero do Cartão");
                } else if (F.equals("2")) {
                    H = JOptionPane.showInputDialog(null, "informe a nota");

                }
                K = JOptionPane.showInputDialog(null, "Se estiver tudo correto digite (sim) Se não digite (nao)");
            } while (!"sim".equals(K));

            Z = Integer.parseInt(JOptionPane.showInputDialog(null,
                    " "
                    + "Digite (1) para confirmar a compra ou (2) para cancelar \n"
                    + " Caso queira refazer o pedido digite (4)"
            ));
        } while (Z == 4);
        if (Z == 1) {
            JOptionPane.showMessageDialog(null, "Seu pedido já será entregue");
        } else if (Z == 2) {
            JOptionPane.showMessageDialog(null, "Obrigado, Volte Sempre!!!");
        }
    }

}
