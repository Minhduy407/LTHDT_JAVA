/*
*@(#)GiaiPT.java.java  Jan 7, 2024
*
*Copyright (c) 2024 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.duy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/*
* @description:
* @author: Chopper
* @date: Jan 7, 2024
* @version: 1.0
*/

/**
 * 
 */
public class GiaiPT extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pn1,pn2,pn3,pn4,pn5,pn,pnphu;
	JButton btgiai,btxoa,btthoat;
	JTextField soa,sob,soc,kq;
	JLabel lbtieude,lbsoa,lbsob,lbsoc,lbkq;
	public GiaiPT() {
		super("Giải phương trình bậc 2");
		
		pnphu = new JPanel();
		pn = new JPanel();
		pn1 = new JPanel();
		pn2 = new JPanel();
		pn3 = new JPanel();
		pn4 = new JPanel();
		pn5 = new JPanel();
		
		pn.add(lbtieude = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2"));
		lbtieude.setFont(new Font("Arial",Font.BOLD,25));
		pn.setBackground(new Color(0,255,255));
		
		pn1.add(lbsoa = new JLabel("Nhập a:"));
		pn1.add(soa = new JTextField(40));
		pn2.add(lbsob = new JLabel("Nhập b:"));
		pn2.add(sob = new JTextField(40));
		pn3.add(lbsoc = new JLabel("Nhập c:"));
		pn3.add(soc = new JTextField(40));
		pn4.add(lbkq = new JLabel("Kết quả:"));
		kq = new JTextField(40);
		kq.setEditable(false);
		pn4.add(kq);
		
		pn5.add(btgiai = new JButton("Giải"));
		pn5.add(btxoa = new JButton("Xóa rỗng"));
		pn5.add(btthoat = new JButton("Thoát"));
		TitledBorder bd = new TitledBorder("Chọn tác vụ");
		pn5.setBorder(bd);
		btgiai.addActionListener(this);
		btxoa.addActionListener(this);
		btthoat.addActionListener(this);
		
		pnphu.add(pn1);
		pnphu.add(pn2);
		pnphu.add(pn3);
		pnphu.add(pn4);
		
		pnphu.setLayout(new GridLayout(4, 1));
		
		add(pn,BorderLayout.NORTH);
		add(pnphu,BorderLayout.CENTER);
		add(pn5,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GiaiPT();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource(); 
		double sa,sb,sc;
		
		if(soa.getText().isEmpty())
			sa = 0;
		else
			sa = Double.parseDouble(soa.getText());
		if(sob.getText().isEmpty())
			sb = 0;
		else
			sb = Double.parseDouble(sob.getText());
		if(soc.getText().isEmpty())
			sc = 0;
		else
			sc = Double.parseDouble(soc.getText());
		
		if(source.equals(btgiai)) {
			if(sa == 0)
				kq.setText("x = " + Double.toString(-sc / sb));
			else {
				double delta = sb*sb - 4 * sa * sc;
				if(delta < 0)
					kq.setText("Phương trình vô nghiệm");
				else if(delta == 0) {
					kq.setText("x1 = x2 =" + Double.toString(-sb / (2 * sa)));
				}
				else {
					kq.setText("x1 = " + Double.toString((-sb + Math.sqrt(delta))/(2 * sa)) + ", x2 = " + Double.toString((-sb - Math.sqrt(delta))/(2 * sa)));
				}
			}
		}
		else if(source.equals(btxoa)) {
			soa.setText(null);
			sob.setText(null);
			soc.setText(null);
			kq.setText(null);
		}
		else
			System.exit(0);
	}
}
