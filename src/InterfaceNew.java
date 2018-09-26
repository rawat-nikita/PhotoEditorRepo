
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class InterfaceNew extends JFrame implements ActionListener {
	int c=1;
	JPanel p1,p2,p3;
	JLabel imagelabel;
	BufferedImage bufimg;
    String path;
    File f,f2;
    JLabel heading1,heading2,heading3;
    JButton original,browse,bright,contrast,greyscale,mirrorImage1,mirrorImage2,mirrorImage3,mirrorImage4,sepia,redImage,negative,greenImage,blueImage,save;
	public InterfaceNew()
	{
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.setMaximizedBounds(env.getMaximumWindowBounds());
		this.setExtendedState(this.getExtendedState()|this.MAXIMIZED_BOTH);
		setLayout(null);
		setTitle("Image Editing Tool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.getHSBColor(9.56f, 2.6f, 49.9f));
		p1.setSize(1366,130);
	
		heading1 = new JLabel("IMAGE",JLabel.LEFT);
		heading1.setForeground(Color.getHSBColor(12.56f, 16.0f, 487.9f));
		heading1.setFont(new Font("Serif",Font.BOLD,30));
		heading1.setBounds(35, 0, 300,100);
		heading2 = new JLabel("EDITING",JLabel.LEFT);
		heading2.setForeground(Color.getHSBColor(32.56f, 76.0f, 487.9f));
		heading2.setFont(new Font("Serif",Font.BOLD,30));
		heading2.setBounds(63, 25, 250,100);
		heading3 = new JLabel("TOOL",JLabel.LEFT);
		heading3.setForeground(Color.getHSBColor(32.56f, 76.0f, 487.9f));
		heading3.setFont(new Font("Serif",Font.BOLD,30));
		heading3.setBounds(99, 50, 250,100);
		
		browse = new JButton("BROWSE NEW IMAGE");
		browse.setBackground(Color.white );
		browse.setBounds(1130,30,160,30);
		save=new JButton("SAVE EDITED IMAGE");
		save.setBackground(Color.white );
		save.setBounds(1130,70,160,30);
		
		p1.add(heading1);
		p1.add(heading2);
		p1.add(heading3);
		p1.add(browse);
		p1.add(save);
		browse.addActionListener(this);
		add (p1,BorderLayout.NORTH);
				
		p2 = new JPanel(new FlowLayout());
		imagelabel = new JLabel();
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setBounds(5,140,1085,560);
		p2.add(imagelabel,BorderLayout.CENTER);
		add(p2);
		
		p3 = new JPanel(new GridLayout(13,1,20,10));
		p3.setBounds(1100,140,250,560);
		 
		original = new JButton("ORIGINAL IMAGE");
		greyscale = new JButton("GREYSCALE");
		mirrorImage1 = new JButton("VERTICAL MIRROR");
		mirrorImage2= new JButton("HORIZONTAL MIRROR");
		mirrorImage3 = new JButton("FLIP VERTICALLY");
		mirrorImage4 = new JButton("FLIP HORIZONTALLY");
		sepia = new JButton("SEPIA");
		redImage = new JButton("RED IMAGE");
		greenImage = new JButton("GREEN IMAGE");
		blueImage = new JButton("BLUE IMAGE");
		negative = new JButton("NEGATIVE");
		bright = new JButton("BRIGHTEN");
		contrast = new JButton("CONTRAST");
		
		original.setForeground(Color.white);
		original.setBackground(Color.getHSBColor(32.56f, 76.0f, 326.9f));
		greyscale.setForeground(Color.white);
		greyscale.setBackground(Color.getHSBColor(76.56f, 66.0f, 29.9f));
		mirrorImage1.setForeground(Color.white);
		mirrorImage1.setBackground(Color.getHSBColor(45.56f, 36.0f, 809.9f));
		mirrorImage2.setForeground(Color.white);
		mirrorImage2.setBackground(Color.getHSBColor(45.56f, 36.0f, 809.9f));
		mirrorImage3.setForeground(Color.white);
		mirrorImage3.setBackground(Color.getHSBColor(45.56f, 36.0f, 809.9f));
		mirrorImage4.setForeground(Color.white);
		mirrorImage4.setBackground(Color.getHSBColor(45.56f, 36.0f, 809.9f));
		sepia.setForeground(Color.white);
		sepia.setBackground(Color.getHSBColor(21.56f, 16.0f, 29.9f));
		redImage.setForeground(Color.white);
		redImage.setBackground(Color.getHSBColor(0.56f, 26.0f, 25.9f));
		greenImage.setForeground(Color.white);
		greenImage.setBackground(Color.getHSBColor(45.56f, 43.0f, 66.9f));
		blueImage.setForeground(Color.white);
		blueImage.setBackground(Color.getHSBColor(16.56f, 66.0f, 573.9f));
		negative.setForeground(Color.white);
		negative.setBackground(Color.getHSBColor(26.56f, 16.0f, 32.9f));
		bright.setForeground(Color.white);
		bright.setBackground(Color.getHSBColor(26.56f, 16.0f, 32.9f));
		contrast.setForeground(Color.white);
		contrast.setBackground(Color.getHSBColor(26.56f, 16.0f, 32.9f));
		//save.setForeground(Color.white);
		//save.setBackground(Color.getHSBColor(26.56f, 16.0f, 32.9f));
		p3.add(original);
		p3.add(bright);
		p3.add(contrast);
		p3.add(greyscale);
		p3.add(sepia);
		p3.add(negative);
		p3.add(mirrorImage1);
		p3.add(mirrorImage2);
		p3.add(mirrorImage3);
		p3.add(mirrorImage4);
		p3.add(redImage);
		p3.add(greenImage);
		p3.add(blueImage);
		add (p3);
	    
	    original.addActionListener(this);
		greyscale.addActionListener(this);
		mirrorImage1.addActionListener(this);
		mirrorImage2.addActionListener(this);
		mirrorImage3.addActionListener(this);
		mirrorImage4.addActionListener(this);
        sepia.addActionListener(this);
        redImage.addActionListener(this);
        greenImage.addActionListener(this);
        blueImage.addActionListener(this);
        negative.addActionListener(this);
        save.addActionListener(this);
        bright.addActionListener(this);
        contrast.addActionListener(this);
        
      	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
        
        }
	private java.awt.Color HSVgetColor(int i, int j, int k) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public static void main(String[] args) {
			new InterfaceNew();	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand()=="BROWSE NEW IMAGE") 
		{
			// JFileChooser to open image file
	        JFileChooser file = new JFileChooser();
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpeg", "jpg","gif","png");
	        file.addChoosableFileFilter(filter);
	        int result = file.showSaveDialog(null);
	        if(result == JFileChooser.APPROVE_OPTION)
	        {
		        File selectedFile = file.getSelectedFile();
		        path = selectedFile.getAbsolutePath();
		        imagelabel.setIcon(ResizeImage(path));
		        
	        }
	        else if(result == JFileChooser.CANCEL_OPTION)
	        {
	        	System.out.println("No File Select");
	        }
		}
		
		if(e.getActionCommand()=="ORIGINAL IMAGE") 
		{
			CreateBufferedImage(path);
	        imagelabel.setIcon(ResizeImage(bufimg));
		}
		
		else if(e.getActionCommand()=="GREYSCALE")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
		        for (int x = 0; x < width; x++)
		        {
		        int p = bufimg.getRGB(x,y);
		        int a = (p>>24)&0xff;
		        int r = (p>>16)&0xff;
		        int g = (p>>8)&0xff;
		        int b = p&0xff;
		        int avg = (r+g+b)/3;
		        p = (a<<24) | (avg<<16) | (avg<<8) | avg;
		        bufimg.setRGB(x, y, p);
		        }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="VERTICAL MIRROR")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
	            for (int lx = 0, rx = width - 1; lx < width; lx++, rx--)
	            {
	                // lx starts from the left side of the image
	                // rx starts from the right side of the image
	                // lx is used since we are getting pixel from left side
	                // rx is used to set from right side
	                // get source pixel value
	                int p = bufimg.getRGB(lx, y);
	 
	                // set mirror image pixel value
	                bufimg.setRGB(rx, y, p);
	            }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="HORIZONTAL MIRROR")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int x = 0; x < width; x++)
	        {
	            for (int ty = 0, by = height - 1; ty < height; ty++, by--)
	            {
	                // lx starts from the left side of the image
	                // rx starts from the right side of the image
	                // lx is used since we are getting pixel from left side
	                // rx is used to set from right side
	                // get source pixel value
	                int p = bufimg.getRGB(x, ty);
	 
	                // set mirror image pixel value
	                bufimg.setRGB(x, by, p);
	            }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="FLIP VERTICALLY")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
	            for (int lx = 0, rx = width - 1; lx < width/2; lx++, rx--)
	            {
	                // lx starts from the left side of the image
	                // rx starts from the right side of the image
	                // lx is used since we are getting pixel from left side
	                // rx is used to set from right side
	                // get source pixel value
	                int p = bufimg.getRGB(lx, y);
	                int q=bufimg.getRGB(rx,y);
	 
	                // set mirror image pixel value
	                bufimg.setRGB(rx, y, p);
	                bufimg.setRGB(lx, y, q);
	            }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="FLIP HORIZONTALLY")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int x = 0; x < width; x++)
	        {
	            for (int ty = 0, by = height - 1; ty < height/2; ty++, by--)
	            {
	                // lx starts from the left side of the image
	                // rx starts from the right side of the image
	                // lx is used since we are getting pixel from left side
	                // rx is used to set from right side
	                // get source pixel value
	                int p = bufimg.getRGB(x, ty);
	                int q=bufimg.getRGB(x,by);
	 
	                // set mirror image pixel value
	                bufimg.setRGB(x, ty, q);
	                bufimg.setRGB(x, by, p);
	            }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="NEGATIVE")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
		        for (int x = 0; x < width; x++)
		        {
		        	int p = bufimg.getRGB(x,y);
	                int a = (p>>24)&0xff;
	                int r = (p>>16)&0xff;
	                int g = (p>>8)&0xff;
	                int b = p&0xff;
	 
	                //subtract RGB from 255
	                r = 255 - r;
	                g = 255 - g;
	                b = 255 - b;
	 
	                //set new RGB value
	                p = (a<<24) | (r<<16) | (g<<8) | b;
	                bufimg.setRGB(x, y, p);
		        }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="SEPIA")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
		        for (int x = 0; x < width; x++)
		        {
		        	int p = bufimg.getRGB(x,y);
		        	 
	                int a = (p>>24)&0xff;
	                int R = (p>>16)&0xff;
	                int G = (p>>8)&0xff;
	                int B = p&0xff;
	 
	                //calculate newRed, newGreen, newBlue
	                int newRed = (int)(0.393*R + 0.769*G + 0.189*B);
	                int newGreen = (int)(0.349*R + 0.686*G + 0.168*B);
	                int newBlue = (int)(0.272*R + 0.534*G + 0.131*B);
	 
	                //check condition
	                if (newRed > 255)
	                    R = 255;
	                else
	                    R = newRed;
	 
	                if (newGreen > 255)
	                    G = 255;
	                else
	                    G = newGreen;
	 
	                if (newBlue > 255)
	                    B = 255;
	                else
	                    B = newBlue;
	 
	                //set new RGB value
	                p = (a<<24) | (R<<16) | (G<<8) | B;
	 
	                bufimg.setRGB(x, y, p);
		        }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="RED IMAGE")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
		        for (int x = 0; x < width; x++)
		        {
		        	int p = bufimg.getRGB(x,y);
		        	 
	                int a = (p>>24)&0xff;
	                int r = (p>>16)&0xff;
	 
	                // set new RGB
	                // keeping the r value same as in original
	                // image and setting g and b as 0.
	                p = (a<<24) | (r<<16) | (0<<8) | 0;
	 
	                bufimg.setRGB(x, y, p);
		        }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="GREEN IMAGE")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
		        for (int x = 0; x < width; x++)
		        {
		        	int p = bufimg.getRGB(x,y);
		        	 
	                int a = (p>>24)&0xff;
	                int g = (p>>8)&0xff;
	 
	                // set new RGB
	                // keeping the r value same as in original
	                // image and setting g and b as 0.
	                p = (a<<24) | (0<<16) | (g<<8) | 0;
	 
	                bufimg.setRGB(x, y, p);
		        }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="BLUE IMAGE")
	    {
			CreateBufferedImage(path);
	    	int width = bufimg.getWidth();
	        int height = bufimg.getHeight();
	        for (int y = 0; y < height; y++)
	        {
		        for (int x = 0; x < width; x++)
		        {
		        	int p = bufimg.getRGB(x,y);
		        	 
	                int a = (p>>24)&0xff;
	                int b = (p>>0)&0xff;
	 
	                // set new RGB
	                // keeping the r value same as in original
	                // image and setting g and b as 0.
	                p = (a<<24) | (0<<16) | (0<<8) | b;
	 
	                bufimg.setRGB(x, y, p);
		        }
	        }
	        imagelabel.setIcon(ResizeImage(bufimg));
	    }
		else if(e.getActionCommand()=="SAVE EDITED IMAGE")
		{
			new File("E:\\Image Editing Tool").mkdir();
	        
	        	System.out.println(c);
	        	f2 = new File("E:\\Image Editing Tool\\EditedImage"+c+".jpg");
	        	try {
					ImageIO.write(bufimg, "jpg", f2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	c=c+1;
	        
	        new SaveDialogBox();
	  	}
		else if(e.getActionCommand()=="BRIGHTEN") 
		{
			CreateBufferedImage(path);
			RescaleOp rescaleOp = new RescaleOp(1.2f, 15, null);   
			rescaleOp.filter(bufimg, bufimg);
	        imagelabel.setIcon(ResizeImage(bufimg));
		}
		else if(e.getActionCommand()=="CONTRAST") 
		{
			CreateBufferedImage(path);
			RescaleOp rescaleOp = new RescaleOp(1.8f, 10.0f, null); 
			rescaleOp.filter(bufimg, bufimg);
	        imagelabel.setIcon(ResizeImage(bufimg));
		}
	}
	
	public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
	
	public ImageIcon ResizeImage(BufferedImage bimg)
    {
        ImageIcon MyImage = new ImageIcon(bimg);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    // Method to create a buffer class image
    public void CreateBufferedImage(String path)
    {
    	 f = new File(path);
         try 
         {
			bufimg = ImageIO.read(f);
		 } 
         catch (IOException e) 
         {
        	 e.printStackTrace();
		}
    }
}