/*
*@(#)JList_CheckBox.java.java  Jan 17, 2024
*
*Copyright (c) 2024 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.duy;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;


/*
* @description:
* @author: Chopper
* @date: Jan 17, 2024
* @version: 1.0
*/

/**
 * 
 */
public class JList_CheckBox extends JFrame implements ActionListener,MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel CenPan,WestPan,SouPan,NorPan,ButtonPan,Nor_CenPan;
	JLabel InputNum,Title;
	JTextField textnhap;
	JCheckBox checkchonhapsoam;
	JButton todensochan,todensole,todensonguyento,botoden,xoacacgiatridangtoden,tonggiatri,nhap,dong;
	JScrollPane paneList;
	JList<Double> list_num;
	ListModel<Double> listModel;
	public JList_CheckBox() {
		CenPan = new JPanel();
		WestPan = new JPanel();
		SouPan = new JPanel();
		NorPan = new JPanel();
		ButtonPan = new JPanel();
		Nor_CenPan = new JPanel();
		//Nor
		Title = new JLabel("Thao tác trên JList - Checkbox");
		Title.setFont(new Font("Time New Romal",Font.BOLD,25));
		Title.setForeground(Color.BLUE);
		NorPan.add(Title);
		add(NorPan,BorderLayout.NORTH);
		
		//West
		ButtonPan.add(todensochan = new JButton("Tô đen số chẵn"));
		ButtonPan.add(todensole = new JButton("Tô đen số lẻ"));
		ButtonPan.add(todensonguyento = new JButton("Tô đen số nguyên tố"));
		ButtonPan.add(botoden = new JButton("Bỏ tô đen"));
		ButtonPan.add(xoacacgiatridangtoden = new JButton("Xóa các giá trị đang tô đen"));
		ButtonPan.add(tonggiatri = new JButton("Tổng giá trị trong JList"));
		ButtonPan.setLayout(new GridLayout(0, 1, 1, 1));
		todensochan.addActionListener(this);
		todensole.addActionListener(this);
		todensonguyento.addActionListener(this);
		botoden.addActionListener(this);
		xoacacgiatridangtoden.addActionListener(this);
		tonggiatri.addActionListener(this);
		WestPan.add(ButtonPan);
		WestPan.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED,1),"Chọn tác vụ"));
		add(WestPan,BorderLayout.WEST);
		
		//Center
		Nor_CenPan.add(nhap = new JButton("Nhập"));
		Nor_CenPan.add(textnhap = new JTextField(10));
		Nor_CenPan.add(checkchonhapsoam = new JCheckBox());
		Nor_CenPan.add(InputNum = new JLabel("Cho nhập số âm"));
		listModel = new DefaultListModel<>();
		list_num = new JList<>(listModel);
		list_num.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		paneList = new JScrollPane(list_num);
		paneList.setPreferredSize(new Dimension(400,240));
		list_num.setVisibleRowCount(15);
		Nor_CenPan.add(paneList);
		nhap.addActionListener(this);
		
		CenPan.setLayout(new BorderLayout());
		CenPan.add(Nor_CenPan,BorderLayout.NORTH);
		CenPan.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED,1),"Nhập thông tin:"));
		add(CenPan,BorderLayout.CENTER);
		
		//South
		SouPan.add(dong = new JButton("Đóng chương trình"));
		SouPan.setBackground(Color.gray);
		add(SouPan,BorderLayout.SOUTH);
		dong.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(100,100);
		setSize(700,400);
	}
	public static void main(String[] args) {
		new JList_CheckBox();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		try {
		        if (o.equals(nhap)){
		            if (textnhap.getText().isEmpty()){
		                JOptionPane.showMessageDialog(null, "Bạn chưa nhập giá trị");
		                textnhap.requestFocus();
		            }else {
		                double n = Double.parseDouble(InputNum.getText());
		                if (!checkchonhapsoam.isSelected() && n < 0){
		                    JOptionPane.showMessageDialog(null, "Bạn chưa chọn cho phép nhập số âm");
		                    textnhap.selectAll();
		                    textnhap.requestFocus();
		                    
		                }else{
		                	listModel.addElement(n);
		                	textnhap.setText("");
		                	textnhap.requestFocus();
		                }
		            }
		        }
		        if (o.equals(todensochan)){
		            int n = list_num.getModel().getSize();
		            for (int i = 0; i < n; i++){
		                double x = (double) list_num.getModel().getElementAt(i);
		                if (x % 2 == 0){
		                    list_num.addSelectionInterval(i, i);
		                }
		            }
		        }
		        if (o.equals(todensole)){
		            int n = list_num.getModel().getSize();
		            for (int i = 0; i < n; i++){
		                double x = (double) list_num.getModel().getElementAt(i);
		                if (x % 2 != 0){
		                    list_num.addSelectionInterval(i, i);
		                }
		            }
		        }
		        if (o.equals(todensonguyento)){
		            int n = list_num.getModel().getSize();
		            for (int i = 0; i < n; i++){
		                double x = (double) list_num.getModel().getElementAt(i);
		                if (isPrime(x)){
		                    list_num.addSelectionInterval(i, i);
		                }
		            }
		        }
		        if (o.equals(botoden)){
		            list_num.clearSelection();
		        }
		        if (o.equals(xoacacgiatridangtoden)){
		            int[] index = list_num.getSelectedIndices();
		            for (int i = index.length - 1; i >= 0; i--){
		                list_num.remove(index[i]);
		            }
		        }
		        if (o.equals(sum)){
		            int n = list_num.getModel().getSize();
		            double sum = 0;
		            for (int i = 0; i < n; i++){
		                double x = (double) list_num.getModel().getElementAt(i);
		                sum += x;
		            }
		            JOptionPane.showMessageDialog(null, "Tổng các giá trị trong JList là: " + sum);
		        }
		        if (o.equals(dong)){
		            System.exit(0);
		        }

		    }

		    private boolean isPrime(double x){
		        if (x < 2){
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(x); i++){
		            if (x % i == 0){
		                return false;
		            }
		        }
		        return true;
		    }
		}
		}catch(Exception e1){
			
		}
	}
	/**
	 * @param x
	 * @return
	 */
	private boolean isPrime(double x) {
		// TODO Auto-generated method stub
		if(x < 2)
			return false;
		for(int i = 2;i <= Math.sqrt(x);i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
