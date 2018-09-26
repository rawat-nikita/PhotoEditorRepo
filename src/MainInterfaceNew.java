
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainInterfaceNew extends JFrame implements ActionListener
{
JButton b1;
JLabel l1,l2,l3;


    public MainInterfaceNew()
    {
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
	this.setMaximizedBounds(env.getMaximumWindowBounds());
	this.setExtendedState(this.getExtendedState()|this.MAXIMIZED_BOTH);
	setLayout(null);
		
    setTitle("Image Editing Tool");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

   
    setContentPane(new JLabel(new ImageIcon("E:\\123.jpg")));
   
  
    b1=new JButton("OPEN");
    b1.setBounds(930,645,93,43);
    b1.addActionListener(this);
     add(b1,BorderLayout.SOUTH);
     
     
       l1 = new JLabel("Image");
       l1.setFont(new Font("Serif",Font.BOLD,68));
       l1.setForeground(Color.BLACK);
       l2 = new JLabel("Editing");
       l2.setFont(new Font("Serif",Font.BOLD,68));
       l2.setForeground(Color.BLACK);
       l1.setBounds(90, 250, 530, 150);
       l2.setBounds(170, 340, 530, 150);
       l3 = new JLabel("Tool......");
       l3.setBounds(330, 430, 530, 150);
       l3.setFont(new Font("Serif",Font.BOLD,68));
       l3.setForeground(Color.BLACK);
       
       add(l1);
       add(l2);
       add(l3);
       setVisible(true);
    
   
    }
   
 public static void main(String args[])
    {
    new MainInterfaceNew();
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="OPEN") {
			this.setVisible(false);
			new InterfaceNew().setVisible(true);
		}
		
	}
   
} 

