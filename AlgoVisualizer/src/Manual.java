import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Manual extends JFrame {
    private static final long serialVersionUID = 1L;

    public Manual() throws IOException {
        setTitle("AlgoVisualizer : User Manual");
        setSize(400, 400);

        setDefaultCloseOperation(3);
        setVisible(true);

        
        Image img = ImageIO.read(getClass().getResource("resources/pencil.jpg")) ;
    	setContentPane(new JLabel(new ImageIcon(img)));
        setLayout(null);

        JButton bckToFrst = new JButton();
        bckToFrst.setBounds(1210, 00, 150, 60);
        bckToFrst.setBackground(Color.magenta);
        bckToFrst.setForeground(Color.white);

        bckToFrst.setText("Back to Menu");
        bckToFrst.setFont(new Font("Gill Sans Ultra", 10, 18));
        setLayout(null);
        add(bckToFrst);

        bckToFrst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Manual.this.dispose();

                try {
					new FirstFrame();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        setSize(1370, 730);
    }
}
