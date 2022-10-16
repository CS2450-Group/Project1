/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/***************************************************************  
*  file: Sudoku.java  
*  author: Timmy Lin, Owen Lovett, Kristine Trevino Kinoshita, Scott Lee 
*  class: CS 2450 – User Interface Design and Programming 
*  
*  assignment: Swing Project 1  
*  date last modified: 10/13/2021  
*  
*  purpose: This program accepts creates a hangman game and a color button game 
*           in a separate window that has a title screen, main menu, game 
*           screen, high score screen, and credits.
* 
****************************************************************/

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class Sudoku extends javax.swing.JFrame {

    // sudoku solution per gridbox
    String[] grid1Solution = {"3", "5", "2", "9", "6", "4", "7"};
    String[] grid2Solution = {"1", "8", "5", "7", "2", "9", "3"};
    String[] grid3Solution = {"9", "2", "3", "1", "8"};
    String[] grid4Solution = {"6", "1", "2", "3", "7"};
    String[] grid5Solution = {"1", "4", "6", "8", "5", "9"};
    String[] grid6Solution = {"2", "5", "4", "9", "6"};
    String[] grid7Solution = {"6", "9", "8", "7", "4"};
    String[] grid8Solution = {"7", "8", "1", "3", "4", "5", "6"};
    String[] grid9Solution = {"3", "4", "2", "7", "6", "8", "1"};
    //current time
    private Timer t;
    private SimpleDateFormat st;
    // current score
    int score = 0;
    int sudokuScore = 540;
    
    private final static String newline = "\n";
    
    // inputted answers
    String text11;
    String text12;
    String text13;
    String text14;
    String text15;
    String text16;
    String text17;
    String text21;
    String text22;
    String text23;
    String text24;
    String text25;
    String text26;
    String text27;
    String text31;
    String text32;
    String text33;
    String text34;
    String text35;
    String text41;
    String text42;
    String text43;
    String text44;
    String text45;
    String text51;
    String text52;
    String text53;
    String text54;
    String text55;
    String text56;
    String text61;
    String text62;
    String text63;
    String text64;
    String text65;
    String text71;
    String text72;
    String text73;
    String text74;
    String text75;
    String text81;
    String text82;
    String text83;
    String text84;
    String text85;
    String text86;
    String text87;
    String text91;
    String text92;
    String text93;
    String text94;
    String text95;
    String text96;
    String text97;
    
    /**
     * Creates new form Sudoku
     */
    public Sudoku() {
        initComponents();
        curDate();
        curTime();
        errorPromptVisible(false);
        Action escapeExit = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        };
        
        jPanel1.getInputMap().put(KeyStroke.getKeyStroke("ESCAPE"), "escapeExit");
        jPanel1.getActionMap().put("escapeExit", escapeExit);
        
            Action popUp = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Fall 2022 Semester Project 1.2 by:\n\n"
                        + "Timmy Lin, 015073799\n"
                        + "Owen Lovett, 014846715\n"
                        + "Kristine Trevino Kinoshita, 014679639\n"
                        + "Scott Lee, 013762138");
            }
        };
        
        jPanel1.getInputMap().put(KeyStroke.getKeyStroke("F1"), "popUp");
        jPanel1.getActionMap().put("popUp", popUp);
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
    
    public void checkInt(String checkBox){
        int checker = Integer.parseInt(checkBox);
        if(checker < 1 || checker > 9){
            errorPromptVisible(true);
        }
        if(checker > 0 && checker < 10){
            errorPromptVisible(false);
        }
    }
    
    public void getScore(int points) {
        score = points;
    }
    
    private void errorPromptVisible(boolean state) {
        error.setVisible(state);
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
        mainBoard = new javax.swing.JPanel();
        square1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        box11 = new javax.swing.JTextField();
        box13 = new javax.swing.JTextField();
        box12 = new javax.swing.JTextField();
        box14 = new javax.swing.JTextField();
        box15 = new javax.swing.JTextField();
        box16 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        box17 = new javax.swing.JTextField();
        square2 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        box21 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        box22 = new javax.swing.JTextField();
        box23 = new javax.swing.JTextField();
        box24 = new javax.swing.JTextField();
        box25 = new javax.swing.JTextField();
        box26 = new javax.swing.JTextField();
        box27 = new javax.swing.JTextField();
        square3 = new javax.swing.JPanel();
        box31 = new javax.swing.JTextField();
        box32 = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        box33 = new javax.swing.JTextField();
        box34 = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        box35 = new javax.swing.JTextField();
        square4 = new javax.swing.JPanel();
        label9 = new javax.swing.JLabel();
        box41 = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        box42 = new javax.swing.JTextField();
        box43 = new javax.swing.JTextField();
        box44 = new javax.swing.JTextField();
        box45 = new javax.swing.JTextField();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        square5 = new javax.swing.JPanel();
        box51 = new javax.swing.JTextField();
        label13 = new javax.swing.JLabel();
        box52 = new javax.swing.JTextField();
        box53 = new javax.swing.JTextField();
        label14 = new javax.swing.JLabel();
        box54 = new javax.swing.JTextField();
        box55 = new javax.swing.JTextField();
        label15 = new javax.swing.JLabel();
        box56 = new javax.swing.JTextField();
        square6 = new javax.swing.JPanel();
        label16 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        box61 = new javax.swing.JTextField();
        box62 = new javax.swing.JTextField();
        box63 = new javax.swing.JTextField();
        box64 = new javax.swing.JTextField();
        label18 = new javax.swing.JLabel();
        box65 = new javax.swing.JTextField();
        label19 = new javax.swing.JLabel();
        square7 = new javax.swing.JPanel();
        box71 = new javax.swing.JTextField();
        label20 = new javax.swing.JLabel();
        label21 = new javax.swing.JLabel();
        box72 = new javax.swing.JTextField();
        box73 = new javax.swing.JTextField();
        label22 = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        box74 = new javax.swing.JTextField();
        box75 = new javax.swing.JTextField();
        square8 = new javax.swing.JPanel();
        box81 = new javax.swing.JTextField();
        box82 = new javax.swing.JTextField();
        box83 = new javax.swing.JTextField();
        box84 = new javax.swing.JTextField();
        box85 = new javax.swing.JTextField();
        box86 = new javax.swing.JTextField();
        label24 = new javax.swing.JLabel();
        box87 = new javax.swing.JTextField();
        label25 = new javax.swing.JLabel();
        square9 = new javax.swing.JPanel();
        box91 = new javax.swing.JTextField();
        label26 = new javax.swing.JLabel();
        box92 = new javax.swing.JTextField();
        box93 = new javax.swing.JTextField();
        box94 = new javax.swing.JTextField();
        box95 = new javax.swing.JTextField();
        box96 = new javax.swing.JTextField();
        box97 = new javax.swing.JTextField();
        label27 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainBoard.setLayout(new java.awt.GridLayout(3, 3));

        square1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square1.setLayout(new java.awt.GridLayout(3, 3));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("8");
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square1.add(label1);

        box11.setBackground(new java.awt.Color(242, 242, 242));
        box11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box11.setToolTipText("Enter a digit between 1-9");
        box11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box11ActionPerformed(evt);
            }
        });
        square1.add(box11);

        box13.setBackground(new java.awt.Color(242, 242, 242));
        box13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box13.setToolTipText("Enter a digit between 1-9");
        box13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box13ActionPerformed(evt);
            }
        });
        square1.add(box13);

        box12.setBackground(new java.awt.Color(242, 242, 242));
        box12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box12.setToolTipText("Enter a digit between 1-9");
        box12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box12ActionPerformed(evt);
            }
        });
        square1.add(box12);

        box14.setBackground(new java.awt.Color(242, 242, 242));
        box14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box14.setToolTipText("Enter a digit between 1-9");
        box14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box14ActionPerformed(evt);
            }
        });
        square1.add(box14);

        box15.setBackground(new java.awt.Color(242, 242, 242));
        box15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box15.setToolTipText("Enter a digit between 1-9");
        box15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box15ActionPerformed(evt);
            }
        });
        square1.add(box15);

        box16.setBackground(new java.awt.Color(242, 242, 242));
        box16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box16.setToolTipText("Enter a digit between 1-9");
        box16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box16ActionPerformed(evt);
            }
        });
        square1.add(box16);

        label2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("1");
        label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square1.add(label2);

        box17.setBackground(new java.awt.Color(242, 242, 242));
        box17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box17.setToolTipText("Enter a digit between 1-9");
        box17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box17ActionPerformed(evt);
            }
        });
        square1.add(box17);

        mainBoard.add(square1);

        square2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square2.setLayout(new java.awt.GridLayout(3, 3));

        label3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("4");
        label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square2.add(label3);

        box21.setBackground(new java.awt.Color(242, 242, 242));
        box21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box21.setToolTipText("Enter a digit between 1-9");
        box21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box21ActionPerformed(evt);
            }
        });
        square2.add(box21);

        label4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("6");
        label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square2.add(label4);

        box22.setBackground(new java.awt.Color(242, 242, 242));
        box22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box22.setToolTipText("Enter a digit between 1-9");
        box22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box22ActionPerformed(evt);
            }
        });
        square2.add(box22);

        box23.setBackground(new java.awt.Color(242, 242, 242));
        box23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box23.setToolTipText("Enter a digit between 1-9");
        box23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box23ActionPerformed(evt);
            }
        });
        square2.add(box23);

        box24.setBackground(new java.awt.Color(242, 242, 242));
        box24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box24.setToolTipText("Enter a digit between 1-9");
        box24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box24ActionPerformed(evt);
            }
        });
        square2.add(box24);

        box25.setBackground(new java.awt.Color(242, 242, 242));
        box25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box25.setToolTipText("Enter a digit between 1-9");
        box25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box25ActionPerformed(evt);
            }
        });
        square2.add(box25);

        box26.setBackground(new java.awt.Color(242, 242, 242));
        box26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box26.setToolTipText("Enter a digit between 1-9");
        box26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box26ActionPerformed(evt);
            }
        });
        square2.add(box26);

        box27.setBackground(new java.awt.Color(242, 242, 242));
        box27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box27.setToolTipText("Enter a digit between 1-9");
        box27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box27ActionPerformed(evt);
            }
        });
        square2.add(box27);

        mainBoard.add(square2);

        square3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square3.setLayout(new java.awt.GridLayout(3, 3));

        box31.setBackground(new java.awt.Color(242, 242, 242));
        box31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box31.setToolTipText("Enter a digit between 1-9");
        box31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box31ActionPerformed(evt);
            }
        });
        square3.add(box31);

        box32.setBackground(new java.awt.Color(242, 242, 242));
        box32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box32.setToolTipText("Enter a digit between 1-9");
        box32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box32ActionPerformed(evt);
            }
        });
        square3.add(box32);

        label5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("7");
        label5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square3.add(label5);

        label6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("4");
        label6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square3.add(label6);

        box33.setBackground(new java.awt.Color(242, 242, 242));
        box33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box33.setToolTipText("Enter a digit between 1-9");
        box33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box33ActionPerformed(evt);
            }
        });
        square3.add(box33);

        box34.setBackground(new java.awt.Color(242, 242, 242));
        box34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box34.setToolTipText("Enter a digit between 1-9");
        box34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box34ActionPerformed(evt);
            }
        });
        square3.add(box34);

        label7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("6");
        label7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square3.add(label7);

        label8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("5");
        label8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square3.add(label8);

        box35.setBackground(new java.awt.Color(242, 242, 242));
        box35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box35.setToolTipText("Enter a digit between 1-9");
        box35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box35ActionPerformed(evt);
            }
        });
        square3.add(box35);

        mainBoard.add(square3);

        square4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square4.setLayout(new java.awt.GridLayout(3, 3));

        label9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("5");
        label9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square4.add(label9);

        box41.setBackground(new java.awt.Color(242, 242, 242));
        box41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box41.setToolTipText("Enter a digit between 1-9");
        box41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box41ActionPerformed(evt);
            }
        });
        square4.add(box41);

        label10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("9");
        label10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square4.add(label10);

        box42.setBackground(new java.awt.Color(242, 242, 242));
        box42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box42.setToolTipText("Enter a digit between 1-9");
        box42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box42ActionPerformed(evt);
            }
        });
        square4.add(box42);

        box43.setBackground(new java.awt.Color(242, 242, 242));
        box43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box43.setToolTipText("Enter a digit between 1-9");
        box43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box43ActionPerformed(evt);
            }
        });
        square4.add(box43);

        box44.setBackground(new java.awt.Color(242, 242, 242));
        box44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box44.setToolTipText("Enter a digit between 1-9");
        box44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box44ActionPerformed(evt);
            }
        });
        square4.add(box44);

        box45.setBackground(new java.awt.Color(242, 242, 242));
        box45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box45.setToolTipText("Enter a digit between 1-9");
        box45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box45ActionPerformed(evt);
            }
        });
        square4.add(box45);

        label11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("4");
        label11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square4.add(label11);

        label12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("8");
        label12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square4.add(label12);

        mainBoard.add(square4);

        square5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square5.setLayout(new java.awt.GridLayout(3, 3));

        box51.setBackground(new java.awt.Color(242, 242, 242));
        box51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box51.setToolTipText("Enter a digit between 1-9");
        box51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box51ActionPerformed(evt);
            }
        });
        square5.add(box51);

        label13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setText("3");
        label13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square5.add(label13);

        box52.setBackground(new java.awt.Color(242, 242, 242));
        box52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box52.setToolTipText("Enter a digit between 1-9");
        box52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box52ActionPerformed(evt);
            }
        });
        square5.add(box52);

        box53.setBackground(new java.awt.Color(242, 242, 242));
        box53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box53.setToolTipText("Enter a digit between 1-9");
        box53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box53ActionPerformed(evt);
            }
        });
        square5.add(box53);

        label14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("7");
        label14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square5.add(label14);

        box54.setBackground(new java.awt.Color(242, 242, 242));
        box54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box54.setToolTipText("Enter a digit between 1-9");
        box54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box54ActionPerformed(evt);
            }
        });
        square5.add(box54);

        box55.setBackground(new java.awt.Color(242, 242, 242));
        box55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box55.setToolTipText("Enter a digit between 1-9");
        box55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box55ActionPerformed(evt);
            }
        });
        square5.add(box55);

        label15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setText("2");
        label15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square5.add(label15);

        box56.setBackground(new java.awt.Color(242, 242, 242));
        box56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box56.setToolTipText("Enter a digit between 1-9");
        box56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box56ActionPerformed(evt);
            }
        });
        square5.add(box56);

        mainBoard.add(square5);

        square6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square6.setLayout(new java.awt.GridLayout(3, 3));

        label16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label16.setText("7");
        label16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square6.add(label16);

        label17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label17.setText("8");
        label17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square6.add(label17);

        box61.setBackground(new java.awt.Color(242, 242, 242));
        box61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box61.setToolTipText("Enter a digit between 1-9");
        box61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box61ActionPerformed(evt);
            }
        });
        square6.add(box61);

        box62.setBackground(new java.awt.Color(242, 242, 242));
        box62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box62.setToolTipText("Enter a digit between 1-9");
        box62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box62ActionPerformed(evt);
            }
        });
        square6.add(box62);

        box63.setBackground(new java.awt.Color(242, 242, 242));
        box63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box63.setToolTipText("Enter a digit between 1-9");
        box63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box63ActionPerformed(evt);
            }
        });
        square6.add(box63);

        box64.setBackground(new java.awt.Color(242, 242, 242));
        box64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box64.setToolTipText("Enter a digit between 1-9");
        box64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box64ActionPerformed(evt);
            }
        });
        square6.add(box64);

        label18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText("1");
        label18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square6.add(label18);

        box65.setBackground(new java.awt.Color(242, 242, 242));
        box65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box65.setToolTipText("Enter a digit between 1-9");
        box65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box65ActionPerformed(evt);
            }
        });
        square6.add(box65);

        label19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label19.setText("3");
        label19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square6.add(label19);

        mainBoard.add(square6);

        square7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square7.setLayout(new java.awt.GridLayout(3, 3));

        box71.setBackground(new java.awt.Color(242, 242, 242));
        box71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box71.setToolTipText("Enter a digit between 1-9");
        box71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box71ActionPerformed(evt);
            }
        });
        square7.add(box71);

        label20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label20.setText("5");
        label20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square7.add(label20);

        label21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label21.setText("2");
        label21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square7.add(label21);

        box72.setBackground(new java.awt.Color(242, 242, 242));
        box72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box72.setToolTipText("Enter a digit between 1-9");
        box72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box72ActionPerformed(evt);
            }
        });
        square7.add(box72);

        box73.setBackground(new java.awt.Color(242, 242, 242));
        box73.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box73.setToolTipText("Enter a digit between 1-9");
        box73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box73ActionPerformed(evt);
            }
        });
        square7.add(box73);

        label22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label22.setText("1");
        label22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square7.add(label22);

        label23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label23.setText("3");
        label23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square7.add(label23);

        box74.setBackground(new java.awt.Color(242, 242, 242));
        box74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box74.setToolTipText("Enter a digit between 1-9");
        box74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box74ActionPerformed(evt);
            }
        });
        square7.add(box74);

        box75.setBackground(new java.awt.Color(242, 242, 242));
        box75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box75.setToolTipText("Enter a digit between 1-9");
        box75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box75ActionPerformed(evt);
            }
        });
        square7.add(box75);

        mainBoard.add(square7);

        square8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square8.setLayout(new java.awt.GridLayout(3, 3));

        box81.setBackground(new java.awt.Color(242, 242, 242));
        box81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box81.setToolTipText("Enter a digit between 1-9");
        box81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box81ActionPerformed(evt);
            }
        });
        square8.add(box81);

        box82.setBackground(new java.awt.Color(242, 242, 242));
        box82.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box82.setToolTipText("Enter a digit between 1-9");
        box82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box82ActionPerformed(evt);
            }
        });
        square8.add(box82);

        box83.setBackground(new java.awt.Color(242, 242, 242));
        box83.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box83.setToolTipText("Enter a digit between 1-9");
        box83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box83ActionPerformed(evt);
            }
        });
        square8.add(box83);

        box84.setBackground(new java.awt.Color(242, 242, 242));
        box84.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box84.setToolTipText("Enter a digit between 1-9");
        box84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box84ActionPerformed(evt);
            }
        });
        square8.add(box84);

        box85.setBackground(new java.awt.Color(242, 242, 242));
        box85.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box85.setToolTipText("Enter a digit between 1-9");
        box85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box85ActionPerformed(evt);
            }
        });
        square8.add(box85);

        box86.setBackground(new java.awt.Color(242, 242, 242));
        box86.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box86.setToolTipText("Enter a digit between 1-9");
        box86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box86ActionPerformed(evt);
            }
        });
        square8.add(box86);

        label24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label24.setText("9");
        label24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square8.add(label24);

        box87.setBackground(new java.awt.Color(242, 242, 242));
        box87.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box87.setToolTipText("Enter a digit between 1-9");
        box87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box87ActionPerformed(evt);
            }
        });
        square8.add(box87);

        label25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label25.setText("2");
        label25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square8.add(label25);

        mainBoard.add(square8);

        square9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        square9.setLayout(new java.awt.GridLayout(3, 3));

        box91.setBackground(new java.awt.Color(242, 242, 242));
        box91.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box91.setToolTipText("Enter a digit between 1-9");
        box91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box91ActionPerformed(evt);
            }
        });
        square9.add(box91);

        label26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label26.setText("9");
        label26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square9.add(label26);

        box92.setBackground(new java.awt.Color(242, 242, 242));
        box92.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box92.setToolTipText("Enter a digit between 1-9");
        box92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box92ActionPerformed(evt);
            }
        });
        square9.add(box92);

        box93.setBackground(new java.awt.Color(242, 242, 242));
        box93.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box93.setToolTipText("Enter a digit between 1-9");
        box93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box93ActionPerformed(evt);
            }
        });
        square9.add(box93);

        box94.setBackground(new java.awt.Color(242, 242, 242));
        box94.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box94.setToolTipText("Enter a digit between 1-9");
        box94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box94ActionPerformed(evt);
            }
        });
        square9.add(box94);

        box95.setBackground(new java.awt.Color(242, 242, 242));
        box95.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box95.setToolTipText("Enter a digit between 1-9");
        box95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box95ActionPerformed(evt);
            }
        });
        square9.add(box95);

        box96.setBackground(new java.awt.Color(242, 242, 242));
        box96.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box96ActionPerformed(evt);
            }
        });
        square9.add(box96);

        box97.setBackground(new java.awt.Color(242, 242, 242));
        box97.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        box97.setToolTipText("Enter a digit between 1-9");
        box97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        box97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box97ActionPerformed(evt);
            }
        });
        square9.add(box97);

        label27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label27.setText("5");
        label27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        label27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square9.add(label27);

        mainBoard.add(square9);

        jPanel1.add(mainBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 310, 310));

        title.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        title.setText("Sudoku");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        date.setText("date");
        date.setToolTipText("");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 6, 124, -1));

        time.setText("time");
        time.setToolTipText("");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 6, 76, -1));

        submitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setToolTipText("Submit answers");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        quitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quitButton.setText("Quit");
        quitButton.setToolTipText("Quit game");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        error.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setText("ERROR: Only enter values between 1-9");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, 340, 80));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void box11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box11ActionPerformed
        text11 = box11.getText().trim();
        checkInt(text11);
    }//GEN-LAST:event_box11ActionPerformed

    private void box12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box12ActionPerformed
        text12 = box12.getText().trim();
        checkInt(text12);
    }//GEN-LAST:event_box12ActionPerformed

    private void box13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box13ActionPerformed
        text13 = box13.getText().trim();
        checkInt(text13);
    }//GEN-LAST:event_box13ActionPerformed

    private void box14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box14ActionPerformed
        text14 = box14.getText().trim();
        checkInt(text14);
    }//GEN-LAST:event_box14ActionPerformed

    private void box15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box15ActionPerformed
        text15 = box15.getText().trim();
        checkInt(text15);
    }//GEN-LAST:event_box15ActionPerformed

    private void box16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box16ActionPerformed
        text16 = box16.getText().trim();
        checkInt(text16);
    }//GEN-LAST:event_box16ActionPerformed

    private void box17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box17ActionPerformed
        text17 = box17.getText().trim();
        checkInt(text17);
    }//GEN-LAST:event_box17ActionPerformed

    private void box21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box21ActionPerformed
        text21 = box21.getText().trim();
        checkInt(text21);
    }//GEN-LAST:event_box21ActionPerformed

    private void box22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box22ActionPerformed
        checkInt(text22);
    }//GEN-LAST:event_box22ActionPerformed

    private void box23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box23ActionPerformed
        checkInt(text23);
    }//GEN-LAST:event_box23ActionPerformed

    private void box24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box24ActionPerformed
        text24 = box24.getText().trim();
        checkInt(text24);
    }//GEN-LAST:event_box24ActionPerformed

    private void box25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box25ActionPerformed
        text25 = box25.getText().trim();
        checkInt(text25);
    }//GEN-LAST:event_box25ActionPerformed

    private void box26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box26ActionPerformed
        text26 = box26.getText().trim();
        checkInt(text26);
    }//GEN-LAST:event_box26ActionPerformed

    private void box27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box27ActionPerformed
        text27 = box27.getText().trim();
        checkInt(text27);
    }//GEN-LAST:event_box27ActionPerformed

    private void box31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box31ActionPerformed
        text31 = box31.getText().trim();
        checkInt(text31);
    }//GEN-LAST:event_box31ActionPerformed

    private void box32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box32ActionPerformed
        text32 = box32.getText().trim();
        checkInt(text32);
    }//GEN-LAST:event_box32ActionPerformed

    private void box33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box33ActionPerformed
        text33 = box33.getText().trim();
        checkInt(text33);
    }//GEN-LAST:event_box33ActionPerformed

    private void box34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box34ActionPerformed
        text34 = box34.getText().trim();
        checkInt(text34);
    }//GEN-LAST:event_box34ActionPerformed

    private void box35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box35ActionPerformed
        text35 = box35.getText().trim();
        checkInt(text35);
    }//GEN-LAST:event_box35ActionPerformed

    private void box45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box45ActionPerformed
        text45 = box45.getText().trim();
        checkInt(text45);
    }//GEN-LAST:event_box45ActionPerformed

    private void box41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box41ActionPerformed
        text41 = box41.getText().trim();
        checkInt(text41);
    }//GEN-LAST:event_box41ActionPerformed

    private void box42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box42ActionPerformed
        text42 = box42.getText().trim();
        checkInt(text42);
    }//GEN-LAST:event_box42ActionPerformed

    private void box43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box43ActionPerformed
        text43 = box43.getText().trim();
        checkInt(text43);
    }//GEN-LAST:event_box43ActionPerformed

    private void box44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box44ActionPerformed
        text44 = box44.getText().trim();
        checkInt(text44);
    }//GEN-LAST:event_box44ActionPerformed

    private void box55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box55ActionPerformed
        text55 = box55.getText().trim();
        checkInt(text55);
    }//GEN-LAST:event_box55ActionPerformed

    private void box51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box51ActionPerformed
        text51 = box51.getText().trim();
        checkInt(text51);
    }//GEN-LAST:event_box51ActionPerformed

    private void box52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box52ActionPerformed
        text52 = box52.getText().trim();
        checkInt(text52);
    }//GEN-LAST:event_box52ActionPerformed

    private void box53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box53ActionPerformed
        text53 = box53.getText().trim();
        checkInt(text53);
    }//GEN-LAST:event_box53ActionPerformed

    private void box54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box54ActionPerformed
        text54 = box54.getText().trim();
        checkInt(text54);
    }//GEN-LAST:event_box54ActionPerformed

    private void box65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box65ActionPerformed
        text65 = box65.getText().trim();
        checkInt(text65);
    }//GEN-LAST:event_box65ActionPerformed

    private void box61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box61ActionPerformed
        text61 = box61.getText().trim();
        checkInt(text61);
    }//GEN-LAST:event_box61ActionPerformed

    private void box62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box62ActionPerformed
        text62 = box62.getText().trim();
        checkInt(text62);
    }//GEN-LAST:event_box62ActionPerformed

    private void box63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box63ActionPerformed
        text63 = box63.getText().trim();
        checkInt(text63);
    }//GEN-LAST:event_box63ActionPerformed

    private void box64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box64ActionPerformed
        text64 = box64.getText().trim();
        checkInt(text64);
    }//GEN-LAST:event_box64ActionPerformed

    private void box75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box75ActionPerformed
        text75 = box75.getText().trim();
        checkInt(text75);
    }//GEN-LAST:event_box75ActionPerformed

    private void box71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box71ActionPerformed
        text71 = box71.getText().trim();
        checkInt(text71);
    }//GEN-LAST:event_box71ActionPerformed

    private void box72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box72ActionPerformed
        text72 = box72.getText().trim();
        checkInt(text72);
    }//GEN-LAST:event_box72ActionPerformed

    private void box73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box73ActionPerformed
        text73 = box73.getText().trim();
        checkInt(text73);
    }//GEN-LAST:event_box73ActionPerformed

    private void box74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box74ActionPerformed
        text74 = box74.getText().trim();
        checkInt(text74);
    }//GEN-LAST:event_box74ActionPerformed

    private void box85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box85ActionPerformed
        text85 = box85.getText().trim();
        checkInt(text85);
    }//GEN-LAST:event_box85ActionPerformed

    private void box86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box86ActionPerformed
        text86 = box86.getText().trim();
        checkInt(text86);
    }//GEN-LAST:event_box86ActionPerformed

    private void box87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box87ActionPerformed
        text87 = box87.getText().trim();
        checkInt(text87);
    }//GEN-LAST:event_box87ActionPerformed

    private void box81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box81ActionPerformed
        text81 = box81.getText().trim();
        checkInt(text81);
    }//GEN-LAST:event_box81ActionPerformed

    private void box82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box82ActionPerformed
        text82 = box82.getText().trim();
        checkInt(text82);
    }//GEN-LAST:event_box82ActionPerformed

    private void box83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box83ActionPerformed
        text83 = box83.getText().trim();
        checkInt(text83);
    }//GEN-LAST:event_box83ActionPerformed

    private void box84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box84ActionPerformed
        text84 = box84.getText().trim();
        checkInt(text84);
    }//GEN-LAST:event_box84ActionPerformed

    private void box92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box92ActionPerformed
        text92 = box92.getText().trim();
        checkInt(text92);
    }//GEN-LAST:event_box92ActionPerformed

    private void box93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box93ActionPerformed
        text93 = box93.getText().trim();
        checkInt(text93);
    }//GEN-LAST:event_box93ActionPerformed

    private void box94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box94ActionPerformed
        text94 = box94.getText().trim();
        checkInt(text94);
    }//GEN-LAST:event_box94ActionPerformed

    private void box95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box95ActionPerformed
        text95 = box95.getText().trim();
        checkInt(text95);
    }//GEN-LAST:event_box95ActionPerformed

    private void box96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box96ActionPerformed
        text96 = box96.getText().trim();
        checkInt(text96);
    }//GEN-LAST:event_box96ActionPerformed

    private void box97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box97ActionPerformed
        text97 = box97.getText().trim();
        checkInt(text97);
    }//GEN-LAST:event_box97ActionPerformed

    private void box91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box91ActionPerformed
        text91 = box91.getText().trim();
        checkInt(text91);
    }//GEN-LAST:event_box91ActionPerformed

    private void box56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box56ActionPerformed
        text56 = box56.getText().trim();
        checkInt(text56);
    }//GEN-LAST:event_box56ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(!text11.equals("3")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text13.equals("5")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text12.equals("2")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text14.equals("9")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text15.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text16.equals("4")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text17.equals("7")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text21.equals("1")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text22.equals("8")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text23.equals("5")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text24.equals("7")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text25.equals("2")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text26.equals("9")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text27.equals("3")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text31.equals("9")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text32.equals("2")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text33.equals("3")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text34.equals("1")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text35.equals("8")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text41.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text42.equals("1")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text43.equals("2")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text44.equals("3")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text45.equals("7")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text51.equals("1")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text52.equals("4")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text53.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text54.equals("8")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text55.equals("5")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text56.equals("9")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text61.equals("2")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text62.equals("5")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text63.equals("4")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text64.equals("9")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text65.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text71.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text72.equals("9")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text73.equals("8")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text74.equals("7")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text75.equals("4")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text81.equals("7")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text82.equals("8")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text83.equals("1")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text84.equals("3")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text85.equals("4")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text86.equals("5")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text87.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text91.equals("3")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text92.equals("4")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text93.equals("2")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text94.equals("7")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text95.equals("6")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text96.equals("8")){
            sudokuScore = sudokuScore - 10;
        }
        if(!text97.equals("1")){
            sudokuScore = sudokuScore - 10;
        }
        int finalScore = score + sudokuScore;
        EndHighScores ehs = new EndHighScores();
        ehs.setVisible(true);
        ehs.setFinalScore(finalScore);
        ehs.checkHighScore(finalScore);
        dispose();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        EndHighScores ehs = new EndHighScores();
        ehs.setVisible(true);
        ehs.setFinalScore(score);
        dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box11;
    private javax.swing.JTextField box12;
    private javax.swing.JTextField box13;
    private javax.swing.JTextField box14;
    private javax.swing.JTextField box15;
    private javax.swing.JTextField box16;
    private javax.swing.JTextField box17;
    private javax.swing.JTextField box21;
    private javax.swing.JTextField box22;
    private javax.swing.JTextField box23;
    private javax.swing.JTextField box24;
    private javax.swing.JTextField box25;
    private javax.swing.JTextField box26;
    private javax.swing.JTextField box27;
    private javax.swing.JTextField box31;
    private javax.swing.JTextField box32;
    private javax.swing.JTextField box33;
    private javax.swing.JTextField box34;
    private javax.swing.JTextField box35;
    private javax.swing.JTextField box41;
    private javax.swing.JTextField box42;
    private javax.swing.JTextField box43;
    private javax.swing.JTextField box44;
    private javax.swing.JTextField box45;
    private javax.swing.JTextField box51;
    private javax.swing.JTextField box52;
    private javax.swing.JTextField box53;
    private javax.swing.JTextField box54;
    private javax.swing.JTextField box55;
    private javax.swing.JTextField box56;
    private javax.swing.JTextField box61;
    private javax.swing.JTextField box62;
    private javax.swing.JTextField box63;
    private javax.swing.JTextField box64;
    private javax.swing.JTextField box65;
    private javax.swing.JTextField box71;
    private javax.swing.JTextField box72;
    private javax.swing.JTextField box73;
    private javax.swing.JTextField box74;
    private javax.swing.JTextField box75;
    private javax.swing.JTextField box81;
    private javax.swing.JTextField box82;
    private javax.swing.JTextField box83;
    private javax.swing.JTextField box84;
    private javax.swing.JTextField box85;
    private javax.swing.JTextField box86;
    private javax.swing.JTextField box87;
    private javax.swing.JTextField box91;
    private javax.swing.JTextField box92;
    private javax.swing.JTextField box93;
    private javax.swing.JTextField box94;
    private javax.swing.JTextField box95;
    private javax.swing.JTextField box96;
    private javax.swing.JTextField box97;
    private javax.swing.JLabel date;
    private javax.swing.JLabel error;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label24;
    private javax.swing.JLabel label25;
    private javax.swing.JLabel label26;
    private javax.swing.JLabel label27;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JPanel mainBoard;
    private javax.swing.JButton quitButton;
    private javax.swing.JPanel square1;
    private javax.swing.JPanel square2;
    private javax.swing.JPanel square3;
    private javax.swing.JPanel square4;
    private javax.swing.JPanel square5;
    private javax.swing.JPanel square6;
    private javax.swing.JPanel square7;
    private javax.swing.JPanel square8;
    private javax.swing.JPanel square9;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
