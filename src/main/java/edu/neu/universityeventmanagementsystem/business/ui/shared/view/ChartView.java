package edu.neu.universityeventmanagementsystem.business.ui.shared.view;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ChartView class
 *
 * @author  Raghavan Renganathan <renganathan.raghavan@gmail.com> <renganathan.r@husky.neu.edu>
 * @version 1.0
 * @since   Apr 27, 2018
 */
@Component
@Scope(value = "prototype")
@Lazy
public class ChartView extends javax.swing.JPanel {

    private String title;
    private DefaultPieDataset dataset;
    /** Creates new form ChartView */
    public ChartView() {
        title = "Chart Title";
        initComponents();
    }
    
    public ChartView(String title, DefaultPieDataset dataset) {
        this.title = title;
        this.dataset = dataset;
        initComponents();
        drawChart();
    }
    
    private void drawChart() {
        removeAll();
        add(createPiePanel());
        repaint();
    }
    
    private javax.swing.JPanel createPiePanel() {
        JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionOutlinesVisible(false);
        plot.setNoDataMessage("No data available");

        return new ChartPanel(chart);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(500, 500));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}