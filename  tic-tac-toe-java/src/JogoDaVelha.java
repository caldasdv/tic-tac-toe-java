import javax.swing.*;
import java.awt.event.*;

public class JogoDaVelha extends JFrame {
    JButton[] bt = new JButton[9];
    boolean xo = false;

    public JogoDaVelha() {
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the operation when the window is closed
        setLayout(null);
        setBounds(200, 200, 400, 400);
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
                cont++;
            }
        }

        bt[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mudar(bt[0]);
            }
        });
    }
    public void mudar(JButton btn){
        if(xo){
            btn.setText("O");
            xo = false;
        }
        else{
            btn.setText("X");
            xo = true;
        }
    }
    public static void main(String[] args) throws Exception {
        new JogoDaVelha();
    }
}
