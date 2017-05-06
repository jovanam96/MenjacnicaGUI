package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblSifra;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textField_Sifra;
	private JTextField textField_Naziv;
	private JTextField textField_Prodajni;
	private JTextField textField_Kupovni;
	private JTextField textField_Srednji;
	private JTextField textField_SkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 0, 360, 271);
			panel.add(getLblSifra());
			panel.add(getLabel_1());
			panel.add(getLabel_2());
			panel.add(getLabel_3());
			panel.add(getLblSrednjiKurs());
			panel.add(getLblSkraceniNaziv());
			panel.add(getTextField_Sifra());
			panel.add(getTextField_Naziv());
			panel.add(getTextField_Prodajni());
			panel.add(getTextField_Kupovni());
			panel.add(getTextField_Srednji());
			panel.add(getTextField_SkraceniNaziv());
			panel.add(getBtnDodaj());
			panel.add(getBtnOdustani());
		}
		return panel;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 103, 25);
		}
		return lblSifra;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv");
			label_1.setBounds(178, 11, 103, 25);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Prodajni kurs");
			label_2.setBounds(10, 82, 103, 25);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Kupovni kurs");
			label_3.setBounds(178, 82, 103, 25);
		}
		return label_3;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 155, 103, 25);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(178, 155, 103, 25);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_Sifra() {
		if (textField_Sifra == null) {
			textField_Sifra = new JTextField();
			textField_Sifra.setBounds(10, 47, 158, 20);
			textField_Sifra.setColumns(10);
		}
		return textField_Sifra;
	}
	private JTextField getTextField_Naziv() {
		if (textField_Naziv == null) {
			textField_Naziv = new JTextField();
			textField_Naziv.setColumns(10);
			textField_Naziv.setBounds(178, 47, 169, 20);
		}
		return textField_Naziv;
	}
	private JTextField getTextField_Prodajni() {
		if (textField_Prodajni == null) {
			textField_Prodajni = new JTextField();
			textField_Prodajni.setColumns(10);
			textField_Prodajni.setBounds(10, 118, 158, 20);
		}
		return textField_Prodajni;
	}
	private JTextField getTextField_Kupovni() {
		if (textField_Kupovni == null) {
			textField_Kupovni = new JTextField();
			textField_Kupovni.setColumns(10);
			textField_Kupovni.setBounds(178, 118, 169, 20);
		}
		return textField_Kupovni;
	}
	private JTextField getTextField_Srednji() {
		if (textField_Srednji == null) {
			textField_Srednji = new JTextField();
			textField_Srednji.setColumns(10);
			textField_Srednji.setBounds(10, 191, 158, 20);
		}
		return textField_Srednji;
	}
	private JTextField getTextField_SkraceniNaziv() {
		if (textField_SkraceniNaziv == null) {
			textField_SkraceniNaziv = new JTextField();
			textField_SkraceniNaziv.setColumns(10);
			textField_SkraceniNaziv.setBounds(178, 191, 169, 20);
		}
		return textField_SkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sifra = textField_Sifra.getText();
					String naziv = textField_Naziv.getText();
					String prodajni = textField_Prodajni.getText();
					String kupovni = textField_Kupovni.getText();
					String srednji = textField_Srednji.getText();
					String skraceniNaziv = textField_SkraceniNaziv.getText();
					String tekst = "Sifra: " + sifra + " Naziv: " + naziv + " Prodajni kurs: " + prodajni + 
							" Kupovni kurs: " + kupovni + " Srednji kurs: " + srednji + " Skraceni naziv " + skraceniNaziv;
					GUIKontroler.ispisi(tekst);
					dispose();
				}
			});
			btnDodaj.setBounds(10, 237, 158, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(178, 237, 169, 23);
		}
		return btnOdustani;
	}
	
}