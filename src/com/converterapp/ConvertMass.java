package com.converterapp;
import java.awt.Color;
/**
 *
 * @author Admin
 */
public class ConvertMass extends javax.swing.JFrame {

    /**
     * Creates new form ConvertWeight
     */
    public ConvertMass() {
        initComponents();
        Color backgroundcolor=new Color(255,102,102);
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entermassjLabel = new javax.swing.JLabel();
        WeightText = new javax.swing.JTextField();
        fromjLabel = new javax.swing.JLabel();
        fromunit = new javax.swing.JComboBox();
        tojLabel = new javax.swing.JLabel();
        tounit = new javax.swing.JComboBox();
        convertbutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        convertedweight = new javax.swing.JTextField();
        gobacktohomepagebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weight Converter");
        setBackground(new java.awt.Color(255, 102, 102));
        setLocation(new java.awt.Point(10, 10));
        setSize(new java.awt.Dimension(600, 600));

        entermassjLabel.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        entermassjLabel.setForeground(new java.awt.Color(0, 0, 0));
        entermassjLabel.setText("ENTER  MASS: ");

        WeightText.setBackground(new java.awt.Color(255, 255, 255));
        WeightText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        WeightText.setToolTipText("");

        fromjLabel.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        fromjLabel.setForeground(new java.awt.Color(0, 0, 0));
        fromjLabel.setText("FROM UNIT: ");

        fromunit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fromunit.setForeground(new java.awt.Color(0, 0, 0));
        fromunit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kilogram", "Gram", "Milligram", "tonne", "US Ton", "Pound", "Ounce" }));

        tojLabel.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        tojLabel.setForeground(new java.awt.Color(0, 0, 0));
        tojLabel.setText("TO UNIT:");

        tounit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tounit.setForeground(new java.awt.Color(0, 0, 0));
        tounit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kilogram", "Gram", "Milligram", "tonne", "US Ton", "Pound", "Ounce" }));

        convertbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        convertbutton.setForeground(new java.awt.Color(0, 0, 0));
        convertbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\reload.png")); // NOI18N
        convertbutton.setText("CONVERT");
        convertbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertbuttonMouseClicked(evt);
            }
        });

        resetbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(0, 0, 0));
        resetbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\cancel.png")); // NOI18N
        resetbutton.setText("RESET");
        resetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbuttonMouseClicked(evt);
            }
        });

        closebutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closebutton.setForeground(new java.awt.Color(0, 0, 0));
        closebutton.setText("CLOSE");
        closebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebuttonMouseClicked(evt);
            }
        });

        convertedweight.setBackground(new java.awt.Color(255, 255, 255));
        convertedweight.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        convertedweight.setForeground(new java.awt.Color(0, 0, 0));

        gobacktohomepagebutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gobacktohomepagebutton.setForeground(new java.awt.Color(0, 0, 0));
        gobacktohomepagebutton.setText("GO BACK TO HOME PAGE");
        gobacktohomepagebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobacktohomepagebuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fromjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addComponent(entermassjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fromunit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tounit, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(convertedweight)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(convertbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(closebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gobacktohomepagebutton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entermassjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromunit, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(fromjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tounit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(convertedweight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(gobacktohomepagebutton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        
            dispose();
            Close cl=new Close();       
    }//GEN-LAST:event_closebuttonMouseClicked

    private void resetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbuttonMouseClicked
        // TODO add your handling code here:
        dispose();
        ConvertMass cw=new ConvertMass();
        
    }//GEN-LAST:event_resetbuttonMouseClicked

    private void convertbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertbuttonMouseClicked
        // TODO add your handling code here:
        String from,to,ans,convert;
        from=fromunit.getSelectedItem().toString();
        to=tounit.getSelectedItem().toString();
        convert=WeightText.getText();
        if (from.equals("Kilogram") && to.equals("Kilogram"))   //1
        {
            ans=kilogramtokilogram(convert);
            convertedweight.setText(convert+" kg = "+ans+" kg");
        }
        else if(from.equals("Kilogram") && to.equals("Gram"))   //2
        {
            ans=kilogramtogram(convert);
            convertedweight.setText(convert+" kg = "+ans+" g");
        }
        else if(from.equals("Kilogram") && to.equals("Milligram"))   //3
        {
            ans=kilogramtomilligram(convert);
            convertedweight.setText(convert+" kg = "+ans+" mg");
        }
        else if(from.equals("Kilogram") && to.equals("tonne"))   //4
        {
            ans=kilogramtotonne(convert);
            convertedweight.setText(convert+" kg = "+ans+" t");
        }
        else if(from.equals("Kilogram") && to.equals("US Ton"))   //5
        {
            ans=kilogramtoUSTon(convert);
            convertedweight.setText(convert+" kg = "+ans+" short ton");
        }
        else if(from.equals("Kilogram") && to.equals("Pound"))   //6
        {
            ans=kilogramtopound(convert);
            convertedweight.setText(convert+" kg = "+ans+" lb");
        }
        else if(from.equals("Kilogram") && to.equals("Ounce"))   //7
        {
            ans=kilogramtoounce(convert);
            convertedweight.setText(convert+" kg = "+ans+" oz");
        }
        else if(from.equals("Gram") && to.equals("Kilogram"))   //8
        {
            ans=gramtokilogram(convert);
            convertedweight.setText(convert+" g = "+ans+" kg");
        }
        else if(from.equals("Gram") && to.equals("Gram"))   //9
        {
            ans=gramtogram(convert);
            convertedweight.setText(convert+" g = "+ans+" g");
        }
        else if(from.equals("Gram") && to.equals("Milligram"))   //10
        {
            ans=gramtomilligram(convert);
            convertedweight.setText(convert+" g = "+ans+" mg");
        }
        else if(from.equals("Gram") && to.equals("tonne"))   //11
        {
            ans=gramtotonne(convert);
            convertedweight.setText(convert+" g = "+ans+" t");
        }
        else if(from.equals("Gram") && to.equals("US Ton"))   //12
        {
            ans=gramtoUSTon(convert);
            convertedweight.setText(convert+" g = "+ans+" short ton");
        }
        else if(from.equals("Gram") && to.equals("Pound"))   //13
        {
            ans=gramtopound(convert);
            convertedweight.setText(convert+" g = "+ans+" lb");
        }
        else if(from.equals("Gram") && to.equals("Ounce"))   //14
        {
            ans=gramtoounce(convert);
            convertedweight.setText(convert+" g = "+ans+" oz");
        }
        else if(from.equals("Milligram") && to.equals("Kilogram"))   //15
        {
            ans=milligramtokilogram(convert);
            convertedweight.setText(convert+" mg = "+ans+" kg");
        }
        else if(from.equals("Milligram") && to.equals("Gram"))   //16
        {
            ans=milligramtogram(convert);
            convertedweight.setText(convert+" mg = "+ans+" g");
        }
        else if(from.equals("Milligram") && to.equals("Milligram"))   //17
        {
            ans=milligramtomilligram(convert);
            convertedweight.setText(convert+" mg = "+ans+" mg");
        }
        else if(from.equals("Milligram") && to.equals("tonne"))   //18
        {
            ans=milligramtotonne(convert);
            convertedweight.setText(convert+" mg = "+ans+" t");
        }
        else if(from.equals("Milligram") && to.equals("US Ton"))   //19
        {
            ans=milligramtoUSTon(convert);
            convertedweight.setText(convert+" mg = "+ans+" short ton");
        }
        else if(from.equals("Milligram") && to.equals("Pound"))   //20
        {
            ans=milligramtopound(convert);
            convertedweight.setText(convert+" mg = "+ans+" lb");
        }
        else if(from.equals("Milligram") && to.equals("Ounce"))   //21
        {
            ans=milligramtoounce(convert);
            convertedweight.setText(convert+" mg = "+ans+" oz");
        }
        else if(from.equals("tonne") && to.equals("Kilogram"))   //22
        {
            ans=tonnetokilogram(convert);
            convertedweight.setText(convert+" t = "+ans+" kg");
        }
        else if(from.equals("tonne") && to.equals("Gram"))   //23
        {
            ans=tonnetogram(convert);
            convertedweight.setText(convert+" t = "+ans+" g");
        }
        else if(from.equals("tonne") && to.equals("milligramgram"))   //24
        {
            ans=tonnetomilligram(convert);
            convertedweight.setText(convert+" t = "+ans+" mg");
        }
        else if(from.equals("tonne") && to.equals("tonne"))   //25
        {
            ans=tonnetotonne(convert);
            convertedweight.setText(convert+" t = "+ans+" t");
        }
        else if(from.equals("tonne") && to.equals("US Ton"))   //26
        {
            ans=tonnetoUSTon(convert);
            convertedweight.setText(convert+" t = "+ans+" short ton");
        }
        else if(from.equals("tonne") && to.equals("Pound"))   //27
        {
            ans=tonnetopound(convert);
            convertedweight.setText(convert+" t = "+ans+" lb");
        }
        else if(from.equals("tonne") && to.equals("Ounce"))   //28
        {
            ans=tonnetoounce(convert);
            convertedweight.setText(convert+" t = "+ans+" oz");
        }
        else if(from.equals("US Ton") && to.equals("Kilogram"))   //29
        {
            ans=USTontokilogram(convert);
            convertedweight.setText(convert+" short ton = "+ans+" kg");
        }
        else if(from.equals("US Ton") && to.equals("Gram"))   //30
        {
            ans=USTontogram(convert);
            convertedweight.setText(convert+" short ton = "+ans+" g");
        }
        else if(from.equals("US Ton") && to.equals("Milligram"))   //31
        {
            ans=USTontomilligram(convert);
            convertedweight.setText(convert+" short ton = "+ans+" mg");
        }
        else if(from.equals("US Ton") && to.equals("tonne"))   //32
        {
            ans=USTontotonne(convert);
            convertedweight.setText(convert+" short ton = "+ans+" t");
        }
        else if(from.equals("US Ton") && to.equals("US Ton"))   //33
        {
            ans=USTontoUSTon(convert);
            convertedweight.setText(convert+" short ton = "+ans+" short ton");
        }
        else if(from.equals("US Ton") && to.equals("Pound"))   //34
        {
            ans=USTontopound(convert);
            convertedweight.setText(convert+" short ton = "+ans+" lb");
        }
        else if(from.equals("US Ton") && to.equals("Ounce"))   //35
        {
            ans=USTontoounce(convert);
            convertedweight.setText(convert+" short ton = "+ans+" oz");
        }
        else if(from.equals("Pound") && to.equals("Kilogram"))   //36
        {
            ans=poundtokilogram(convert);
            convertedweight.setText(convert+" lb = "+ans+" kg");
        }
        else if(from.equals("Pound") && to.equals("Gram"))   //37
        {
            ans=poundtogram(convert);
            convertedweight.setText(convert+" lb = "+ans+" g");
        }
        else if(from.equals("Pound") && to.equals("Milligram"))   //38
        {
            ans=poundtomilligram(convert);
            convertedweight.setText(convert+" lb = "+ans+" mg");
        }
        else if(from.equals("Pound") && to.equals("tonne"))   //39
        {
            ans=poundtotonne(convert);
            convertedweight.setText(convert+" lb = "+ans+" t");
        }
        else if(from.equals("Pound") && to.equals("US Ton"))   //40
        {
            ans=poundtoUSTon(convert);
            convertedweight.setText(convert+" lb = "+ans+" short ton");
        }
        else if(from.equals("Pound") && to.equals("Pound"))   //41
        {
            ans=poundtopound(convert);
            convertedweight.setText(convert+" lb = "+ans+" lb");
        }
        else if(from.equals("Pound") && to.equals("Ounce"))   //42
        {
            ans=poundtoounce(convert);
            convertedweight.setText(convert+" lb = "+ans+" oz");
        }
        else if(from.equals("Ounce") && to.equals("Kilogram"))   //43
        {
            ans=ouncetokilogram(convert);
            convertedweight.setText(convert+" oz = "+ans+" kg");
        }
        else if(from.equals("Ounce") && to.equals("Gram"))   //44
        {
            ans=ouncetogram(convert);
            convertedweight.setText(convert+" oz = "+ans+" g");
        }
        else if(from.equals("Ounce") && to.equals("Milligram"))   //45
        {
            ans=ouncetomilligram(convert);
            convertedweight.setText(convert+" oz = "+ans+" mg");
        }
        else if(from.equals("Ounce") && to.equals("tonne"))   //46
        {
            ans=ouncetotonne(convert);
            convertedweight.setText(convert+" oz = "+ans+" t");
        }
        else if(from.equals("Ounce") && to.equals("US Ton"))   //47
        {
            ans=ouncetoUSTon(convert);
            convertedweight.setText(convert+" oz = "+ans+" short ton");
        }
        else if(from.equals("Ounce") && to.equals("Pound"))   //48
        {
            ans=ouncetopound(convert);
            convertedweight.setText(convert+" oz = "+ans+" lb");
        }
        else if(from.equals("Ounce") && to.equals("Ounce"))   //49
        {
            ans=ouncetoounce(convert);
            convertedweight.setText(convert+" oz = "+ans+" oz");
        }
        
        
        
        
    }//GEN-LAST:event_convertbuttonMouseClicked

    private void gobacktohomepagebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobacktohomepagebuttonMouseClicked
        // TODO add your handling code here:
        dispose();
        Start s=new Start();
    }//GEN-LAST:event_gobacktohomepagebuttonMouseClicked

    /**
     * @param val
     * @return 
     */
    public String kilogramtokilogram(String val)   //1) kg to kg
    {
        return val;
    }
    public String kilogramtogram(String val)    //2) kg to g
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1000);
        return ans;
    }
    public String kilogramtomilligram(String val)   //3) kg to mg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1000000);
        return ans;
    }
    public String kilogramtotonne(String val)   //4) kg to t
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1000);
        return ans;
    }
    public String kilogramtoUSTon(String val)   //5) kg to short ton
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/907);
        return ans;
    }
    public String kilogramtopound(String val)   //6) kg to lb
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*2.205);
        return ans;
    }
    public String kilogramtoounce(String val)   //7) kg to oz
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*35.274);
        return ans;
    }
    public String gramtokilogram(String val)    //8) g to kg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1000);
        return ans;
    }
    public String gramtogram(String val)    //9) g to g
    {
        return val;
    }
    public String gramtomilligram(String val)    //10) g to mg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1000);
        return ans;
    }
    public String gramtotonne(String val)    //11) g to t
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1000000);
        return ans;
    }
    public String gramtoUSTon(String val)    //12) g to short ton
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/907185);
        return ans;
    }
    public String gramtopound(String val)    //13) g to lb
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/454);
        return ans;
    }
    public String gramtoounce(String val)    //14) g to oz
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/28.35);
        return ans;
    }
    public String milligramtokilogram(String val)    //15) mg to kg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1000000);
        return ans;
    }
    public String milligramtogram(String val)    //16) mg to g
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1000);
        return ans;
    }
    public String milligramtomilligram(String val)    //17) mg to mg
    {
        return val;
    }
    public String milligramtotonne(String val)    //18) mg to t
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1000000000);
        return ans;
    }
    public String milligramtoUSTon(String val)    //19) mg to short ton
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/907200000);
        return ans;
    }
    public String milligramtopound(String val)    //20) mg to lb
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/453592);
        return ans;
    }
    public String milligramtoounce(String val)    //21) mg to oz
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/28350);
        return ans;
    }
    public String tonnetokilogram(String val)    //22) tonne to kg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1000);
        return ans;
    }
    public String tonnetogram(String val)    //23) tonne to g
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1000000);
        return ans;
    }
    public String tonnetotonne(String val)    //24) tonne to tonne
    {
        return val;
    }
    public String tonnetomilligram(String val)    //25) tonne to mg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1000000000);
        return ans;
    }
    public String tonnetoUSTon(String val)    //26) tonne to short ton
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*1.102);
        return ans;
    }
    public String tonnetopound(String val)    //27) tonne to lb
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*2205);
        return ans;
    }
    public String tonnetoounce(String val)    //28) tonne to oz
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*35274);
        return ans;
    }
    public String USTontokilogram(String val)    //29) short ton to kg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*907);
        return ans;
    }
    public String USTontogram(String val)    //30) short ton to g
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*907185);
        return ans;
    }
    public String USTontomilligram(String val)    //31) short ton to mg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*907200000);
        return ans;
    }
    public String USTontotonne(String val)    //32) short ton to tonne
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/1.102);
        return ans;
    }
    public String USTontoUSTon(String val)    //33) short ton to short ton
    {
        return val;
    }
    public String USTontopound(String val)    //34) short ton to lb
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*2000);
        return ans;
    }
    public String USTontoounce(String val)    //35) short ton to oz
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*32000);
        return ans;
    }
    public String poundtokilogram(String val)    //36) lb to kg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/2.205);
        return ans;
    }
    public String poundtogram(String val)    //37) lb to g
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*454);
        return ans;
    }
    public String poundtomilligram(String val)    //38) lb to mg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*453592);
        return ans;
    }
    public String poundtotonne(String val)    //39) lb to t
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/2205);
        return ans;
    }
    public String poundtoUSTon(String val)    //40) lb to short ton
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/2000);
        return ans;
    }
    public String poundtopound(String val)    //41) lb to lb
    {
        return val;
    }
    public String poundtoounce(String val)    //42) lb to oz
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*16);
        return ans;
    }
    public String ouncetokilogram(String val)    //43) oz to kg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/35.274);
        return ans;
    }
    public String ouncetogram(String val)    //43) oz to g
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*28.35);
        return ans;
    }
    public String ouncetomilligram(String val)    //43) oz to mg
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input*28350);
        return ans;
    }
    public String ouncetotonne(String val)    //43) oz to t
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/35274);
        return ans;
    }
    public String ouncetoUSTon(String val)    //47) oz to short ton
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/32000);
        return ans;
    }
    public String ouncetopound(String val)    //48) oz to lb
    {
        String ans=val;
        double input=Double.parseDouble(val);
        ans=Double.toString(input/16);
        return ans;
    }
    public String ouncetoounce(String val)    //49) oz to oz
    {
        return val;
    }
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
            java.util.logging.Logger.getLogger(ConvertMass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertMass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertMass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertMass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertMass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField WeightText;
    private javax.swing.JButton closebutton;
    private javax.swing.JButton convertbutton;
    private javax.swing.JTextField convertedweight;
    private javax.swing.JLabel entermassjLabel;
    private javax.swing.JLabel fromjLabel;
    private javax.swing.JComboBox fromunit;
    private javax.swing.JButton gobacktohomepagebutton;
    private javax.swing.JButton resetbutton;
    private javax.swing.JLabel tojLabel;
    private javax.swing.JComboBox tounit;
    // End of variables declaration//GEN-END:variables
}
