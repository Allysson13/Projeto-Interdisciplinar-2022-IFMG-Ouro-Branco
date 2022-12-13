package controller;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelos.Usuario;
import repository.UsuarioDAO;
import telas.ConsultaBanco;

public class RegraTabelaUsuario extends AbstractTableModel{
    
    private Vector<Usuario> vetUsuario= UsuarioDAO.consultaUsuario();
    private String nomeColunnas[] = {"Email", "Senha"};
;
    
    //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        
        return this.vetUsuario.size();
        
    }
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        
        return 2;
        
    }
    
    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Usuario usuarioTemporario = vetUsuario.get(indiceLinha);
        
        switch(indiceColuna){
            
            case 0: return usuarioTemporario.getEmail();
            case 1: return usuarioTemporario.getSenha();
            default: return null;
            
        }
        
    }
    
    //nome de cada coluna da tabela (Cabeçalho)
    @Override
    public String getColumnName(int coluna) {
        
        return nomeColunnas[coluna];
        
    }
    
    //Definindo quais células podem ser modificadas (editadas)
    @Override
    public boolean isCellEditable(int indiceLinha, int indiceColuna) {
        
        return indiceLinha == vetUsuario.size() -1;
        
    }

    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        
        switch(indiceColuna){
            
            case 0: return Integer.class;
            default: return String.class;
            
        }
        
    }
    
}
