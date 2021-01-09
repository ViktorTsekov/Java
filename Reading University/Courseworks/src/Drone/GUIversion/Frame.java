package Drone.GUIversion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.SwingConstants;

public class Frame {
	private JFrame frame;
	private JPanel arena;
	private JButton AnimateButton;
	private JLabel Information;
	
	private ArenaAssets arenaAssets;

	/**
	 * Launch the application
	 * Dimensions of drone: 40x40
	 * @author Viktor
	 */	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		arenaAssets = new ArenaAssets();
		initialize();
	}

	private void addDrone(String role) {
		arenaAssets.addNewDrone(arena, role);
		arenaAssets.showInformationOnScreen(Information);
	}
	
	private void animate() {
		arenaAssets.clearPanel(arena);
		arenaAssets.moveDrones(arena);
		arenaAssets.showInformationOnScreen(Information);
	}
	
	private void saveToFile() {
		arenaAssets.saveToFile();
		Information.setText("Data Saved");
	}
	
	private void loadFromFile() {
		arenaAssets.clearPanel(arena);
		arenaAssets.loadFromFile(arena);
		arenaAssets.showInformationOnScreen(Information);
	}
	
	private void clear() {
		arenaAssets.clearPanel(arena);
		arenaAssets.emptyList();
		Information.setText("");
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Timer timer;  
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1289, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Here we play the animation
		timer = new Timer(10, new ActionListener() {  
            @Override
            
            public void actionPerformed(ActionEvent e) {
            	animate();
            }  
            
        });    
		
		JButton AddHorizontalDrone = new JButton("Add Horizontal Drone");
		AddHorizontalDrone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AddHorizontalDrone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addDrone("horizontal");
			}
		});
		AddHorizontalDrone.setBounds(0, 0, 210, 37);
		frame.getContentPane().add(AddHorizontalDrone);
		
		arena = new JPanel();
		arena.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		arena.setBounds(0, 100, 600, 600);
		frame.getContentPane().add(arena);
		
		AnimateButton = new JButton("Animate");
		AnimateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!timer.isRunning()) {
					timer.start();
				} else {
					timer.stop(); 
				}

			}
		});
		AnimateButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AnimateButton.setBounds(817, 0, 148, 37);
		frame.getContentPane().add(AnimateButton);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ExitButton.setBounds(1133, 0, 148, 37);
		frame.getContentPane().add(ExitButton);
		
		Information = new JLabel("");
		Information.setVerticalAlignment(SwingConstants.TOP);
		Information.setForeground(Color.BLACK);
		Information.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Information.setBackground(Color.GRAY);
		Information.setBounds(659, 140, 440, 560);
		frame.getContentPane().add(Information);
		
		JButton HelpButton = new JButton("Help");
		HelpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Drones GUI, Version 1.0");
			}
		});
		HelpButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		HelpButton.setBounds(975, 0, 148, 37);
		frame.getContentPane().add(HelpButton);
		
		JLabel lblNewLabel;
		lblNewLabel = new JLabel("Arena Size: 600x600");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(659, 100, 210, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton AddVerticalDrone = new JButton("Add Vertical Drone");
		AddVerticalDrone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addDrone("vertical");
			}
		});
		AddVerticalDrone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AddVerticalDrone.setBounds(220, 0, 210, 37);
		frame.getContentPane().add(AddVerticalDrone);
		
		JButton SaveInformation = new JButton("Save Informtaion");
		SaveInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveToFile();
			}
		});
		SaveInformation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SaveInformation.setBounds(440, 0, 148, 37);
		frame.getContentPane().add(SaveInformation);
		
		JButton LoadInformation = new JButton("Load Information");
		LoadInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadFromFile();
			}
		});
		LoadInformation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LoadInformation.setBounds(440, 44, 148, 37);
		frame.getContentPane().add(LoadInformation);
		
		JButton btnClearArena = new JButton("Clear Arena");
		btnClearArena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnClearArena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClearArena.setBounds(659, 0, 148, 37);
		frame.getContentPane().add(btnClearArena);
		
		JButton AddDiagonalDrone = new JButton("Add Diagonal Drone");
		AddDiagonalDrone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addDrone("diagonal");
			}
		});
		AddDiagonalDrone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AddDiagonalDrone.setBounds(0, 44, 210, 37);
		frame.getContentPane().add(AddDiagonalDrone);
		
		JButton btnAddStaticDrone = new JButton("Add Static Drone");
		btnAddStaticDrone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addDrone("static");
			}
		});
		btnAddStaticDrone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddStaticDrone.setBounds(220, 44, 210, 37);
		frame.getContentPane().add(btnAddStaticDrone);
	}
	
}
