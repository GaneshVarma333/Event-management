package edu.neu.universityeventmanagementsystem.business.ui.admin.events.view;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EventsView class
 *
 * @author  Raghavan Renganathan <renganathan.r@husky.neu.edu>
 * @version 1.0
 * @since   Apr 21, 2018
 */
@Component
@Lazy
public class EventsView extends javax.swing.JPanel {

    private final static Color ACTIVE_BACKGROUND = new Color(255, 255, 255);
    private final static Color INACTIVE_BACKGROUND = new Color(240, 240, 240);

    private final static Color ACTIVE_FOREGROUND = new Color(0, 0, 0);
    private final static Color INACTIVE_FOREGROUND = new Color(0, 102, 102);

    /** Creates new form EventsView */
    public EventsView() {
        initComponents();
    }

    public List<java.awt.Component> getPanelButtons() {
        return new ArrayList<>(Arrays.asList(btnManage, btnApprovalRequests));
    }

    public java.awt.Component getAddEventButton() {
        return btnAddEvent;
    }

    public void setActiveButton(java.awt.Component activeButton) {
        getPanelButtons().forEach(button -> {
            button.setBackground(INACTIVE_BACKGROUND);
            button.setForeground(INACTIVE_FOREGROUND);
        });
        activeButton.setBackground(ACTIVE_BACKGROUND);
        activeButton.setForeground(ACTIVE_FOREGROUND);
    }

    public void setContent(java.awt.Component component) {
        contentPanel.removeAll();
        contentPanel.add(component);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        btnManage = new javax.swing.JButton();
        btnApprovalRequests = new javax.swing.JButton();
        btnAddEvent = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1116, 700));

        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(722, 65));

        btnManage.setBackground(new java.awt.Color(255, 255, 255));
        btnManage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnManage.setText("Manage");
        btnManage.setBorder(null);
        btnManage.setBorderPainted(false);
        btnManage.setContentAreaFilled(false);
        btnManage.setFocusPainted(false);
        btnManage.setOpaque(true);

        btnApprovalRequests.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnApprovalRequests.setForeground(new java.awt.Color(0, 102, 102));
        btnApprovalRequests.setText("Approval Requests");
        btnApprovalRequests.setBorder(null);
        btnApprovalRequests.setBorderPainted(false);
        btnApprovalRequests.setContentAreaFilled(false);
        btnApprovalRequests.setFocusPainted(false);
        btnApprovalRequests.setOpaque(true);

        btnAddEvent.setBackground(new java.awt.Color(0, 102, 102));
        btnAddEvent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEvent.setText("Add New Event");
        btnAddEvent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAddEvent.setBorderPainted(false);
        btnAddEvent.setContentAreaFilled(false);
        btnAddEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEvent.setFocusPainted(false);
        btnAddEvent.setMaximumSize(new java.awt.Dimension(360, 40));
        btnAddEvent.setOpaque(true);
        btnAddEvent.setPreferredSize(new java.awt.Dimension(360, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApprovalRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 722, Short.MAX_VALUE)
                .addComponent(btnAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApprovalRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEvent;
    private javax.swing.JButton btnApprovalRequests;
    private javax.swing.JButton btnManage;
    private javax.swing.JPanel contentPanel;
    // End of variables declaration//GEN-END:variables

}
