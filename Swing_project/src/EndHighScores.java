/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/***************************************************************  
*  file: EndHighScores.java  
*  author: Timmy Lin, Owen Lovett, Kristine Trevino Kinoshita, Scott Lee 
*  class: CS 2450 – User Interface Design and Programming 
*  
*  assignment: Swing Project 1  
*  date last modified: 9/26/2021  
*  
*  purpose: This program accepts creates a hangman game and a color button game 
*           in a separate window that has a title screen, main menu, game 
*           screen, high score screen, and credits.
*  
****************************************************************/
public class EndHighScores extends javax.swing.JFrame {
    
    private int fScore;
    private String text;
    
    /**
     * Creates new form EndHighScores
     */
    public EndHighScores() {
        initComponents();
        makeNewScoreInvisible();
    }
    
    public void setFinalScore(int score) {
        finalScoreLabel.setText(finalScoreLabel.getText() + "               " + score);
        fScore = score;
    }
    
    private void makeNewScoreInvisible() {
        newHighScore.setVisible(false);
        promptSave.setVisible(false);
        noB.setVisible(false);
        yesB.setVisible(false);
        textField.setVisible(false);
        promptInitial.setVisible(false);
    }
    
    public final void checkHighScore(int fScore){
        readFile r = new readFile();
        r.openFile();
        String[] scores = r.readScore();
        String scoreStr = scores[7];
        int scoreInt = Integer.parseInt(scoreStr);
        if (fScore > scoreInt) {
            newHighScore.setVisible(true);
            promptSave.setVisible(true);
            noB.setVisible(true);
            yesB.setVisible(true);
        }
        r.closeFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        highscoreTitle = new javax.swing.JLabel();
        finalScoreLabel = new javax.swing.JLabel();
        newHighScore = new javax.swing.JLabel();
        promptSave = new javax.swing.JLabel();
        yesB = new javax.swing.JButton();
        noB = new javax.swing.JButton();
        endButton = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        promptInitial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        highscoreTitle.setBackground(new java.awt.Color(255, 255, 255));
        highscoreTitle.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        highscoreTitle.setText("Game Over");
        jPanel1.add(highscoreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 39, 184, -1));

        finalScoreLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalScoreLabel.setText("Player 1");
        jPanel1.add(finalScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 88, 210, 78));

        newHighScore.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        newHighScore.setForeground(new java.awt.Color(51, 204, 0));
        newHighScore.setText("New High Score!");
        jPanel1.add(newHighScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 172, -1, -1));

        promptSave.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        promptSave.setText("Would you like to save your score?");
        jPanel1.add(promptSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 209, -1, -1));

        yesB.setText("Yes");
        yesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBActionPerformed(evt);
            }
        });
        jPanel1.add(yesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 207, 60, -1));

        noB.setText("No");
        noB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBActionPerformed(evt);
            }
        });
        jPanel1.add(noB, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 207, 60, -1));

        endButton.setBackground(new java.awt.Color(242, 242, 242));
        endButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        endButton.setText("End");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });
        jPanel1.add(endButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 95, 44));

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });
        jPanel1.add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 30));

        promptInitial.setText("Please enter 3 letter initials. Press Enter key when done");
        jPanel1.add(promptInitial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        // TODO add your handling code here:
        MenuScreen ms = new MenuScreen();
        ms.setVisible(true);
        dispose();
    }//GEN-LAST:event_endButtonActionPerformed

    private void yesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBActionPerformed
       textField.setVisible(true);
       promptInitial.setVisible(true);
       promptSave.setVisible(false);
       noB.setVisible(false);
       yesB.setVisible(false);
    }//GEN-LAST:event_yesBActionPerformed

    private void noBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBActionPerformed
        newHighScore.setVisible(false);
        promptSave.setVisible(false);
        noB.setVisible(false);
        yesB.setVisible(false);
    }//GEN-LAST:event_noBActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        text = textField.getText();
        
        readFile r = new readFile();

        r.openFile();
        String[] scores = r.readScore();
        r.closeFile();
        
        int scoreA = Integer.parseInt(scores[1]);
        int scoreB = Integer.parseInt(scores[3]);
        int scoreC = Integer.parseInt(scores[5]);
        int scoreD = Integer.parseInt(scores[7]);
        
        if (fScore > scoreD && fScore <= scoreC){
            scores[7] = Integer.toString(fScore);
            scores[6] = text;
        }
        else if (fScore > scoreC && fScore <= scoreB){
            scores[7] = scores[5];
            scores[6] = scores[4];
            scores[5] = Integer.toString(fScore);
            scores[4] = text;
        }
        else if (fScore > scoreB && fScore <= scoreA){
            scores[7] = scores[5];
            scores[6] = scores[4];
            scores[5] = scores[3];
            scores[4] = scores[2];
            scores[3] = Integer.toString(fScore);
            scores[2] = text;
        }
        else{
            scores[7] = scores[5];
            scores[6] = scores[4];
            scores[5] = scores[3];
            scores[4] = scores[2];
            scores[3] = scores[1];
            scores[2] = scores[0];
            scores[1] = Integer.toString(fScore);
            scores[0] = text;
        }
    }//GEN-LAST:event_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EndHighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndHighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndHighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndHighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndHighScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endButton;
    private javax.swing.JLabel finalScoreLabel;
    private javax.swing.JLabel highscoreTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newHighScore;
    private javax.swing.JButton noB;
    private javax.swing.JLabel promptInitial;
    private javax.swing.JLabel promptSave;
    private javax.swing.JTextField textField;
    private javax.swing.JButton yesB;
    // End of variables declaration//GEN-END:variables
}
