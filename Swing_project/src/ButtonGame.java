


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
*  date last modified: 9/28/2021  
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
        makeButtonsInvisible();
        startGame();
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
            ehs.checkHighScore(score);
            dispose();
        }
        setColorLabel();
        makeButtonsInvisible();
        setButtons();
    }
    
    // select color of text
    private Color selectColor(String c) {
        Color colorName;
        switch (c) {
            case "RED":
                colorName = Color.RED;
                break;
            case "YELLOW":
                colorName = Color.YELLOW;
                break;
            case "GREEN":
                colorName = Color.GREEN;
                break;
            case "BLUE":
                colorName = Color.BLUE;
                break;
            case "PURPLE":
                colorName = Color.MAGENTA;
                break;
            default:
                colorName = null;
                break;
        }
        return colorName;
    }
    
    // set color label to random color and name
    private void setColorLabel() {
        Random rand = new Random();
        int colorText = rand.nextInt(colorArray.length);
        int color = rand.nextInt(colorArray.length);
        textColor = selectColor(colorArray[color]);
        colorLabel.setForeground(textColor);
        colorLabel.setText(colorArray[colorText]);
    }
    
    
    // open random buttons on screen
    private void setButtons() {
        int colorIndex = 0;
        Random buttonSelector = new Random();
        int[] selectedButtons = new int[5];
        int index = 0;
        while (index < 5) {
            int randButton = buttonSelector.nextInt(10) + 1;
            if (checkDuplicates(randButton, selectedButtons) && index > 0)
                index--;
            else {
                selectedButtons[index] = randButton;
                index++;
            }
        }
        for(int i = 0; i < selectedButtons.length; i++){
            int num = selectedButtons[i];
            switch(num){
                case 1:
                    colorButton1.setVisible(true);
                    colorButton1.setText("");
                    colorButton1.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 2:
                    colorButton2.setVisible(true);
                    colorButton2.setText("");
                    colorButton2.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 3:
                    colorButton3.setVisible(true);
                    colorButton3.setText("");
                    colorButton3.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 4:
                    colorButton4.setVisible(true);
                    colorButton4.setText("");
                    colorButton4.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 5:
                    colorButton5.setVisible(true);
                    colorButton5.setText("");
                    colorButton5.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 6:
                    colorButton6.setVisible(true);
                    colorButton6.setText("");
                    colorButton6.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 7:
                    colorButton7.setVisible(true);
                    colorButton7.setText("");
                    colorButton7.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 8:
                    colorButton8.setVisible(true);
                    colorButton8.setText("");
                    colorButton8.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 9:
                    colorButton9.setVisible(true);
                    colorButton9.setText("");
                    colorButton9.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
                case 10:
                    colorButton10.setVisible(true);
                    colorButton10.setText("");
                    colorButton10.setBackground(selectColor(colorArray[colorIndex]));
                    colorIndex++;
                    break;
            }
        }
    }
    
    //check for duplicates in an array
    private boolean checkDuplicates(int button, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (button == array[i])
                return true;
        }
        return false;
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
        if (button.getBackground().equals(textColor)) {
            score = score + 100;
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
        colorButton1 = new javax.swing.JButton();
        colorButton2 = new javax.swing.JButton();
        colorButton3 = new javax.swing.JButton();
        colorButton4 = new javax.swing.JButton();
        colorButton5 = new javax.swing.JButton();
        colorButton6 = new javax.swing.JButton();
        colorButton7 = new javax.swing.JButton();
        colorButton8 = new javax.swing.JButton();
        colorButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        colorLabel = new javax.swing.JLabel();
        colorButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(dateTimePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 6, -1, -1));

        colorButton1.setText("jButton1");
        colorButton1.setDoubleBuffered(true);
        colorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, 97, 72));

        colorButton2.setText("jButton2");
        colorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 306, 97, 72));

        colorButton3.setText("jButton3");
        colorButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 317, 97, 72));

        colorButton4.setText("jButton4");
        colorButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 77, 97, 72));

        colorButton5.setText("jButton5");
        colorButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 167, 97, 72));

        colorButton6.setText("jButton6");
        colorButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 126, 97, 72));

        colorButton7.setText("jButton7");
        colorButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 167, 97, 72));

        colorButton8.setText("jButton8");
        colorButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 309, 97, 72));

        colorButton9.setText("jButton9");
        colorButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 196, 97, 72));

        colorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorLabel.setText("Color Label");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 40, -1, -1));

        colorButton10.setText("jButton10");
        colorButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(colorButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 219, 97, 72));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    private void setButtonsInvisibl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
