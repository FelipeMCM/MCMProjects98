package controller;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import util.ConnectionFactory;
import model.Task;

/**
 *
 * @author Felipe MCM ;^_^;
 */
public class TaskDAO {
    
    public void save(Task task) {
        String sql = "INSERT INTO TASKS(IDPROJECT, NAME, DESCRIPTION, NOTES, COMPLETED, DEADLINE, CREATEDAT, UPDATEDAT) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, task.getIdProject());
            stmt.setString(2, task.getName());
            stmt.setString(3, task.getDescription());
            stmt.setString(4, task.getNotes());
            stmt.setBoolean(5, task.getCompleted());
            stmt.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            stmt.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            stmt.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            
            stmt.execute();
            
          
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao salvar tarefa ", ex);
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
    
    public void update(Task task) {
        String sql = "UPDATE TASKS SET IDPROJECT = ?, NAME = ?, DESCRIPTION = ?, NOTES = ?, COMPLETED = ?, DEADLINE = ?, CREATEDAT = ?, UPDATEDAT = ? WHERE ID = ?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, task.getIdProject());
            stmt.setString(2, task.getName());
            stmt.setString(3, task.getDescription());
            stmt.setString(4, task.getNotes());
            stmt.setBoolean(5, task.getCompleted());
            stmt.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            stmt.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            stmt.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            stmt.setInt(9, task.getId());
            
            stmt.execute();
            
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao atualizar tarefa ", ex);
         
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
    
    public List<Task> getAll(int idProject) {
        String sql = "SELECT * FROM tasks";

        List<Task> tasks = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet rst = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            rst = stmt.executeQuery();

            //Enquanto existir dados no banco de dados, faï¿½a
            while (rst.next()) {

                Task task = new Task();

                task.setId(rst.getInt("ID"));
                task.setIdProject(rst.getInt("IDPROJECT"));
                task.setName(rst.getString("NAME"));
                task.setDescription(rst.getString("DESCRIPTION"));
                
                task.setNotes(rst.getString("NOTES"));
                task.setDeadline(rst.getDate("DEADLINE"));
                task.setCompleted(rst.getBoolean("COMPLETED"));
                task.setCreatedAt(rst.getDate("CREATEDAT"));
                task.setCreatedAt(rst.getDate("UPDATEDAT"));

                
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            try {
                if (rst != null) {
                    rst.close();
                };
                if (stmt != null) {
                    stmt.close();
                };
                if (conn != null) {
                    conn.close();
                };
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexÃ£o", ex);
            };
        };
        return tasks;
    };
    
    
     public List<Task> getByProjectId(int id) {
        String sql = "SELECT * FROM TASKS WHERE IDPROJECT = ?";

        List<Task> tasks = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet rst = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            rst = stmt.executeQuery();

            
            while (rst.next()) {

                Task task = new Task();

                task.setId(rst.getInt("ID"));
                task.setIdProject(rst.getInt("IDPROJECT"));
                task.setName(rst.getString("NAME"));
                task.setDescription(rst.getString("DESCRIPTION"));
           
                task.setNotes(rst.getString("NOTES"));
                task.setDeadline(rst.getDate("DEADLINE"));
                task.setCompleted(rst.getBoolean("COMPLETED"));
                task.setCreatedAt(rst.getDate("CREATEDAT"));
                task.setCreatedAt(rst.getDate("UPDATEDAT"));

                
                tasks.add(task);
            };
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            try {
                if (rst != null) {
                    rst.close();
                };
                if (stmt != null) {
                    stmt.close();
                };
                if (conn != null) {
                    conn.close();
                };
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            };
        };
        return tasks;
    };

    public void removeById(int id) {
        String sql = "DELETE FROM TASKS WHERE ID = ?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            stmt.execute();
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao deletar tarefa ", ex);
            
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
