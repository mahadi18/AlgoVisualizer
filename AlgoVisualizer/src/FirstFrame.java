

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FirstFrame extends JPanel {
    private static final long serialVersionUID = 1L;
    
    JFrame firstFrame = new JFrame("AlgoVisualizer");
    BufferedImage image = null;
    File f = null;
    private Image img;
    private JButton bubbleSrtBtn = new JButton("Bubble Sort");
    private JButton creditbtn = new JButton("Credit");
    private JButton manualBtn = new JButton("Help");
    
    FirstFrame() throws IOException {
    	
    	img = ImageIO.read(getClass().getResource("resources/new.jpg")) ;
    	
    	this.firstFrame.add(this);
        this.firstFrame.setSize(1380, 730);

        setLayout(null);
        this.firstFrame.setLocationRelativeTo(null);
        this.firstFrame.setDefaultCloseOperation(3);
        this.firstFrame.setResizable(true);
        this.firstFrame.setDefaultCloseOperation(3);
        
        this.bubbleSrtBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                FirstFrame.this.firstFrame.dispose();

                new BubbleSort();
            }
        });
        this.bubbleSrtBtn.setLocation(50, 200);
        this.bubbleSrtBtn.setBackground(Color.ORANGE);
        this.bubbleSrtBtn.setForeground(Color.red);
        this.bubbleSrtBtn.setSize(200, 50);
        this.bubbleSrtBtn.setText("Bubble Sort");
        this.bubbleSrtBtn.setFont(new Font("Gill Sans Ultra Bold", 2, 18));

        this.creditbtn.setLocation(150, 400);
        this.creditbtn.setBackground(Color.red);
        this.creditbtn.setForeground(Color.white);
        this.creditbtn.setSize(200, 50);
        this.creditbtn.setFont(new Font("Ravie", 1, 28));

        this.creditbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                FirstFrame.this.firstFrame.dispose();
                try {
					new Credit();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        this.manualBtn.setLocation(100, 300);
        this.manualBtn.setBackground(Color.GREEN);
        this.manualBtn.setForeground(Color.BLACK);
        this.manualBtn.setSize(200, 50);
        this.manualBtn.setFont(new Font("Gill Sans Ultra Bold", 2, 18));
        this.manualBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                FirstFrame.this.firstFrame.dispose();
                try {
					new Manual();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        add(this.manualBtn);

        add(this.creditbtn);
        add(this.bubbleSrtBtn);
        repaint();
        revalidate();
        this.firstFrame.repaint();
        this.firstFrame.validate();

        this.firstFrame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
    	
    	g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(img, 0, 0, this);
    }
}
