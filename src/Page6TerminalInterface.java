
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHBUB
 */
public class Page6TerminalInterface extends javax.swing.JFrame {
    
    Connection conn=null;
    Connection newconn2=null;
    Connection newconn3=null;
    Connection newconn4=null;
    Connection newconn5=null;
    Connection newconn6=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Connection newconn=null;
    ResultSet rs1=null;
    PreparedStatement pst1=null;
    ResultSet rs_La=null;
    PreparedStatement pst_La=null;
    ResultSet rs_Fd=null;
    PreparedStatement pst_Fd=null;
    PreparedStatement pst_Trans=null;
    PreparedStatement pst5=null;
    public void close(){
         
         WindowEvent winClosing= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
        }

    /**
     * Creates new form Page6TerminalInterface
     */
    public Page6TerminalInterface() {
        initComponents();
        conn=dataBaseConnect.connectdb();
        newconn=dataBaseConnect.connectdb();
        newconn2=dataBaseConnect.connectdb();
        newconn3=dataBaseConnect.connectdb();
        newconn4=dataBaseConnect.connectdb();
        newconn5=dataBaseConnect.connectdb();
        newconn6=dataBaseConnect.connectdb();
        //routesetShow();
    }
    
    public void terminalhistoryShow(){
        try {
            String sqlL="Select CardNumber,Activity from Terminal where TerminalName=?";
            pst=conn.prepareStatement(sqlL);
            pst.setString(1, TerminalName_Terminal.getText());
            rs=pst.executeQuery();
            ShowTerminaHistory.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public void routesetShow(){
        try {
            String sql1="Select BusName,Start,T2,T3,T4,End from RouteSet where Start=? or T2=? or T3=? or T4=? or End=?";
            pst=conn.prepareStatement(sql1);
            pst.setString(1, TerminalName_Terminal.getText());
            pst.setString(2, TerminalName_Terminal.getText());
            pst.setString(3, TerminalName_Terminal.getText());
            pst.setString(4, TerminalName_Terminal.getText());
            pst.setString(5, TerminalName_Terminal.getText());
            rs=pst.executeQuery();
            showBusRoute.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
	finally{
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    public void insertinto(String terminal,String card){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jSpinner1 = new javax.swing.JSpinner();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TerminalName_Terminal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CardNumber_TerminalName = new javax.swing.JTextField();
        Departure_Activity = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Arrive_activity = new javax.swing.JRadioButton();
        TerminalActivityOK = new javax.swing.JButton();
        RouteChange_Activity = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowTerminaHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        showBusRoute = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jFormattedTextField1.setText("jFormattedTextField1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        TerminalName_Terminal.setEditable(false);
        TerminalName_Terminal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TerminalName_Terminal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TerminalName_Terminal.setText("Terminal Name");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CardNumber_TerminalName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonGroup1.add(Departure_Activity);
        Departure_Activity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Departure_Activity.setText("Departure");
        Departure_Activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Departure_ActivityActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Your Activity:");

        buttonGroup1.add(Arrive_activity);
        Arrive_activity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Arrive_activity.setText("Arrive");
        Arrive_activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arrive_activityActionPerformed(evt);
            }
        });

        TerminalActivityOK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TerminalActivityOK.setText("OK");
        TerminalActivityOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminalActivityOKActionPerformed(evt);
            }
        });

        buttonGroup1.add(RouteChange_Activity);
        RouteChange_Activity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RouteChange_Activity.setText("Route Change");
        RouteChange_Activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteChange_ActivityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Your Card:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Arrive_activity)
                        .addGap(26, 26, 26)
                        .addComponent(RouteChange_Activity)
                        .addGap(18, 18, 18)
                        .addComponent(Departure_Activity))
                    .addComponent(CardNumber_TerminalName, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(TerminalActivityOK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RouteChange_Activity)
                            .addComponent(Arrive_activity)
                            .addComponent(Departure_Activity)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TerminalActivityOK))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CardNumber_TerminalName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null"
            }
        ));
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Upcoming Buses & Available Seat");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        ShowTerminaHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ShowTerminaHistory.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ShowTerminaHistory);
        if (ShowTerminaHistory.getColumnModel().getColumnCount() > 0) {
            ShowTerminaHistory.getColumnModel().getColumn(0).setResizable(false);
            ShowTerminaHistory.getColumnModel().getColumn(0).setPreferredWidth(15);
            ShowTerminaHistory.getColumnModel().getColumn(1).setResizable(false);
            ShowTerminaHistory.getColumnModel().getColumn(1).setPreferredWidth(45);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Terminal History");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(163, 163, 163))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        showBusRoute.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showBusRoute.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(showBusRoute);
        if (showBusRoute.getColumnModel().getColumnCount() > 0) {
            showBusRoute.getColumnModel().getColumn(0).setResizable(false);
            showBusRoute.getColumnModel().getColumn(0).setPreferredWidth(15);
            showBusRoute.getColumnModel().getColumn(1).setResizable(false);
            showBusRoute.getColumnModel().getColumn(1).setPreferredWidth(45);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Todays Bus Route");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(TerminalName_Terminal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TerminalName_Terminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        close();
        Page1Front dis=new Page1Front();
        dis.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TerminalActivityOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminalActivityOKActionPerformed
        // TODO add your handling code here:
        String givencardNumber=CardNumber_TerminalName.getText();
        String TerminalName=TerminalName_Terminal.getText();
        String realcardNumber="";
        
        
        
        String sql="select * from Register where CardNumber=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, givencardNumber);
            rs=pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Card Number Entered");
                realcardNumber=rs.getString("CardNumber");
                pst.close();
                rs.close();
                try {
                String sql1="Insert into Terminal(TerminalName,CardNumber,Activity) values (?,?,?)";
                pst1=newconn.prepareStatement(sql1);
                pst1.setString(1, TerminalName);
                pst1.setString(2, realcardNumber);
                //JOptionPane.showMessageDialog(null, activity);
                pst1.setString(3, activity);
                pst1.execute();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                pst1.close();
                //rs1.close();
                //insertinto(TerminalName, cardNumber);
                
                String from="";
                String pay="";
                String La="select * from LastArrive where CardNumber=?";
                try {
                    pst_La=newconn2.prepareStatement(La);
                    pst_La.setString(1, realcardNumber);
                    rs_La=pst_La.executeQuery();
                    if (rs_La.next()) {
                     from=rs_La.getString("Terminal");
                    // JOptionPane.showMessageDialog(null, "Last Arrive from "+from);
                    }
                    else{
                      JOptionPane.showMessageDialog(null, "Data Does not exist");  
                    }
                     } catch (Exception e) {
                      JOptionPane.showMessageDialog(null, e);
                    }
                pst_La.close();
                rs_La.close();
                
                String Fd="select * from FareDefine where Start=? and End=?";
                
                try {
                    pst_Fd=newconn3.prepareStatement(Fd);
                    pst_Fd.setString(1, from);
                    pst_Fd.setString(2, TerminalName);
                    rs_Fd=pst_Fd.executeQuery();
                    if (rs_Fd.next()) {
                     pay=rs_Fd.getString("Fare");
                     //JOptionPane.showMessageDialog(null, "Fare "+pay);
                    }
                    else{
                        if (activity.equals("Arrive")) {
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Does not exist");
                        }
                        
                    }
                     } catch (Exception e) {
                      JOptionPane.showMessageDialog(null, "Fare define "+e);
                    }
                pst_Fd.close();
                rs_Fd.close();
                
                if (activity.equals("Departure")) {
                    
                    String trans="Insert into History(TerminalName,CardNumber,Paid) values (?,?,?)";
        try {
            pst_Trans=newconn4.prepareStatement(trans);
            pst_Trans.setString(1, from+" To "+TerminalName);
            pst_Trans.setString(2, realcardNumber);
            pst_Trans.setString(3, pay);
            pst_Trans.execute();
            //JOptionPane.showMessageDialog(null, from+" to "+TerminalName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        pst_Trans.close();
                    
                    String LADB="Update LastArrive set Terminal='"+"NO"+"' where CardNumber='"+realcardNumber+"'";
                    try {
                    pst=newconn5.prepareStatement(LADB);
                    pst.execute();
                    } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    }
                    pst.close();
                }
               else if (activity.equals("Route Change")) {
                   String sql5="Insert into History(TerminalName,CardNumber,Paid) values (?,?,?)";
                    try {
                    pst5=newconn6.prepareStatement(sql5);
                    pst5.setString(1, from+" To "+TerminalName);
                    pst5.setString(2, realcardNumber);
                    pst5.setString(3, pay);
                    pst5.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    pst5.close();
                    
                    try {
                    String LADB="Update LastArrive set Terminal='"+TerminalName+"' where CardNumber='"+realcardNumber+"'";
                    pst=conn.prepareStatement(LADB);
                    pst.execute();
                    } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    }
                    pst.close();
                }
                else{
                  try {
                    String LADB="Update LastArrive set Terminal='"+TerminalName+"' where CardNumber='"+realcardNumber+"'";
                    pst=conn.prepareStatement(LADB);
                    pst.execute();
                    } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    }
                }
                pst.close();
            }
            else{
             JOptionPane.showMessageDialog(null, "Card Number Does not Exist");  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
            }
        }
        terminalhistoryShow();
    }//GEN-LAST:event_TerminalActivityOKActionPerformed

    private void Arrive_activityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Arrive_activityActionPerformed
        // TODO add your handling code here:
        activity="Arrive";
    }//GEN-LAST:event_Arrive_activityActionPerformed

    private void RouteChange_ActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteChange_ActivityActionPerformed
        // TODO add your handling code here:
        activity="Route Change";
    }//GEN-LAST:event_RouteChange_ActivityActionPerformed

    private void Departure_ActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Departure_ActivityActionPerformed
        // TODO add your handling code here:
        activity="Departure";
    }//GEN-LAST:event_Departure_ActivityActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Page6TerminalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page6TerminalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page6TerminalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page6TerminalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page6TerminalInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Arrive_activity;
    private javax.swing.JTextField CardNumber_TerminalName;
    private javax.swing.JRadioButton Departure_Activity;
    private javax.swing.JRadioButton RouteChange_Activity;
    private javax.swing.JTable ShowTerminaHistory;
    private javax.swing.JButton TerminalActivityOK;
    public static javax.swing.JTextField TerminalName_Terminal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable showBusRoute;
    // End of variables declaration//GEN-END:variables
    private String activity;
}
