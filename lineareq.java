import javax.swing.*;
import java.awt.event.*;
class lineareq{
	static JTextField t1,t2;
	static JLabel xlabel,ylabel;
	public static void main(String arg[]){
		JFrame f=new JFrame("Linear equation");
		f.setSize(800,800);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1=new JLabel("first equation");
		l1.setBounds(100,100,100,50);
		f.add(l1);
		
		 t1=new JTextField();
		t1.setBounds(200,100,200,30);
		f.add(t1);
		
		
		JLabel l2=new JLabel("second equation");
		l2.setBounds(100,250,100,50);
		f.add(l2);
		
		 t2=new JTextField();
		t2.setBounds(200,250,200,30);
		f.add(t2);
		
		JButton b1=new JButton("find");
		b1.setBounds(100,300,100,50);
		b1.addActionListener(new find_action());
		
		xlabel=new JLabel("");
		xlabel.setBounds(100,400,100,50);
		ylabel=new JLabel("");
		ylabel.setBounds(200,400,100,50);
		
		f.add(xlabel);
		f.add(ylabel);
		f.add(b1);
		f.setVisible(true);
	}
		
}

class find_action implements ActionListener{
	public void actionPerformed(ActionEvent e){
		int[][] a=new int[2][2];
		int[] b=new int[2];
		lineareq obj=new lineareq();
		String e1=obj.t1.getText();
		
		
		String e2=obj.t2.getText();
		
		
		String[] d=e1.split("x");
		a[0][0]=Integer.parseInt(d[0]);
		a[0][1]=Integer.parseInt(d[1].split("y")[0]);
		
		String[] d2=e2.split("x");
		a[1][0]=Integer.parseInt(d2[0]);
		a[1][1]=Integer.parseInt(d2[1].split("y")[0]);
		
		b[0]=Integer.parseInt(e1.split("=")[1]);
		b[1]=Integer.parseInt(e2.split("=")[1]);
		
		
		int k=a[0][0]*a[1][1]-a[0][1]*a[1][0];
		System.out.println(k);
		
		int k1=(b[0]*a[1][1])-(a[0][1]*b[1]);
		System.out.println(k1);
		int x=k1/k;
		
		
		
		
		int k2=(a[0][0]*b[1])-(b[0]*a[1][0]);
		System.out.println(k2);
		int y=k2/k;
		
				
		System.out.println(x);
		System.out.println(y);
		
			obj.xlabel.setText("x= "+x);
		obj.ylabel.setText("y= "+y);
		}
}