/*
 * Projeto Final da Cadeira de POO em Java
 * IFCE 2018.2
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matheus
 */
public class CandidatoTableModel extends AbstractTableModel{

    private List<Candidato> dados = new ArrayList<>();
    private String[] colunas = {"Nome","Partido","Número"};


    @Override
    public String getColumnName(int column) {
        return colunas[column];
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
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNomeCandidato();
            case 1:
                return dados.get(linha).getIdPartido();
            case 2:
                return dados.get(linha).getNumeroCandidato();
            
        }
        return null;
    }
    public void setValueAt(Object valor, int linha, int coluna){
        switch(coluna){
            case 0:
                 dados.get(linha).setNomeCandidato((String)valor);
                 break;
            case 1:
                 dados.get(linha).setIdPartido((String)valor);
                 break;
            case 2:
                 dados.get(linha).setNumeroCandidato((String)valor);
                 break;
            
        } 
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Candidato e){
        this.dados.add(e);
        this.fireTableDataChanged();
    }
     public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
