package com.practice.gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc = new Abc();
	}

}

class Abc extends JFrame{

	public Abc() {
		
		JLabel l = new JLabel("Hello World!");
		JLabel l1 = new JLabel("Its me");
		JLabel l2 = new JLabel("This is added to see pull request in github");
		add(l);
		add(l1);
		add(l2);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
