import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;

public class Memory extends javax.swing.JFrame
{
    static final int PHYSICAL_MEMORY_TOTAL_SIZE = 3072;   //3072                         //INITIALIZE MEMORY SIZE PER PAGE
    static final int PAGE_SIZE = 1024;
    public int Pages_In_Memory=0;
    public JButton[] Memory_Cells_1 = new JButton[PAGE_SIZE];
    public JButton[] Memory_Cells_2 = new JButton[PAGE_SIZE];
    public JButton[] Memory_Cells_3 = new JButton[PAGE_SIZE];
    MemoryItem Page_1 = new MemoryItem(Random_Size(),new Color(242,0,0),1);
    MemoryItem Page_2 = new MemoryItem(Random_Size(),new Color(255,119,0),2);
    MemoryItem Page_3 = new MemoryItem(Random_Size(),new Color(250, 255, 0),3);
    MemoryItem Page_4 = new MemoryItem(Random_Size(),new Color(12, 255, 0),4);
    MemoryItem Page_5 = new MemoryItem(Random_Size(),new Color(0, 255, 237),5);
    MemoryItem Page_6 = new MemoryItem(Random_Size(),new Color(4, 0, 255),6);
    MemoryItem Page_7 = new MemoryItem(Random_Size(),new Color(110, 0, 255),7);
    MemoryItem Page_8 = new MemoryItem(Random_Size(),new Color(255, 0, 220),8);
    
    ArrayList<MemoryItem> List = new ArrayList<>();
    ArrayList<MemoryItem> Frames = new ArrayList<>();
    ArrayList<JLabel> Labels = new ArrayList<>();
    ArrayList<MemoryItem> replaced = new ArrayList<>();
            
    public Memory()
    {
        initComponents();
        setup();                                                                //CREATE FIRST PAGE FRAME
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Page_Table = new javax.swing.JPanel();
        Page1 = new javax.swing.JButton();
        Page2 = new javax.swing.JButton();
        Page4 = new javax.swing.JButton();
        Page3 = new javax.swing.JButton();
        Page8 = new javax.swing.JButton();
        Page7 = new javax.swing.JButton();
        Page6 = new javax.swing.JButton();
        Page5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Status_1 = new javax.swing.JLabel();
        Status_2 = new javax.swing.JLabel();
        Status_3 = new javax.swing.JLabel();
        Status_4 = new javax.swing.JLabel();
        Status_5 = new javax.swing.JLabel();
        Status_6 = new javax.swing.JLabel();
        Status_7 = new javax.swing.JLabel();
        Status_8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        MemoryTABS = new javax.swing.JTabbedPane();
        Frame1 = new javax.swing.JPanel();
        Frame2 = new javax.swing.JPanel();
        Frame3 = new javax.swing.JPanel();
        EmptyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtual Memory Management");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        Page_Table.setBackground(new java.awt.Color(102, 102, 102));
        Page_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Page_Table.setAutoscrolls(true);

        Page1.setBackground(new java.awt.Color(204, 204, 204));
        Page1.setText("Page 1");
        Page1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page1ActionPerformed(evt);
            }
        });

        Page2.setBackground(new java.awt.Color(204, 204, 204));
        Page2.setText("Page 2");
        Page2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page2ActionPerformed(evt);
            }
        });

        Page4.setBackground(new java.awt.Color(204, 204, 204));
        Page4.setText("Page 4");
        Page4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page4ActionPerformed(evt);
            }
        });

        Page3.setBackground(new java.awt.Color(204, 204, 204));
        Page3.setText("Page 3");
        Page3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page3ActionPerformed(evt);
            }
        });

        Page8.setBackground(new java.awt.Color(204, 204, 204));
        Page8.setText("Page 8");
        Page8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page8ActionPerformed(evt);
            }
        });

        Page7.setBackground(new java.awt.Color(204, 204, 204));
        Page7.setText("Page 7");
        Page7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page7ActionPerformed(evt);
            }
        });

        Page6.setBackground(new java.awt.Color(204, 204, 204));
        Page6.setText("Page 6");
        Page6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page6ActionPerformed(evt);
            }
        });

        Page5.setBackground(new java.awt.Color(204, 204, 204));
        Page5.setText("Page 5");
        Page5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page5ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Page Table");

        Status_1.setForeground(new java.awt.Color(255, 255, 255));
        Status_1.setText(" ");

        Status_2.setForeground(new java.awt.Color(255, 255, 255));
        Status_2.setText(" ");

        Status_3.setForeground(new java.awt.Color(255, 255, 255));
        Status_3.setText(" ");

        Status_4.setForeground(new java.awt.Color(255, 255, 255));
        Status_4.setText(" ");

        Status_5.setForeground(new java.awt.Color(255, 255, 255));
        Status_5.setText(" ");

        Status_6.setForeground(new java.awt.Color(255, 255, 255));
        Status_6.setText(" ");

        Status_7.setForeground(new java.awt.Color(255, 255, 255));
        Status_7.setText(" ");

        Status_8.setForeground(new java.awt.Color(255, 255, 255));
        Status_8.setText(" ");

        javax.swing.GroupLayout Page_TableLayout = new javax.swing.GroupLayout(Page_Table);
        Page_Table.setLayout(Page_TableLayout);
        Page_TableLayout.setHorizontalGroup(
            Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page_TableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Page2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page8, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Status_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Page_TableLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(152, 152, 152))
        );
        Page_TableLayout.setVerticalGroup(
            Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page_TableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_8))
                .addContainerGap())
        );

        console.setEditable(false);
        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Changes Made");

        MemoryTABS.setBackground(new java.awt.Color(204, 204, 204));

        Frame1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Frame1Layout = new javax.swing.GroupLayout(Frame1);
        Frame1.setLayout(Frame1Layout);
        Frame1Layout.setHorizontalGroup(
            Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        Frame1Layout.setVerticalGroup(
            Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        MemoryTABS.addTab("Page Frame1", Frame1);

        Frame2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Frame2Layout = new javax.swing.GroupLayout(Frame2);
        Frame2.setLayout(Frame2Layout);
        Frame2Layout.setHorizontalGroup(
            Frame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        Frame2Layout.setVerticalGroup(
            Frame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        MemoryTABS.addTab("Page Frame 2", Frame2);

        Frame3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Frame3Layout = new javax.swing.GroupLayout(Frame3);
        Frame3.setLayout(Frame3Layout);
        Frame3Layout.setHorizontalGroup(
            Frame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        Frame3Layout.setVerticalGroup(
            Frame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        MemoryTABS.addTab("Page Frame 3", Frame3);

        EmptyButton.setBackground(new java.awt.Color(204, 204, 204));
        EmptyButton.setText("Empty Memory");
        EmptyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmptyMemory(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(628, Short.MAX_VALUE)
                        .addComponent(EmptyButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Page_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(MemoryTABS, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmptyButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Page_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MemoryTABS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Page1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page1ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_1);
                console.append("Page 1 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_1);
                console.append("Page 1 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_1);
                console.append("Page 1 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_1);
                break;
            }
        }        
    }//GEN-LAST:event_Page1ActionPerformed

    private void Page2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page2ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_2);
                console.append("Page 2 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_2);
                console.append("Page 2 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_2);
                console.append("Page 2 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_2);
                break;
            }
        } 
    }//GEN-LAST:event_Page2ActionPerformed

    private void Page3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page3ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_3);
                console.append("Page 3 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_3);
                console.append("Page 3 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_3);
                console.append("Page 3 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_3);
                break;
            }
        }
    }//GEN-LAST:event_Page3ActionPerformed

    private void Page4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page4ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_4);
                console.append("Page 4 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_4);
                
                console.append("Page 4 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_4);
                
                console.append("Page 4 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_4);
                break;
            }
        }
    }//GEN-LAST:event_Page4ActionPerformed

    private void Page5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page5ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_5);
                console.append("Page 5 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_5);
                console.append("Page 5 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_5);
                console.append("Page 5 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_5);
                break;
            }
        }
    }//GEN-LAST:event_Page5ActionPerformed

    private void Page6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page6ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_6);
                console.append("Page 6 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_6);
                console.append("Page 6 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_6);
                console.append("Page 6 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_6);
                break;
            }
        }
    }//GEN-LAST:event_Page6ActionPerformed

    private void Page7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page7ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_7);
                console.append("Page 7 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_7);
                console.append("Page 7 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_7);
                console.append("Page 7 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_7);
                break;
            }
        }
    }//GEN-LAST:event_Page7ActionPerformed

    private void Page8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page8ActionPerformed
        switch(Pages_In_Memory)
        {
            case 0:
            {
                AddToPage(1,Page_8);
                console.append("Page 8 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 1:
            {
                AddToPage(2,Page_8);
                console.append("Page 8 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 2:
            {
                AddToPage(3,Page_8);
                console.append("Page 8 mapped to Frame "+(Pages_In_Memory)+"\n");
                break;
            }
            case 3:
            {
                ReplaceWorker job = new ReplaceWorker();
                job.execute();
                replaced.add(Page_8);
                break;
            }
        }
    }//GEN-LAST:event_Page8ActionPerformed

    private void EmptyMemory(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmptyMemory
        
        for(int i=0;i<PAGE_SIZE;i++)
        {
            Memory_Cells_1[i].setBackground(WHITE);
            Memory_Cells_2[i].setBackground(WHITE);
            Memory_Cells_3[i].setBackground(WHITE);
        }
        console.append("All pages unmapped from Memory\n");
        for(int i=0;i<8;i++)
            Labels.get(i).setText("Current Status: In Secondary Memory");
        Pages_In_Memory = 0;
        
        Frames.clear();
    }//GEN-LAST:event_EmptyMemory
    
    public void AddToPage(int page, MemoryItem temp)
    {

        switch(page)
        {
            case 1:
            {
                for(int i = 0; i < temp.getEnd(); i++)
                {
                    Memory_Cells_1[i].setBackground(temp.getColor());
                    Memory_Cells_1[i].setOpaque(true);
                }
                Frames.add(0, temp);
                Pages_In_Memory++;
                Labels.get(temp.getPage()-1).setText("Current Status: Mapped to Frame 1");
                break;
            }
            case 2:
            {
                for(int i = 0; i < temp.getEnd(); i++)
                    Memory_Cells_2[i].setBackground(temp.getColor());
                Frames.add(1, temp);
                Pages_In_Memory++;
                Labels.get(temp.getPage()-1).setText("Current Status: Mapped to Frame 2");
                break;
            }
            case 3:
            {
                for(int i = 0; i < temp.getEnd(); i++)
                    Memory_Cells_3[i].setBackground(temp.getColor());
                Frames.add(2, temp);
                Pages_In_Memory++;
                Labels.get(temp.getPage()-1).setText("Current Status: Mapped to Frame 3");
                break;
            }
            
        }
        
        //console.append(Frames.toString());
    }
    
    public void replace(MemoryItem temp)
    {
        if(Frames.contains(temp))
            console.append("Page "+temp.getPage()+" already mapped to primary memory\n");
        else
        {
            JOptionPane.showMessageDialog(jPanel1,"PAGE FAULT: PAGE NOT MAPPED TO FRAME ","Page Fault",JOptionPane.ERROR_MESSAGE);
            
            console.append("\nSaving Page data to Secondary Memory\n");
            
            try{TimeUnit.MILLISECONDS.sleep(350);} catch(Exception e){}
            
            console.append("\nPage in Frame 1 unmapped\n");
            
            Labels.get(Frames.get(0).getPage()-1).setText("Current Status: In Secondary Memory");
            
            
            Frames.remove(0);
            Frames.add(2,temp);
            
            for(int i=0;i<PAGE_SIZE;i++)
            {
                Memory_Cells_1[i].setBackground(WHITE);
                Memory_Cells_2[i].setBackground(WHITE);
                Memory_Cells_3[i].setBackground(WHITE);
            }
            
            Labels.get(Frames.get(0).getPage()-1).setText("Current Status: Mapped to Frame 1");
            for(int i = 0; i<Frames.get(0).getEnd();i++)
            {
                Memory_Cells_1[i].setBackground(Frames.get(0).getColor());

            }
            
            Labels.get(Frames.get(1).getPage()-1).setText("Current Status: Mapped to Frame 2");
            
            try{TimeUnit.MILLISECONDS.sleep(500);} catch(Exception e){}
            
            for(int i = 0; i<Frames.get(1).getEnd();i++)
            {
                Memory_Cells_2[i].setBackground(Frames.get(1).getColor());

            }
            
            try{TimeUnit.MILLISECONDS.sleep(500);} catch(Exception e){}
            
            Labels.get(temp.getPage()-1).setText("Current Status: Mapped to Frame 3");
            for(int i = 0; i<Frames.get(2).getEnd();i++)
            {
                Memory_Cells_3[i].setBackground(Frames.get(2).getColor());

            }
            
            try{TimeUnit.MILLISECONDS.sleep(500);} catch(Exception e){}
            
            
            console.append("\nMapped Page "+temp.getPage()+" to memory\n");
            replaced.clear();
        }
    }
    
    class ReplaceWorker extends SwingWorker<Void,Void>
    {
        @Override
        public Void doInBackground()
        {
            replace(replaced.get(0));
            return null;
        }
        
        @Override
        public void done()
        {
            
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmptyButton;
    private javax.swing.JPanel Frame1;
    private javax.swing.JPanel Frame2;
    private javax.swing.JPanel Frame3;
    private javax.swing.JTabbedPane MemoryTABS;
    public javax.swing.JButton Page1;
    public javax.swing.JButton Page2;
    public javax.swing.JButton Page3;
    public javax.swing.JButton Page4;
    public javax.swing.JButton Page5;
    public javax.swing.JButton Page6;
    public javax.swing.JButton Page7;
    public javax.swing.JButton Page8;
    private javax.swing.JPanel Page_Table;
    private javax.swing.JLabel Status_1;
    private javax.swing.JLabel Status_2;
    private javax.swing.JLabel Status_3;
    private javax.swing.JLabel Status_4;
    private javax.swing.JLabel Status_5;
    private javax.swing.JLabel Status_6;
    private javax.swing.JLabel Status_7;
    private javax.swing.JLabel Status_8;
    private javax.swing.JTextArea console;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void setup()
    {
        Frame1.setLayout(new GridLayout(32, 64, 1, 1));
        Frame2.setLayout(new GridLayout(32, 64, 1, 1));
        Frame3.setLayout(new GridLayout(32, 64, 1, 1));
        for (int r = 0; r < PAGE_SIZE; r++)
        {
            
                Memory_Cells_1[r] = new JButton();		
                Frame1.add(Memory_Cells_1[r]);
                Memory_Cells_1[r].setPreferredSize(new Dimension(3, 3));
                Memory_Cells_1[r].setBackground(Color.WHITE);
                Memory_Cells_1[r].setOpaque(false);
            
                Memory_Cells_2[r] = new JButton();		
                Frame2.add(Memory_Cells_2[r]);
                Memory_Cells_2[r].setPreferredSize(new Dimension(3, 3));
                Memory_Cells_2[r].setBackground(Color.WHITE);
            
                Memory_Cells_3[r] = new JButton();		
                Frame3.add(Memory_Cells_3[r]);
                Memory_Cells_3[r].setPreferredSize(new Dimension(3, 3));
                Memory_Cells_3[r].setBackground(Color.WHITE);
            
        }
        
        //add(Page_Table);
        
        Labels.add(Status_1);
        Labels.add(Status_2);
        Labels.add(Status_3);
        Labels.add(Status_4);
        Labels.add(Status_5);
        Labels.add(Status_6);
        Labels.add(Status_7);
        Labels.add(Status_8);
        
        for(int i=0;i<8;i++)
            Labels.get(i).setText("Current Status: In Secondary Memory");
        
        List.add(Page_1);
        List.add(Page_2);
        List.add(Page_3);
        List.add(Page_4);
        List.add(Page_5);
        List.add(Page_6);
        List.add(Page_7);
        List.add(Page_8);
        
        Page1.setBackground(Page_1.getColor());
        Page2.setBackground(Page_2.getColor());
        Page3.setBackground(Page_3.getColor());
        Page4.setBackground(Page_4.getColor());
        Page5.setBackground(Page_5.getColor());
        Page6.setBackground(Page_6.getColor());
        Page7.setBackground(Page_7.getColor());
        Page8.setBackground(Page_8.getColor());
        
    }
    
    public Color randomColor()
    {
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 1.0f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        Color col = Color.getHSBColor(hue, saturation, luminance);
        return col;
    }

    private int Random_Size()
    {
        return (int)(Math.random() * ((1023 - 0) + 1)) + 0;
    }
}