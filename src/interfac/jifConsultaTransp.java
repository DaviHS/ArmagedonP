/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfac;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelDAO.ConsultaDAO;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.transportadora;

/**
 * Listagem de transportadoras, podendo filtrar com base em dado selecionados e
 * inserido
 *
 */
public class jifConsultaTransp extends javax.swing.JInternalFrame {

    transportadora objtra = new transportadora();

    /**
     * Creates new form jifConsultaTransp
     */
    public jifConsultaTransp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlConsulta = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox<>();
        jtInfo = new javax.swing.JTextField();
        jlInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jbPesquisar = new javax.swing.JButton();
        jbCap = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Transportadoras");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jlConsulta.setText("Consulta por:");

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cod.", "Razão Social", "CNPJ", "Cidade", "Estado", "Status" }));

        jtInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtInfoKeyPressed(evt);
            }
        });

        jlInfo.setText("Digite a informação:");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Razão Social", "CNPJ", "Cidade", "Estado", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTabela.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTabela);

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbCap.setText("Capturar");
        jbCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCapActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jbCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlConsulta)
                    .addComponent(jlInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSair)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jcTipo, jtInfo});

        setBounds(250, 20, 888, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

        jPrincipal.consultaTransp = true;

        DefaultTableModel mp1 = (DefaultTableModel) jTabela.getModel();

        int l = mp1.getRowCount(); //conta as linhas da tabela

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTabela.getModel()).removeRow(l - 1); // primeira linha tem valor 0
                l--;
            } //fim While

        } //fim do if - verifica se tem alguma info. na tabela

        try {

            //sem atgumento na pesquisa
            ResultSet rs = ConsultaDAO.carregaTabelaTransportadora();

            //instancia o objeto mp da classe DefaultTableModel
            DefaultTableModel mp = (DefaultTableModel) jTabela.getModel();

            while (rs.next()) {

                //coleta os dados da linha no banco de dados
                String Coluna0 = rs.getString("id_transportadora").trim();
                String Coluna1 = rs.getString("tra_razaoS").trim();
                String Coluna2 = rs.getString("tra_cnpj").trim();
                String Coluna3 = rs.getString("tra_cidade").trim();
                String Coluna4 = rs.getString("tra_uf").trim();

                String status = rs.getString("tra_status").trim();
                String Coluna5 = "";

                if (status.equals("1")) {
                    Coluna5 = "Ativo";
                }
                if (status.equals("0")) {
                    Coluna5 = "Inativo";
                }
                //preenche a linha da JTable e volta para o while até terminar as linhas contidas
                //na tabela do banco
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5});
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + erro, "Preencher Item", 2);
        }

        tamanhocoluna();
        jTabela.setAutoCreateRowSorter(true); //ordena as linhas ao clicar na coluna
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        jPrincipal.consultaTransp = false;

        dispose();
    }//GEN-LAST:event_formInternalFrameClosed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel mp1 = (DefaultTableModel) jTabela.getModel();

        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTabela.getModel()).removeRow(l - 1); // primeira linha tem valor 0
                l--;
            } //fim While

        } //fim do if - verifica se tem alguma info. na tabela

        //fim limpa a tabela
        String tipo = "";
        String escolha = jcTipo.getSelectedItem().toString().trim();

        if (escolha.equals("Cod.")) {
            tipo = " " + "id_transportadora";
        }
        if (escolha.equals("Razão Social")) {
            tipo = " " + "tra_razaoS";
        }
        if (escolha.equals("CNPJ")) {
            tipo = " " + "tra_cnpj";
        }
        if (escolha.equals("Cidade")) {
            tipo = " " + "tra_cidade";
        }
        if (escolha.equals("Estado")) {
            tipo = " " + "tra_uf";
        }
        if (escolha.equals("Status")) {
            tipo = " " + "tra_status";
        }
        String arg = jtInfo.getText();

        try {
            ResultSet rs = ConsultaDAO.carregaTelaTransportadora(tipo, arg);

            DefaultTableModel mp = (DefaultTableModel) jTabela.getModel();

            while (rs.next()) {

                //coleta os dados da linha no banco de dados
                String Coluna0 = rs.getString("id_transportadora").trim();
                String Coluna1 = rs.getString("tra_razaoS").trim();
                String Coluna2 = rs.getString("tra_cnpj").trim();
                String Coluna3 = rs.getString("tra_cidade").trim();
                String Coluna4 = rs.getString("tra_uf").trim();
                String status = rs.getString("tra_status").trim();
                String Coluna5 = "";

                if (status.equals("1")) {
                    Coluna5 = "Ativo";
                }
                if (status.equals("0")) {
                    Coluna5 = "Inativo";
                }

                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5});

            }

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + error, "Preencher Item", 2);
        }

        tamanhocoluna();
        jTabela.setAutoCreateRowSorter(true); //ordena as linhas ao clicar na coluna
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        jPrincipal.consultaTransp = false;
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCapActionPerformed
        // TODO add your handling code here:

        int row = jTabela.getSelectedRow();
        if (jPrincipal.transportadora == true) {

            objtra.setId_transportadora(Integer.parseInt(jTabela.getValueAt(row, 0).toString().trim()));

            jifTransportadora.recebeidTransportadora(objtra);
            dispose();

        }

        if (jPrincipal.cliente == true) {

            objtra.setId_transportadora(Integer.parseInt(jTabela.getValueAt(row, 0).toString().trim()));

            jifCliente.recebeidTransportadoraT1(objtra);
            jifCliente.recebeidTransportadoraT2(objtra);
            jifCliente.recebeidTransportadoraT3(objtra);
            dispose();

        }
        
        if (jPrincipal.fichao == true) {
            objtra.setTra_razaoS(String.valueOf(jTabela.getValueAt(row, 1).toString().trim()));
            jifFichao.recebeTransp1(objtra);
            jifFichao.recebeTransp2(objtra);
            jifFichao.recebeTransp3(objtra);
            dispose();

        }

    }//GEN-LAST:event_jbCapActionPerformed

    private void jtInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtInfoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
             DefaultTableModel mp1 = (DefaultTableModel) jTabela.getModel();

        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTabela.getModel()).removeRow(l - 1); // primeira linha tem valor 0
                l--;
            } //fim While

        } //fim do if - verifica se tem alguma info. na tabela

        //fim limpa a tabela
        String tipo = "";
        String escolha = jcTipo.getSelectedItem().toString().trim();

        if (escolha.equals("Cod.")) {
            tipo = " " + "id_transportadora";
        }
        if (escolha.equals("Razão Social")) {
            tipo = " " + "tra_razaoS";
        }
        if (escolha.equals("CNPJ")) {
            tipo = " " + "tra_cnpj";
        }
        if (escolha.equals("Cidade")) {
            tipo = " " + "tra_cidade";
        }
        if (escolha.equals("Estado")) {
            tipo = " " + "tra_uf";
        }
        if (escolha.equals("Status")) {
            tipo = " " + "tra_status";
        }
        String arg = jtInfo.getText();

        try {
            ResultSet rs = ConsultaDAO.carregaTelaTransportadora(tipo, arg);

            DefaultTableModel mp = (DefaultTableModel) jTabela.getModel();

            while (rs.next()) {

                //coleta os dados da linha no banco de dados
                String Coluna0 = rs.getString("id_transportadora").trim();
                String Coluna1 = rs.getString("tra_razaoS").trim();
                String Coluna2 = rs.getString("tra_cnpj").trim();
                String Coluna3 = rs.getString("tra_cidade").trim();
                String Coluna4 = rs.getString("tra_uf").trim();
                String status = rs.getString("tra_status").trim();
                String Coluna5 = "";

                if (status.equals("1")) {
                    Coluna5 = "Ativo";
                }
                if (status.equals("0")) {
                    Coluna5 = "Inativo";
                }

                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5});

            }

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + error, "Preencher Item", 2);
        }

        tamanhocoluna();
        jTabela.setAutoCreateRowSorter(true); //ordena as linhas ao clicar na coluna
            
        }
    }//GEN-LAST:event_jtInfoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JButton jbCap;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JLabel jlConsulta;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JTextField jtInfo;
    // End of variables declaration//GEN-END:variables
    /**
     * determina tamanho das celulas 
     */
    public void tamanhocoluna() {
        jTabela.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTabela.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTabela.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTabela.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTabela.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTabela.getColumnModel().getColumn(5).setPreferredWidth(60);
    }//dimensionar tabela

}
