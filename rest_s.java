package rest_es;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class rest_s extends javax.swing.JFrame {
double firstnum;
        double secondnum;
        double result;
        String operations;
        
        double[] i = new double[5];

        double Landhi=1.00;
        double Korangi=1.00 ;
        double Maymar=1.00 ;
        double Hadeed =1.00;
        
    public rest_s() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlblsubTotal = new javax.swing.JLabel();
        jlblTax = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnSub = new javax.swing.JButton();
        jbTNmULT = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        JbTNdIV = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnEquals = new javax.swing.JButton();
        jBtnPlusSub = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnConvert = new javax.swing.JButton();
        jbtnClose = new javax.swing.JButton();
        jlblConvert = new javax.swing.JLabel();
        jtxtConvert = new javax.swing.JTextField();
        jcmbCurrency = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jCChicBurger = new javax.swing.JCheckBox();
        jCChicBurgerMeal = new javax.swing.JCheckBox();
        jCBCBurger = new javax.swing.JCheckBox();
        jtxtChicBurger = new javax.swing.JTextField();
        jtxtChicBurgerMeal = new javax.swing.JTextField();
        jtxtBCBurger = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCTax = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jCDelivery = new javax.swing.JCheckBox();
        jCmbDrink = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jBtnTotal = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblCostOfDelivery = new javax.swing.JLabel();
        jlblCostOfDrinks = new javax.swing.JLabel();
        jlblCostOfMeal = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.orange);
        setPreferredSize(new java.awt.Dimension(1400, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sub Total:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tax:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total:");

        jlblsubTotal.setBackground(new java.awt.Color(0, 0, 0));
        jlblsubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblsubTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlblsubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblsubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jlblsubTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblsubTotalMouseClicked(evt);
            }
        });

        jlblTax.setBackground(new java.awt.Color(0, 0, 0));
        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblTax.setForeground(new java.awt.Color(255, 255, 255));
        jlblTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel13)
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel14)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, 166));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Receipt", jPanel8);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtn7.setBackground(new java.awt.Color(0, 0, 0));
        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setForeground(new java.awt.Color(255, 255, 255));
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setBackground(new java.awt.Color(0, 0, 0));
        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setForeground(new java.awt.Color(255, 255, 255));
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setBackground(new java.awt.Color(0, 0, 0));
        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setForeground(new java.awt.Color(255, 255, 255));
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnPlus.setBackground(new java.awt.Color(255, 153, 51));
        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        jBtn4.setBackground(new java.awt.Color(0, 0, 0));
        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setForeground(new java.awt.Color(255, 255, 255));
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setBackground(new java.awt.Color(0, 0, 0));
        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setForeground(new java.awt.Color(255, 255, 255));
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setBackground(new java.awt.Color(0, 0, 0));
        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setForeground(new java.awt.Color(255, 255, 255));
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnSub.setBackground(new java.awt.Color(255, 153, 51));
        jBtnSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSub.setText("-");
        jBtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubActionPerformed(evt);
            }
        });

        jbTNmULT.setBackground(new java.awt.Color(255, 153, 51));
        jbTNmULT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbTNmULT.setText("*");
        jbTNmULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTNmULTActionPerformed(evt);
            }
        });

        jBtn1.setBackground(new java.awt.Color(0, 0, 0));
        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setForeground(new java.awt.Color(255, 255, 255));
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setBackground(new java.awt.Color(0, 0, 0));
        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setForeground(new java.awt.Color(255, 255, 255));
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setBackground(new java.awt.Color(0, 0, 0));
        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setForeground(new java.awt.Color(255, 255, 255));
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        JbTNdIV.setBackground(new java.awt.Color(255, 153, 51));
        JbTNdIV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbTNdIV.setText("/");
        JbTNdIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbTNdIVActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Wingdings", 1, 18)); // NOI18N
        jButton14.setText("");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jBtn0.setBackground(new java.awt.Color(0, 0, 0));
        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setForeground(new java.awt.Color(255, 255, 255));
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnClear.setBackground(new java.awt.Color(102, 102, 102));
        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnEquals.setBackground(new java.awt.Color(0, 0, 0));
        jBtnEquals.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnEquals.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEquals.setText("=");
        jBtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualsActionPerformed(evt);
            }
        });

        jBtnPlusSub.setBackground(new java.awt.Color(102, 102, 102));
        jBtnPlusSub.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jBtnPlusSub.setText("+/-");
        jBtnPlusSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusSubActionPerformed(evt);
            }
        });

        jBtnDot.setBackground(new java.awt.Color(0, 0, 0));
        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDot.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbTNmULT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JbTNdIV, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbTNmULT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JbTNdIV, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jbtnConvert.setBackground(new java.awt.Color(51, 51, 51));
        jbtnConvert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnConvert.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConvert.setText("Proceed");
        jbtnConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnClose.setBackground(new java.awt.Color(51, 51, 51));
        jbtnClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jbtnClose.setText("Close");
        jbtnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jbtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCloseActionPerformed(evt);
            }
        });

        jlblConvert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblConvert.setForeground(new java.awt.Color(255, 153, 51));
        jlblConvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jtxtConvert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtConvert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtConvertActionPerformed(evt);
            }
        });

        jcmbCurrency.setBackground(new java.awt.Color(102, 102, 102));
        jcmbCurrency.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Distant Areas D/C", "Landhi", "Korangi", "Maymar", "Hadeed", " " }));
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jbtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jcmbCurrency, javax.swing.GroupLayout.Alignment.LEADING, 0, 240, Short.MAX_VALUE)
                        .addComponent(jtxtConvert, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblConvert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(64, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jcmbCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(13, 13, 13)
                    .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnConvert)
                        .addComponent(jbtnClose))
                    .addGap(23, 23, 23)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jCChicBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCChicBurger.setForeground(new java.awt.Color(255, 255, 255));
        jCChicBurger.setText("Biryani");
        jCChicBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicBurgerMouseClicked(evt);
            }
        });
        jCChicBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicBurgerActionPerformed(evt);
            }
        });

        jCChicBurgerMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCChicBurgerMeal.setForeground(new java.awt.Color(255, 255, 255));
        jCChicBurgerMeal.setText("Haleem");
        jCChicBurgerMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicBurgerMealMouseClicked(evt);
            }
        });
        jCChicBurgerMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicBurgerMealActionPerformed(evt);
            }
        });

        jCBCBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCBCBurger.setForeground(new java.awt.Color(255, 255, 255));
        jCBCBurger.setText("Chicken Burger");
        jCBCBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCBurgerMouseClicked(evt);
            }
        });
        jCBCBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCBurgerActionPerformed(evt);
            }
        });

        jtxtChicBurger.setBackground(new java.awt.Color(0, 0, 0));
        jtxtChicBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicBurger.setForeground(new java.awt.Color(255, 255, 255));
        jtxtChicBurger.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jtxtChicBurgerMeal.setBackground(new java.awt.Color(0, 0, 0));
        jtxtChicBurgerMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicBurgerMeal.setForeground(new java.awt.Color(255, 255, 255));
        jtxtChicBurgerMeal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jtxtBCBurger.setBackground(new java.awt.Color(0, 0, 0));
        jtxtBCBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCBurger.setForeground(new java.awt.Color(255, 255, 255));
        jtxtBCBurger.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Drinks");

        jCTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCTax.setForeground(new java.awt.Color(255, 255, 255));
        jCTax.setText("Tax");
        jCTax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCTaxMouseClicked(evt);
            }
        });
        jCTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTaxActionPerformed(evt);
            }
        });

        jCDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCDelivery.setForeground(new java.awt.Color(255, 255, 255));
        jCDelivery.setText("Home Delivery");
        jCDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCDeliveryMouseClicked(evt);
            }
        });
        jCDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDeliveryActionPerformed(evt);
            }
        });

        jCmbDrink.setBackground(new java.awt.Color(51, 51, 51));
        jCmbDrink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCmbDrink.setForeground(new java.awt.Color(255, 255, 255));
        jCmbDrink.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange", "Doodh Soda" }));
        jCmbDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDrinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCChicBurgerMeal)
                            .addComponent(jCBCBurger)
                            .addComponent(jCChicBurger))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtChicBurger, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jtxtChicBurgerMeal)
                            .addComponent(jtxtBCBurger)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(144, 144, 144)
                        .addComponent(jCmbDrink, 0, 209, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCTax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCChicBurger)
                    .addComponent(jtxtChicBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCChicBurgerMeal)
                    .addComponent(jtxtChicBurgerMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCBurger)
                    .addComponent(jtxtBCBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCmbDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCDelivery)
                    .addComponent(jCTax))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnTotal.setBackground(new java.awt.Color(51, 51, 51));
        jBtnTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnTotal.setForeground(new java.awt.Color(255, 255, 255));
        jBtnTotal.setText("Total");
        jBtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTotalMouseClicked(evt);
            }
        });
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        jBtnReceipt.setBackground(new java.awt.Color(51, 51, 51));
        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReceipt.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReceipt.setText("Receipt");
        jBtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReceiptMouseClicked(evt);
            }
        });
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        jBtnReset.setBackground(new java.awt.Color(51, 51, 51));
        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnExit.setBackground(new java.awt.Color(51, 51, 51));
        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jBtnTotal)
                .addGap(88, 88, 88)
                .addComponent(jBtnReceipt)
                .addGap(70, 70, 70)
                .addComponent(jBtnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jBtnExit)
                .addGap(117, 117, 117))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTotal)
                    .addComponent(jBtnReceipt)
                    .addComponent(jBtnReset)
                    .addComponent(jBtnExit))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cost of Drinks");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cost of Meal");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cost of Delivery");

        jlblCostOfDelivery.setBackground(new java.awt.Color(255, 255, 255));
        jlblCostOfDelivery.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfDelivery.setForeground(new java.awt.Color(255, 255, 255));
        jlblCostOfDelivery.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfDelivery.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jlblCostOfDrinks.setBackground(new java.awt.Color(255, 255, 255));
        jlblCostOfDrinks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfDrinks.setForeground(new java.awt.Color(255, 255, 255));
        jlblCostOfDrinks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfDrinks.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jlblCostOfMeal.setBackground(new java.awt.Color(255, 255, 255));
        jlblCostOfMeal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfMeal.setForeground(new java.awt.Color(255, 255, 255));
        jlblCostOfMeal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfMeal.setText("0");
        jlblCostOfMeal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jlblCostOfMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCostOfMealMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(241, Short.MAX_VALUE)
                    .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AlFars 2 Kamran Outline", 1, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bawarchi Inn");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 500, 70));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("jTextField1");
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1200, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Presented By:");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("M.Fahad Siddiqui (2019-SE-206)");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 220, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Shahzaib Ansari (2019-SE-249)");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 260, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("M.Khubaib.H.Zuberi (2019-SE-245)");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 300, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Shareh Akhter (2019-SE-232)");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 340, -1, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 1650, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
       String Enternumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="+";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="-";
    }//GEN-LAST:event_jBtnSubActionPerformed

    private void jbTNmULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTNmULTActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="*";
    }//GEN-LAST:event_jbTNmULTActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void JbTNdIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbTNdIVActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="/";
    }//GEN-LAST:event_JbTNdIVActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String backspace=null;
        if(jtxtDisplay.getText().length() > 0){
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        jtxtDisplay.setText(null);
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualsActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations == "+")
        {
            result = firstnum +  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if (operations == "-")
        {
            result = firstnum -  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if (operations == "*")
        {
            result = firstnum *  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  
                if (operations == "/")
        {
            if(secondnum==0){
                try{
            
            result = firstnum /  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
                }
                catch(ArithmeticException e){
                    JOptionPane.showMessageDialog(null,"infinity");
                }
        }
            else{
              result = firstnum /  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);  
            }}
        else  if (operations == "%")
        {
            result = firstnum %  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jBtnEqualsActionPerformed

    private void jBtnPlusSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusSubActionPerformed
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnPlusSubActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed

        jtxtDisplay.setText(jtxtDisplay.getText()+ jBtnDot.getText());

    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jCChicBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicBurgerMouseClicked
      
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
        double iChicBurger = 190.00;

        if ( jCChicBurger.isSelected())
        {
            i[0] = (ChicBurger * iChicBurger) + cMeal ;
            String pMeal  = String.format("%.2f",  i[0]);
            jlblCostOfMeal.setText(pMeal );
        }   
    }//GEN-LAST:event_jCChicBurgerMouseClicked

    private void jCChicBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicBurgerActionPerformed

    }//GEN-LAST:event_jCChicBurgerActionPerformed

    private void jCChicBurgerMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicBurgerMealMouseClicked
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double ChicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
        double iChicBurgerMeal = 180.00;

        if (  jCChicBurgerMeal .isSelected() )
        {
            i[1] = ((ChicBurgerMeal *  iChicBurgerMeal)+ cMeal);
            String pMeal  = String.format("%.2f",  i[1]);
            jlblCostOfMeal.setText(pMeal );}
        else
        {
            jlblCostOfMeal.setText(null);
        }
    }//GEN-LAST:event_jCChicBurgerMealMouseClicked

    private void jCChicBurgerMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicBurgerMealActionPerformed

    }//GEN-LAST:event_jCChicBurgerMealActionPerformed

    private void jCBCBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCBurgerMouseClicked
        double BCBurger = Double.parseDouble(jtxtBCBurger.getText());
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double iBCBurger = 200.00;

        if (  jCBCBurger .isSelected() )
        {
            i[2] = ( (BCBurger * iBCBurger)+ cMeal);
            String pMeal  = String.format("%.2f",  i[2]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCBurgerMouseClicked

    private void jCBCBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCBurgerActionPerformed

    }//GEN-LAST:event_jCBCBurgerActionPerformed

    private void jCTaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCTaxMouseClicked
       
        double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
        double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
        double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());

        final double allTotal = (cTotal1 + cTotal2 + cTotal3 )/13;

        String iTotal = String.format("%.2f", allTotal);
        jlblTax.setText(iTotal);
        
    }//GEN-LAST:event_jCTaxMouseClicked

    private void jCTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTaxActionPerformed

    private void jCDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCDeliveryMouseClicked
        final double iDelivery = 70.00 ; 

        if ( jCDelivery.isSelected())
        {
            String pDelivery  = String.format("%.2f",  iDelivery);
            jlblCostOfDelivery.setText(pDelivery );
        }
        else
        {
            jlblCostOfDelivery.setText(null);
        }
    }//GEN-LAST:event_jCDeliveryMouseClicked

    private void jCDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCDeliveryActionPerformed

    private void jBtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTotalMouseClicked
        double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
        double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
        double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
        double cTotal4 = Double.parseDouble( jlblTax.getText());

        double subTotal = (cTotal1 + cTotal2 + cTotal3 );
        String isubTotal = String.format(" %.2f", subTotal);
        jlblsubTotal.setText(isubTotal);

        double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4 );
        String iTotal = String.format(" %.2f", allTotal);
        jlblTotal.setText(iTotal);

        String iTaxTotal = String.format(" %.2f", cTotal4);
        jlblTax.setText(iTaxTotal);

    }//GEN-LAST:event_jBtnTotalMouseClicked

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
synchronized(this){ 
        double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
        double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
        double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
        double cTotal4 = Double.parseDouble( jlblTax.getText());

        double subTotal = (cTotal1 + cTotal2 + cTotal3 );
        String isubTotal = String.format("%.2f", subTotal);
        jlblsubTotal.setText(isubTotal);

        double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4 );
        String iTotal = String.format(" %.2f", allTotal);
        jlblTotal.setText(iTotal);

        String iTaxTotal = String.format(" %.2f", cTotal4);
        jlblTax.setText(iTaxTotal);
}
    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jBtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReceiptMouseClicked

    }//GEN-LAST:event_jBtnReceiptMouseClicked

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed
 synchronized(this){       
        double Qty1 = Double.parseDouble(jtxtChicBurger.getText());
        double Qty2 = Double.parseDouble(jtxtChicBurgerMeal.getText());
        double Qty3 = Double.parseDouble(jtxtBCBurger.getText());

        jTextArea1.append("\t\nOrder Receipt:\n\n" + "Biryani:\t\t"
            + Qty1 +  "\nHaleem:\t\t"+
            Qty2 +"\nChicken Burger:\t "
            + Qty3 +"\n\nThank you " );
 }       
    }//GEN-LAST:event_jBtnReceiptActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        jlblCostOfDelivery.setText(null);
        jlblsubTotal.setText(null);
        jlblTotal.setText(null);
        jlblTax.setText(null);
  jlblConvert.setText(null);
        jlblCostOfDelivery.setText(null);
        jlblCostOfDrinks.setText(null);
        jlblCostOfMeal.setText(null);
        jlblsubTotal.setText(null);
        jlblTax.setText(null);
        jlblTotal.setText(null);
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jlblCostOfMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCostOfMealMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblCostOfMealMouseClicked

    private void jCmbDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDrinkActionPerformed
        double Tea= 50.00;
        double Ice_Tea= 120.00;
        double Coffee= 100.00;
        double Ice_Coffee= 150.00;
        double Cola= 70.00;
        double Coke= 70.00;
        double Orange =80.00;
        double Apple_Juice = 200.00;
        double Doodh_Soda=300.00;

        if (jCmbDrink.getSelectedItem().equals("Apple Juice"))
        {
            String cApple_Juice = String.format("%.2f",  Apple_Juice);
            jlblCostOfDrinks.setText( cApple_Juice);
        }
        if (jCmbDrink.getSelectedItem().equals("Tea"))
        {
            String cTea = String.format("%.2f",  Tea);
            jlblCostOfDrinks.setText( cTea);
        }

        if (jCmbDrink.getSelectedItem().equals("Ice Tea"))
        {
            String cIce_Tea = String.format("%.2f",  Ice_Tea);
            jlblCostOfDrinks.setText( cIce_Tea);
        }

        if (jCmbDrink.getSelectedItem().equals("Coke"))
        {
            String cCoke = String.format("%.2f",  Coke);
            jlblCostOfDrinks.setText( cCoke);
        }

        if (jCmbDrink.getSelectedItem().equals("Cola"))
        {
            String cCola = String.format("%.2f",  Cola);
            jlblCostOfDrinks.setText( cCola);
        }

        if (jCmbDrink.getSelectedItem().equals("Orange"))
        {
            String cOrange = String.format("%.2f",  Orange);
            jlblCostOfDrinks.setText( cOrange);
        }

        if (jCmbDrink.getSelectedItem().equals("Coffee"))
        {
            String cCoffee = String.format("%.2f",  Coffee);
            jlblCostOfDrinks.setText( cCoffee);
        }

        if (jCmbDrink.getSelectedItem().equals("Ice Coffee"))
        {
            String cIceCoffee = String.format("%.2f",  Ice_Coffee);
            jlblCostOfDrinks.setText( cIceCoffee);
        }
        if (jCmbDrink.getSelectedItem().equals("Doodh Soda"))
        {
            String cDoodhSoda = String.format("%.2f",  Doodh_Soda);
            jlblCostOfDrinks.setText( cDoodhSoda);
        }
        if (jCmbDrink.getSelectedItem().equals("Select a drink"))
        {
            jlblCostOfDrinks.setText( null);
        }
    }//GEN-LAST:event_jCmbDrinkActionPerformed

    private void jbtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseActionPerformed

        jtxtConvert.setText(null);
        jlblConvert.setText(null);
        //jcmbCurrency.isSelectedItem("Choose One...");
        //jcmbCurrency.setModel("Choose One...");
    }//GEN-LAST:event_jbtnCloseActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
        // TODO add your handling code here:
        double Pak_Rupee= Double.parseDouble(jtxtConvert.getText());
        if (jcmbCurrency.getSelectedItem().equals("Landhi"))
        {
            String cConvert1 = String.format("RS %.2f",  Pak_Rupee * Landhi);
            jlblConvert.setText( cConvert1);
        }

        if (jcmbCurrency.getSelectedItem().equals( "Korangi"))
        {
            String cConvert2 = String.format("RS %.2f",  Pak_Rupee * Korangi);
            jlblConvert.setText( cConvert2);
        }

        if (jcmbCurrency.getSelectedItem().equals( "Maymar"))
        {
            String cConvert3 = String.format("RS %.2f",  Pak_Rupee *  Maymar);
            jlblConvert.setText( cConvert3);
        }

        if (jcmbCurrency.getSelectedItem().equals( "Hadeed"))
        {
            String cConvert4 = String.format("RS %.2f", Pak_Rupee* Hadeed);
            jlblConvert.setText( cConvert4);
        }

       

       

      

       
    }//GEN-LAST:event_jbtnConvertActionPerformed

    private void jtxtConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtConvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtConvertActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    private void jlblsubTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblsubTotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblsubTotalMouseClicked

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
            java.util.logging.Logger.getLogger(rest_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rest_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rest_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rest_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){ 
            
                new rest_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbTNdIV;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEquals;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnPlusSub;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnSub;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JButton jButton14;
    private javax.swing.JCheckBox jCBCBurger;
    private javax.swing.JCheckBox jCChicBurger;
    private javax.swing.JCheckBox jCChicBurgerMeal;
    private javax.swing.JCheckBox jCDelivery;
    private javax.swing.JCheckBox jCTax;
    private javax.swing.JComboBox jCmbDrink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbTNmULT;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JComboBox jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JLabel jlblCostOfDelivery;
    private javax.swing.JLabel jlblCostOfDrinks;
    private javax.swing.JLabel jlblCostOfMeal;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblsubTotal;
    private javax.swing.JTextField jtxtBCBurger;
    private javax.swing.JTextField jtxtChicBurger;
    private javax.swing.JTextField jtxtChicBurgerMeal;
    private javax.swing.JTextField jtxtConvert;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
