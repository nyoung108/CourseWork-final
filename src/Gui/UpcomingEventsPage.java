/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Objects.eventStringObject;
import java.util.ArrayList;
import libraryFunctions.*;

public class UpcomingEventsPage extends javax.swing.JFrame {

    public static eventStringObject event;
    
    public static eventStringObject getEvent(){
        return event;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBar = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchRequest = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        sortAZ = new javax.swing.JButton();
        sortZA = new javax.swing.JButton();
        sortDate = new javax.swing.JButton();
        eventRequested = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel2.setText("Upcoming Events:");

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        searchButton.setText("Search:");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

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

        jLabel3.setText("Enter event you would like to see:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eventRequested, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(confirm)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(searchRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sortAZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortDate))
                    .addComponent(sortZA))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(sortAZ)
                    .addComponent(sortDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortZA)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(jLabel1)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(eventRequested, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(317, Short.MAX_VALUE))
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

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String eventRequest = new String(eventRequested.getText());
         ArrayList<String> upcomingEvents = new ArrayList<>();
         boolean valid = false;
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        for (int i = 0; i < upcomingEvents.size(); i++) {
            if(upcomingEvents.get(i).equalsIgnoreCase(eventRequest)){
                valid = true;
                break;
            }
        }
        if(valid){
            eventStringObject eventEntered = new eventStringObject(eventRequest, null, null);
            event = eventEntered;
        TicketDetails ticketDetails = new TicketDetails();

        ticketDetails.setVisible(true);
        this.dispose();
        } else{
            System.out.println("This is not a real event");
        }
        
    }//GEN-LAST:event_confirmActionPerformed

    private void sortDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortDateActionPerformed
        String request = "date";
        ArrayList<String> upcomingEvents = new ArrayList<>();
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        libraryFunctions.upcomingEventsSort.mergedList(upcomingEvents, request);
        for (int i = 0; i < upcomingEvents.size(); i++) {
            System.out.println(upcomingEvents.get(i));
        }
    }//GEN-LAST:event_sortDateActionPerformed

    private void sortAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAZActionPerformed
        String request = "az";
        ArrayList<String> upcomingEvents = new ArrayList<>();
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        libraryFunctions.upcomingEventsSort.mergedList(upcomingEvents, request);
        for (int i = 0; i < upcomingEvents.size(); i++) {
            System.out.println(upcomingEvents.get(i));
        }
    }//GEN-LAST:event_sortAZActionPerformed

    private void sortZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortZAActionPerformed
        String sortRequested = "za";
        ArrayList<String> upcomingEvents = new ArrayList<>();
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        upcomingEventsSort.mergedList(upcomingEvents, sortRequested);       
    }//GEN-LAST:event_sortZAActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        ArrayList<String> upcomingEvents = new ArrayList<>();
        upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
        for (int i = 0; i < upcomingEvents.size(); i++) {
            if (!upcomingEvents.get(i).contains(search.getText())) {
                upcomingEvents.remove(i);
            }
        }
        for (int i = 0; i < upcomingEvents.size(); i++) {
            System.out.println(upcomingEvents.get(i));
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    public void toTicketPage() {

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

                UpcomingEventsPage update = new UpcomingEventsPage();
                update.setVisible(true);
                String request = "date";
                ArrayList<String> upcomingEvents = new ArrayList<>();
                upcomingEvents = databaseOrders.getUpcomingEvents(upcomingEvents);
                libraryFunctions.upcomingEventsSort.mergedList(upcomingEvents, request);
                for (int i = 0; i < upcomingEvents.size(); i++) {
                    System.out.println(upcomingEvents.get(i));
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField eventRequested;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchRequest;
    private javax.swing.JButton sortAZ;
    private javax.swing.JButton sortDate;
    private javax.swing.JButton sortZA;
    // End of variables declaration//GEN-END:variables

}
