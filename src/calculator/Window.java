package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {

    JTextField number1;
    JTextField number2;
    ButtonGroup group;
    JRadioButton rbAdd, rbMultiply, rbDivide, rbSubstract;
    JLabel result;
    
    Window() {
        setTitle("Calculator");
        setSize(250, 300);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        number1 = new JTextField();
        number1.setSize(80,25);
        number1.setLocation(20,20);
        add(number1);
        
        number2 = new JTextField();
        number2.setSize(80,25);
        number2.setLocation(150,20);
        add(number2);
        
        group = new ButtonGroup();
        
        rbAdd = new JRadioButton("Dodawanie");
        rbAdd.setLocation(30, 70);
        rbAdd.setSize(100, 25);
        rbAdd.addActionListener(this);
        group.add(rbAdd);
        add(rbAdd);
        
        rbMultiply = new JRadioButton("Mnożenie");
        rbMultiply.setLocation(30, 100);
        rbMultiply.setSize(100, 25);
        rbMultiply.addActionListener(this);
        group.add(rbMultiply);
        add(rbMultiply);
        
        rbDivide = new JRadioButton("Dzielenie");
        rbDivide.setLocation(30, 130);
        rbDivide.setSize(100, 25);
        rbDivide.addActionListener(this);
        group.add(rbDivide);
        add(rbDivide);
              
        rbSubstract = new JRadioButton("Odejmowanie");
        rbSubstract.setLocation(30, 160);
        rbSubstract.setSize(120, 25);
        rbSubstract.addActionListener(this);
        group.add(rbSubstract);
        add(rbSubstract);
        
        result = new JLabel("Wynik: ");
        result.setLocation(30,200);
        result.setSize(200, 35);
        add(result);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(number1.getText().matches("[0-9.]*") && number2.getText().matches("[0-9.]*")){
        if(rbAdd.isSelected()){
            result.setText("Wynik: " + (Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText())));
        }else if(rbMultiply.isSelected()){
            result.setText("Wynik: " + (Double.parseDouble(number1.getText()) * Double.parseDouble(number2.getText())));
        }else if(rbDivide.isSelected()){
            result.setText("Wynik: " + (Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText())));
        }else if(rbSubstract.isSelected()){
            result.setText("Wynik: " + (Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText())));
        }
        }else{
            result.setText("Podaj liczby");
            group.clearSelection();
            number1.setText("");
            number2.setText("");
        }
    }

}
