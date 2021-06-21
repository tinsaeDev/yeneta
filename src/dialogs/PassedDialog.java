

// Class name : PassedDialog.java
// package : dialogs
// project : Yeneta
// Purpose : Used whwn user passes a lesson
// Author  : Tinsae Belay
// Date : Dec 17, 2017

package dialogs;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PassedDialog extends JDialog{
    
   final int dialogWidth = 267;
   final int dialogHeight = 420;
   
    BufferedImage bufImage;
    JPanel panel;
    JPanel superPanel = new JPanel();
    JButton button = new JButton( new ImageIcon("data\\image\\dialogs\\passedButton.png") );
    BufferedImage img;
    public PassedDialog(){
       
        button.setBackground(Color.GREEN);
        button.setForeground(Color.WHITE);
        button.setBorder( BorderFactory.createEmptyBorder() );
        button.setFont( new Font("roboto",Font.PLAIN,30) );
        button.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            
            }
        
        } );
        
        
       try {
           img = ImageIO.read(new File("data\\image\\dialogs\\passedBg.png") );
       } catch (IOException ex) {
           System.err.println( "File not found "+ ex.toString() );
           ex.printStackTrace();
       }
        
        panel = new JPanel( new BorderLayout() ){
            @Override
        public void paintComponent(Graphics gg){
            Graphics2D g = (Graphics2D) gg;
                       g.drawImage( img,0,0,dialogWidth,dialogHeight,0,0,dialogWidth,dialogHeight,null);
        }
        };
        
        panel.add(button,BorderLayout.SOUTH);
        
        
        
        
        this.add(panel);
        this.setSize(dialogWidth,dialogHeight);
        this.setModal(true);
        this.setResizable(false);
   
    }
    
}


