package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Felipe MCM ;^_^;
 */
public class TaskTableModel extends AbstractTableModel{
    
    
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    
    public int getRowCount() {  //Quantas tarefas eu já possuo;
        return tasks.size();
    }

    @Override
    
    public int getColumnCount() { //Quantas colunas eu já possuo;
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {  //Retorna o nome de uma coluna com base na coluna pedida;
        return columns[columnIndex];
    };
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        return columnIndex == 3;
    };
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        if(tasks.isEmpty()) {
            return Object.class;
        };
        return this.getValueAt(0, columnIndex).getClass();
    };
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        tasks.get(rowIndex).setCompleted((boolean) value);
    }
    
    
    @Override    
    public Object getValueAt(int rowIndex, int columnIndex) { //Qual valor deve ser exibido em determinada linha e coluna; 
        
        switch(columnIndex) {
            case 0 :
                return tasks.get(rowIndex).getName();
                
            case 1 :
                return tasks.get(rowIndex).getDescription();
                
            case 2 :
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
                
            case 3 :
                return tasks.get(rowIndex).getCompleted();
                
            case 4 :
                return "";
                
            case 5 :
                return "";
            
            default :
                return "Valor não encontrado!";
                
                
        }
    };

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
