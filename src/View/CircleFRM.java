package View;
/**
 * @author Victor Lavalle
 */
import Pattern.Observer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class CircleFRM extends javax.swing.JFrame implements Observer {
    /**
     * Creates new form Circle
     */
    public CircleFRM() {
        initComponents();
        this.setLocation(200,50);
    }
    
 private PieDataset createDataset(int[] votes, String[] nominees) {
 DefaultPieDataset result = new DefaultPieDataset();
 result.setValue(nominees[0], votes[0]);
 result.setValue(nominees[1], votes[1]);
 result.setValue(nominees[2], votes[2]);
 return result;
 }

 private JFreeChart createChart(PieDataset dataset, String title) {
 JFreeChart chart = ChartFactory.createPieChart3D(title, dataset,true,true,false);
 PiePlot3D plot = (PiePlot3D) chart.getPlot();
 plot.setStartAngle(290);
 plot.setDirection(Rotation.CLOCKWISE);
 plot.setForegroundAlpha(0.5f);
 return chart;
 }

    @Override
 public void update(int[] votos, String[] nominees){
 PieDataset dataset = createDataset(votos, nominees);
 JFreeChart chart = createChart(dataset, "Voting with Observer");
 ChartPanel chartPanel = new ChartPanel(chart);
 chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
 setContentPane(chartPanel);
 this.setVisible(true);
 }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CircleFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CircleFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CircleFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CircleFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CircleFRM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
