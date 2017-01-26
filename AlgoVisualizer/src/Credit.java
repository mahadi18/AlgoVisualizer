
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

class Credit extends JFrame {
    private static final long serialVersionUID = 1L;

    public Credit() throws IOException {
        setTitle("AlgoVisualizer : Credit");
        setSize(1370, 730);

        setDefaultCloseOperation(3);
        setVisible(true);

        Image img = ImageIO.read(getClass().getResource("resources/credit.jpg")) ;
    	setContentPane(new JLabel(new ImageIcon(img)));
        //setContentPane(new JLabel(new ImageIcon("credit.jpg")));
        setLayout(null);

        JButton bckToFrst = new JButton();
        bckToFrst.setBounds(695, 390, 300, 35);
        bckToFrst.setBackground(Color.WHITE);
        bckToFrst.setForeground(Color.MAGENTA);

        bckToFrst.setText("Back to Menu");
        bckToFrst.setFont(new Font("Gill Sans Ultra Bold", 10, 18));
        setLayout(null);
        add(bckToFrst);

        bckToFrst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Credit.this.dispose();

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
