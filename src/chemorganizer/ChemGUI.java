package chemorganizer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ChemGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChemGUI
     */
    String mouseDragFunction = "Move";
    String selectionBoxElement = "";
    
    ArrayList<Element> elements = new ArrayList();
    Element[] e = new Element[0];
    
    int i0 = -1;
    boolean placeElement = false;
    String hover;
    
    public ChemGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        selectionBox = new javax.swing.JComboBox();
        actionButton = new javax.swing.JButton();
        clickComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drawInput = new javax.swing.JTextArea();
        drawButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(815, 700));

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawingPanel.setPreferredSize(new java.awt.Dimension(650, 700));
        drawingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawingPanelMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawingPanelMouseReleased(evt);
            }
        });
        drawingPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingPanelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drawingPanelMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        selectionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Carbon", "Carbon Chain", "Cyclic Carbon Chain", "Aromatic Carbon Chain", " ", "Hydrogen", "Oxygen", "Nitrogen", " ", "Fluorine", "Chlorine", "Bromine", "Iodine" }));

        actionButton.setText("Build");
        actionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actionButtonMousePressed(evt);
            }
        });

        clickComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Move Element", "Bond Element", "Delete Element" }));
        clickComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clickComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("Click & Drag Function");

        jLabel4.setText("Add Element");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(clickComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)))
                            .addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(selectionBox, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clickComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Build", jPanel1);

        drawInput.setColumns(20);
        drawInput.setLineWrap(true);
        drawInput.setRows(5);
        jScrollPane1.setViewportView(drawInput);

        drawButton.setText("Draw");
        drawButton.setToolTipText("");
        drawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawButtonMousePressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Use Presets:");

        jLabel3.setText("Type an IUPAC name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawButton))
        );

        jTabbedPane2.addTab("Draw", jPanel2);

        resetButton.setText("Reset Screen");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actionButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionButtonMousePressed
        selectionBoxElement = (String) selectionBox.getSelectedItem();
        
        if (!selectionBoxElement.equals(" ")){
            if (selectionBoxElement.equals("Single Carbon") || selectionBoxElement.contains("Carbon")){
                selectionBoxElement = "Carbon";
            }
            
            placeElement = true;
            hover = new Element(-1, -1, selectionBoxElement).letter;
        }
    }//GEN-LAST:event_actionButtonMousePressed

    private void drawButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawButtonMousePressed
        // TODO add your handling code here:
        resetScreen();
        
        String b = drawInput.getText();
        String[] build = b.split(" ");
        int l = build.length;
        int stop = l-1;
        int chainLen = 0;
        String baseChain = "";
        
        if (build[l-1].equals("acid")){
            baseChain = build[l-2];
            stop = l-2;
        } else {
            baseChain = build[l-1];
        }
        switch (baseChain.substring(0, 3)){
//            case "cyc":
//                break;
            case "met":
                chainLen = 1;
                break;
            case "eth":
                chainLen = 2;
                break;
            case "pro":
                chainLen = 3;
                break;
            case "but":
                chainLen = 4;
                break;
            case "pen":
                chainLen = 5;
                break;
            case "hex":
                chainLen = 6;
                break;
            case "hep":
                chainLen = 7;
                break;
            case "oct":
                chainLen = 8;
                break;
            case "non":
                chainLen = 9;
                break;
            case "dec":
                chainLen = 10;
                break;
//            case "ben":
//                break;       
        }
        placeCarbonChain(chainLen);
        boolean[] carbonBonds = new boolean[chainLen];
        //add the ending as a "branch"
        for (int i=0; i<stop; i++){
            String[] parsedBranch = build[i].split("-");            
            int[] n = parseNumbers(parsedBranch[0]);
            for (int j=0; j<n.length; j++){
                int x = (285-20*chainLen) + 80*n[j]/2;
                int y = 310;
                if (carbonBonds[n[j]-1]){
                    y = 390;
                }
                String name = parseName(parsedBranch[1]);
                Element next = new Element(x, y, name);
                elements.add(next);
                carbonBonds[n[j]-1] = true;
            }
        }
        //Add some pretty hydrogens
        drawImage(drawingPanel.getGraphics());
    }//GEN-LAST:event_drawButtonMousePressed

    private void drawingPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseDragged
        int x = evt.getX();
        int y = evt.getY();
        e = getElementArray();
        
        if (placeElement){
            placeElement(x, y);
        } else if (mouseDragFunction.equals("Move")){
            if (i0 != -1){
                e[i0].x = x;
                e[i0].y = y;
                drawImage(drawingPanel.getGraphics());
            } else {
                for (int i=0; i<e.length; i++){
                    if (getDistance(x, y, e[i].x, e[i].y) < 15){
                        i0 = i;
                        break;
                    }
                }
            }
        } else if (mouseDragFunction.equals("Bond")){
            //Bond making feature
            //MAKE ABSOLUTELY SURE THAT THE BOND NUMBERS MATCH ALWAYS!!
        } // The Delete feature is handled in drawingPanelMouseClicked
    }//GEN-LAST:event_drawingPanelMouseDragged

    private void drawingPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseReleased
        i0 = -1;
    }//GEN-LAST:event_drawingPanelMouseReleased

    private void clickComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clickComboBoxItemStateChanged
        String boxSelection = (String) clickComboBox.getSelectedItem();
        switch(boxSelection){
            case "Move Element":
                mouseDragFunction = "Move";
                break;
            case "Bond Element":
                mouseDragFunction = "Bond";
                break;
            case "Delete Element":
                mouseDragFunction = "Delete";
                break;
        }
    }//GEN-LAST:event_clickComboBoxItemStateChanged

    private void drawingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        if (placeElement){
            placeElement(x, y);
        } else if (mouseDragFunction.equals("Delete")){
            for (int i=0; i<e.length; i++){
                if (getDistance(x, y, e[i].x, e[i].y) < 15){                        
                    elements.remove(e[i]);
                    drawImage(drawingPanel.getGraphics());
                    break;
                }
            }
        }
    }//GEN-LAST:event_drawingPanelMouseClicked

    private void drawingPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseMoved
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        if (placeElement){
            Graphics g = drawingPanel.getGraphics();
            drawImage(g);
            g.setFont(new Font("default", Font.PLAIN, 12));
            g.setColor(Color.GRAY);
            g.drawString(hover, x-5, y+5);
        }
    }//GEN-LAST:event_drawingPanelMouseMoved

    private void resetButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMousePressed
        // TODO add your handling code here:
        resetScreen();
    }//GEN-LAST:event_resetButtonMousePressed
    
    public void placeElement(int x, int y){
        Element nextElement = new Element(x, y, selectionBoxElement);
        elements.add(nextElement);
        drawImage(drawingPanel.getGraphics());
        placeElement = false;        
    }
    
    public int[] parseNumbers(String a){
        String[] a0 = a.split(",");
        int[] n = new int [a0.length];
        for (int i=0; i<a0.length; i++){
            n[i] = Integer.parseInt(a0[i]);
        }
        return n;
    }
    
    public String parseName(String a){
        String name = " ";
        if (a.contains("fluoro")){
            name = "Fluorine";
        } else if (a.contains("chloro")){
            name = "Chlorine";
        } else if (a.contains("bromo")){
            name = "Bromine";
        } else if (a.contains("iodo")){
            name = "Iodine";
        } else if (a.contains("amino")){
            name = "Nitrogen";
        } else if (a.contains("hydroxyl")){
            name = "Oxygen";
        } else if (a.contains("carbonyl")){
            
        } else if (a.contains("methyl")){
            name = "Carbon";
        } else if (a.contains("ethyl")){
            
        } else if (a.contains("propyl")){
            
        } else if (a.contains("isopropyl")){
            
        } else if (a.contains("butyl")){
            
        } else if (a.contains("secbutyl")){
            
        } else if (a.contains("isobutyl")){
            
        }
        return name;
    }
    
    public void resetScreen(){
        elements = new ArrayList();
        drawImage(drawingPanel.getGraphics());
    }
    
    private void drawImage(Graphics jPanelGraphics){
        BufferedImage bi = new BufferedImage(650, 700, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) bi.getGraphics();
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 650, 700);
        g.setColor(Color.black);
        e = getElementArray();
        for (int i=0; i<e.length; i++){
            if (e[i].letter.equals("C")){
                g.setFont(new Font("default", Font.BOLD, 20));
            } else {
                g.setFont(new Font("default", Font.PLAIN, 16));
            }            
            g.drawString(e[i].letter, e[i].x-5, e[i].y+5);
            //DO SOME BOND DRAWING HERE TOO
        }
        
        jPanelGraphics.drawImage(bi, 0, 0, rootPane);
    }
    
    public Element[] getElementArray(){
        int l = elements.size();
        Object[] objects = elements.toArray();
        Element[] e0 = new Element[l];
        
        for (int i=0; i<l; i++){
            e0[i] = (Element) objects[i];
        }
        
        return e0;
    }
    
    public double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
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
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChemGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JComboBox clickComboBox;
    private javax.swing.JButton drawButton;
    private javax.swing.JTextArea drawInput;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox selectionBox;
    // End of variables declaration//GEN-END:variables
}
