package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javafx.scene.shape.Circle;
import javax.swing.*;

/**
 *
 * @author estudios
 */
public class Ventana extends JFrame implements ActionListener {

    JFrame marco;
    JPanel p1;
    JTextField txt;
    JButton b1, b2;
    Graphics g;
    
        
    public Ventana() {
        
        p1 = new JPanel();
        txt = new JTextField("0", 9);
        b1 = new JButton("dibuxa");
        b2 = new JButton("limpa");

        this.setLocation(540, 260);
        this.setSize(600, 400);
        b1.addActionListener(this);
        b2.addActionListener(this);

        p1.add(txt);
        p1.add(b1);
        p1.add(b2);
        this.add(p1);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object boton = ae.getSource();
        if (boton == b1) {
            paint(p1.getGraphics());
        }
        else{
            txt.setText("");
                    p1.repaint();
        
        }

    }

    public void paint(Graphics g) {

        int x = 100;
        int y = 100;
        for (int i = 0; i < Integer.parseInt(this.txt.getText()); i++) {
            x=x+25;
            y=y+25;
            g.setColor(Color.RED);
            g.drawOval(x, y, 20, 20);
            
        }
    }

}
