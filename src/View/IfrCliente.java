/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.EntidadeDAO;
import DAO.ClienteDAO;
import Entidade.Cidade;
import Entidade.Entidade;
import Entidade.Estado;
import Entidade.Cliente;
import TableModel.ClienteTableModel;
import Utils.Formatacao;
import Utils.JTableUtilities;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

/**
 *
 * @author Gui
 */
public class IfrCliente extends javax.swing.JInternalFrame {

    JDesktopPane dskPrincipal = new JDesktopPane();
    ClienteTableModel tableModel = new ClienteTableModel();
    int idEntidade = 0;
    int idCliente = 0;

    public IfrCliente() {
        initComponents();
        tblPessoa.setModel(tableModel);
        tblPessoa.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblPessoa.getColumnModel().getColumn(1).setPreferredWidth(780);
        JTableUtilities.setCellsAlignment(tblPessoa, SwingConstants.CENTER, new int[]{0, 2});
        tblPessoa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleção de única linha
        FrmPrincipal frmPrincipal = new FrmPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProduto = new javax.swing.JTabbedPane();
        pnlCadastrar = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        tfdRazaoSocial = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        tfdCnpj = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbEndereco = new javax.swing.JLabel();
        tfdEndereco = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfdBairro = new javax.swing.JTextField();
        lbNr = new javax.swing.JLabel();
        tfdNumero = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        tfdTelefone = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        tfdCelular = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        tfdMostraId = new javax.swing.JTextField();
        pnlConsultar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        tfdBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Funcionário");
        setPreferredSize(new java.awt.Dimension(992, 737));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/save-30.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Campos marcados com '*' são de preenchimento obrigatório.");

        lbNome.setText("Razão Social");

        lbCpf.setText("CNPJ");

        lbEndereco.setText("Endereço");

        lbBairro.setText("Bairro");

        tfdBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdBairroActionPerformed(evt);
            }
        });

        lbNr.setText("Nr");

        lbTelefone.setText("Telefone");

        lbCelular.setText("Celular");

        lbEmail.setText("Email");

        lbCodigo.setText("Código:");

        tfdMostraId.setEditable(false);

        javax.swing.GroupLayout pnlCadastrarLayout = new javax.swing.GroupLayout(pnlCadastrar);
        pnlCadastrar.setLayout(pnlCadastrarLayout);
        pnlCadastrarLayout.setHorizontalGroup(
            pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlCadastrarLayout.createSequentialGroup()
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastrarLayout.createSequentialGroup()
                                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlCadastrarLayout.createSequentialGroup()
                                        .addComponent(lbEndereco)
                                        .addGap(86, 86, 86))
                                    .addGroup(pnlCadastrarLayout.createSequentialGroup()
                                        .addComponent(lbTelefone)
                                        .addGap(90, 90, 90)))
                                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                                        .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbNr)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                                        .addComponent(tfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbCelular)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCadastrarLayout.createSequentialGroup()
                                        .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(pnlCadastrarLayout.createSequentialGroup()
                                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBairro)
                                    .addComponent(lbEmail))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlCadastrarLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbCodigo)
                            .addComponent(lbCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdMostraId, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 259, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        pnlCadastrarLayout.setVerticalGroup(
            pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfdMostraId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfdRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(tfdCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro)
                    .addComponent(lbNr)
                    .addComponent(tfdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(tfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCelular)
                    .addComponent(tfdCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pnlProduto.addTab("Cadastrar", pnlCadastrar);

        jLabel1.setText("Buscar:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/search-30.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPessoa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblPessoa);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/delete-30.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/edit-30.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarLayout = new javax.swing.GroupLayout(pnlConsultar);
        pnlConsultar.setLayout(pnlConsultarLayout);
        pnlConsultarLayout.setHorizontalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlConsultarLayout.setVerticalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlProduto.addTab("Consultar", pnlConsultar);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/cancel-30.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProduto)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validaCampos()) {

            EntidadeDAO entidadeDao = new EntidadeDAO();
            Entidade entidade = new Entidade();

            Estado estado = new Estado();
            estado.setId_estado(1);
            estado.setEstado("Rio Grande do Sul");
            estado.setSigla_estado("RS");
            estado.setSituacao('a');

            Cidade cidade = new Cidade();
            cidade.setCidade("Estrela");
            cidade.setId_cidade(1);
            cidade.setId_estado(estado);
            cidade.setId_usuario_cadastro(1);
            cidade.setSituacao('a');

            entidade.setId_entidade(idEntidade);
            entidade.setEndereco(tfdEndereco.getText());
            entidade.setBairro(tfdBairro.getText());
            entidade.setCelular(tfdCelular.getText());
            entidade.setTelefone(tfdTelefone.getText());
            entidade.setEmail(tfdEmail.getText());
            entidade.setNumero(Integer.parseInt(tfdNumero.getText()));
            entidade.setUsuarioCadastro(1);
            entidade.setId_cidade(cidade);
            entidade.setSituacao('A');

            entidadeDao.save(entidade);

            ClienteDAO clienteDao = new ClienteDAO();
            Cliente cliente = new Cliente();

//        Date data = new Date();
//        
//        
//        Calendario calendar = new Calendario();
//        
//        data = calendar.obterDataAtualDMA();
//        
            cliente.setRazaoSocial(tfdRazaoSocial.getText());
            cliente.setCnpj(tfdCnpj.getText());
            cliente.setId_cliente(idCliente);
            cliente.setId_entidade(entidade);

            clienteDao.save(cliente);

            limpaCampos();
            this.tableModel.updateData("");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.tableModel.updateData(tfdBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblPessoa.getSelectedRow() != -1) {
            //remonta o produto, possuindo o ID, basta buscar os dados no banco:
            EntidadeDAO entidadeDAO = new EntidadeDAO();
            Entidade entidade = entidadeDAO.findById((int) tableModel.getValueAt(tblPessoa.getSelectedRow(), 5));
            entidade.setSituacao('I'); //INATIVANDO
            String retorno = entidadeDAO.update(entidade);
            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
                this.tableModel.updateData("");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir Cliente\nMensagem técnica: " + retorno, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            this.tableModel.updateData("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente para Excluir.", "Verifique a seleção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
//        if (tblPessoa.getSelectedRow() != -1) {
//            this.idCliente = (int) tableModel.getValueAt(tblPessoa.getSelectedRow(), 0);
//            tfdMostraId.setText(String.valueOf(idCliente));
//            txaDescricao.setText(String.valueOf(tableModel.getValueAt(tblProduto.getSelectedRow(), 1)));
//            tfdValor.setText(String.valueOf(tableModel.getValueAt(tblProduto.getSelectedRow(), 2)));
//
//            //retorna à aba de cadastro
//            pnlProduto.setSelectedIndex(0);
//        } else {
//            JOptionPane.showMessageDialog(null, "Selecione um produto para Editar.", "Verifique a seleção!", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (pnlProduto.getSelectedIndex() == 0) {
            limpaCampos();
        } else {
            pnlProduto.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfdBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdBairroActionPerformed
    private void limpaCampos() {
        tfdRazaoSocial.setText("");
        tfdCnpj.setText("");
        tfdBairro.setText("");
        tfdEndereco.setText("");
        tfdTelefone.setText("");
        tfdCelular.setText("");
        tfdEmail.setText("");
    }

    private boolean validaCampos() {
        boolean valido = true;
        if (tfdRazaoSocial.getText().length() == 0
                || tfdCnpj.getText().length() == 0
                || tfdBairro.getText().length() == 0
                || tfdEndereco.getText().length() == 0
                || tfdTelefone.getText().length() == 0
                || tfdCelular.getText().length() == 0
                || tfdEmail.getText().length() == 0) {
            valido = false;
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios.", "Verifique os campos!", JOptionPane.WARNING_MESSAGE);
        }
        return valido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNr;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel pnlCadastrar;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JTabbedPane pnlProduto;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField tfdBairro;
    private javax.swing.JTextField tfdBuscar;
    private javax.swing.JTextField tfdCelular;
    private javax.swing.JTextField tfdCnpj;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdMostraId;
    private javax.swing.JTextField tfdNumero;
    private javax.swing.JTextField tfdRazaoSocial;
    private javax.swing.JTextField tfdTelefone;
    // End of variables declaration//GEN-END:variables
}