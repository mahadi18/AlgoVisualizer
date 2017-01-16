import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Manual extends JFrame {
    private static final long serialVersionUID = 1L;

    public Manual() {
        setTitle("AlgoVisualizer : User Manual");
        setSize(400, 400);

        setDefaultCloseOperation(3);
        setVisible(true);

        setContentPane(new JLabel(new ImageIcon("pencil.jpg")));
        setLayout(null);

        JButton bckToFrst = new JButton();
        bckToFrst.setBounds(1200, 20, 100, 50);
        bckToFrst.setBackground(Color.magenta);
        bckToFrst.setForeground(Color.white);

        bckToFrst.setText("Back");
        bckToFrst.setFont(new Font("Gill Sans Ultra", 2, 18));
        setLayout(null);
        add(bckToFrst);

        bckToFrst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Manual.this.dispose();

                new FirstFrame();
            }
        });
        setSize(1370, 730);
    }
}
