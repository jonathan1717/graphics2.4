import java.awt.*;
import java.util.Set;

import javax.swing.*;


public class graphicsChallengesTwo4 extends Canvas 
	{
		static int y;
		static int x;
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        graphicsChallengesTwo4 canvas = new graphicsChallengesTwo4();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			 for (x = 0; x < 1000; x++)
    		        	{
    			        
		    			 for (y = 0; y < 1000; y++)
		    		        	{
		    			        graphics.setColor(Color.blue);
		    			        graphics.fillRect(y, y, 150, 150);
		    			        delay();
		    			        graphics.setColor(Color.white);
		    			        graphics.fillRect(y, y, 150, 150);
		    		        	}
    		        	}
    			}
    	    		
    	
    	    		public void delay()
    	    			{
    	    	        try
    	    					{
    	    					Thread.sleep(10);
    	    					} catch (InterruptedException e)
    	    					{
    	    					e.printStackTrace();
    	    					}
    	    			}
    		}
    	
    		