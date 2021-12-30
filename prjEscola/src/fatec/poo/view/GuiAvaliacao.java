/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.util.ArrayList;

/**
 *
 * @author Bley
 */
public class GuiAvaliacao extends javax.swing.JFrame {

    /**
     * Creates new form GuiAvaliacao
     */
    public GuiAvaliacao(ArrayList<Curso> cadCurso) {
        initComponents();
        
        this.cadCurso = cadCurso;
        
        for (Curso curso : this.cadCurso){
            jComboBoxCurso.addItem(curso.getSigla());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCurso = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        lblQtddTurmas = new javax.swing.JLabel();
        txtQtdTurmas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTotalFaturamento = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblCurso.setText("Curso");

        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        lblQtddTurmas.setText("Quantidade Turmas");

        txtQtdTurmas.setEditable(false);

        jLabel1.setText("Total Faturamento");

        txtTotalFaturamento.setEditable(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCurso)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblQtddTurmas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQtdTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(30, 30, 30)
                            .addComponent(txtTotalFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addGap(41, 41, 41)
                .addComponent(btnSair)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnConsultar, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurso))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtddTurmas)
                    .addComponent(txtQtdTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotalFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        txtQtdTurmas.setText("");
        txtTotalFaturamento.setText("");
        
        if (indexCurso == -1){
            javax.swing.JOptionPane.showMessageDialog(null, "Curso não definido!", "Aviso", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double faturamento = 0;
        int quantidadeturmas = 0;
        
        Curso curso = cadCurso.get(indexCurso);
        ArrayList<Turma> cadTurmas = curso.getTurmas();
        
        for (Turma turma : cadTurmas){
            quantidadeturmas++;
            faturamento += (curso.getValor() * turma.getCountMatricula());
        }
            
        // Mostrando informação  
        txtQtdTurmas.setText(Integer.toString(quantidadeturmas));
        txtTotalFaturamento.setText(Double.toString(faturamento));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
        
        int indexAux = -1;
        for(Curso curso : cadCurso){
            indexAux++;
            if(curso.getSigla().equals(jComboBoxCurso.getSelectedItem().toString())){
                indexCurso = indexAux;
                return;
            }
        }
        
        indexCurso = -1;
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblQtddTurmas;
    private javax.swing.JTextField txtQtdTurmas;
    private javax.swing.JTextField txtTotalFaturamento;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Curso> cadCurso;
    
    // Index
    private int indexCurso = -1;
}
