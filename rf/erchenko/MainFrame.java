/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf.erchenko;

import java.awt.*;
import java.lang.Object;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

class MainFrame extends JFrame {
    protected javax.swing.JTable jTable1;
    private javax.swing.JMenu jAbout;
    private javax.swing.JMenuItem jContractsJournal;
    private javax.swing.JMenuItem jInvoicesJournal;
    private javax.swing.JMenu jJournalsMenu;
    private javax.swing.JMenu jSettling;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jNewBooking;
    private javax.swing.JMenuItem jNewAdditionalAgreement;
    private javax.swing.JMenuItem jNewContract;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jReceiptsJournal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jSettings;
    private javax.swing.JMenuBar menuBar;
    public static Object[][] strArr = new Object[Hotel.hrs.colsCount][Hotel.hrs.rowsCount];

    public MainFrame() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();

        Hotel.hrs.prepareStrArr();

        jTable1.getTableHeader().setDefaultRenderer(new HeaderRenderer(jTable1));
        jTable1.setDefaultRenderer(Object.class, new MyCellRenderer());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        jSettling = new javax.swing.JMenu();
        jNewBooking = new javax.swing.JMenuItem();
        jNewContract = new javax.swing.JMenuItem();
        jNewAdditionalAgreement = new javax.swing.JMenuItem();
        jJournalsMenu = new javax.swing.JMenu();
        jReceiptsJournal = new javax.swing.JMenuItem();
        jInvoicesJournal = new javax.swing.JMenuItem();
        jContractsJournal = new javax.swing.JMenuItem();
        jSettings = new javax.swing.JMenu();
        //jAbout = new javax.swing.JMenu();

        jMenuItem1.setText("Бронирование");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Заселение");
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Допсоглашение");
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Hotel.getVersion());

        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName(""); // NOI18N


        jTable1.setBackground(java.awt.SystemColor.controlHighlight);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DateTimeUtils dtu = new DateTimeUtils();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            },
            new String [] {"Номера", dtu.addHeaderDateToStr(-1), dtu.addHeaderDateToStr(0), dtu.addHeaderDateToStr(1), dtu.addHeaderDateToStr(2), dtu.addHeaderDateToStr(3), dtu.addHeaderDateToStr(4), dtu.addHeaderDateToStr(5), dtu.addHeaderDateToStr(6),
                    dtu.addHeaderDateToStr(7), dtu.addHeaderDateToStr(8), dtu.addHeaderDateToStr(9), dtu.addHeaderDateToStr(10), dtu.addHeaderDateToStr(11), dtu.addHeaderDateToStr(12), dtu.addHeaderDateToStr(13)}
        ) {
            boolean[] canEdit = new boolean [] {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setFillsViewportHeight(true);
        jTable1.setInheritsPopupMenu(true);
        jTable1.setRowHeight(40);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jSettling.setText("   Заселение   ");
        jSettling.setActionCommand("jSettling");

        jNewBooking.setText("Новое бронирование");
        //jNewBooking.setActionCommand("jAddNewBooking");
        jNewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewBookingActionPerformed(evt);
            }
        });
        jSettling.add(jNewBooking);

        jNewContract.setText("Новый договор");
        //jNewContract.setActionCommand("jAddNewContract");
        jNewContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewContractActionPerformed(evt);
            }
        });
        jSettling.add(jNewContract);

        jNewAdditionalAgreement.setText("Новое допсоглашение");
        //jNewContract.setActionCommand("jAddNewAdditionalAgreemen");
        jNewAdditionalAgreement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewAdditionalAgreementActionPerformed(evt);
            }
        });
        jSettling.add(jNewAdditionalAgreement);

        menuBar.add(jSettling);

        jJournalsMenu.setText("   Журналы   ");

        jReceiptsJournal.setText("ReceiptsJournal");
        jReceiptsJournal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReceiptsJournalActionPerformed(evt);
            }
        });
        jJournalsMenu.add(jReceiptsJournal);

        jInvoicesJournal.setText("InvoicesJournal");
        jInvoicesJournal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInvoicesJournalActionPerformed(evt);
            }
        });
        jJournalsMenu.add(jInvoicesJournal);

        jContractsJournal.setText("ContractsJournal");
        jContractsJournal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContractsJournalActionPerformed(evt);
            }
        });
        jJournalsMenu.add(jContractsJournal);

        menuBar.add(jJournalsMenu);

        jSettings.setText("   Настройки   ");
        //jSettings.setActionCommand("jSettings");
        jSettings.addMenuListener(new MyMenuListener());
        menuBar.add(jSettings);

        //jAbout.setText("О программе");
        //jAbout.setActionCommand("jAbout");
        //menuBar.add(jAbout);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        jScrollPane1.setMinimumSize(new Dimension(700,400));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private class HeaderRenderer implements TableCellRenderer {
        DefaultTableCellRenderer renderer;

        public HeaderRenderer(JTable table) {
            renderer = (DefaultTableCellRenderer)
            table.getTableHeader().getDefaultRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
            return renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        }
    }

    private class MyCellRenderer extends JTextField implements TableCellRenderer {
        private Font fnt = new Font("Tahoma", 0, 11);

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Booking booking;
            Contract contract;
            AdditionalAgreement additionalAgreement;

            setHorizontalAlignment(SwingConstants.CENTER);
            if (column == 0) {
                setBackground(Color.lightGray);
                setForeground(Color.black);
                setFont(fnt.deriveFont(Font.BOLD + Font.ITALIC));
                setText(strArr[0][row].toString());
                return this;
            } else if (strArr[column][row] != null) {
               setToolTipText("<html>");
               for (Object object : (ArrayList<Object>)strArr[column][row]) {
                if (object.getClass().toString().equals("class rf.erchenko.Booking")) {
                    booking = (Booking) object;
                    //System.out.println("[column]="+column+"[row]="+row+" "+getToolTipText() + " " + table.getToolTipText());
                    setToolTipText(( table.getValueAt(row,column) == null ? "<html>" : table.getToolTipText() ) + booking.getToolTipString());
                    setBackground(Color.yellow);
                    setForeground(Color.black);
                    setBorder(null);
                    setFont(fnt.deriveFont(Font.BOLD));
                    setText(" Бронь");
                }
                if (object.getClass().toString().equals("class rf.erchenko.Contract")) {
                    contract = (Contract) object;
                    //System.out.println("[column]="+column+"[row]="+row+" "+getToolTipText());
                    setToolTipText(getToolTipText() + contract.getToolTipString());
                    setBackground(Color.red);
                    setForeground(Color.white);
                    setBorder(null);
                    setFont(fnt.deriveFont(Font.BOLD));
                    setText(" Занят");
                }
                if (object.getClass().toString().equals("class rf.erchenko.AdditionalAgreement")) {
                    additionalAgreement = (AdditionalAgreement) object;
                    //System.out.println("[column]="+column+"[row]="+row+" "+getToolTipText());
                    setToolTipText(getToolTipText() + additionalAgreement.getToolTipString());
                    setBackground(Color.orange);
                    setForeground(Color.black);
                    setBorder(null);
                    setFont(fnt.deriveFont(Font.BOLD));
                    setText(" Занят");
                }
               }
               return this;
            } else if (column == 2) {
                setBackground(Color.green);
                setForeground(Color.black);
                setFont(fnt.deriveFont(Font.BOLD&~Font.ITALIC));
                setText(" ");
                return this;
            } else {
                setBackground(Color.white);
                setForeground(Color.black);
                setBorder(null);
                setText(" ");
                return this;
            }
        }
    }    

    private void jInvoicesJournalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInvoicesJournalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInvoicesJournalActionPerformed

    private void jReceiptsJournalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReceiptsJournalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReceiptsJournalActionPerformed

    private void jContractsJournalActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jNewBookingActionPerformed(java.awt.event.ActionEvent evt) {
        NewBookingDialog.main();
    }

    private void jNewContractActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jNewAdditionalAgreementActionPerformed(java.awt.event.ActionEvent evt) {
    }


    /**
     * @param args the command line arguments
     */
    public static void runMainFrame() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Hotel.mframe = new MainFrame();
                Hotel.mframe.setExtendedState(MainFrame.MAXIMIZED_BOTH);
                Hotel.mframe.setVisible(true);
            }
        });
    }
}