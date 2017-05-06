package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textField_Sifra;
	private JTextField textField_Naziv;
	private JTextField textField_Prodajni;
	private JTextField textField_Kupovni;
	private JTextField textField_Srednji;
	private JTextField textField_SkraceniNaziv;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JButton btnObrisi;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 361, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextField_Sifra());
		contentPane.add(getTextField_Naziv());
		contentPane.add(getTextField_Prodajni());
		contentPane.add(getTextField_Kupovni());
		contentPane.add(getTextField_Srednji());
		contentPane.add(getTextField_SkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(10, 11, 129, 24);
		}
		return lblNewLabel;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(163, 11, 129, 24);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 77, 129, 24);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(163, 77, 129, 24);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 143, 129, 24);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(163, 143, 129, 24);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_Sifra() {
		if (textField_Sifra == null) {
			textField_Sifra = new JTextField();
			textField_Sifra.setEditable(false);
			textField_Sifra.setBounds(10, 46, 129, 20);
			textField_Sifra.setColumns(10);
		}
		return textField_Sifra;
	}
	private JTextField getTextField_Naziv() {
		if (textField_Naziv == null) {
			textField_Naziv = new JTextField();
			textField_Naziv.setEditable(false);
			textField_Naziv.setColumns(10);
			textField_Naziv.setBounds(163, 46, 129, 20);
		}
		return textField_Naziv;
	}
	private JTextField getTextField_Prodajni() {
		if (textField_Prodajni == null) {
			textField_Prodajni = new JTextField();
			textField_Prodajni.setEditable(false);
			textField_Prodajni.setColumns(10);
			textField_Prodajni.setBounds(10, 112, 129, 20);
		}
		return textField_Prodajni;
	}
	private JTextField getTextField_Kupovni() {
		if (textField_Kupovni == null) {
			textField_Kupovni = new JTextField();
			textField_Kupovni.setEditable(false);
			textField_Kupovni.setColumns(10);
			textField_Kupovni.setBounds(163, 112, 129, 20);
		}
		return textField_Kupovni;
	}
	private JTextField getTextField_Srednji() {
		if (textField_Srednji == null) {
			textField_Srednji = new JTextField();
			textField_Srednji.setEditable(false);
			textField_Srednji.setColumns(10);
			textField_Srednji.setBounds(10, 178, 129, 20);
		}
		return textField_Srednji;
	}
	private JTextField getTextField_SkraceniNaziv() {
		if (textField_SkraceniNaziv == null) {
			textField_SkraceniNaziv = new JTextField();
			textField_SkraceniNaziv.setEditable(false);
			textField_SkraceniNaziv.setColumns(10);
			textField_SkraceniNaziv.setBounds(163, 178, 129, 20);
		}
		return textField_SkraceniNaziv;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxZaistaObrisiKurs.isSelected()==true) {
						btnObrisi.setEnabled(true);
					} 
					if(chckbxZaistaObrisiKurs.isSelected()==false) {
						btnObrisi.setEnabled(false);
					}
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 205, 129, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sifra = textField_Sifra.getText();
					String naziv = textField_Naziv.getText();
					String prodajni = textField_Prodajni.getText();
					String kupovni = textField_Kupovni.getText();
					String srednji = textField_Srednji.getText();
					String skraceniNaziv = textField_SkraceniNaziv.getText();
					String tekst = "Sifra: " + sifra + "Naziv: " + naziv + "Prodajni kurs: " + prodajni + 
							"Kupovni kurs: " + kupovni + "Srednji kurs: " + srednji + "Skraceni naziv " + skraceniNaziv;
					GUIKontroler.ispisi(tekst);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 235, 129, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(163, 235, 129, 23);
		}
		return btnOdustani;
	}
}