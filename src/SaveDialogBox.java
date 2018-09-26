import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
public class SaveDialogBox extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton yes,no;
	JPanel p1,p2,p3;
	public SaveDialogBox()
	{
		setTitle("Image Saved");
		setLayout(new GridLayout(3,1));
		l1=new JLabel("Image saved at    E:\\Image Editing Tool");
		l2=new JLabel("Do you want to edit a new image?");
		yes=new JButton("YES");
		no=new JButton("NO");
		p1=new JPanel(new FlowLayout());
		p2=new JPanel(new FlowLayout());
		p3=new JPanel(new FlowLayout());
		p3.add(yes);
		p3.add(no);
		p1.add(l1,"Center");
		p2.add(l2,"Center");
		add(p1);
		add(p2);
		add(p3);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		
		setSize(250,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SaveDialogBox();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yes)
		{
			this.setVisible(false);
			new InterfaceNew().setVisible(true);
		}
		else if(e.getSource()==no)
		{
			this.setVisible(false);
		}
		
	}

}
