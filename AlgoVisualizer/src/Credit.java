
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Credit extends JFrame {
    private static final long serialVersionUID = 1L;

    public Credit() {
        setTitle("AlgoVisualizer : Credit");
        setSize(1370, 730);

        setDefaultCloseOperation(3);
        setVisible(true);

        setContentPane(new JLabel(new ImageIcon("credit.jpg")));
        setLayout(null);

        JButton bckToFrst = new JButton();
        bckToFrst.setBounds(70, 300, 100, 50);
        bckToFrst.setBackground(Color.magenta);
        bckToFrst.setForeground(Color.white);

        bckToFrst.setText("Back");
        bckToFrst.setFont(new Font("Gill Sans Ultra", 2, 18));
        setLayout(null);
        add(bckToFrst);

        bckToFrst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Credit.this.dispose();

                new FirstFrame();
            }
        });
        setSize(1370, 730);
    }
}
