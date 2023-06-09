/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfac;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.login;
import modelDAO.ExcluirDAO;
import modelDAO.IncluirEditarDAO;

/**
 * Realizar cadastro do usuario pelo sisttema ARMAGEDON
 * 
 */
public class CadastroUser extends javax.swing.JInternalFrame {
  
        login objlog = new login ();
        
        IncluirEditarDAO IEDAO;
        ExcluirDAO EXDAO;
        

    /**
     * Creates new form CadastroUser
     */
    public CadastroUser() {
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

        jPanel1 = new javax.swing.JPanel();
        jbAdicionar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCod = new javax.swing.JTextField();
        jtSenha = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Usuários");

        jbAdicionar.setText("Adicionar");
        jbAdicionar.setEnabled(false);
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Insira o nome");

        jtNome.setEnabled(false);
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Insira a senha");

        jLabel3.setText("Codigo");

        jtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodActionPerformed(evt);
            }
        });

        jtSenha.setEnabled(false);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jtSenha))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAdicionar, jbExcluir, jtCod});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdicionar)
                    .addComponent(jbExcluir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAdicionar, jbExcluir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(250, 30, 311, 170);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        // TODO add your handling code here:
        
        
        int Cod;
     objlog= new login();
     preencher_objetos();
     
     try {
          salvar();
         IEDAO = new IncluirEditarDAO();
          
                Cod=IEDAO.IncluirUsuario(objlog);
                    jtCod.setText(String.valueOf(Cod));
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso !");
                
         
     }catch(SQLException error){
         JOptionPane.showMessageDialog(this, "Erro ao salvar: " + error.getMessage());  
         cancelar();
         
     }
     
     
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        
                
        
        if(jtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o Código! ");
        }else{
            int codigo=Integer.parseInt(jtCod.getText());
            
            EXDAO = new ExcluirDAO();
    
            try {
                if (JOptionPane.showConfirmDialog(this, "Confirmar Exclusão? ", "Confirmação",
                        JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION)
                    

                        if (EXDAO.ExcluirClientes(codigo)) {
                            JOptionPane.showMessageDialog(this, "Excluido com sucesso!");
                            cancelar();
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(this, "Erro ao excluir o registro! ");
                            
                        } else {
                    
                    JOptionPane.showMessageDialog(this, "Operação cancelada! ");
                    cancelar();
                    
                    }
                        
                } catch (SQLException error) {
                     JOptionPane.showMessageDialog(this, "Erro: Exclusão Não REalizada!" + error.getMessage());
                }
                

            
        
               
        }
                
                
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        novo();
        
    }//GEN-LAST:event_jbNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtSenha;
    // End of variables declaration//GEN-END:variables


    
    
public void cancelar(){
    
    jtNome.setText("");
    jtSenha.setText("");
    jtCod.setText("");
    
        jtCod.setEnabled(true);
        jbNovo.setEnabled(true);
       jtNome.setEnabled(false);
    jtSenha.setEnabled(false);
    jbAdicionar.setEnabled(false);
    jbExcluir.setEnabled(false);
    
}

public void preencher_objetos(){
    objlog.setUsuario(jtNome.getText());
       objlog.setSenha(jtSenha.getText());
    
}

public void pesquisa(){

jtNome.setText(objlog.getUsuario().trim());
         jtSenha.setText(objlog.getSenha().trim());

}

public void novo(){
    
        jtCod.setText("");
    jtNome.setText("");
    jtSenha.setText("");
    
    jtCod.setEnabled(false);
       jtNome.setEnabled(true);
    jtSenha.setEnabled(true);
    jbAdicionar.setEnabled(true);
    jbNovo.setEnabled(false);
  
}

public void salvar(){
    
        jbExcluir.setEnabled(true);
        jbNovo.setEnabled(true);
        jbAdicionar.setEnabled(false);
        
}

}
