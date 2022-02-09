/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import libraryFunctions.*;

public class UpcomingEventsPage extends javax.swing.JFrame {
    
    
    public ArrayList<String> upcomingEvents;
    
    public UpcomingEventsPage() {
        initComponents();
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
                for (int i = 0; i < upcomingEvents.size(); i++) {
                    if(!upcomingEvents.get(i).contains(search.getText())){
                        upcomingEvents.remove(i);
                    }
                }
                for (int i = 0; i < upcomingEvents.size(); i++) {
                    System.out.println(upcomingEvents.get(i));
                }
            }
        }
        );
        
    }
    
    @SuppressWarnings("unchecked")
    DefaultListModel model = new DefaultListModel();
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBar = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchRequest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventsList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        sortAZ = new javax.swing.JButton();
        sortZA = new javax.swing.JButton();
        sortDate = new javax.swing.JButton();

        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Upcoming Events");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchButton.setText("Search:");

        jScrollPane2.setViewportView(eventsList);

        sortAZ.setText("Sort A-Z");
        sortAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAZActionPerformed(evt);
            }
        });

        sortZA.setText("Sort Z-A");
        sortZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortZAActionPerformed(evt);
            }
        });

        sortDate.setText("Sort by date");
        sortDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(search)
                                        .addGap(25, 25, 25))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel2)))
                                .addGap(62, 62, 62)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(searchRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sortAZ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sortDate))
                            .addComponent(sortZA))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(sortAZ)
                            .addComponent(sortDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortZA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchButton)
                                .addComponent(jLabel1)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        
            
        
    }//GEN-LAST:event_searchBarActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        
        HomePage home = new HomePage();
                home.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       TicketDetails ticketDetails = new TicketDetails();
        
        ticketDetails.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sortDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortDateActionPerformed
        String request = "date";
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        libraryFunctions.upcomingEventsSort.mergedList(upcomingEvents, request);
    }//GEN-LAST:event_sortDateActionPerformed

    private void sortAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAZActionPerformed
        String request = "az";
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        libraryFunctions.upcomingEventsSort.mergedList(upcomingEvents, request);
        
    }//GEN-LAST:event_sortAZActionPerformed
    
    private void sortZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortZAActionPerformed
        String sortRequested = "za";
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        upcomingEvents = upcomingEventsSort.mergedList(upcomingEvents, sortRequested);
        
    }//GEN-LAST:event_sortZAActionPerformed
    public void toTicketPage() {
        
        
    }

    public void updateList() {
        
        for (int i = 0; i < upcomingEvents.size(); i++) {
            model.addElement(upcomingEvents.get(i));            
            eventsList.setModel(model);
        }
    }

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
            java.util.logging.Logger.getLogger(UpcomingEventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpcomingEventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpcomingEventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpcomingEventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //databaseOrders.addToStack("upcomingEvent");
                UpcomingEventsPage update = new UpcomingEventsPage();
                
                update.setVisible(true);
               update.repaint();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JList<String> eventsList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchRequest;
    private javax.swing.JButton sortAZ;
    private javax.swing.JButton sortDate;
    private javax.swing.JButton sortZA;
    // End of variables declaration//GEN-END:variables

}
