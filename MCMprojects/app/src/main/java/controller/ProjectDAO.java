package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.ConnectionFactory;
import java.sql.SQLException;
import model.Project;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe MCM ;^_^;
 */
public class ProjectDAO {
    
    public void save(Project project) {
        String sql = "INSERT INTO projects(name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            //Cria conexão com o banco de dados;
            conn = ConnectionFactory.getConnection();
            //Cria um PrepareStatement, classe usada para executar uma query;
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, project.getName());
            stmt.setString(2, project.getDescription());
            stmt.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
            stmt.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
            
            
            //Executa o sql para a inserção dos dados;
            stmt.execute();
                    
            
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto ", ex);
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                };
                if(stmt != null) {
                    stmt.close();
                };
            } catch(SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão ", ex);
                
            };
        };
    };
    
    public void update(Project project) {
        String sql = "UPDATE PROJECTS SET NAME = ?, DESCRIPTION = ?, CREATEDAT = ?, UPDATEDAT = ?, WHERE ID = ?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, project.getName());
            stmt.setString(2, project.getDescription());
            stmt.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
            stmt.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
            stmt.setInt(5, project.getId());
            
            stmt.execute();
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto ", ex);
            
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                };
                if(stmt != null) {
                    stmt.close();
                };
            } catch(SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão com o dataBase ", ex);
            };
        };
    };
    
    
    public List<Project> getAll() {
        
        String sql = "SELECT * FROM PROJECTS";
        
        List<Project> projects = new ArrayList();
        
        
        Connection conn= null;
        PreparedStatement stmt = null;
        
        //Classe que vai recuperar os dados do dataBase
        ResultSet rst = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            
            rst = stmt.executeQuery();
            
            while(rst.next()) {
                
                Project project = new Project();
                
                project.setId(rst.getInt("ID"));
                project.setName(rst.getString("NAME"));
                project.setDescription(rst.getString("DESCRIPTION"));
                project.setCreatedAt(rst.getDate("CREATEDAT"));
                project.setUpdatedAt(rst.getDate("UPDATEDAT"));
                
                projects.add(project);
                
            };
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao consultar projeto ", ex);
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                };
                if(stmt != null) {
                    stmt.close();
                };
                if(rst != null) {
                    rst.close();
                };
                
            } catch(SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão com o dataBase ", ex);
            };
        };
        return projects;
    };
    
    
    public void removeById(int id) {
        
        String sql = "DELETE FROM PROJECTS WHERE ID = ?";
        
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            stmt.execute();
            
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao deletar projeto ", ex);
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                };
                if(stmt != null) {
                    stmt.close();
                };
            } catch(SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão ", ex);
            };
        };
        
    };
    
    
    
    
    
    
};
