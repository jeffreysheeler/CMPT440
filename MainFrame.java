/*
 * file: MainFrame.java
 * author: Jeffrey Sheeler
 * course: CMPT 440
 * assignment: Final Project
 * due date: May 3, 2016
 * version: 1
 * 
 * This file contains the declaration of the MainFrame
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.*;
import javax.swing.text.StyleConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.beans.PropertyChangeEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmSave = new JMenuItem("Save");
	private final JMenuItem mntmOpen = new JMenuItem("Open");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private DFAClass2 checker = new DFAClass2();
	private final JMenuItem mntmNew = new JMenuItem("New");
	private final JTextPane textPane = new JTextPane();
	private final JScrollPane scrollPane = new JScrollPane();
	private String saveFile = null;
	private String loadFile = null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Text Editor");
		jbInit();
	}
	private void jbInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 486);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmNew_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmNew);
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmSave_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmSave);
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmOpen_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmOpen);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmExit_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 563, 410);
		
		contentPane.add(scrollPane);
		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				do_textPane_keyReleased(arg0);
			}
		});
		scrollPane.setViewportView(textPane);
	}
	
	/*
	 * loadFile
	 *
	 * This function loads a file from the computer
	 * 
	 * Parameters:
	 *   N/A
	 * 
	 * Return value: N/A
	 */
	
	private void loadFile(){
		JFileChooser file = new JFileChooser();
		String name = null;
		if (file.showOpenDialog(null) != JFileChooser.CANCEL_OPTION)
		      name = file.getSelectedFile().getAbsolutePath();
		    else
		      return;  
		    try {
		      Scanner in = new Scanner(new File(name)); 
		      saveFile = name;
		      textPane.setText("");
		      while (in.hasNext())
				try {
					((Appendable) textPane).append(in.nextLine() + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
		      in.close();
		    }
		    catch (FileNotFoundException e) {
		      JOptionPane.showMessageDialog(null, "File not found: " + name,
		        "Error", JOptionPane.ERROR_MESSAGE);
		    }
	}
	
	
	/*
	 * saveFile
	 *
	 * This function saves the contents of the textPane to a document
	 * 
	 * Parameters:
	 *   N/A
	 * 
	 * Return value: N/A
	 */
	private void saveFile(){
		String name = null;
		if(name == null){
			JFileChooser file = new JFileChooser();
			if (file.showSaveDialog(null) != JFileChooser.CANCEL_OPTION)
		        name = file.getSelectedFile().getAbsolutePath();
		    }
		    if (name != null) {  // else user cancelled
		      try {
		        Formatter out = new Formatter(new File(name));  // might fail
		        loadFile = name;
		        out.format("%s", textPane.getText());
		        out.close();
		      }
		      catch (FileNotFoundException e) {
		        JOptionPane.showMessageDialog(null, "Could not save your file",
		          "Error", JOptionPane.ERROR_MESSAGE);
		      }
		    }
		}
	
	
	
	protected void do_mntmExit_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
	
	protected void do_mntmNew_actionPerformed(ActionEvent arg0) {
		textPane.setText("");
	}
	protected void do_mntmOpen_actionPerformed(ActionEvent arg0) {
		loadFile();
	}
	protected void do_mntmSave_actionPerformed(ActionEvent arg0) {
		saveFile();
	}
	protected void do_textPane_keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_ENTER){
			checker.reset();
			textPane.setForeground(Color.BLACK);
		}
		
		
		
		String s = textPane.getText();
		String[] numLines = s.split("\n");
		if(checker.setColor(s) == "blue")
			textPane.setForeground(Color.BLUE);
		else if(checker.setColor(s) == "purple")
			textPane.setForeground(Color.MAGENTA);
		else if(checker.setColor(s) == "orange")
			textPane.setForeground(Color.ORANGE);
		else if(checker.setColor(s) == "green")
			textPane.setForeground(Color.GREEN);
		else if(checker.setColor(s) == "red")
			textPane.setForeground(Color.RED);
				
		else
			textPane.setForeground(Color.BLACK);
		
	}
}
