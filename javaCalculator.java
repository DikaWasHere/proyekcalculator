import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel javaCalculator;
    private JTextField textDisplay;
    private JButton btnequals;
    private JButton btnmultiply;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
    private JButton btn8;
    private JButton btndot;
    private JButton btnplus;
    private JButton btn6;
    private JButton btn9;
    private JButton btnclear;
    private JButton btnminus;
    private JButton btndevine;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn0;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public javaCalculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1text = textDisplay.getText()+ btn1.getText();
                textDisplay.setText(btn1text);
            }
        });
        btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String btn2text = textDisplay.getText()+ btn2.getText();
            textDisplay.setText(btn2text);
        }
    });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3text = textDisplay.getText()+ btn3.getText();
                textDisplay.setText(btn3text);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4text = textDisplay.getText()+ btn4.getText();
                textDisplay.setText(btn4text);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5text = textDisplay.getText()+ btn5.getText();
                textDisplay.setText(btn5text);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6text = textDisplay.getText()+ btn6.getText();
                textDisplay.setText(btn6text);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7text = textDisplay.getText()+ btn7.getText();
                textDisplay.setText(btn7text);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8text = textDisplay.getText()+ btn8.getText();
                textDisplay.setText(btn8text);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9text = textDisplay.getText()+ btn9.getText();
                textDisplay.setText(btn9text);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0text = textDisplay.getText()+ btn0.getText();
                textDisplay.setText(btn0text);
            }
        });

        btnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String button_text = btnplus.getText();
              getOperator(button_text);
            }
        });
        btnequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               switch (math_operator){
                   case '+':
                       total2 = total1 + Double.parseDouble(textDisplay.getText());
                       break;
                   case '−':
                       total2 = total1 - Double.parseDouble(textDisplay.getText());
                       break;
                   case '/':
                       total2 = total1 / Double.parseDouble(textDisplay.getText());
                       break;
                   case 'x':
                       total2 = total1 * Double.parseDouble(textDisplay.getText());
                       break;
               }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
        btndot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if (textDisplay.getText().contains(".")){
                    btndot.setEnabled(false);
                }
                else
                {
                    String btndotText = textDisplay.getText() + btndot.getText();
                textDisplay.setText(btndotText);
                }
                btndot.setEnabled(true);
            }
        });
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnminus.getText();
                getOperator(button_text);
            }
        });
        btndevine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btndevine.getText();
                getOperator(button_text);
            }
        });
        btnmultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnmultiply.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("javaCalculator");
        frame.setContentPane(new javaCalculator().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
