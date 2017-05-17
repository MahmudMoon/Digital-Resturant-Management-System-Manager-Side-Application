import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import java.io.*;
import java.net.*;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame2 {

	private JFrame frame;
	private JTextField textField_Table_TotalCost;
	private JTextField textField_Table_2;
	private Label label_3;
	private JTextField textField_Burger;
	private Label label_4;
	private Label label_5;
	private Label label_6;
	private Label label_7;
	private Label label_9;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Label label_10;
	private Label label_11;
	private JTextField textField_5;
	private Label label_12;
	private JTextField textField_6;
	private Label label_13;
	private JTextField textField_7;
	private Label label_14;
	private JTextField textField_8;
	private Label label_15;
	private JTextField textField_9;
	private Label label_16;
	private JTextField textField_10;
	private Label label_17;
	String Z = null;
	private Label label_8;
	private Label label_18;
	private Label label_19;
	private Label label_20;
	private Label label_21;
	private Label label_22;
	private JTextField textField_Coffee;
	private JTextField textField_chicken;
	private JTextField textField_French;
	private JTextField textField_Spring;
	private JTextField textField_Noodle;
	private JTextField textField_Vegetable;
	private Label label_23;
	private Label label_24;
	private Label label_25;
	private Label label_26;
	private Label label_27;
	private Label label_28;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private Label label_29;
	private JTextField txtxxxxxxxxx;
	private JTextField textField_TotalOfTheDay;
	int numTotal ;
	Label label_30 ;
	String STRT;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame2() {
		initialize();
	}
        
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 44));
		frame.getContentPane().setForeground(new Color(0, 51, 255));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(700,600,650, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Management System");
		label.setForeground(Color.BLACK);
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(99, 31, 422, 57);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Table No 1 :");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_1.setBounds(10, 105, 139, 34);
		frame.getContentPane().add(label_1);
		
		textField_Table_TotalCost = new JTextField();
		textField_Table_TotalCost.setText("0");
		textField_Table_TotalCost.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_Table_TotalCost.setBounds(143, 522, 139, 40);
		frame.getContentPane().add(textField_Table_TotalCost);
		textField_Table_TotalCost.setColumns(10);
		
		Label label_2 = new Label("Table No 2 :");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_2.setBounds(310, 99, 139, 40);
		frame.getContentPane().add(label_2);
		
		textField_Table_2 = new JTextField();
		textField_Table_2.setBounds(423, 522, 139, 40);
		frame.getContentPane().add(textField_Table_2);
		textField_Table_2.setColumns(10);
		
		label_3 = new Label("Burger");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_3.setBounds(70, 145, 54, 22);
		frame.getContentPane().add(label_3);
		
		textField_Burger = new JTextField();
		textField_Burger.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Burger.setBounds(143, 145, 67, 22);
		frame.getContentPane().add(textField_Burger);
		textField_Burger.setColumns(10);
		
		label_4 = new Label("Pizza");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_4.setBounds(81, 173, 43, 22);
		frame.getContentPane().add(label_4);
		
		label_5 = new Label("Hot Dog");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_5.setBounds(59, 201, 67, 22);
		frame.getContentPane().add(label_5);
		
		label_6 = new Label("    Vanilla");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_6.setBounds(59, 229, 67, 22);
		frame.getContentPane().add(label_6);
		
		label_7 = new Label("Fancy Roll  : ");
		label_7.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_7.setBounds(49, 257, 83, 22);
		frame.getContentPane().add(label_7);
		
		label_9 = new Label("Chocolate Cake  : ");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_9.setBounds(18, 285, 119, 22);
		frame.getContentPane().add(label_9);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(143, 173, 67, 22);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(143, 201, 67, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(143, 228, 67, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(143, 256, 67, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(143, 284, 67, 22);
		frame.getContentPane().add(textField_4);
		
		
		label_10 = new Label("          Total : ");
		label_10.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_10.setBounds(4, 517, 133, 34);
		frame.getContentPane().add(label_10);
		
		label_11 = new Label("Burger : ");
		label_11.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_11.setBounds(387, 145, 67, 22);
		frame.getContentPane().add(label_11);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(454, 145, 67, 22);
		frame.getContentPane().add(textField_5);
		
		label_12 = new Label("Pizza  : ");
		label_12.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_12.setBounds(387, 173, 67, 22);
		frame.getContentPane().add(label_12);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(454, 173, 67, 22);
		frame.getContentPane().add(textField_6);
		
		label_13 = new Label("Hot Dog : ");
		label_13.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_13.setBounds(382, 201, 67, 22);
		frame.getContentPane().add(label_13);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(454, 201, 67, 22);
		frame.getContentPane().add(textField_7);
		
		label_14 = new Label("Vanilla  : ");
		label_14.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_14.setBounds(382, 229, 67, 22);
		frame.getContentPane().add(label_14);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(454, 229, 67, 22);
		frame.getContentPane().add(textField_8);
		
		label_15 = new Label("Fancy Roll  : ");
		label_15.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_15.setBounds(366, 257, 83, 22);
		frame.getContentPane().add(label_15);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(454, 257, 67, 22);
		frame.getContentPane().add(textField_9);
		
		label_16 = new Label("Chocolate Cake  : ");
		label_16.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_16.setBounds(334, 285, 119, 22);
		frame.getContentPane().add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(454, 285, 67, 22);
		frame.getContentPane().add(textField_10);
		
		textField_Coffee = new JTextField();
		textField_Coffee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Coffee.setColumns(10);
		textField_Coffee.setBounds(143, 313, 67, 22);
		frame.getContentPane().add(textField_Coffee);
		
		textField_chicken = new JTextField();
		textField_chicken.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_chicken.setColumns(10);
		textField_chicken.setBounds(143, 339, 67, 22);
		frame.getContentPane().add(textField_chicken);
		
		textField_French = new JTextField();
		textField_French.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_French.setColumns(10);
		textField_French.setBounds(143, 371, 67, 22);
		frame.getContentPane().add(textField_French);
		
		textField_Spring = new JTextField();
		textField_Spring.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Spring.setColumns(10);
		textField_Spring.setBounds(143, 399, 67, 22);
		frame.getContentPane().add(textField_Spring);
		
		textField_Noodle = new JTextField();
		textField_Noodle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Noodle.setColumns(10);
		textField_Noodle.setBounds(143, 427, 67, 22);
		frame.getContentPane().add(textField_Noodle);
		
		textField_Vegetable = new JTextField();
		textField_Vegetable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Vegetable.setColumns(10);
		textField_Vegetable.setBounds(143, 455, 67, 22);
		frame.getContentPane().add(textField_Vegetable);
		
		label_17 = new Label("          Total : ");
		label_17.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_17.setBounds(288, 523, 133, 34);
		frame.getContentPane().add(label_17);
		
		
		label_8 = new Label("Coffee ");
		label_8.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_8.setBounds(72, 313, 54, 22);
		frame.getContentPane().add(label_8);
		
		label_18 = new Label("  chicken-soup : ");
		label_18.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_18.setBounds(18, 341, 119, 22);
		frame.getContentPane().add(label_18);
		
		label_19 = new Label("    French-Fries");
		label_19.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_19.setBounds(18, 371, 119, 22);
		frame.getContentPane().add(label_19);
		
		label_20 = new Label(" Spring_rolls");
		label_20.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_20.setBounds(38, 399, 94, 22);
		frame.getContentPane().add(label_20);
		
		label_21 = new Label("Noodle");
		label_21.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_21.setBounds(78, 424, 54, 22);
		frame.getContentPane().add(label_21);
		
		label_22 = new Label("Vegetables_soup");
		label_22.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_22.setBounds(10, 455, 129, 22);
		frame.getContentPane().add(label_22);
		
		label_29 = new Label("Online Transection");
		label_29.setForeground(Color.RED);
		label_29.setFont(new Font("Dialog", Font.BOLD, 16));
		label_29.setBounds(0, 573, 149, 34);
		frame.getContentPane().add(label_29);
		
		label_30 = new Label("Total sell of the day");
		label_30.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_30.setBounds(18, 661, 184, 22);
		frame.getContentPane().add(label_30);
		
		
		txtxxxxxxxxx = new JTextField();
		txtxxxxxxxxx.setText("Account Number");
		txtxxxxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtxxxxxxxxx.setColumns(10);
		txtxxxxxxxxx.setBounds(153, 573, 245, 40);
		frame.getContentPane().add(txtxxxxxxxxx);
        
		textField_TotalOfTheDay = new JTextField();
		textField_TotalOfTheDay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_TotalOfTheDay.setColumns(10);
		textField_TotalOfTheDay.setBounds(208, 660, 139, 40);
		frame.getContentPane().add(textField_TotalOfTheDay);
		

		
		try{
		ServerSocket SS = new ServerSocket(9999);
		Socket s = SS.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String str = (String)dis.readUTF();
		//JOptionPane.showMessageDialog(null,str);
		char ary[] = str.toCharArray();
		int num=0, t;
		int a = 0,b =0,c=0,d=0,e=0,f=0,g =0,h =0,i=0,j =0,k=0,l=0;
		if(ary[0]!=0)
		{
			t = (int)ary[0]-48;
			num = num + t*60;
			a = t;
		}
		if(ary[1]!=0)
		{
			t = (int)ary[1]-48;
			num = num + t*75;
			b=t;
		}
		if(ary[2]!=0)
		{
			t = (int)ary[2]-48;
			num = num + t*70;
			c =t ;
		}
		if(ary[3]!=0)
		{
			t = (int)ary[3]-48;
			num = num + t*50;
			d = t;
		}
		if(ary[4]!=0)
		{
			t = (int)ary[4]-48;
			num = num + t*45;
			e = t;
		}
		if(ary[5]!=0)
		{
			t = (int)ary[5]-48;
			num = num + t*85;
			f = t;
		}
		if(ary[6]!=0)
		{
			t = (int)ary[6]-48;
			num = num + t*40;
			g = t;
		}
		if(ary[7]!=0)
		{
			t = (int)ary[7]-48;
			num = num + t*50;
			h = t;
		}
		if(ary[8]!=0)
		{
			t = (int)ary[8]-48;
			num = num + t*45;
			i = t;
		}
		if(ary[9]!=0)
		{
			t = (int)ary[9]-48;
			num = num + t*50;
			j = t;
		}
		if(ary[10]!=0)
		{
			t = (int)ary[10]-48;
			num = num + t*45;
			k = t;
		}
		if(ary[11]!=0)
		{
			t = (int)ary[11]-48;
			num = num + t*55;
			l = t;
		}
		numTotal = num;
		int Temp = 0;
		try
		{
			FileReader fw = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fw);
			
			String str2 = br.readLine();
			Temp = Integer.parseInt(str2);
			fw.close();
		}catch(Exception e2)
		{
			
		}
		numTotal = numTotal + Temp;
		;
		STRT = Integer.toString(numTotal);
		textField_TotalOfTheDay.setText(STRT);
		
		try
		{
			FileWriter fw = new FileWriter("test.txt");
            fw.write(STRT);
			fw.close();
		}catch(Exception e5)
		{
			
		}
		
		String STRR="";
		if(ary.length > 12)
		{
			
			for(int x = 12;x<ary.length;x++)
			{
				STRR = STRR + ary[x];
			}
		}
		int NUM = 0;
		Z = Integer.toString(NUM);
		
		String A = Integer.toString(a);
		String B = Integer.toString(b);
		String C = Integer.toString(c);
		String D = Integer.toString(d);
		String E = Integer.toString(e);
		String F = Integer.toString(f);
		String G = Integer.toString(num);
		String H = Integer.toString(g);
		String I = Integer.toString(h);
		String J = Integer.toString(i);
		String K = Integer.toString(j);
		String L = Integer.toString(k);
		String M = Integer.toString(l);
		textField_Burger.setText(A);
		textField.setText(B);
		textField_1.setText(C);
		textField_2.setText(D);
		textField_3.setText(E);
		textField_4.setText(F);
		textField_Coffee.setText(H);
		textField_chicken.setText(I);
		textField_French.setText(J);
		textField_Spring.setText(K);
		textField_Noodle.setText(L);
		textField_Vegetable.setText(M);
		textField_Table_TotalCost.setText(G);
		txtxxxxxxxxx.setText(STRR);
		
		
		JButton btnNewButton = new JButton("Paid");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JTextField textField_Table_11 = new JTextField();
				textField_Table_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
				textField_Table_11.setBounds(143, 317, 139, 40);
				frame.getContentPane().add(textField_Table_11);
				textField_Table_11.setColumns(10);
				textField_Table_TotalCost.setText(Z);
				
				JTextField textField_Burger11 = new JTextField();
				textField_Burger11.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_Burger11.setBounds(143, 145, 67, 22);
				frame.getContentPane().add(textField_Burger11);
				textField_Burger11.setColumns(10);
				textField_Burger11.setText(Z);
				
				JTextField textField11 = new JTextField();
				textField11.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField11.setColumns(10);
				textField11.setBounds(143, 173, 67, 22);
				frame.getContentPane().add(textField11);
				textField11.setText(Z);
				
				JTextField textField_11 = new JTextField();
				textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_11.setColumns(10);
				textField_11.setBounds(143, 201, 67, 22);
				frame.getContentPane().add(textField_11);
				textField_11.setText(Z);
				
				JTextField textField_21 = new JTextField();
				textField_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_21.setColumns(10);
				textField_21.setBounds(143, 228, 67, 22);
				frame.getContentPane().add(textField_21);
				textField_21.setText(Z);
				
				JTextField textField_31 = new JTextField();
				textField_31.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_31.setColumns(10);
				textField_31.setBounds(143, 256, 67, 22);
				frame.getContentPane().add(textField_31);
				textField_31.setText(Z);
				
				JTextField textField_41 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_41.setColumns(10);
				textField_41.setBounds(143, 284, 67, 22);
				frame.getContentPane().add(textField_41);
				textField_41.setText(Z);
				
				JTextField textField_Coffee1 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_Coffee1.setColumns(10);
				textField_Coffee1.setBounds(143, 313, 67, 22);
				frame.getContentPane().add(textField_Coffee1);
				textField_41.setText(Z);
				
				JTextField textField_chicken1 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_chicken1.setColumns(10);
				textField_chicken1.setBounds(143, 339, 67, 22);
				frame.getContentPane().add(textField_chicken1);
				textField_chicken1.setText(Z);
				
				JTextField textField_French1 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_French1.setColumns(10);
				textField_French1.setBounds(143, 371, 67, 22);
				frame.getContentPane().add(textField_French1);
				textField_French1.setText(Z);
				
				JTextField textField_Spring1 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_Spring1.setColumns(10);
				textField_Spring1.setBounds(143, 399, 67, 22);
				frame.getContentPane().add(textField_Spring1);
				textField_Spring1.setText(Z);
				
				JTextField textField_Noodle1 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_Noodle1.setColumns(10);
				textField_Noodle1.setBounds(143, 427, 67, 22);
				frame.getContentPane().add(textField_Noodle1);
				textField_Noodle1.setText(Z);
				
				JTextField textField_Vegetable1 = new JTextField();
				textField_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_Vegetable1.setColumns(10);
				textField_Vegetable1.setBounds(143, 455, 67, 22);
				frame.getContentPane().add(textField_Vegetable1);
				textField_Vegetable1.setText(Z);
				
				txtxxxxxxxxx = new JTextField();
				txtxxxxxxxxx.setText("Account Number");
				txtxxxxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 24));
				txtxxxxxxxxx.setColumns(10);
				txtxxxxxxxxx.setBounds(153, 573, 245, 40);
				frame.getContentPane().add(txtxxxxxxxxx);
				
				

				/*
				textField_Table_1.replaceSelection("0000");
				textField_Table_1.setText(Z);
				textField_Burger.setText(Z);
				textField.setText(Z);
				textField_1.setText(Z);
				textField_2.setText(Z);
				textField_3.setText(Z);
				textField_4.setText(Z);
				*/
			}
		});

		btnNewButton.setBounds(153, 614, 129, 34);
		frame.getContentPane().add(btnNewButton);
		
		label_23 = new Label("Coffee ");
		label_23.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_23.setBounds(395, 313, 54, 22);
		frame.getContentPane().add(label_23);
		
		label_24 = new Label("  chicken-soup : ");
		label_24.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_24.setBounds(335, 339, 119, 22);
		frame.getContentPane().add(label_24);
		
		label_25 = new Label("    French-Fries");
		label_25.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_25.setBounds(335, 371, 119, 22);
		frame.getContentPane().add(label_25);
		
		label_26 = new Label(" Spring_rolls");
		label_26.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_26.setBounds(355, 399, 94, 22);
		frame.getContentPane().add(label_26);
		
		label_27 = new Label("Noodle");
		label_27.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_27.setBounds(395, 427, 54, 22);
		frame.getContentPane().add(label_27);
		
		label_28 = new Label("Vegetables_soup");
		label_28.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_28.setBounds(323, 455, 129, 22);
		frame.getContentPane().add(label_28);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(454, 313, 67, 22);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(454, 339, 67, 22);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(454, 371, 67, 22);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(454, 399, 67, 22);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(454, 427, 67, 22);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(454, 455, 67, 22);
		frame.getContentPane().add(textField_17);
		
	

		
		
		


		SS.close();
		
        	}catch(Exception e)
			{
				
			}
		}
	}

