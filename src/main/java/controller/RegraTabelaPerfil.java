package controller;

import java.util.Vector;
import repository.UsuarioDAO;
import javax.swing.table.AbstractTableModel;
import modelos.Usuario;

public class RegraTabelaPerfil extends AbstractTableModel {
    
    private Vector<Usuario> vetUsuario= UsuarioDAO.consultaUsuario();
    private String nomeColunnas[] = {"Código", "Nome", "Idade", "Senha", "Email", "Tipo Usuário"};  
;
    
    //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        
        return this.vetUsuario.size();
        
    }
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        
        return 6;
        
    }
    
    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Usuario usuarioTemporario = vetUsuario.get(indiceLinha);
        
        switch(indiceColuna){
            
            case 0: return usuarioTemporario.getCodigo();
            case 1: return usuarioTemporario.getNome();
            case 2: return usuarioTemporario.getIdade();
            case 3: return usuarioTemporario.getSenha();
            case 4: return usuarioTemporario.getEmail();
            case 5: return usuarioTemporario.getTipoUsuario();
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
        
        return indiceLinha == vetUsuario.size() -1 && indiceColuna != 0;
        
    }

    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        
        switch(indiceColuna){
            
            case 0: return Integer.class;
            default: return String.class;
            
        }
        
    }
    
    
    
}
