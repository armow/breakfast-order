package project;


import java.awt.*;


import javax.swing.*;


public class Test {
	
	static public Cart[] c = new Cart[31];
	static public Panel_Cart cart;
	static public Panel_Menu menu;
	static public Frame_check check;
	static public Panel_Done done;
	static public Panel_Wait wait;
	
	static public Btnlistener btnlisnr;
	
	static public JPanel cardPanel;
	static public CardLayout cardLayout;
	//public static void main(String[] args) {
	public Test(){
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("毛可可養生breakfast點餐系統");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cardPanel = new JPanel();
		cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);
		
		btnlisnr = new Btnlistener(cardPanel, cardLayout);
		
		menu = new Panel_Menu(btnlisnr);
		check = new Frame_check(btnlisnr);
		cart = new Panel_Cart(btnlisnr);
		Start start = new Start(btnlisnr);
		wait = new Panel_Wait(btnlisnr);
		done = new Panel_Done(btnlisnr);
        JPanel how_panel = new JPanel();
        
        JLabel how_label=new JLabel(new ImageIcon("src/image/howto.jpg"));
        how_label.setLocation(0,-50);
        how_panel.setSize(800,550);
        
        JButton how_btn = new JButton("go to menu");
        how_btn.addActionListener(btnlisnr);
        how_btn.setLocation(530,450);
		how_btn.setSize(180,58);
		how_btn.setFont(new Font("Courier", Font.BOLD, 25));
		how_btn.setForeground(Color.blue);
		
		how_label.add(how_btn);
		how_panel.add(how_label);
		
		
		///set cardLayout
		cardPanel.add(menu,"0");
		cardPanel.add(cart,"1");
		cardPanel.add(start,"2");
		cardPanel.add(how_panel,"3");
		cardPanel.add(wait,"4");
		cardPanel.add(done,"5");
		cardLayout.show(cardPanel,"2");

		frame.add(cardPanel);
		
		frame.setVisible(true);
	}
	
}
