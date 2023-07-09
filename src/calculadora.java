import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;

public class calculadora {
        private JPanel Calculadora;
    private JTextField textoconsola;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button10;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button15;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a10Button;
    private JButton a11Botton;
    double a, b, resultado;
    String op;
    public calculadora() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoconsola.setText(textoconsola.getText()+a00Button.getText());
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textoconsola.getText().contains("."))
                {
                    double pm= Double.parseDouble(textoconsola.getText());
                    pm=pm*-1;
                    textoconsola.setText(String.valueOf(pm));
                }else{
                    long PM= Long.parseLong(textoconsola.getText());
                    PM = PM*-1;
                    textoconsola.setText(String.valueOf(PM));
                }
            }
        });
        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textoconsola.getText().contains(".")){
                    textoconsola.setText(textoconsola.getText()+a10Button.getText());
                }
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(textoconsola.getText());
            op = "+";
            textoconsola.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textoconsola.getText());
                op = "-";
                textoconsola.setText("");
            }
        });
        a11Botton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textoconsola.getText());
                op = "*";
                textoconsola.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textoconsola.getText());
                op = "/";
                textoconsola.setText("");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(textoconsola.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(textoconsola.getText());
                    strB.deleteCharAt(textoconsola.getText().length() -1);
                    backspace = String.valueOf(strB);
                    textoconsola.setText(backspace);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               b=Double.parseDouble(textoconsola.getText());
               if(op == "+"){
                   resultado = a+b;
                   textoconsola.setText(String.valueOf(resultado));
               }else if(op == "-"){
                   resultado= a-b;
                   textoconsola.setText(String.valueOf(resultado));
               }else if(op == "*"){
                   resultado= a*b;
                   textoconsola.setText(String.valueOf(resultado));
               }else if(op == "/"){
                   resultado= a/b;
                   textoconsola.setText(String.valueOf(resultado));
               }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
