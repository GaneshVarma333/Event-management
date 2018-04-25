package edu.neu.universityeventmanagementsystem.business.ui.users.schedule.view;

import edu.neu.universityeventmanagementsystem.business.ui.shared.view.EventView;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * SchedulePanelView class
 *
 * @author  Raghavan Renganathan <renganathan.r@husky.neu.edu>
 * @version 1.0
 * @since   Apr 19, 2018
 */
@Component
@Lazy
public final class SchedulePanelView extends javax.swing.JPanel {

    public static final int UPCOMING_EVENTS_PANE = 0;
    public static final int PAST_EVENTS_PANE = 1;
    public static final int INVITES_PANE = 2;
    public static final int HOSTED_EVENTS_PANE = 3;
    public static final int[] ALL_PANES = {0, 1, 2, 3};


    /** Creates new form EventsPanelView */
    public SchedulePanelView() {
        initComponents();
    }

    public void addToPanel(java.awt.Component component, int panelIndex) {
        switch (panelIndex) {
            case UPCOMING_EVENTS_PANE:
                lblNoUpcomingEvents.setVisible(false);
                upcomingEventsContentPane.add(component);
                break;
            case PAST_EVENTS_PANE:
                lblNoPastEvents.setVisible(false);
                pastEventsContentPane.add(component);
                break;
            case INVITES_PANE:
                lblNoInvites.setVisible(false);
                invitesContentPane.add(component);
                break;
            case HOSTED_EVENTS_PANE:
                lblNoHostedEvents.setVisible(false);
                hostedEventsContentPane.add(component);
                break;
        }
    }

    private void resetPanel(JPanel panel) {
        for (java.awt.Component comp : panel.getComponents()) {
            if (comp instanceof EventView)
                panel.remove(comp);
        }
        panel.revalidate();
        panel.repaint();
        java.awt.Component comp = panel.getComponent(0);
        if (comp instanceof JLabel)
            comp.setVisible(true);
        panel.revalidate();
        panel.repaint();
    }

    public void resetPanel(int panelIndex) {
        switch (panelIndex) {
            case UPCOMING_EVENTS_PANE:
                resetPanel(upcomingEventsContentPane);
                break;
            case PAST_EVENTS_PANE:
                resetPanel(pastEventsContentPane);
                break;
            case INVITES_PANE:
                resetPanel(invitesContentPane);
                break;
            case HOSTED_EVENTS_PANE:
                resetPanel(hostedEventsContentPane);
        }
    }

    public void resetPanels(int[] panelIndices) {
        for (int panelIndex : panelIndices)
            resetPanel(panelIndex);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollPane mainContainerPanel = new javax.swing.JScrollPane();
        javax.swing.JPanel mainScrollPane = new javax.swing.JPanel();
        javax.swing.JPanel upcominEventsOuterPanel = new javax.swing.JPanel();
        javax.swing.JPanel upcomingEventLabelContainer = new javax.swing.JPanel();
        javax.swing.JLabel lblUpcomingEvents = new javax.swing.JLabel();
        javax.swing.JPanel upcomingEventContentContainer = new javax.swing.JPanel();
        javax.swing.JScrollPane upcomingEventScrollPane = new javax.swing.JScrollPane();
        upcomingEventsContentPane = new javax.swing.JPanel();
        lblNoUpcomingEvents = new javax.swing.JLabel();
        javax.swing.JPanel invitesOuterPanel = new javax.swing.JPanel();
        javax.swing.JPanel invitesLabelContainer = new javax.swing.JPanel();
        javax.swing.JLabel lblInvites = new javax.swing.JLabel();
        javax.swing.JPanel invitesContentContainer = new javax.swing.JPanel();
        javax.swing.JScrollPane invitesScrollPane = new javax.swing.JScrollPane();
        invitesContentPane = new javax.swing.JPanel();
        lblNoInvites = new javax.swing.JLabel();
        javax.swing.JPanel pastEventsOuterPanel = new javax.swing.JPanel();
        javax.swing.JPanel pastEventsLabelContainer = new javax.swing.JPanel();
        javax.swing.JLabel lblPastEvents = new javax.swing.JLabel();
        javax.swing.JPanel pastEventsContentContainer = new javax.swing.JPanel();
        javax.swing.JScrollPane pastEventsScrollPane = new javax.swing.JScrollPane();
        pastEventsContentPane = new javax.swing.JPanel();
        lblNoPastEvents = new javax.swing.JLabel();
        javax.swing.JPanel hostedEventsOuterPanel = new javax.swing.JPanel();
        javax.swing.JPanel hostedEventsLabelContainer = new javax.swing.JPanel();
        javax.swing.JLabel lblHostedEvents = new javax.swing.JLabel();
        javax.swing.JPanel hostedEventContentContainer = new javax.swing.JPanel();
        javax.swing.JScrollPane hostedEventsScrollPane = new javax.swing.JScrollPane();
        hostedEventsContentPane = new javax.swing.JPanel();
        lblNoHostedEvents = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1116, 700));

        mainContainerPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainContainerPanel.setBorder(null);
        mainContainerPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainContainerPanel.setAutoscrolls(true);
        mainContainerPanel.setOpaque(false);
        mainContainerPanel.setPreferredSize(new java.awt.Dimension(1066, 700));
        mainContainerPanel.getVerticalScrollBar().setUnitIncrement(10);

        mainScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        upcominEventsOuterPanel.setBackground(new java.awt.Color(255, 255, 255));
        upcominEventsOuterPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        upcominEventsOuterPanel.setPreferredSize(new java.awt.Dimension(510, 354));
        upcominEventsOuterPanel.setLayout(new java.awt.BorderLayout());

        upcomingEventLabelContainer.setPreferredSize(new java.awt.Dimension(480, 50));

        lblUpcomingEvents.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblUpcomingEvents.setText("Upcoming Events");

        javax.swing.GroupLayout upcomingEventLabelContainerLayout = new javax.swing.GroupLayout(upcomingEventLabelContainer);
        upcomingEventLabelContainer.setLayout(upcomingEventLabelContainerLayout);
        upcomingEventLabelContainerLayout.setHorizontalGroup(
            upcomingEventLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingEventLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpcomingEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upcomingEventLabelContainerLayout.setVerticalGroup(
            upcomingEventLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingEventLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpcomingEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        upcominEventsOuterPanel.add(upcomingEventLabelContainer, java.awt.BorderLayout.PAGE_START);

        upcomingEventContentContainer.setBackground(new java.awt.Color(255, 255, 255));
        upcomingEventContentContainer.setPreferredSize(new java.awt.Dimension(480, 300));

        upcomingEventScrollPane.setBorder(null);
        upcomingEventScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        upcomingEventScrollPane.setHorizontalScrollBar(null);
        upcomingEventScrollPane.setMaximumSize(new java.awt.Dimension(480, 300));
        upcomingEventScrollPane.setMinimumSize(new java.awt.Dimension(480, 300));
        upcomingEventScrollPane.getVerticalScrollBar().setUnitIncrement(10);

        upcomingEventsContentPane.setBackground(new java.awt.Color(255, 255, 255));
        upcomingEventsContentPane.setLayout(new javax.swing.BoxLayout(upcomingEventsContentPane, javax.swing.BoxLayout.Y_AXIS));

        lblNoUpcomingEvents.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNoUpcomingEvents.setForeground(new java.awt.Color(153, 153, 153));
        lblNoUpcomingEvents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoUpcomingEvents.setText("No upcoming events.");
        lblNoUpcomingEvents.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        upcomingEventsContentPane.add(lblNoUpcomingEvents);

        upcomingEventScrollPane.setViewportView(upcomingEventsContentPane);

        javax.swing.GroupLayout upcomingEventContentContainerLayout = new javax.swing.GroupLayout(upcomingEventContentContainer);
        upcomingEventContentContainer.setLayout(upcomingEventContentContainerLayout);
        upcomingEventContentContainerLayout.setHorizontalGroup(
            upcomingEventContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(upcomingEventContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(upcomingEventScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upcomingEventContentContainerLayout.setVerticalGroup(
            upcomingEventContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(upcomingEventContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(upcomingEventScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        upcominEventsOuterPanel.add(upcomingEventContentContainer, java.awt.BorderLayout.CENTER);

        invitesOuterPanel.setBackground(new java.awt.Color(255, 255, 255));
        invitesOuterPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        invitesOuterPanel.setPreferredSize(new java.awt.Dimension(510, 354));
        invitesOuterPanel.setLayout(new java.awt.BorderLayout());

        invitesLabelContainer.setPreferredSize(new java.awt.Dimension(480, 50));

        lblInvites.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblInvites.setText("Invites");

        javax.swing.GroupLayout invitesLabelContainerLayout = new javax.swing.GroupLayout(invitesLabelContainer);
        invitesLabelContainer.setLayout(invitesLabelContainerLayout);
        invitesLabelContainerLayout.setHorizontalGroup(
            invitesLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invitesLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInvites)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        invitesLabelContainerLayout.setVerticalGroup(
            invitesLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invitesLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInvites)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invitesOuterPanel.add(invitesLabelContainer, java.awt.BorderLayout.PAGE_START);

        invitesContentContainer.setPreferredSize(new java.awt.Dimension(480, 300));

        invitesScrollPane.setBorder(null);
        invitesScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        invitesScrollPane.getVerticalScrollBar().setUnitIncrement(10);

        invitesContentPane.setBackground(new java.awt.Color(255, 255, 255));
        invitesContentPane.setPreferredSize(new java.awt.Dimension(91, 300));
        invitesContentPane.setLayout(new javax.swing.BoxLayout(invitesContentPane, javax.swing.BoxLayout.Y_AXIS));

        lblNoInvites.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNoInvites.setForeground(new java.awt.Color(153, 153, 153));
        lblNoInvites.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoInvites.setText("No invites.");
        invitesContentPane.add(lblNoInvites);

        invitesScrollPane.setViewportView(invitesContentPane);

        javax.swing.GroupLayout invitesContentContainerLayout = new javax.swing.GroupLayout(invitesContentContainer);
        invitesContentContainer.setLayout(invitesContentContainerLayout);
        invitesContentContainerLayout.setHorizontalGroup(
            invitesContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invitesContentContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(invitesScrollPane)
                .addGap(0, 0, 0))
        );
        invitesContentContainerLayout.setVerticalGroup(
            invitesContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invitesContentContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(invitesScrollPane)
                .addGap(0, 0, 0))
        );

        invitesOuterPanel.add(invitesContentContainer, java.awt.BorderLayout.CENTER);

        pastEventsOuterPanel.setBackground(new java.awt.Color(255, 255, 255));
        pastEventsOuterPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        pastEventsOuterPanel.setPreferredSize(new java.awt.Dimension(510, 354));
        pastEventsOuterPanel.setLayout(new java.awt.BorderLayout());

        pastEventsLabelContainer.setPreferredSize(new java.awt.Dimension(100, 50));

        lblPastEvents.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPastEvents.setText("Past Events");

        javax.swing.GroupLayout pastEventsLabelContainerLayout = new javax.swing.GroupLayout(pastEventsLabelContainer);
        pastEventsLabelContainer.setLayout(pastEventsLabelContainerLayout);
        pastEventsLabelContainerLayout.setHorizontalGroup(
            pastEventsLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastEventsLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPastEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pastEventsLabelContainerLayout.setVerticalGroup(
            pastEventsLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastEventsLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPastEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pastEventsOuterPanel.add(pastEventsLabelContainer, java.awt.BorderLayout.PAGE_START);

        pastEventsScrollPane.setBorder(null);
        pastEventsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pastEventsScrollPane.getVerticalScrollBar().setUnitIncrement(10);

        pastEventsContentPane.setBackground(new java.awt.Color(255, 255, 255));
        pastEventsContentPane.setLayout(new javax.swing.BoxLayout(pastEventsContentPane, javax.swing.BoxLayout.Y_AXIS));

        lblNoPastEvents.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNoPastEvents.setForeground(new java.awt.Color(153, 153, 153));
        lblNoPastEvents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoPastEvents.setText("No past events.");
        pastEventsContentPane.add(lblNoPastEvents);

        pastEventsScrollPane.setViewportView(pastEventsContentPane);

        javax.swing.GroupLayout pastEventsContentContainerLayout = new javax.swing.GroupLayout(pastEventsContentContainer);
        pastEventsContentContainer.setLayout(pastEventsContentContainerLayout);
        pastEventsContentContainerLayout.setHorizontalGroup(
            pastEventsContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastEventsContentContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pastEventsScrollPane)
                .addGap(0, 0, 0))
        );
        pastEventsContentContainerLayout.setVerticalGroup(
            pastEventsContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastEventsContentContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pastEventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pastEventsOuterPanel.add(pastEventsContentContainer, java.awt.BorderLayout.CENTER);

        hostedEventsOuterPanel.setBackground(new java.awt.Color(255, 255, 255));
        hostedEventsOuterPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        hostedEventsOuterPanel.setPreferredSize(new java.awt.Dimension(510, 354));
        hostedEventsOuterPanel.setLayout(new java.awt.BorderLayout());

        hostedEventsLabelContainer.setPreferredSize(new java.awt.Dimension(100, 50));

        lblHostedEvents.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblHostedEvents.setText("Events You Host");

        javax.swing.GroupLayout hostedEventsLabelContainerLayout = new javax.swing.GroupLayout(hostedEventsLabelContainer);
        hostedEventsLabelContainer.setLayout(hostedEventsLabelContainerLayout);
        hostedEventsLabelContainerLayout.setHorizontalGroup(
            hostedEventsLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostedEventsLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHostedEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hostedEventsLabelContainerLayout.setVerticalGroup(
            hostedEventsLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostedEventsLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHostedEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hostedEventsOuterPanel.add(hostedEventsLabelContainer, java.awt.BorderLayout.PAGE_START);

        hostedEventsScrollPane.setBorder(null);
        hostedEventsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        hostedEventsScrollPane.getVerticalScrollBar().setUnitIncrement(10);

        hostedEventsContentPane.setBackground(new java.awt.Color(255, 255, 255));
        hostedEventsContentPane.setLayout(new javax.swing.BoxLayout(hostedEventsContentPane, javax.swing.BoxLayout.Y_AXIS));

        lblNoHostedEvents.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNoHostedEvents.setForeground(new java.awt.Color(153, 153, 153));
        lblNoHostedEvents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoHostedEvents.setText("<HTML>You don't host any events or <BR> you don't have enough privilege to host an event</HTML>");
        hostedEventsContentPane.add(lblNoHostedEvents);

        hostedEventsScrollPane.setViewportView(hostedEventsContentPane);

        javax.swing.GroupLayout hostedEventContentContainerLayout = new javax.swing.GroupLayout(hostedEventContentContainer);
        hostedEventContentContainer.setLayout(hostedEventContentContainerLayout);
        hostedEventContentContainerLayout.setHorizontalGroup(
            hostedEventContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostedEventContentContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(hostedEventsScrollPane)
                .addGap(0, 0, 0))
        );
        hostedEventContentContainerLayout.setVerticalGroup(
            hostedEventContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostedEventContentContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(hostedEventsScrollPane)
                .addGap(0, 0, 0))
        );

        hostedEventsOuterPanel.add(hostedEventContentContainer, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout mainScrollPaneLayout = new javax.swing.GroupLayout(mainScrollPane);
        mainScrollPane.setLayout(mainScrollPaneLayout);
        mainScrollPaneLayout.setHorizontalGroup(
            mainScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainScrollPaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(mainScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainScrollPaneLayout.createSequentialGroup()
                        .addComponent(pastEventsOuterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hostedEventsOuterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainScrollPaneLayout.createSequentialGroup()
                        .addComponent(upcominEventsOuterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(invitesOuterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainScrollPaneLayout.setVerticalGroup(
            mainScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainScrollPaneLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(mainScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(invitesOuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upcominEventsOuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(mainScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pastEventsOuterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostedEventsOuterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        mainContainerPanel.setViewportView(mainScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hostedEventsContentPane;
    private javax.swing.JPanel invitesContentPane;
    private javax.swing.JLabel lblNoHostedEvents;
    private javax.swing.JLabel lblNoInvites;
    private javax.swing.JLabel lblNoPastEvents;
    private javax.swing.JLabel lblNoUpcomingEvents;
    private javax.swing.JPanel pastEventsContentPane;
    private javax.swing.JPanel upcomingEventsContentPane;
    // End of variables declaration//GEN-END:variables

}
