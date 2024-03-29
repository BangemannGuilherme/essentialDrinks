/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import Entidade.Produto;
import DAO.ProdutoDAO;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Gui
 */
public class ProdutoTableModel extends AbstractTableModel {

    private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"ID", "Descrição", "Valor venda (R$)"};

    public ProdutoTableModel() {
        updateData("");
    }

    public void updateData(String busca) {
        if (busca.equals("")) {
            this.dados = new ProdutoDAO().findAll();
            this.fireTableDataChanged();
        } else {
            this.dados = new ProdutoDAO().findAllByDescription(busca);
            this.fireTableDataChanged();
        }
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {//retorna o nome da Coluna, o java usa para noemar as colunas também!
        return colunas[column];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId_produto();
            case 1:
                return dados.get(linha).getDescricao();
            case 2:
                //return dados.get(linha).getVl_venda();
                NumberFormat formatter = new DecimalFormat("###,###,##0.00");
                String s = formatter.format(dados.get(linha).getValor());
                return s;
        }

        return null;
    }

//
//    public void addRow(Produto p) {
//        this.dados.add(p);
//        this.fireTableDataChanged();//atualiza a tabela quando houver alteração
//    }
//
//    public void removeRow(int linha) {
//        this.dados.remove(linha);
//        this.fireTableRowsDeleted(linha, linha);// parâmetros ~> (início, fim)
//    }
//    @Override
//    public void setValueAt(Object valor, int linha, int coluna) {
//        switch (coluna) {
//            case 0:
//                dados.get(linha).setId_produto(Integer.parseInt((String) valor));
//                break;
//            case 1:
//                dados.get(linha).setDs_produto((String) valor);
//                break;
//            case 2:
//                dados.get(linha).setVl_venda(Double.parseDouble((String) valor));//valor que vem do Text Field é sempre uma String
//                break;
//        }
//
//        this.fireTableRowsUpdated(linha, linha);
//    }
}
