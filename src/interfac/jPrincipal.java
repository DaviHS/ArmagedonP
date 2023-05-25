/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfac;

import javax.swing.ImageIcon;
import model.clientes;
import model.produtos;
import model.transportadora;
/**
 * Tela Principal, reponsavel por interligar as outras pagina pela aba do menu
 * 
 */
public class jPrincipal extends javax.swing.JFrame {

    public static boolean cliente;

    public static boolean consultaClientes;

    public static boolean consultaTransp;

    public static boolean listagem;

    public static boolean usuario;

    public static boolean transportadora;

    public static boolean produto;

    public static boolean consultaProduto;

    public static boolean fichao;

    clientes objpes = new clientes();

    transportadora objtra = new transportadora();

    produtos objpro = new produtos();



    /**
     * Creates new form jPrincipal
     */
    public jPrincipal() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTela = new javax.swing.JDesktopPane();
        jtUser = new javax.swing.JTextField();
        jlUser = new javax.swing.JLabel();
        jBarraInicial = new javax.swing.JMenuBar();
        jManutencoes = new javax.swing.JMenu();
        jCadastro = new javax.swing.JMenu();
        jClientes = new javax.swing.JMenuItem();
        jListagem = new javax.swing.JMenuItem();
        jFep = new javax.swing.JMenuItem();
        jFornecedores = new javax.swing.JMenuItem();
        jProdutos = new javax.swing.JMenuItem();
        jTransportadora = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jComprasGerais = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMateriaPrima = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jRequisiçãoComprasGerais = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jEstoque = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jVendas = new javax.swing.JMenu();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jFinanceiro = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jManutencao = new javax.swing.JMenu();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jFaturamento = new javax.swing.JMenu();
        jmFichao = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jPcp = new javax.swing.JMenu();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jRh = new javax.swing.JMenu();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jPortaria = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jRelatorio = new javax.swing.JMenu();
        jPesagemRodoviária = new javax.swing.JMenu();
        jSaida = new javax.swing.JMenu();
        jOperacional = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projeto Armagedon");
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtUser.setEditable(false);
        jtUser.setBackground(new java.awt.Color(0, 102, 153));
        jtUser.setForeground(new java.awt.Color(255, 255, 255));
        jtUser.setCaretColor(new java.awt.Color(255, 255, 255));

        jlUser.setForeground(new java.awt.Color(255, 255, 255));
        jlUser.setText("Login realizado por:");

        jTela.setLayer(jtUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTela.setLayer(jlUser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTelaLayout = new javax.swing.GroupLayout(jTela);
        jTela.setLayout(jTelaLayout);
        jTelaLayout.setHorizontalGroup(
            jTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTelaLayout.createSequentialGroup()
                .addGap(0, 728, Short.MAX_VALUE)
                .addComponent(jlUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTelaLayout.setVerticalGroup(
            jTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaLayout.createSequentialGroup()
                .addGroup(jTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUser))
                .addGap(0, 369, Short.MAX_VALUE))
        );

        jManutencoes.setText("Manutenções");

        jCadastro.setText("Cadastro");

        jClientes.setText("Clientes");
        jClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClientesActionPerformed(evt);
            }
        });
        jCadastro.add(jClientes);

        jListagem.setText("Listagem de Clientes");
        jListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListagemActionPerformed(evt);
            }
        });
        jCadastro.add(jListagem);

        jFep.setText("FEP");
        jFep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFepActionPerformed(evt);
            }
        });
        jCadastro.add(jFep);

        jFornecedores.setText("Fornecedores");
        jCadastro.add(jFornecedores);

        jProdutos.setText("Produtos");
        jProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutosActionPerformed(evt);
            }
        });
        jCadastro.add(jProdutos);

        jTransportadora.setText("Transportadora");
        jTransportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTransportadoraActionPerformed(evt);
            }
        });
        jCadastro.add(jTransportadora);

        jManutencoes.add(jCadastro);
        jManutencoes.add(jSeparator1);

        jComprasGerais.setText("Compras Gerais");
        jManutencoes.add(jComprasGerais);
        jManutencoes.add(jSeparator2);

        jMateriaPrima.setText("Compras de Matéria Prima");
        jManutencoes.add(jMateriaPrima);
        jManutencoes.add(jSeparator3);

        jRequisiçãoComprasGerais.setText("Requisição de Compras Gerais");
        jManutencoes.add(jRequisiçãoComprasGerais);
        jManutencoes.add(jSeparator4);

        jEstoque.setText("Estoque");
        jManutencoes.add(jEstoque);
        jManutencoes.add(jSeparator5);

        jVendas.setText("Vendas");
        jManutencoes.add(jVendas);
        jManutencoes.add(jSeparator6);

        jFinanceiro.setText("Financeiro ");
        jManutencoes.add(jFinanceiro);
        jManutencoes.add(jSeparator7);

        jManutencao.setText("Manutenção");
        jManutencoes.add(jManutencao);
        jManutencoes.add(jSeparator8);

        jFaturamento.setText("Faturamento");

        jmFichao.setText("Fichão");
        jmFichao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFichaoActionPerformed(evt);
            }
        });
        jFaturamento.add(jmFichao);

        jManutencoes.add(jFaturamento);
        jManutencoes.add(jSeparator9);

        jPcp.setText("PCP");
        jManutencoes.add(jPcp);
        jManutencoes.add(jSeparator10);

        jRh.setText("RH");
        jManutencoes.add(jRh);
        jManutencoes.add(jSeparator11);

        jPortaria.setText("Portaria");
        jPortaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPortariaActionPerformed(evt);
            }
        });
        jManutencoes.add(jPortaria);
        jManutencoes.add(jSeparator12);

        jBarraInicial.add(jManutencoes);

        jRelatorio.setText("Relatório");

        jPesagemRodoviária.setText("Pesagem Rodoviária");
        jRelatorio.add(jPesagemRodoviária);

        jBarraInicial.add(jRelatorio);

        jSaida.setText("Saída");
        jBarraInicial.add(jSaida);

        jOperacional.setText("Operacional");

        jMenuItem1.setText("Cadastro de Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jOperacional.add(jMenuItem1);

        jBarraInicial.add(jOperacional);

        setJMenuBar(jBarraInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTela))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTela))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre a tela de Cliente (cadastro, atualização e verificação)
     * @param evt 
     */
    private void jClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClientesActionPerformed

        if (cliente == false) {
            jifCliente obj = new jifCliente();
            jTela.add(obj);

            obj.setVisible(true);

            objpes.setPes_quemCad(String.valueOf(jtUser.getText()));

            jifCliente.recebeUser(objpes);

        }


    }//GEN-LAST:event_jClientesActionPerformed

    private void jFepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFepActionPerformed

    }//GEN-LAST:event_jFepActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);

        jPrincipal.cliente = false;

        jPrincipal.consultaClientes = false;

        jPrincipal.consultaTransp = false;

        jPrincipal.listagem = false;

        jPrincipal.usuario = false;

        jPrincipal.transportadora = false;

        jPrincipal.produto = false;

        jPrincipal.consultaProduto = false;

        jPrincipal.fichao = false;


    }//GEN-LAST:event_formWindowOpened

    private void jPortariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPortariaActionPerformed

    }//GEN-LAST:event_jPortariaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (usuario == false) {
            CadastroUser obj = new CadastroUser();
            jTela.add(obj);
            obj.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTransportadoraActionPerformed
        if (transportadora == false) {
            jifTransportadora obj = new jifTransportadora();
            jTela.add(obj);
            obj.setVisible(true);
            
            objtra.setTra_quemCad(String.valueOf(jtUser.getText()));
            jifTransportadora.recebeUser(objtra);
        }
    }//GEN-LAST:event_jTransportadoraActionPerformed

    private void jProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutosActionPerformed
        // TODO add your handling code here:
        if (produto == false) {
            jifProduto obj = new jifProduto();
            jTela.add(obj);
            obj.setVisible(true);
            
            objpro.setPro_quemCad(String.valueOf(jtUser.getText()));
            jifProduto.recebeUser(objpro);            
        }
    }//GEN-LAST:event_jProdutosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/imagens/armageddon (1).png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListagemActionPerformed

        if (listagem == false) {
            jifListagem obj = new jifListagem();
            jTela.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jListagemActionPerformed

    private void jmFichaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFichaoActionPerformed
        // TODO add your handling code here:
        if (fichao == false) {
            // TesteMysql obj = new TesteMysql();
            jifFichao obj = new jifFichao();
            jTela.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jmFichaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jBarraInicial;
    private javax.swing.JMenu jCadastro;
    private javax.swing.JMenuItem jClientes;
    private javax.swing.JMenu jComprasGerais;
    private javax.swing.JMenu jEstoque;
    private javax.swing.JMenu jFaturamento;
    private javax.swing.JMenuItem jFep;
    private javax.swing.JMenu jFinanceiro;
    private javax.swing.JMenuItem jFornecedores;
    private javax.swing.JMenuItem jListagem;
    private javax.swing.JMenu jManutencao;
    private javax.swing.JMenu jManutencoes;
    private javax.swing.JMenu jMateriaPrima;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jOperacional;
    private javax.swing.JMenu jPcp;
    private javax.swing.JMenu jPesagemRodoviária;
    private javax.swing.JMenuItem jPortaria;
    private javax.swing.JMenuItem jProdutos;
    private javax.swing.JMenu jRelatorio;
    private javax.swing.JMenu jRequisiçãoComprasGerais;
    private javax.swing.JMenu jRh;
    private javax.swing.JMenu jSaida;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    public static javax.swing.JDesktopPane jTela;
    private javax.swing.JMenuItem jTransportadora;
    private javax.swing.JMenu jVendas;
    private javax.swing.JLabel jlUser;
    private javax.swing.JMenuItem jmFichao;
    private static javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables
/**
 * Recebe o usuário utilizado no login
 * @param usuario 
 */
    public void recebeUsuario(String usuario) {
        jtUser.setText(usuario);
    }
}
