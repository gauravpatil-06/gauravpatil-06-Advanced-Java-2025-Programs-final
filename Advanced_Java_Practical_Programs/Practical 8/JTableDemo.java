import javax.swing.*; 
import java.awt.*; 
class JTableDemo extends JFrame 
{ 
	JTableDemo() 
	{ 
	   Container c=getContentPane(); 
	   
	   BorderLayout b1=new BorderLayout(); 
	   c.setLayout(b1); 
	   
	   String colHeads[]={"ID","Name","salary"}; 
	   String data[][]={{"101","Amit","670000"}, 
					    {"102","Jay","780000"}, 
					    {"101","Sachin","700000"}};  	
		
	   JTable jt=new JTable(data,colHeads); 
	   
	   int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; 
	   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;   
	   JScrollPane jsp=new JScrollPane(jt,v,h); 
	   c.add(jsp,BorderLayout.CENTER); 
	} 
	public static void main(String args[]) 
	{ 
		 JTableDemo j1=new JTableDemo(); 
		 j1.setVisible(true); 
		 j1.setTitle("JTable Demo"); 
		 j1.setSize(500,500); 
		 j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	} 
} 
