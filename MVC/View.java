package MVC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class View extends JFrame{
	
	private JTextField first = new JTextField(10);
	private JLabel addLabel = new JLabel("+");
	private JTextField second = new JTextField(10);
	private JButton calButton = new JButton("Calculate");
	private JTextField solution = new JTextField(10);
	
	public void view(){
		
		JPanel CalcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		CalcPanel.add(first);
		CalcPanel.add(addLabel);
		CalcPanel.add(second);
		CalcPanel.add(calButton);
		CalcPanel.add(solution);
		
		this.add(CalcPanel);
		
	}
	
	
	public int getFirst(){
		return Integer.parseInt(first.getText());
	}
	
	public int getSecond(){
		return Integer.parseInt(second.getText());
	}
	
	public int getSolution(){
		return Integer.parseInt(solution.getText());
	}
	
//	public void setSolution(int value){
//		solution.setText(Integer.toString(value));
//	}
	
	public void CalActionListener(ActionListener ListenForButton){
		calButton.addActionListener(ListenForButton);
	}
	
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}


	public void setSolution(int total) {
		// TODO Auto-generated method stub
		solution.setText(Integer.toString(total));
	}

	
}
