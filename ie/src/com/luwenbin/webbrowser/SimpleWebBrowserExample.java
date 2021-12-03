/*
 * luwenbin006@163.com (luwenbin006@163.com)
 * http://www.luwenbin.com
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package com.luwenbin.webbrowser;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
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
public class SimpleWebBrowserExample
{

    public static JComponent createContent()
    {
        JPanel contentPane = new JPanel(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));
        final JWebBrowser webBrowser = new JWebBrowser();
        webBrowser.navigate("file:///C:/Users/blart/Desktop/moni.html");
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        contentPane.add(webBrowserPanel, BorderLayout.CENTER);
        // Create an additional bar allowing to show/hide the menu bar of the web browser.
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));
        JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser.isMenuBarVisible());
        menuBarCheckBox.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                webBrowser.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);
            }
        });
        buttonPanel.add(menuBarCheckBox);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        return contentPane;
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
                JFrame frame = new JFrame("blart���ƹ���");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(createContent(), BorderLayout.CENTER);
                frame.setSize(980, 900);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });
        NativeInterface.runEventPump();
    }

}
