/*
 * luwenbin006@163.com (luwenbin006@163.com)
 * http://www.luwenbin.com
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package com.luwenbin.webbrowser;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.common.WebServer;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

/**
 * @author luwenbin006@163.com
 */
public class ClasspathPages
{

    public static JComponent createContent()
    {
        JWebBrowser webBrowser = new JWebBrowser(null);
        webBrowser.navigate(WebServer.getDefaultWebServer().getClassPathResourceURL(ClasspathPages.class.getName(), "resource/page1.html"));
        webBrowser.setBarsVisible(false);
        return webBrowser;
    }

    /* Standard main method to try that test as a standalone application. */
    public static void main(String[] args)
    {
        NativeInterface.open();
        UIUtils.setPreferredLookAndFeel();
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("DJ Native Swing Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(createContent(), BorderLayout.CENTER);
                frame.setSize(800, 600);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });
        NativeInterface.runEventPump();
    }

}
