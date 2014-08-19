/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAL.DisciplinaDAO;
import DAL.MateriaDAO;
import DAL.TesteDAO;
import Model.Disciplina;
import Model.Materia;
import Model.Teste;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author marina.silva
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        loadTestesGrid();
        loadDisciplinasGrid();
        loadMateriasGrid();
        loadDisciplinasCmb();
        loadSerieCmb();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTestes = new javax.swing.JTable();
        btnAddTeste = new javax.swing.JButton();
        btnDeleteTeste = new javax.swing.JButton();
        btnUpdateTeste = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDisciplinas = new javax.swing.JTable();
        btnAddDisciplina = new javax.swing.JButton();
        btnDeletarDisciplina = new javax.swing.JButton();
        btnUpdateDisciplina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        btnAddMateria = new javax.swing.JButton();
        btnDeleteMateria = new javax.swing.JButton();
        btnUpdateMateria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        cmbDisciplina = new javax.swing.JComboBox();
        cmbSerie = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableTestes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Série", "Quantidade de Questões", "Data", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTestes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTestes);
        if (jTableTestes.getColumnModel().getColumnCount() > 0) {
            jTableTestes.getColumnModel().getColumn(0).setResizable(false);
            jTableTestes.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTableTestes.getColumnModel().getColumn(1).setResizable(false);
            jTableTestes.getColumnModel().getColumn(1).setHeaderValue("Série");
            jTableTestes.getColumnModel().getColumn(2).setResizable(false);
            jTableTestes.getColumnModel().getColumn(2).setHeaderValue("Quantidade de Questões");
            jTableTestes.getColumnModel().getColumn(3).setResizable(false);
            jTableTestes.getColumnModel().getColumn(3).setHeaderValue("Data");
            jTableTestes.getColumnModel().getColumn(4).setResizable(false);
            jTableTestes.getColumnModel().getColumn(4).setHeaderValue("ID");
        }

        btnAddTeste.setText("Adicionar");
        btnAddTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTesteActionPerformed(evt);
            }
        });

        btnDeleteTeste.setText("Deletar");
        btnDeleteTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTesteActionPerformed(evt);
            }
        });

        btnUpdateTeste.setText("Editar");
        btnUpdateTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnAddTeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteTeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateTeste)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Testes", jPanel1);

        jTableDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDisciplinasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDisciplinas);
        jTableDisciplinas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableDisciplinas.getColumnModel().getColumnCount() > 0) {
            jTableDisciplinas.getColumnModel().getColumn(0).setResizable(false);
            jTableDisciplinas.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTableDisciplinas.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddDisciplina.setText("Adicionar");
        btnAddDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDisciplinaActionPerformed(evt);
            }
        });

        btnDeletarDisciplina.setText("Deletar");
        btnDeletarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarDisciplinaActionPerformed(evt);
            }
        });

        btnUpdateDisciplina.setText("Editar");
        btnUpdateDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDisciplinaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletarDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddDisciplina)
                            .addComponent(jLabel1)
                            .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletarDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateDisciplina))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Disciplinas", jPanel2);

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Disciplina", "Série"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMaterias.getTableHeader().setReorderingAllowed(false);
        jTableMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMateriasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMaterias);
        if (jTableMaterias.getColumnModel().getColumnCount() > 0) {
            jTableMaterias.getColumnModel().getColumn(0).setResizable(false);
            jTableMaterias.getColumnModel().getColumn(1).setResizable(false);
            jTableMaterias.getColumnModel().getColumn(2).setResizable(false);
            jTableMaterias.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAddMateria.setText("Adicionar");
        btnAddMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMateriaActionPerformed(evt);
            }
        });

        btnDeleteMateria.setText("Deletar");
        btnDeleteMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMateriaActionPerformed(evt);
            }
        });

        btnUpdateMateria.setText("Editar");
        btnUpdateMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMateriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Disciplina:");

        jLabel4.setText("Série:");

        cmbDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSerie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbDisciplina, 0, 131, Short.MAX_VALUE)
                        .addComponent(cmbSerie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMateria)
                    .addComponent(btnDeleteMateria)
                    .addComponent(btnUpdateMateria))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Matérias", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTesteActionPerformed
        AddTesteJFrame addTeste = new AddTesteJFrame();
        addTeste.setLocationRelativeTo(this);
        addTeste.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addTeste.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                //Isso é chamado de classe anonima em Java.
                //Em C# é tal como os eventos, aquele que tu da dois clicks no botão e já cria um metodo.
                //Oque ele fez aqui foi adicionar um evento que sera chamado quando a janela fechar(windowClosing) ha ha ha
                //Não se assuste com a sintaxe, pq eu me assustei quando vi ahuehae. Depois eu te explico melhor ela...
                //Enfim, aqui tu pode chamar o seu update do grid. 
                loadTestesGrid();

            }
        });
        addTeste.setVisible(true);
        /*addTeste.addWindowListener( new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent we) {
         showDialog(f);
         System.exit(0);
         }
         } );*/
    }//GEN-LAST:event_btnAddTesteActionPerformed

    private void btnUpdateTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTesteActionPerformed
        int x, y;
        x = jTableTestes.getSelectedRow();
        TesteDAO teste = new TesteDAO();
        if (x != -1) 
        {            
            Teste t = teste.retrieveByID(Integer.parseInt((String) jTableTestes.getValueAt(x, 0)));
            AddTesteJFrame editTeste = new AddTesteJFrame(t);
            editTeste.setVisible(true);
            editTeste.setTitle("Edição de Teste");
            editTeste.setLocationRelativeTo(this);
            editTeste.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            editTeste.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadTestesGrid();
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Favor selecionar um teste para editar!");
        }

    }//GEN-LAST:event_btnUpdateTesteActionPerformed

    private void btnAddDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDisciplinaActionPerformed
        DisciplinaDAO disciplina = new DisciplinaDAO();
        Disciplina d = new Disciplina();
        try {
            d.setNome(txtDisciplina.getText());
            disciplina.insert(d);
            JOptionPane.showMessageDialog(this, "Disciplina: " + d.getNome() + " inserida com sucesso!");
            loadDisciplinasGrid();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Falha ao inserir a nova disciplina: " + e);
        }
        txtDisciplina.setText("");
    }//GEN-LAST:event_btnAddDisciplinaActionPerformed

    private void btnUpdateDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDisciplinaActionPerformed
        int x, y, z;
        x = jTableDisciplinas.getSelectedRow();
        y = 0;
        z = 1;
        if (x != -1) {
            int id = Integer.parseInt((String) jTableDisciplinas.getValueAt(x, y));
            String d = (String) jTableDisciplinas.getValueAt(x, z);
            Disciplina disciplina = new Disciplina();
            disciplina.setId(id);
            disciplina.setNome(txtDisciplina.getText());
            DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
            try {
                disciplinaDAO.update(disciplina);
                JOptionPane.showMessageDialog(this, "Disciplina editada com sucesso!");
                txtDisciplina.setText("");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Falha ao editar a disciplina: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor selecionar uma disciplina para ser editada.");
        }
        loadDisciplinasGrid();
    }//GEN-LAST:event_btnUpdateDisciplinaActionPerformed

    private void btnDeletarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarDisciplinaActionPerformed
        int x, y;
        x = jTableDisciplinas.getSelectedRow();
        y = 0;

        if (x != -1) {//-1 significa que nenhuma linha da tabela foi selecionada
            int id = Integer.valueOf((String) jTableDisciplinas.getValueAt(x, y));
            DisciplinaDAO disciplina = new DisciplinaDAO();
            try {
                disciplina.delete(id);
                JOptionPane.showMessageDialog(this, "Disciplina deletada com sucesso!");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Falha ao deletar a disciplina: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor selecionar uma disciplina para ser deletada.");
        }

        loadDisciplinasGrid();
    }//GEN-LAST:event_btnDeletarDisciplinaActionPerformed

    private void jTableDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDisciplinasMouseClicked
        int x, y;
        x = jTableDisciplinas.getSelectedRow();
        y = 1;
        txtDisciplina.setText((String) jTableDisciplinas.getValueAt(x, y));
    }//GEN-LAST:event_jTableDisciplinasMouseClicked

    private void btnDeleteTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTesteActionPerformed
        int x, y;
        x = jTableTestes.getSelectedRow();
        y = 4;
        if (x != -1) {
            int id = Integer.parseInt((String) jTableTestes.getValueAt(x, y));
            TesteDAO teste = new TesteDAO();
            try {
                teste.delete(id);
                JOptionPane.showMessageDialog(this, "Teste deletado com sucesso!");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Falha ao deletar o teste: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor selecionar um teste para ser deletado.");
        }
        loadTestesGrid();
    }//GEN-LAST:event_btnDeleteTesteActionPerformed

    private void btnAddMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMateriaActionPerformed
        Materia m = new Materia();
        MateriaDAO materia = new MateriaDAO();
        try {
            m.setNome(txtMateria.getText());
            m.setSerie(cmbSerie.getSelectedIndex());
            m.setidDisciplina(((Disciplina) cmbDisciplina.getSelectedItem()).getId());
            materia.insert(m);
            JOptionPane.showMessageDialog(this, "Matéria inserida com sucesso!");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Falha ao inserir a matéria: " + e);
        }
    }//GEN-LAST:event_btnAddMateriaActionPerformed

    private void btnDeleteMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMateriaActionPerformed
        int x, y;
        x = jTableMaterias.getSelectedRow();
        y = 0;
        int id = Integer.parseInt((String) jTableMaterias.getValueAt(x, y));
        MateriaDAO materia = new MateriaDAO();
        try {
            materia.delete(id);
            JOptionPane.showMessageDialog(this, "Matéria deletada com sucesso!");
            loadMateriasGrid();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Falha ao deletar a matéria: " + e);
        }
    }//GEN-LAST:event_btnDeleteMateriaActionPerformed

    private void btnUpdateMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMateriaActionPerformed
        int x, y;
        x = jTableMaterias.getSelectedRow();
        y = 0;
        int id = Integer.parseInt((String) jTableMaterias.getValueAt(x, y));
        MateriaDAO materia = new MateriaDAO();
        Materia m = new Materia();
        try {
            m.setNome(txtMateria.getText());
            m.setidDisciplina(((Disciplina) cmbDisciplina.getSelectedItem()).getId());
            m.setSerie(cmbSerie.getSelectedIndex()); //VER SE VAI COMEÇAR EM 0 OU EM 1 //COMEÇA SEMPRE EM 0.
            materia.update(m);
            JOptionPane.showMessageDialog(this, "Matéria editada com sucesso!");
            loadMateriasGrid();
            txtMateria.setText("");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Falha ao editar a matéria: " + e);
        }
    }//GEN-LAST:event_btnUpdateMateriaActionPerformed

    private void jTableMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMateriasMouseClicked
        int x, y;
        x = jTableMaterias.getSelectedRow();
        y = 0;
        int id = Integer.parseInt((String) jTableMaterias.getValueAt(x, y));
        MateriaDAO materia = new MateriaDAO();
        Materia m = materia.retrieveById(id);
        txtMateria.setText(m.getNome());
        //cmbDisciplina.setSelectedItem(m.getIdDisciplina());   saporra vai dar muito erro
        //cmbSerie.setSelectedIndex(m.getSerie());  saporra vai dar muito erro [2]
    }//GEN-LAST:event_jTableMateriasMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDisciplina;
    private javax.swing.JButton btnAddMateria;
    private javax.swing.JButton btnAddTeste;
    private javax.swing.JButton btnDeletarDisciplina;
    private javax.swing.JButton btnDeleteMateria;
    private javax.swing.JButton btnDeleteTeste;
    private javax.swing.JButton btnUpdateDisciplina;
    private javax.swing.JButton btnUpdateMateria;
    private javax.swing.JButton btnUpdateTeste;
    private javax.swing.JComboBox cmbDisciplina;
    private javax.swing.JComboBox cmbSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTableDisciplinas;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JTable jTableTestes;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables

    private void loadTestesGrid() {
        TesteDAO t = new TesteDAO();
        ArrayList<Teste> testesList = t.retrieveAll();
        ArrayList<String> columns = new ArrayList<>();
        ArrayList<String[]> values = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        columns.add("ID");
        columns.add("Nome");
        columns.add("Número de Questões");
        columns.add("Data de Geração");
        columns.add("Disciplina");

        testesList.stream().forEach((c) -> {
            values.add(new String[]{String.valueOf(c.getId()), "Teste " + String.valueOf(c.getId()), String.valueOf(c.getNumeroQuestoes()), format.format(c.getDataGeracao().getTime()), String.valueOf(c.getDisciplina().getNome())});
        });

        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray());

        jTableTestes.setModel(tableModel);
        //jTableTestes.getColumnModel().getColumn(0).setMinWidth(0);
        //jTableTestes.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private void loadDisciplinasGrid() {
        DisciplinaDAO disciplina = new DisciplinaDAO();
        ArrayList<Disciplina> disciplinaList = disciplina.retrieveAll();
        ArrayList<String> columns = new ArrayList<>();
        ArrayList<String[]> values = new ArrayList<>();
        columns.add("ID");
        columns.add("Nome");

        disciplinaList.stream().forEach((Disciplina d) -> {
            values.add(new String[]{String.valueOf(d.getId()), d.getNome()});
        });

        TableModel model = new DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray());
        jTableDisciplinas.setModel(model);
    }

    private void loadMateriasGrid() {
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        ArrayList<Disciplina> disciplinas = disciplinaDAO.retrieveAll();
        ArrayList<String> columns = new ArrayList<>();
        ArrayList<String[]> values = new ArrayList<>();
        columns.add("ID");
        columns.add("Nome");
        columns.add("Disciplina");
        columns.add("Série");

        disciplinas.stream().forEach((Disciplina d) -> {
            d.getMateriaList().stream().forEach((m) -> {
                values.add(new String[]{String.valueOf(d.getId()), m.getNome(), String.valueOf(d.getNome()), String.valueOf(m.getSerie())});
            });
        });
        TableModel model = new DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray());
        jTableMaterias.setModel(model);

    }

    private void loadDisciplinasCmb() {
        cmbDisciplina.removeAllItems();
        DisciplinaDAO disciplina = new DisciplinaDAO();
        ArrayList<Disciplina> disciplinaList = disciplina.retrieveAll();
        disciplinaList.stream().forEach((disciplina1) -> {
            cmbDisciplina.addItem(disciplina1);
        });
    }

    private void loadSerieCmb() {
        cmbSerie.removeAllItems();
        cmbSerie.addItem("1ª");
        cmbSerie.addItem("2ª");
    }
}
