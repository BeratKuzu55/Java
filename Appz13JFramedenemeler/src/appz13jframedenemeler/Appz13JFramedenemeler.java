
package appz13jframedenemeler;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Appz13JFramedenemeler 
{


    
    public static class hesap_makinesi extends JFrame implements ActionListener , MouseListener
    {
        JButton jbtn1 , jbtn2 , jbtn3 , jbtn4;
        JTextField jtf1;
        JTextField jtf2;
        JTextField jtf3;
        JLabel lbl1 , lbl2 , lbl3 ;
         public hesap_makinesi() 
        {
       
        
        super("hesap makinesi");
        this.setVisible(true);
                 // ekran x,y   size x,y
        this.setBounds(400, 250, 300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        
        jbtn1 = new JButton("+");
        jbtn1.setBounds(50, 150, 50, 50);
        this.add(jbtn1);
        jbtn1.addActionListener(this);
        jbtn1.addMouseListener(this);
        
        jbtn2 = new JButton("-");
        jbtn2.setBounds(100, 150, 50, 50);
        this.add(jbtn2);
        jbtn2.addActionListener(this);
        jbtn2.addMouseListener(this);
        
        jbtn3 = new JButton("*");
        jbtn3.setBounds(150, 150, 50, 50);
        this.add(jbtn3);
        jbtn3.addActionListener(this);
        jbtn3.addMouseListener(this);
        
        jbtn4 = new JButton("/");
        jbtn4.setBounds(200, 150, 50, 50);
        this.add(jbtn4);
        jbtn4.addActionListener(this);
        jbtn4.addMouseListener(this);
        
        jtf1 = new JTextField();
        jtf1.setBounds(100, 50, 100, 20);
        jtf1.setVisible(true);
        this.add(jtf1);
        
        jtf2 = new JTextField();
        jtf2.setBounds(100, 75, 100, 20);
        jtf2.setVisible(true);
        this.add(jtf2);
        
        
        jtf3 = new JTextField();
        jtf3.setBounds(100, 100, 100, 20);
        jtf3.setVisible(true); 
        jtf3.setEditable(false);
        this.add(jtf3);
        
        
        
        lbl1 = new JLabel("ilk değer");
        lbl2 = new JLabel("ikinci değer");
        lbl3 = new JLabel("sonuç");
        
        lbl1.setVisible(true);
        lbl2.setVisible(true);
        lbl3.setVisible(true);
        
        lbl1.setBounds(10, 50, 75, 20);
        lbl2.setBounds(10, 75, 75, 20);
        lbl3.setBounds(10, 100, 75, 20);
        
        this.add(lbl1);
        this.add(lbl2);
        this.add(lbl3);
        
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
           
            int first_val = Integer.parseInt(jtf1.getText());
            int second_val = Integer.parseInt(jtf2.getText());
            
             
            if(e.getSource().equals(jbtn1))
            {
                jtf3.setText( String.valueOf(first_val + second_val));
            }
            else if(e.getSource().equals(jbtn2))
            {
                jtf3.setText( String.valueOf(first_val - second_val));
            }
            else if(e.getSource().equals(jbtn3))
            {
                jtf3.setText( String.valueOf(first_val * second_val));
            }
            else 
            {
                jtf3.setText( String.valueOf(first_val / second_val));
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
           
        }

        @Override
        public void mousePressed(MouseEvent me) {
           
        }

        @Override
        public void mouseReleased(MouseEvent me) {
          
        }

        @Override
        public void mouseEntered(MouseEvent me) {
           if( me.getSource().equals(jbtn1))
           {
               jbtn1.setBackground(Color.yellow);
           }
           else if( me.getSource().equals(jbtn2))
           {
               jbtn2.setBackground(Color.yellow);
           }
           else if( me.getSource().equals(jbtn3))
           {
               jbtn3.setBackground(Color.yellow);
           }
           else
           {
                 jbtn4.setBackground(Color.yellow);
           }
             
            
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
           if( me.getSource().equals(jbtn1))
               jbtn1.setBackground(Color.LIGHT_GRAY);
           
           if( me.getSource().equals(jbtn2))
               jbtn2.setBackground(Color.LIGHT_GRAY);
           
           if( me.getSource().equals(jbtn3))
               jbtn3.setBackground(Color.LIGHT_GRAY);
           
           if( me.getSource().equals(jbtn4))
               jbtn4.setBackground(Color.LIGHT_GRAY);
            
        }

    
        
        
    }
    
    
    
    
    
    
    public static class radio_button extends JFrame implements ActionListener 
    {
        JRadioButton rb1 , rb2;
        radio_button()
        {
            
            super("radio button trying");
            this.setVisible(true);
            this.setBounds(new Rectangle(500, 300));
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setLocation(450, 300);
            
            rb1 = new JRadioButton("1.radio button");
            rb1.setBounds(50, 100, 200, 25);
            rb1.setVisible(true);
            this.add(rb1);
            rb1.addActionListener(this);
            
            
            rb2 = new JRadioButton("2.radio button");
            rb2.setBounds(50, 150, 200, 25);
            rb2.setVisible(true);
            this.add(rb2);
            rb2.addActionListener(this);
            
            // ne işe yarıyor bilmiyorum lab da hoca yaptı 
            ButtonGroup bg = new ButtonGroup();
            bg.add(rb1);
            bg.add(rb2);
            
            
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
             
            
            if(rb1.isSelected())
                JOptionPane.showConfirmDialog(this, "1. button secildi");
            else if(rb2.isSelected())
                 JOptionPane.showConfirmDialog(this, "2. button secildi");
            else if(rb1.isSelected() && rb2.isSelected())
                JOptionPane.showConfirmDialog(this, "1. ve 2. button seçildi");
            else
                 JOptionPane.showConfirmDialog(this, "seçim yok");
            
            
            /*    bu şekilde de olur 
            if(ae.getSource().equals(rb1))
                JOptionPane.showConfirmDialog(this, "1. button secildi");
            else if(ae.getSource().equals(rb2))
                 JOptionPane.showConfirmDialog(this, "2. button secildi");
            else
                 JOptionPane.showConfirmDialog(this, "1. ve 2. button secildi"); */
            
            
        }
        
        
        
        
    }
    
  
    public static class three_panelli_list
    {
        
    }
    
    
    
    
    
    
    public static void main(String[] args) 
    {
        
        //hesap_m();
        radio_bt_try();
    }
    
   
    
    public static void hesap_m()
    {
        hesap_makinesi hm = new hesap_makinesi();
    }
    
     public static void radio_bt_try()
     {
         radio_button rb = new radio_button();
     }
   

    
  
    
    
    
}
