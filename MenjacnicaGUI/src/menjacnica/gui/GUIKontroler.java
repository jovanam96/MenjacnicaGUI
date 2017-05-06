package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUIKontroler {

	private static MenjacnicaGUI frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void prikaziDodajKurs() {
		DodajKursGUI prozor = new DodajKursGUI();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(null);
	}
	
	public static void otvoriFajl() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(frame.getContentPane());
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			frame.ispisi("Ucitaj fajl: " + file.getAbsolutePath());
		}
		
	}
	
	public static void sacuvajFajl() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(frame.getContentPane());
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			frame.ispisi("Sacuvan fajl: "
			+ file.getAbsolutePath());
		}
	}
	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(frame.getContentPane(), "Da li zelite da ziadjete iz programa?",
				"Zatvaranje aplikacije", JOptionPane.YES_NO_CANCEL_OPTION);

		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public static void ispisiPodatkeOAutoru() {
		JOptionPane.showMessageDialog(frame, "Ime i prezime autora: Jovana Mitrovic", "Podaci o autoru", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void ispisi(String tekst) {
		frame.ispisi(tekst);
	}

}
