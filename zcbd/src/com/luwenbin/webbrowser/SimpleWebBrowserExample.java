/*
 * luwenbin006@163.com (luwenbin006@163.com)
 * http://www.luwenbin.com
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package com.luwenbin.webbrowser;
import jiemian.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

/**
 * @author luwenbin006@163.com
 */
public class SimpleWebBrowserExample extends Thread
{
public static String ul="http://hw4g.zcdcyxdl.com/ldhw/index.php";
    public static JComponent createContent()
    {
        JPanel contentPane = new JPanel(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));
        final JWebBrowser webBrowser = new JWebBrowser();
      //��ҳ��ַ
        webBrowser.navigate(ul);
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        contentPane.add(webBrowserPanel, BorderLayout.CENTER);
       
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));
        
//        JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser.isMenuBarVisible());
//        menuBarCheckBox.addItemListener(new ItemListener()
//        {
//            public void itemStateChanged(ItemEvent e)
//            {
//                webBrowser.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);
//            }
//        });
//        buttonPanel.add(menuBarCheckBox);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        return contentPane;
    }

    //public static void main(String[] args) {
		
	
    
    public  void run() {
    
        NativeInterface.open();
        UIUtils.setPreferredLookAndFeel();
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            	
            	JPanel jPanel =new JPanel();
            	JPanel jPanel2 =new JPanel();
            	jPanel2.setLayout(new GridLayout(10,1,2,2));
            	jPanel2.add(JM.an);
            	jPanel2.add(JM.jl1);
            	jPanel2.add(JM.jt);
            	jPanel2.add(JM.jl2);
            	jPanel2.add(JM.jt1);
            	jPanel2.add(JM.wysj);
            	jPanel2.add(JM.end);
            	jPanel.add(JM.jln);
            	


            	
                final JFrame frame = new JFrame("by_blart");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(createContent(), BorderLayout.CENTER);
                frame.add(jPanel,BorderLayout.NORTH);
                frame.add(jPanel2,BorderLayout.EAST);
                //frame.add(JM.jl,BorderLayout.SOUTH);
                frame.setSize(500, 700);
               // frame.setUndecorated(true);//���ô��ڹ���
                frame.setResizable(false);//�������
                
//                frame.setLocationRelativeTo(null);
                
                frame.setVisible(true);
                frame.setAlwaysOnTop(true);
                frame.setLocation(0, 0);
                
                frame.addComponentListener(new ComponentListener () {//���������ƶ�λ��

					public void componentHidden(ComponentEvent e) {
						// TODO �Զ����ɵķ������
						
					}

					public void componentMoved(ComponentEvent e) {//��ô����ƶ����λ��
						Point p = frame.getLocation();  
						JM.x=(int)p.getX();JM.y=(int)p.getY();
						
						
					}

					public void componentResized(ComponentEvent e) {
						// TODO �Զ����ɵķ������
						
					}

					public void componentShown(ComponentEvent e) {
						// TODO �Զ����ɵķ������
						
					}//�������ڱ仯
                	 
                   
                });
                
              
                
                
                
            }
        });
        NativeInterface.runEventPump();
        
        
    	
    }

    	
    	
    	
}
