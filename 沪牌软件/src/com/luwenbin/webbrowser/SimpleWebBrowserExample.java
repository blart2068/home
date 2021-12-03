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
//public static String ul=System.getProperty("user.dir")+"/moni.html";
public static String ul="https://paimai.alltobid.com";
public static int cs=40;

    public static JComponent createContent()
    {
        JPanel contentPane = new JPanel(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));
        final JWebBrowser webBrowser = new JWebBrowser();
      //网页地址
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
            	jPanel2.add(JM.wysj);
            	jPanel2.add(JM.end);
            	
            	jPanel.add(JM.jln);
            	jPanel.add(JM.jl);
            	jPanel.add(JM.jts);
            	jPanel.add(JM.jtf);
            	jPanel.add(JM.jtm);
            	jPanel.add(JM.szsj);
            	
                final JFrame frame = new JFrame("blart 沪牌工具");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(createContent(), BorderLayout.CENTER);
                frame.add(jPanel,BorderLayout.NORTH);
                frame.add(jPanel2,BorderLayout.EAST);
                //frame.add(JM.jl,BorderLayout.SOUTH);
                frame.setSize(1040, 888);
               // frame.setUndecorated(true);//禁用窗口工具
                frame.setResizable(false);//禁用最大化
                
//                frame.setLocationRelativeTo(null);
                
                frame.setVisible(true);
                frame.setAlwaysOnTop(true);
                frame.setLocation(0, 0);
                
                frame.addComponentListener(new ComponentListener () {//监听窗口移动位置

					public void componentHidden(ComponentEvent e) {
						// TODO 自动生成的方法存根
						
					}

					public void componentMoved(ComponentEvent e) {//获得窗口移动后的位置
						Point p = frame.getLocation();  
						JM.x=(int)p.getX();
						
						JM.y=(int)p.getY()-cs;
						
						
					}

					public void componentResized(ComponentEvent e) {
						// TODO 自动生成的方法存根
						
					}

					public void componentShown(ComponentEvent e) {
						// TODO 自动生成的方法存根
						
					}//监听窗口变化
                	 
                   
                });
                
                frame.addWindowListener(new WindowAdapter() {  //下线删除客户端
                	  
                	  
                	public void windowClosing(WindowEvent e) {  
                	super.windowClosing(e);  
                	
                	 }  
                	  
                	});  
                
                
                
            }
        });
        NativeInterface.runEventPump();
        
        
    	
    }

    	
    	
    	
}
