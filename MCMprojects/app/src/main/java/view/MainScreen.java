/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectDAO;
import controller.TaskDAO;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.List;
import javax.swing.DefaultListModel;

import model.Project;
import model.Task;
import util.ButtonColumnCellRenderer;
import util.DeadlineColumnCellRenderer;
import util.TaskTableModel;


/**
 *
 * @author Micro
 */
public class MainScreen extends javax.swing.JFrame {

    ProjectDAO projectController;
    TaskDAO taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
   
    
    public MainScreen() {
        initComponents();
       
        
        initDataController();
        initComponentsModel();
        decorateTableTask();
        
        
        
        
    };
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmptyTableTask = new javax.swing.JPanel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanelToolBar = new javax.swing.JPanel();
        jPanelSubToolBar = new javax.swing.JPanel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jButtonProjectsAdd = new javax.swing.JButton();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitle = new javax.swing.JLabel();
        jButtonTasksAdd = new javax.swing.JButton();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSubTitle = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();

        jPanelEmptyTableTask.setBackground(new java.awt.Color(204, 204, 204));
        jPanelEmptyTableTask.setLayout(new java.awt.BorderLayout());

        jLabelEmptyListTitle.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 0, 102));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("Nenhuma tarefa por aqui ");
        jLabelEmptyListTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelEmptyTableTask.add(jLabelEmptyListTitle, java.awt.BorderLayout.CENTER);

        jLabelEmptyListSubTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setText("Clique no bot�o \"+\" para adicionar uma nova tarefa");
        jLabelEmptyListSubTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelEmptyListSubTitle.setAlignmentX(0.5F);
        jLabelEmptyListSubTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelEmptyTableTask.add(jLabelEmptyListSubTitle, java.awt.BorderLayout.PAGE_START);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 1360));
        setMinimumSize(new java.awt.Dimension(740, 800));

        jPanelMain.setBackground(new java.awt.Color(0, 0, 204));
        jPanelMain.setMaximumSize(new java.awt.Dimension(1280, 1360));
        jPanelMain.setMinimumSize(new java.awt.Dimension(400, 450));

        jPanelToolBar.setBackground(new java.awt.Color(102, 102, 255));

        jPanelSubToolBar.setBackground(new java.awt.Color(204, 204, 204));

        jPanelProjects.setBackground(new java.awt.Color(204, 204, 204));

        jLabelProjectsTitle.setBackground(new java.awt.Color(153, 153, 153));
        jLabelProjectsTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabelProjectsTitle.setForeground(new java.awt.Color(0, 0, 102));
        jLabelProjectsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProjectsTitle.setText("Projetos");

        jButtonProjectsAdd.setBackground(new java.awt.Color(0, 0, 204));
        jButtonProjectsAdd.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        jButtonProjectsAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProjectsAdd.setText("+");
        jButtonProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelProjectsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProjectsAdd)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelProjectsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelProjectsTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonProjectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTasks.setBackground(new java.awt.Color(204, 204, 204));

        jLabelTasksTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabelTasksTitle.setForeground(new java.awt.Color(0, 0, 102));
        jLabelTasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTasksTitle.setText("Tarefas");
        jLabelTasksTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonTasksAdd.setBackground(new java.awt.Color(0, 0, 204));
        jButtonTasksAdd.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        jButtonTasksAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTasksAdd.setText("+");
        jButtonTasksAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabelTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTasksAdd)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTasksLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelTasksTitle))
                    .addGroup(jPanelTasksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonTasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSubToolBarLayout = new javax.swing.GroupLayout(jPanelSubToolBar);
        jPanelSubToolBar.setLayout(jPanelSubToolBarLayout);
        jPanelSubToolBarLayout.setHorizontalGroup(
            jPanelSubToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubToolBarLayout.createSequentialGroup()
                .addComponent(jPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSubToolBarLayout.setVerticalGroup(
            jPanelSubToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelSubToolBarLayout.createSequentialGroup()
                .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabelToolBarTitle.setBackground(new java.awt.Color(204, 204, 204));
        jLabelToolBarTitle.setFont(new java.awt.Font("Ink Free", 3, 48)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(204, 255, 255));
        jLabelToolBarTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarTitle.setText("MCM Projetos 98");
        jLabelToolBarTitle.setToolTipText("");

        jLabelToolBarSubTitle.setBackground(new java.awt.Color(204, 204, 204));
        jLabelToolBarSubTitle.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabelToolBarSubTitle.setForeground(new java.awt.Color(204, 255, 255));
        jLabelToolBarSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSubTitle.setText("Anote tudo n�o esque�a nada ");

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSubToolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolBarLayout.createSequentialGroup()
                        .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolBarLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabelToolBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(267, 267, 267))))
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolBarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelToolBarTitle)
                .addGap(24, 24, 24)
                .addComponent(jLabelToolBarSubTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanelSubToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jScrollPaneTasks.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPaneTasks.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPaneTasks.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        jTableTasks.setBackground(new java.awt.Color(204, 204, 204));
        jTableTasks.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTableTasks.setForeground(new java.awt.Color(0, 0, 102));
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa Conclu�da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(0, 0, 0));
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jTableTasks.setSelectionForeground(new java.awt.Color(0, 0, 102));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowVerticalLines(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        jPanel9.add(jScrollPaneTasks, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jListProjects.setBackground(new java.awt.Color(204, 204, 204));
        jListProjects.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 0, 102));
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(40);
        jListProjects.setSelectedIndex(getCursorType());
        jListProjects.setSelectionBackground(new java.awt.Color(153, 255, 255));
        jListProjects.setSelectionForeground(new java.awt.Color(0, 0, 102));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProjectsAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
         projectDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            };
        });
    }//GEN-LAST:event_jButtonProjectsAddMouseClicked

    private void jButtonTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTasksAddMouseClicked
        // TODO add your handling code here:
        TasksDialogScreen taskDialogScreen = new TasksDialogScreen(this, rootPaneCheckingEnabled);
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        taskDialogScreen.setVisible(true);
        taskDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            };
        });
    }//GEN-LAST:event_jButtonTasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = taskModel.getTasks().get(rowIndex);
        switch(columnIndex) {
            
            case 3 :
                
                taskController.update(task);
                break;    
            case 4 :
                
                break;
                
            case 5 :
                
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                
                
                
                break; 
                    
        };
  
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
       
        int projectIndex = jListProjects.getSelectedIndex();
        Project projects = (Project) projectsModel.get(projectIndex);
       
        loadTasks(projects.getId());   
        
    
       
   
        
        
    }//GEN-LAST:event_jListProjectsMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            };
        });
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProjectsAdd;
    private javax.swing.JButton jButtonTasksAdd;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTasksTitle;
    private javax.swing.JLabel jLabelToolBarSubTitle;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEmptyTableTask;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelSubToolBar;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask() {
        jTableTasks.getTableHeader().setFont(new Font("Georgia", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(102, 102, 255));
        jTableTasks.getTableHeader().setForeground(new Color(50, 50, 50));
        
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCellRenderer());
        
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRenderer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRenderer("delete"));
        
        
        jTableTasks.setAutoCreateRowSorter(true);
    };
    
    public void initDataController() {
        projectController = new ProjectDAO();
        taskController = new TaskDAO();
    };
    
   public void initComponentsModel() {
       /*Respons�vel por gerenciar a parte do meu JList */
        projectsModel = new DefaultListModel();
        loadProjects();
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        
            
              
            
        
    };

   public void loadTasks(int idProject) {
       List<Task> tasks = taskController.getByProjectId(idProject);
       
       taskModel.setTasks(tasks);
       showJTableTasks(!tasks.isEmpty());
       
       
       
   }
    
    private void showJTableTasks(boolean isEmptyTable) {
        if (isEmptyTable) {
            if(jPanelEmptyTableTask.isVisible()) {
                jPanelEmptyTableTask.setVisible(false);
                jPanel9.remove(jPanelEmptyTableTask);
            }
            jPanel9.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanel9.getWidth(), jPanel9.getHeight());
        } else {
            if(jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanel9.remove(jScrollPaneTasks);
            }
            jPanel9.add(jPanelEmptyTableTask);
            jPanelEmptyTableTask.setVisible(true);
            jPanelEmptyTableTask.setSize(jPanel9.getWidth(), jPanel9.getHeight());
        }
    }

   public void loadProjects() {
       List<Project> projects = projectController.getAll();

       projectsModel.clear();
       
       for(int i = 0; i < projects.size(); i++) {
          
           projectsModel.addElement(projects.get(i));
           
       };
       jListProjects.setModel(projectsModel);
       
   };

   
   
   
};