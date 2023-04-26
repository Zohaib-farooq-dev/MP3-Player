
package playerapp;

import jaco.mp3.player.MP3Player;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.net.URI;

public class Lists extends javax.swing.JFrame {

     final URI uri;
     playerapp.LinkedList Songs = new playerapp.LinkedList();
    public Lists() throws Exception {
        this.uri = new URI ("https://www.youtube.com");
        Songs.add(1, "Pyaar by Yaser Desai" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Pyaar.mp3");
        Songs.add(2, "Roke na Ruke Naina By Arijit " ,"C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Naina.mp3" );
        Songs.add(3, "Salame Ishq by Lata Mangeshkar" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Salame Ishq.mp3");
        Songs.add(4, "Zaalima by Arijit" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Zaalima.mp3");
        Songs.add(5, "Kahani Suno by Kaifi Khalil" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Kahani Suno.mp3");
        Songs.add(6, "Rafta Rafta by Muhammad Ali" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Rafta Rafta.mp3");
        Songs.add(7, "Sajna" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Sajna.mp3");
        Songs.add(8, "Soochta Hun by Nusrat Fateh Ali Khan" , "C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Music\\Soochta Hun.mp3");
        initComponents();
    }
    
     Node ptr;
     MP3Player player;
     int currentSongIndex =1;
    
   
    public void stop(){
        player.stop();
    }
    public void play(int i ) {
       Node curr = Songs.get(i);
       File file = new File(curr.key);
       player = new MP3Player(new File(curr.key));
       player.play();
       ptr = curr;
       jLabel2.setText(ptr.Name);
       jLabel2.setFont(new Font("Arial", Font.BOLD,18));
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Pause = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Resume = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Player App");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 3, 24)); // NOI18N
        jLabel1.setText("    MP3 Player App   ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 490, 72));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 3, 18)); // NOI18N
        jLabel7.setText("SONGS AVAILABLE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 103, 185, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pyaar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 99, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Naina");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 180, 101, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salame Ishq");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 247, 99, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Zaalima");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 247, 101, -1));

        Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerapp/pause.PNG"))); // NOI18N
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });
        getContentPane().add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 70, 80));

        Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerapp/stop.PNG"))); // NOI18N
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 74, 87));

        Resume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerapp/resume.PNG"))); // NOI18N
        Resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumeActionPerformed(evt);
            }
        });
        getContentPane().add(Resume, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 75, 78));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setText("Browse More ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 246, -1, 56));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerapp/next.PNG"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 80, 80));

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerapp/previous.PNG"))); // NOI18N
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 83, 87));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Kahani Suno");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Rafta Rafta");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 300, 101, -1));

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Sajna ");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 353, 99, -1));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Soochta Hun");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 353, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 403, 540, 37));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerapp/mp3-player-with-headphones-isolated-white-background_608280-233.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(player !=null){
            stop();
        }
        play(1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(player !=null){
            stop();
        }
       play(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(player !=null){
            stop();
        }
       play(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          if(player !=null){
            stop();
        }
        play(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed
        player.pause();
    }//GEN-LAST:event_PauseActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        stop();
    }//GEN-LAST:event_StopActionPerformed

    private void ResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeActionPerformed
        player.play();
    }//GEN-LAST:event_ResumeActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
       if (Desktop.isDesktopSupported()) {
	   Desktop desktop = Desktop.getDesktop();
	   try {
		 desktop.browse(uri);
	       } catch (Exception ex) {
                   System.out.println(ex.getMessage());
	        }
	}  
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
          if(player !=null){
            stop();
        }
        play(8);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         if(player !=null){
            stop();
        }
       play(5);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         if(player !=null){
            stop();
        }
      play(6);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(player !=null){
            stop();
        }
         play(7);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        
         stop();
         player = new MP3Player(new File(ptr.next.key));
         player.play();
         ptr = ptr.next;
         jLabel2.setText(ptr.Name);
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed

        stop();
        player = new MP3Player(new File(ptr.prev.key));
        player.play();
        ptr = ptr.prev;
        jLabel2.setText(ptr.Name);
    }//GEN-LAST:event_previousActionPerformed

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
            java.util.logging.Logger.getLogger(Lists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lists().setVisible(true);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pause;
    private javax.swing.JButton Resume;
    private javax.swing.JButton Stop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
