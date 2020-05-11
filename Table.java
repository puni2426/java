
import javax.swing.*;
import java.awt.*;


/*
<applet code ="Table" width=500 height=500>
</applet>
*/

public class Table extends JApplet{

	
	JFrame jf = new JFrame("TABLE");

	String col[]={"USN","NAME","BRANCH","SEM","SECTION"};


	String value[][]={
		 	 {"4AL18CS072","Harin ","CSE","4th","B"},
		 	 {"4AL18CS068","Ramesh","CSE","4th","B"},
             {"4AL18CS082","Sidramesh","CSE","4th","B"}
			 };

	public void init()
	{
		try
		{
			SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					makeGUI();
				}
			}
			);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


		public void makeGUI()
		{
			setLayout(new FlowLayout());

			JTable jt=new JTable(value,col);

			JScrollPane js=new JScrollPane(jt);
			add(js);

		}
}
