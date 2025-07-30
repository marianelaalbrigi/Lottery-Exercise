
package gui;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMes = new javax.swing.JLabel();
        labelNumWinners = new javax.swing.JLabel();
        txtNumWinners = new javax.swing.JTextField();
        btnStartDraw = new javax.swing.JButton();
        cmbMonth = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWinners = new javax.swing.JTable();
        btnRestart = new javax.swing.JButton();
        btnWinnerHistory = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMes.setForeground(new java.awt.Color(102, 102, 102));
        labelMes.setText("Add Month:");

        labelNumWinners.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNumWinners.setForeground(new java.awt.Color(102, 102, 102));
        labelNumWinners.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumWinners.setText("Number of Winners:");
        labelNumWinners.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNumWinners.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumWinners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumWinnersActionPerformed(evt);
            }
        });

        btnStartDraw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStartDraw.setForeground(new java.awt.Color(51, 51, 51));
        btnStartDraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar_16x16.png"))); // NOI18N
        btnStartDraw.setText(" Draw Winner");
        btnStartDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartDrawActionPerformed(evt);
            }
        });

        cmbMonth.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthActionPerformed(evt);
            }
        });

        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(102, 102, 102));
        txtTitle.setText("ENTER INFO TO START DRAW ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNumWinners)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumWinners, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnStartDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtTitle)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMes)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumWinners, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumWinners, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnStartDraw)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("LIST OF WINNERS");

        tableWinners.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableWinners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Position", "Winning ticket"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableWinners);

        btnRestart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(51, 51, 51));
        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnWinnerHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnWinnerHistory.setForeground(new java.awt.Color(51, 51, 51));
        btnWinnerHistory.setText("Winners history");
        btnWinnerHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWinnerHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnWinnerHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestart)
                    .addComponent(btnWinnerHistory))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("MONTHLY LOTTERY");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loteria_64x64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumWinnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumWinnersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumWinnersActionPerformed
    
    int numDraws = 0;
    LinkedHashSet<String> winnerList = new LinkedHashSet<String>();
    int sizeList = winnerList.size(); 
    
    public String getRandomDay(int actualYear, String month){
        Random numRandom = new Random();
        int dayRandom;
        String day;
        
        //Getting a random day depending on the month and converting it to String
        if (month.equals("02")) {
            //Check if the year is a leap year
            if ((actualYear % 4 == 0 && actualYear % 100 != 0) || actualYear % 400 == 0){
                dayRandom=numRandom.nextInt(29)+1;
                day = Integer.toString(dayRandom);
            } else {
                dayRandom=numRandom.nextInt(28)+1;
                day = Integer.toString(dayRandom);
            }
        } else {
            if (month.equals("04") || month.equals("06") || month.equals("09") || month.equals("11")) {
                dayRandom=numRandom.nextInt(30)+1;
                day = Integer.toString(dayRandom);
            } else {
                dayRandom=numRandom.nextInt(31)+1;
                day = Integer.toString(dayRandom);
            }
        }
        return day;
    }
    
    public String addZerosDay (String day, String month){
        String ticketWinner;
        int lengthDay = day.length();
                
        // Format "day" to two digits when it has only one digit (01,02...)
        if (lengthDay == 2) {
            ticketWinner = day + month;
        } else {
            ticketWinner = "0" + day + month;
        }
        return ticketWinner;
    }
    
    public String addZerosTicket (String ticket){
        String ticketWinner;
        int lengthTicket = ticket.length();
        
          // Format "ticket" to 4 digits when it has not 4 digit (0001,0022...)
        if (lengthTicket == 1) {
            ticketWinner = "000" + ticket;    
        } 
        else {
            if (lengthTicket == 2) {
                ticketWinner = "00" + ticket;    
            } 
            else {
                if (lengthTicket == 3) {
                    ticketWinner = "0" + ticket;    
                } 
                else {
                    ticketWinner = ticket; 
                }    
            }
        }
     
        return ticketWinner;
        }
    
    private void btnStartDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartDrawActionPerformed
        
        //get Amount Winners
        if (!txtNumWinners.getText().equals("")){
            int totalWinners = 0;
            int amountWinners;
            amountWinners = Integer.parseInt(txtNumWinners.getText());
            totalWinners = totalWinners + amountWinners;
            
            if (numDraws < amountWinners) {
                //Disabling access to the fill-in fields     
                txtNumWinners.setEnabled(false);
                cmbMonth.setEnabled(false);
                
                // Getting the current year to check if it's a leap year
                LocalDate actualDate = LocalDate.now();
                int actualYear = actualDate.getYear();

                //Getting Month from the Interfaz
                String month;
                month = (String)cmbMonth.getSelectedItem();                                     
                                
                //Generating a random day
                String day = getRandomDay(actualYear, month);      

                //Generating random ticket and converting it to a string
                String ticket;
                Random numRandom = new Random();
                int ticketRandom = numRandom.nextInt(10000)+1;
                ticket = Integer.toString(ticketRandom);    

                //Genearating the Ticket Winner(day+month+ticket)
                String ticketWinner;
                ticketWinner = addZerosDay(day, month) + addZerosTicket(ticket);       
                
                //Add Winners to the table
                DefaultTableModel modelTable = (DefaultTableModel) tableWinners.getModel();
                Object[] objectRow = {amountWinners-numDraws, ticketWinner};
                modelTable.addRow(objectRow);
                
                //Storing winners in array
                winnerList.add(ticketWinner);
                
                if(totalWinners != sizeList) {
                    numDraws++;   
                }
            }          
            if (numDraws >= amountWinners) {
                btnStartDraw.setEnabled(false);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please enter the number of winners.");
        }  
        
    }//GEN-LAST:event_btnStartDrawActionPerformed
    
    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        txtNumWinners.setText("");
        cmbMonth.setSelectedIndex(0);
        
        //Enabling access to the fill-in fields     
        txtNumWinners.setEnabled(true);
        cmbMonth.setEnabled(true);
        
        DefaultTableModel modelTable = (DefaultTableModel) tableWinners.getModel();
       
        modelTable.setRowCount(0);
        numDraws = 0;        
        btnStartDraw.setEnabled(true);
    }//GEN-LAST:event_btnRestartActionPerformed

    private void cmbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMonthActionPerformed

    private void btnWinnerHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWinnerHistoryActionPerformed
        if (winnerList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No winners yet.");
    } else {
        StringBuilder historyText = new StringBuilder();
        int index = 1;
        for (String winner : winnerList) {
            historyText.append("N°" + index++).append(" "+winner).append("\n");
        }
        JOptionPane.showMessageDialog(this, historyText.toString(), "Winners History", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnWinnerHistoryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStartDraw;
    private javax.swing.JButton btnWinnerHistory;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelNumWinners;
    private javax.swing.JTable tableWinners;
    private javax.swing.JTextField txtNumWinners;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
