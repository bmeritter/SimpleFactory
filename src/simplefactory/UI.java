package simplefactory;

import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class UI extends JFrame implements ActionListener {

	public JButton btn1 = new JButton("1");
	public JButton btn2 = new JButton("2");
	public JButton btn3 = new JButton("3");
	public JButton btnAdd = new JButton("+");
	public JButton btn4 = new JButton("4");
	public JButton btn5 = new JButton("5");
	public JButton btn6 = new JButton("6");
	public JButton btnSub = new JButton("-");
	public JButton btn7 = new JButton("7");
	public JButton btn8 = new JButton("8");
	public JButton btn9 = new JButton("9");
	public JButton btnMul = new JButton("*");
	public JButton btnClear = new JButton("Clear");
	public JButton btn0 = new JButton("0");
	public JButton btnDiv = new JButton("/");
	public JButton btnResult = new JButton("=");

	public JTextArea result = new JTextArea();

	public int numA;
	public int numB;
	String str;

	public UI() {
		getContentPane().setLayout(null);
		result.setForeground(new Color(0, 0, 0));
		result.setFont(new Font("ºÚÌå", Font.BOLD, 15));
		
		result.setBounds(0, 0, 434, 34);
		getContentPane().add(result);

		JPanel panel = new JPanel();
		panel.setBounds(0, 32, 434, 229);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 4));

		btn1.addActionListener(this);
		panel.add(btn1);

		btn2.addActionListener(this);
		panel.add(btn2);

		btn3.addActionListener(this);
		panel.add(btn3);

		btnAdd.addActionListener(this);
		panel.add(btnAdd);

		btn4.addActionListener(this);
		panel.add(btn4);

		btn5.addActionListener(this);
		panel.add(btn5);

		btn6.addActionListener(this);
		panel.add(btn6);

		btnSub.addActionListener(this);
		panel.add(btnSub);

		btn7.addActionListener(this);
		panel.add(btn7);

		btn8.addActionListener(this);
		panel.add(btn8);

		btn9.addActionListener(this);
		panel.add(btn9);

		btnMul.addActionListener(this);
		panel.add(btnMul);

		btnClear.addActionListener(this);
		panel.add(btnClear);

		btn0.addActionListener(this);
		panel.add(btn0);

		btnResult.addActionListener(this);
		panel.add(btnResult);

		btnDiv.addActionListener(this);
		panel.add(btnDiv);

		this.setSize(450, 299);
		this.setVisible(true);
		this.setTitle("¼ÆËãÆ÷");

	}

	public static void main(String[] args) {
		new UI();
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (btn0 == event.getSource()) {
			result.append("0");
		}

		else if (btn1 == event.getSource()) {
			result.append("1");
		}

		else if (btn2 == event.getSource()) {
			result.append("2");
		}

		else if (btn3 == event.getSource()) {
			result.append("3");
		}

		else if (btn4 == event.getSource()) {
			result.append("4");
		}

		else if (btn5 == event.getSource()) {
			result.append("5");
		}

		else if (btn6 == event.getSource()) {
			result.append("6");
		}

		else if (btn7 == event.getSource()) {
			result.append("7");
		}

		else if (btn8 == event.getSource()) {
			result.append("8");
		}

		else if (btn9 == event.getSource()) {
			result.append("9");
		}

		else if (btnAdd == event.getSource()) {
			str = result.getText();
			numA = Integer.parseInt(str);
			result.append("+");
		}

		else if (btnSub == event.getSource()) {
			str = result.getText();
			numA = Integer.parseInt(str);
			result.append("-");
		}

		else if (btnMul == event.getSource()) {
			str = result.getText();
			numA = Integer.parseInt(str);
			result.append("*");
		}

		else if (btnDiv == event.getSource()) {
			str = result.getText();
			numA = Integer.parseInt(str);
			result.append("/");

		}

		else if (btnClear == event.getSource()) {
			result.setText("");
		}

		else {
			int len = str.length();
			str = result.getText();
			String op = str.substring(len, len+1);
			str = str.substring(len+1);
			numB = Integer.parseInt(str);
			
			
			Operate opt;
			opt = OperateFactory.createOperate(op);
			opt.numA = numA;
			opt.numB = numB;
			int end = opt.getResult();
			
			result.setForeground(Color.BLUE);
			result.setFont(new Font("ºÚÌå", Font.BOLD, 18));
			result.setText(Integer.toString(end));
			
		}

	}

}
