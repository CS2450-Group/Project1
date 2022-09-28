


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/***************************************************************  
*  file: ButtonGame.java  
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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.Timer;
import java.util.Arrays;


public class ButtonGame extends javax.swing.JFrame {

    // color array
    String colorArray[] = {"RED", "YELLOW", "GREEN", "BLUE", "PURPLE"};
    // text color
    Color textColor;
    // number of rounds played
    int rounds = 0;
    // current score
    int score = 0;
    //current time
    private Timer t;
    private SimpleDateFormat st;
    
    /**
     * Creates new form ButtonGame
     */
    public ButtonGame() {
        initComponents();
        curDate();
        curTime();
        startGame();
        makeButtonsInvisible();
        setButtons();
    }
    
    //current date
    private void curDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, YYYY");
        
        String dd = sdf.format(d);
        date.setText(dd);
    }
    
    // current time
    private void curTime(){
        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
            
                String tt = st.format(dt);
                time.setText(tt);
            }
        });
        t.start();
    }
    
    // get score from previous game
    public void getScore(int points) {
        score = points;
    }
    
    // create round 
    private void startGame() {
        if (rounds == 5) {
            EndHighScores ehs = new EndHighScores();
            ehs.setVisible(true);
            ehs.setFinalScore(score);
            dispose();
        }
        setColorLabel();
        
    }
    
    // select color of text
    private void selectColor(String c) {
        switch (c) {
            case "RED":
                textColor = Color.RED;
                break;
            case "YELLOW":
                textColor = Color.YELLOW;
                break;
            case "GREEN":
                textColor = Color.GREEN;
                break;
            case "BLUE":
                textColor = Color.BLUE;
                break;
            case "PURPLE":
                textColor = Color.MAGENTA;
                break;
        }
    }
    
    // set color label to random color and name
    private void setColorLabel() {
        Random rand = new Random();
        int colorText = rand.nextInt(colorArray.length);
        int color = rand.nextInt(colorArray.length);
        selectColor(colorArray[color]);
        colorLabel.setForeground(textColor);
        colorLabel.setText(colorArray[colorText]);
    }
    
    
    // open random buttons on screen
    private void setButtons() {
        Random buttonSelector = new Random();
        int[] selectedButtons = new int[5];
        int temp = 0;
        for(int i = 0; i < selectedButtons.length; i++) {
            int checker = temp;
            temp = buttonSelector.nextInt(10)+1;
            while(checker == temp){
                temp = buttonSelector.nextInt(10) + 1;
            }
            selectedButtons[i] = temp; 
        }
        for(int i = 0; i < selectedButtons.length; i++){
            int num = selectedButtons[i];
            switch(num){
                case 1:
                    colorButton1.setVisible(true);
                    break;
                case 2:
                    colorButton2.setVisible(true);
                    break;
                case 3:
                    colorButton3.setVisible(true);
                    break;
                case 4:
                    colorButton4.setVisible(true);
                    break;
                case 5:
                    colorButton5.setVisible(true);
                    break;
                case 6:
                    colorButton6.setVisible(true);
                    break;
                case 7:
                    colorButton7.setVisible(true);
                    break;
                case 8:
                    colorButton8.setVisible(true);
                    break;
                case 9:
                    colorButton9.setVisible(true);
                    break;
                case 10:
                    colorButton10.setVisible(true);
                    break;
            }
        }
    }

    //set all color buttons invisible
    private void makeButtonsInvisible(){
        colorButton1.setVisible(false);
        colorButton2.setVisible(false);
        colorButton3.setVisible(false);
        colorButton4.setVisible(false);
        colorButton5.setVisible(false);
        colorButton6.setVisible(false);
        colorButton7.setVisible(false);
        colorButton8.setVisible(false);
        colorButton9.setVisible(false);
        colorButton10.setVisible(false);
    }
    
    // check if button color matches text color
    private void checkColor(JButton button) {
        rounds++;
        if (button.getBackground() == textColor) {
            score += 100;
        }
        startGame();
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
        dateTimePanel = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        colorButton1 = new javax.swing.JButton();
        colorButton2 = new javax.swing.JButton();
        colorButton3 = new javax.swing.JButton();
        colorButton4 = new javax.swing.JButton();
        colorButton5 = new javax.swing.JButton();
        colorButton6 = new javax.swing.JButton();
        colorButton7 = new javax.swing.JButton();
        colorButton8 = new javax.swing.JButton();
        colorButton9 = new javax.swing.JButton();
        colorButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        date.setText("date");

        time.setText("time");

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(time))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        colorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorLabel.setText("Color Label");

        colorButton1.setText("jButton1");
        colorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton1ActionPerformed(evt);
            }
        });

        colorButton2.setText("jButton2");
        colorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton2ActionPerformed(evt);
            }
        });

        colorButton3.setText("jButton3");
        colorButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton3ActionPerformed(evt);
            }
        });

        colorButton4.setText("jButton4");
        colorButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton4ActionPerformed(evt);
            }
        });

        colorButton5.setText("jButton5");
        colorButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton5ActionPerformed(evt);
            }
        });

        colorButton6.setText("jButton6");
        colorButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton6ActionPerformed(evt);
            }
        });

        colorButton7.setText("jButton7");
        colorButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton7ActionPerformed(evt);
            }
        });

        colorButton8.setText("jButton8");
        colorButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton8ActionPerformed(evt);
            }
        });

        colorButton9.setText("jButton9");
        colorButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton9ActionPerformed(evt);
            }
        });

        colorButton10.setText("jButton10");
        colorButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(colorButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(colorButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(colorButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(colorButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(colorButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colorButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(colorButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(colorButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(colorButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(colorButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(colorButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton1ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton1);
    }//GEN-LAST:event_colorButton1ActionPerformed

    private void colorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton2ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton2);
    }//GEN-LAST:event_colorButton2ActionPerformed

    private void colorButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton3ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton3);
    }//GEN-LAST:event_colorButton3ActionPerformed

    private void colorButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton4ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton4);
    }//GEN-LAST:event_colorButton4ActionPerformed

    private void colorButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton5ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton5);
    }//GEN-LAST:event_colorButton5ActionPerformed

    private void colorButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton6ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton6);
    }//GEN-LAST:event_colorButton6ActionPerformed

    private void colorButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton7ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton7);
    }//GEN-LAST:event_colorButton7ActionPerformed

    private void colorButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton8ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton8);
    }//GEN-LAST:event_colorButton8ActionPerformed

    private void colorButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton9ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton9);
    }//GEN-LAST:event_colorButton9ActionPerformed

    private void colorButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButton10ActionPerformed
        // TODO add your handling code here:
        checkColor(colorButton10);
    }//GEN-LAST:event_colorButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(ButtonGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ButtonGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ButtonGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ButtonGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ButtonGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton1;
    private javax.swing.JButton colorButton10;
    private javax.swing.JButton colorButton2;
    private javax.swing.JButton colorButton3;
    private javax.swing.JButton colorButton4;
    private javax.swing.JButton colorButton5;
    private javax.swing.JButton colorButton6;
    private javax.swing.JButton colorButton7;
    private javax.swing.JButton colorButton8;
    private javax.swing.JButton colorButton9;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel date;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
