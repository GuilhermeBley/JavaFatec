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
import fatec.poo.model.Matricula;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Turma;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class GuiAlocarEfetuarMatricula extends javax.swing.JFrame {

    /**
     * Creates new form GuiAlocarEfetuarMatricula
     */
    public GuiAlocarEfetuarMatricula(ArrayList<Pessoa> cadPessoas, ArrayList<Curso> cadCurso) {
        initComponents();
        ftxtCPF.setEnabled(false);
        
        this.cadPessoa = cadPessoas;
        this.cadCurso = cadCurso;

        for (Curso curso : cadCurso)
            jComboBoxCurso.addItem(curso.getSigla());
    }
    
    //
    // Método verifica se campos estão preenchidos corretamente
    //
    private boolean isDadosOk(){
        if(indexCurso < 0){
            JOptionPane.showMessageDialog(null, "Curso não definido!", "Aviso", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            
        else if (indexTurma < 0){
            JOptionPane.showMessageDialog(null, "Turma não definida!", "Aviso", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jComboBoxTurma = new javax.swing.JComboBox<>();
        ftxtDataMatric = new javax.swing.JFormattedTextField();
        ftxtCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        panelPagamento = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonAvista = new javax.swing.JRadioButton();
        jRadioButtonParcelado = new javax.swing.JRadioButton();
        ftxtDataPagto = new javax.swing.JFormattedTextField();
        ftxtDataVenc = new javax.swing.JFormattedTextField();
        fTxtTxJuros = new javax.swing.JFormattedTextField();
        fTtxtNoCheque = new javax.swing.JFormattedTextField();
        fTxtAgencia = new javax.swing.JFormattedTextField();
        fTxtQtdeMensalidades = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Data da Matrícula");

        jLabel2.setText("Curso");

        jLabel3.setText("Turma");

        jLabel4.setText("CPF Aluno");

        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        jComboBoxTurma.setLightWeightPopupEnabled(false);
        jComboBoxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaActionPerformed(evt);
            }
        });

        ftxtDataMatric.setText("  /  /");

        try {
            ftxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCPF.setEnabled(false);

        jLabel5.setText("Valor");

        jLabel6.setText("Nome");

        txtValor.setEditable(false);
        txtValor.setEnabled(false);

        txtNome.setEditable(false);
        txtNome.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Inserir.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Remover.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        panelPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));
        panelPagamento.setToolTipText("");
        panelPagamento.setEnabled(false);
        panelPagamento.setName(""); // NOI18N

        label1.setText("Agência");

        jLabel7.setText("Qtde. Mensalidades");

        jLabel8.setText("No. Cheque");

        jLabel9.setText("Tx. Juros(%)");

        jLabel10.setText("Data Pagto.");

        jLabel11.setText("Data 1o. Vencimento");

        jRadioButtonAvista.setText("À Vista");
        jRadioButtonAvista.setEnabled(false);
        jRadioButtonAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAvistaActionPerformed(evt);
            }
        });

        jRadioButtonParcelado.setText("Parcelado");
        jRadioButtonParcelado.setEnabled(false);
        jRadioButtonParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonParceladoActionPerformed(evt);
            }
        });

        ftxtDataPagto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftxtDataPagto.setText(" / / ");
        ftxtDataPagto.setEnabled(false);

        ftxtDataVenc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftxtDataVenc.setText(" / / ");
        ftxtDataVenc.setEnabled(false);

        fTxtTxJuros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fTxtTxJuros.setEnabled(false);

        fTtxtNoCheque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        fTtxtNoCheque.setEnabled(false);

        fTxtAgencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        fTxtAgencia.setEnabled(false);

        fTxtQtdeMensalidades.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        fTxtQtdeMensalidades.setEnabled(false);

        javax.swing.GroupLayout panelPagamentoLayout = new javax.swing.GroupLayout(panelPagamento);
        panelPagamento.setLayout(panelPagamentoLayout);
        panelPagamentoLayout.setHorizontalGroup(
            panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPagamentoLayout.createSequentialGroup()
                        .addComponent(jRadioButtonParcelado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(panelPagamentoLayout.createSequentialGroup()
                        .addComponent(jRadioButtonAvista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fTxtQtdeMensalidades, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(fTxtAgencia))
                .addGap(18, 18, 18)
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(fTtxtNoCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(fTxtTxJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtDataPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelPagamentoLayout.setVerticalGroup(
            panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagamentoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(ftxtDataPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fTtxtNoCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fTxtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButtonAvista))
                .addGap(15, 15, 15)
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButtonParcelado)
                    .addComponent(ftxtDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxtTxJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxtQtdeMensalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCurso, 0, 129, Short.MAX_VALUE)
                            .addComponent(jComboBoxTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ftxtDataMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftxtDataMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(panelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if(!isDadosOk())
            return;
        
        if(!Pessoa.validarCpf(ftxtCPF.getText())){
            JOptionPane.showMessageDialog(null,"Informe um CPF válido", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtCPF.setText("");
            return;
        }
        
        indexAluno = -1;
        
        for (int index= 0; index < cadPessoa.size(); index ++){
            if (cadPessoa.get(index) instanceof Aluno){
                if (cadPessoa.get(index).getCpf().equals(ftxtCPF.getText().replace(".", "").replace("-", ""))){
                    indexAluno = index;
                }
            }
        }
        
        if(indexAluno == -1){
            JOptionPane.showMessageDialog(null,"Aluno com o cpf '" + ftxtCPF.getText() +"' inexistente. Realize o cadastro na janela 'Cadastro Aluno'"
                    , "Aviso", JOptionPane.ERROR_MESSAGE);;
            return;
        }
        
        String nomeAluno = ((Aluno)cadPessoa.get(indexAluno)).getNome();
        txtNome.setText(nomeAluno);
        
        if(((Aluno)cadPessoa.get(indexAluno)).getMatricula() != null){
            habilitarAlteracao();
            return;
        }
        
        habilitarPagamento();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
        
        // Limpando combobox        
        cadTurma = new ArrayList<>();
        int qtdElements = jComboBoxTurma.getItemCount();
        for(int index = 0; index < qtdElements; index++){
            jComboBoxTurma.removeItemAt(0);
        }
        
        // Adicionando novos
        int cursoEscolhido = -1;
        for (Curso curso : cadCurso){
            cursoEscolhido++;
            if(curso.getSigla().equals(jComboBoxCurso.getSelectedItem().toString())){
                indexCurso = cursoEscolhido;
                break;
            }
        }
        
        Curso cursoAtual = cadCurso.get(indexCurso);
        
        DecimalFormat formatter = new DecimalFormat("#0.##");
        // Setando valor do curso
        txtValor.setText(formatter.format(cursoAtual.getValor()));
        
        cadTurma = cursoAtual.getTurmas();
        for (Turma turma : cursoAtual.getTurmas())
            jComboBoxTurma.addItem(turma.getSiglaTurma());
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

    private void jComboBoxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaActionPerformed
        
        int index = -1;
        for (Turma turma : cadTurma){
            index++;
            if(turma.getSiglaTurma().equals(jComboBoxTurma.getSelectedItem().toString()))
                indexTurma = index;
        }
        
        // Caso contenham cursos, é habilitado o CPF
        if (index != -1)
            ftxtCPF.setEnabled(true);
    }//GEN-LAST:event_jComboBoxTurmaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jRadioButtonAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAvistaActionPerformed
        if(jRadioButtonAvista.isSelected()){
            jRadioButtonParcelado.setSelected(false);
            
            // Desabilitando A vista
            fTxtQtdeMensalidades.setEnabled(false);
            fTxtTxJuros.setEnabled(false);
            ftxtDataVenc.setEnabled(false);
            fTxtAgencia.setText("");
            fTtxtNoCheque.setText("");
            ftxtDataPagto.setText(" / / ");
            
            // Habilitando botões
            fTxtAgencia.setEnabled(true);
            fTtxtNoCheque.setEnabled(true);
            ftxtDataPagto.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonAvistaActionPerformed

    private void jRadioButtonParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonParceladoActionPerformed
        if(jRadioButtonParcelado.isSelected()){
            jRadioButtonAvista.setSelected(false);
            
            // Desabilitando Parcelado
            fTxtAgencia.setEnabled(false);
            fTtxtNoCheque.setEnabled(false);
            ftxtDataPagto.setEnabled(false);
            fTxtQtdeMensalidades.setText("");
            fTxtTxJuros.setText("");
            ftxtDataVenc.setText(" / / ");
            
            // Habilitando botões
            fTxtQtdeMensalidades.setEnabled(true);
            fTxtTxJuros.setEnabled(true);
            ftxtDataVenc.setEnabled(true);
            
        }
    }//GEN-LAST:event_jRadioButtonParceladoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        
        if(!isDadosOk())
            return;
        
        Matricula matricula = new Matricula(ftxtDataMatric.getText());
        
        // Turma - Matricula
        Turma turma = cadTurma.get(indexTurma);
        turma.addMatricula(matricula);
        
        // Matricula - Aluno
        Aluno aluno = ((Aluno)cadPessoa.get(indexAluno));
        aluno.setMatricula(matricula);
        
        // Matricula - Aprazo || Avista
         if (jRadioButtonParcelado.isSelected()){
            APrazo aprazo = new APrazo();
            aprazo.setDtVencimento(ftxtDataVenc.getText());
            aprazo.setQtdeMensalidade(Integer.parseInt(fTxtQtdeMensalidades.getText()));
            aprazo.setTaxaJuros(Double.parseDouble(fTxtTxJuros.getText().replace(",", ".")));
            aprazo.setValor(Double.parseDouble(txtValor.getText()));
            
            matricula.setaVista(null);
            matricula.setaPrazo(aprazo);
        }
        else{
            AVista avista = new AVista();
            avista.setAgencia(Integer.parseInt(fTxtAgencia.getText()));
            avista.setnCheque(Integer.parseInt(fTtxtNoCheque.getText()));
            avista.setPreData(ftxtDataPagto.getText());
            avista.setValor(Double.parseDouble(txtValor.getText()));
            
            matricula.setaPrazo(null);
            matricula.setaVista(avista);
        }
         
        desabilitarPagamento();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        if(!isDadosOk())
            return;

        // Matricula - Aluno
        Aluno aluno = ((Aluno)cadPessoa.get(indexAluno));
        
        // Matricula - Aluno
        Matricula matricula = aluno.getMatricula();
        
        // Turma
        Turma turmaOld = matricula.getTurma();
        
        // Removendo valor anterior Matricula - Turma
        turmaOld.removeMatricula(matricula);
        
        // Adicionando novo Matricula - Turma
        Turma turmaNew = cadTurma.get(indexTurma);
        turmaNew.addMatricula(matricula);
        
        // Matricula - Aprazo || Avista
         if (jRadioButtonParcelado.isSelected()){
            APrazo aprazo = new APrazo();
            aprazo.setDtVencimento(ftxtDataVenc.getText());
            aprazo.setQtdeMensalidade(Integer.parseInt(fTxtQtdeMensalidades.getText()));
            aprazo.setTaxaJuros(Double.parseDouble(fTxtTxJuros.getText().replace(",", ".")));
            aprazo.setValor(Double.parseDouble(txtValor.getText()));
            
            matricula.setaVista(null);
            matricula.setaPrazo(aprazo);
        }
        else{
            AVista avista = new AVista();
            avista.setAgencia(Integer.parseInt(fTxtAgencia.getText()));
            avista.setnCheque(Integer.parseInt(fTtxtNoCheque.getText()));
            avista.setPreData(ftxtDataPagto.getText());
            avista.setValor(Double.parseDouble(txtValor.getText()));
            
            matricula.setaPrazo(null);
            matricula.setaVista(avista);
        }
        
        desabilitarPagamento();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        Aluno aluno = ((Aluno)cadPessoa.get(indexAluno));
        
        Matricula matricula = aluno.getMatricula();
        
        // Matricula - Aluno
        matricula.setAluno(null);
        aluno.setMatricula(null);
        
        // Turma - Matricula
        matricula.getTurma().removeMatricula(matricula);
        
        desabilitarPagamento();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void habilitarPagamento(){
        jRadioButtonAvista.setSelected(true);

        // jPanel
        panelPagamento.setEnabled(true);
        
        // habilitando botões
        jRadioButtonAvista.setEnabled(true);
        jRadioButtonParcelado.setEnabled(true);
        
        // Botões
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    private void desabilitarPagamento(){
        // Desabilitando botões
        jRadioButtonAvista.setSelected(false);
        jRadioButtonParcelado.setSelected(false);
        jRadioButtonAvista.setEnabled(false);
        jRadioButtonParcelado.setEnabled(false);
        
        // Desabilitando a vista
        fTxtAgencia.setEnabled(false);
        fTtxtNoCheque.setEnabled(false);
        ftxtDataPagto.setEnabled(false);
        fTxtAgencia.setText("");
        fTtxtNoCheque.setText("");
        ftxtDataPagto.setText(" / / ");
        
        // Desabilitando a prazo
        fTxtQtdeMensalidades.setEnabled(false);
        fTxtTxJuros.setEnabled(false);
        ftxtDataVenc.setEnabled(false);
        fTxtQtdeMensalidades.setText("");
        fTxtTxJuros.setText("");
        ftxtDataVenc.setText("");
        
        // Botões
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        // txt
        ftxtCPF.setText("");
        txtNome.setText("");
        
        // jPanel
        panelPagamento.setEnabled(false);
    }
    
    private void habilitarAlteracao(){
        // jPanel
        panelPagamento.setEnabled(true);

        // habilitando botões
        jRadioButtonAvista.setEnabled(true);
        jRadioButtonParcelado.setEnabled(true);
        
        Matricula matricula = ((Aluno)cadPessoa.get(indexAluno)).getMatricula();
        
        if (matricula.getaPrazo() != null){
            jRadioButtonParcelado.setSelected(true);
            fTxtQtdeMensalidades.setEnabled(true);
            fTxtTxJuros.setEnabled(true);
            ftxtDataVenc.setEnabled(true);
            fTxtQtdeMensalidades.setText(Integer.toString(matricula.getaPrazo().getQtdeMensalidade()));
            fTxtTxJuros.setText(Double.toString(matricula.getaPrazo().getTaxaJuros()));
            ftxtDataVenc.setText(matricula.getaPrazo().getDtVencimento());
        }
        else{
            jRadioButtonAvista.setSelected(true);
            fTxtAgencia.setEnabled(true);
            fTtxtNoCheque.setEnabled(true);
            ftxtDataPagto.setEnabled(true);
            fTxtAgencia.setText(Integer.toString(matricula.getaVista().getAgencia()));
            fTtxtNoCheque.setText(Integer.toString(matricula.getaVista().getnCheque()));
            ftxtDataPagto.setText(matricula.getaVista().getPreData());
        }
        
        // Botões
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField fTtxtNoCheque;
    private javax.swing.JFormattedTextField fTxtAgencia;
    private javax.swing.JFormattedTextField fTxtQtdeMensalidades;
    private javax.swing.JFormattedTextField fTxtTxJuros;
    private javax.swing.JFormattedTextField ftxtCPF;
    private javax.swing.JFormattedTextField ftxtDataMatric;
    private javax.swing.JFormattedTextField ftxtDataPagto;
    private javax.swing.JFormattedTextField ftxtDataVenc;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JComboBox<String> jComboBoxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonAvista;
    private javax.swing.JRadioButton jRadioButtonParcelado;
    private java.awt.Label label1;
    private javax.swing.JPanel panelPagamento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Curso> cadCurso;
    private ArrayList<Pessoa> cadPessoa;
    private ArrayList<Turma> cadTurma;
    
    // Auxiliares ->
    private int indexCurso = -1;
    private int indexAluno = -1;
    private int indexTurma = -1;
}