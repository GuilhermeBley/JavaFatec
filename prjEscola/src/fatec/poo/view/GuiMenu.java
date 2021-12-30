/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Matricula;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Turma;
import java.util.ArrayList;

/**
 *
 * @author Bley
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCurso = new javax.swing.JMenuItem();
        jMenuItemTurma = new javax.swing.JMenuItem();
        jMenuItemInstrutor = new javax.swing.JMenuItem();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuOperacoes = new javax.swing.JMenu();
        jMenuItemAlocInstrut = new javax.swing.JMenuItem();
        jMenuItemEfetuMatri = new javax.swing.JMenuItem();
        jMenuItem2Aval = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traballho POO");
        setResizable(false);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCurso.setText("Curso");
        jMenuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCursoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCurso);

        jMenuItemTurma.setText("Turma");
        jMenuItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemTurma);

        jMenuItemInstrutor.setText("Instrutor");
        jMenuItemInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstrutorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemInstrutor);

        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemAluno);
        jMenuCadastros.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastros);

        jMenuOperacoes.setText("Operações");

        jMenuItemAlocInstrut.setText("Alocar Instrutor");
        jMenuItemAlocInstrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlocInstrutActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemAlocInstrut);

        jMenuItemEfetuMatri.setText("Efetuar Matrícula");
        jMenuItemEfetuMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEfetuMatriActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemEfetuMatri);

        jMenuItem2Aval.setText("2a. Avaliação POO");
        jMenuItem2Aval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2AvalActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItem2Aval);

        jMenuBar1.add(jMenuOperacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCursoActionPerformed
        GuiCurso frameCurso = new GuiCurso(cadCursos);
        frameCurso.setVisible(true);
    }//GEN-LAST:event_jMenuItemCursoActionPerformed

    private void jMenuItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaActionPerformed
        GuiTurma frameTurma = new GuiTurma(CadTurmas, cadCursos);
        frameTurma.setVisible(true);
    }//GEN-LAST:event_jMenuItemTurmaActionPerformed

    private void jMenuItemInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstrutorActionPerformed
        GuiInstrutor frameInstrutor = new GuiInstrutor(cadAlunoInstrutor);
        frameInstrutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemInstrutorActionPerformed

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        GuiAluno frameAluno = new GuiAluno(cadAlunoInstrutor);
        frameAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemAlocInstrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlocInstrutActionPerformed
        GuiAlocarInstrutor frameInstrutor = new GuiAlocarInstrutor(cadCursos, cadAlunoInstrutor);
        frameInstrutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemAlocInstrutActionPerformed

    private void jMenuItemEfetuMatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEfetuMatriActionPerformed
        GuiAlocarEfetuarMatricula frameMatricula = new GuiAlocarEfetuarMatricula(cadAlunoInstrutor, cadCursos);
        frameMatricula.setVisible(true);
    }//GEN-LAST:event_jMenuItemEfetuMatriActionPerformed

    private void jMenuItem2AvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2AvalActionPerformed
        GuiAvaliacao frameAval = new GuiAvaliacao(cadCursos);
        frameAval.setVisible(true);
    }//GEN-LAST:event_jMenuItem2AvalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem2Aval;
    private javax.swing.JMenuItem jMenuItemAlocInstrut;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemCurso;
    private javax.swing.JMenuItem jMenuItemEfetuMatri;
    private javax.swing.JMenuItem jMenuItemInstrutor;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTurma;
    private javax.swing.JMenu jMenuOperacoes;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Curso> cadCursos = new ArrayList<Curso>();;
    private ArrayList<Turma> CadTurmas = new ArrayList<Turma>();
    private ArrayList<Pessoa> cadAlunoInstrutor = new ArrayList<Pessoa>();
    private ArrayList<Matricula> cadMatricula = new ArrayList<Matricula>();
    private ArrayList<AVista> cadAVista = new ArrayList<AVista>();
    private ArrayList<APrazo> cadAPrazo = new ArrayList<APrazo>();

}
