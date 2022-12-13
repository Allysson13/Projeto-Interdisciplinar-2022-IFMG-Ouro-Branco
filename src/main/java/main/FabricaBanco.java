package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FabricaBanco {
    
    private static Connection con;
    
    public static Connection getConexao(){
        
        if(con == null){
        
            try {
                //"jdbc:postgresql://localhost:5432/LocadoraBD", "postgres", "postgres"
                //"jdbc:postgresql://200.18.128.54/aula?user=aula&password=aula"
                //"jdbc:postgresql://200.18.128.54/Gerenciamento_de_Barbearia_BD", "aula", "aula"
                //Gerenciamento_de_Barbearia_BD
                //con = DriverManager.getConnection("jdbc:postgresql://200.18.128.54/aula", "aula", "aula");
                con = DriverManager.getConnection("jdbc:postgresql://200.18.128.54/aula", "aula", "aula");

            } catch (SQLException err) {
                
                JOptionPane.showMessageDialog(null, "Erro no momento da conexão com o banco: " + err.getMessage(), "Status da conexão", JOptionPane.WARNING_MESSAGE);

            }
        
        }
        
        return con;
        
    }
    
}
