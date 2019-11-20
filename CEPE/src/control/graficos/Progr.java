/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.graficos;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Progr   {
    JFrame f  = new JFrame();
    JPanel p = new JPanel();
    JLabel l = new JLabel();
    
    public JFrame getF() {
        return f;
    }

    public void setF(JFrame f) {
        this.f = f;
    }

    public JPanel getP() {
        return p;
    }

    public void setP(JPanel p) {
        this.p = p;
    }
    

    final JProgressBar pr ;
    
    
     public  Progr() {
        UIManager.put("ProgressBar.background",Color.RED);
        
         pr = new JProgressBar();
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
         f.setPreferredSize(new Dimension(200,100));
         f.pack();
         f.setLocationRelativeTo(null);
         init();
         
         f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
	public void windowOpened(WindowEvent evt) {
		w.execute();
                
}
});
     
     
     
     
     
     
           
     }
     
     
     final SwingWorker w = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    try {
                        pr.setValue(i);
                        pr.setString(i + "%");
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    
                }
                f.dispose();
                return 0;
                
            }
        };
     
     
     
     public void init(){
        
        pr.setStringPainted(true);
        pr.setValue(0);
        pr.setSize(new Dimension(150, 75));
        p.setBackground(Color.black);
        l.setText("Carregando..");
        l.setForeground(Color.white);
        p.add(l);
        p.add(pr);
        f.add(p);
        
         
     }
     
     
	
     
}
     
  
    
   

