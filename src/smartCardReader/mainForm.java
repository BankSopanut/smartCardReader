package smartCardReader;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.commons.codec.DecoderException;
import th.or.ega.common.smartcard.ThaiSmartCard;
import th.or.ega.common.smartcard.bean.DOPAProfileBean;
import java.awt.SystemColor;
import javax.smartcardio.CardException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainForm {

	private JFrame frmSmartCardRetrive;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm window = new mainForm();
					window.frmSmartCardRetrive.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainForm() {
		frmSmartCardRetrive = new JFrame();
		frmSmartCardRetrive.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSmartCardRetrive.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BSopanut\\eclipse-workspace\\smartCardReader\\lib\\card.ico"));
		frmSmartCardRetrive.setTitle("Smart Card Retrive Data");
		frmSmartCardRetrive.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSmartCardRetrive.setBounds(100, 100, 391, 305);
		frmSmartCardRetrive.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSmartCardRetrive.getContentPane().setLayout(null);
		
		JLabel lblProfile = new JLabel("\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E2A\u0E48\u0E27\u0E19\u0E15\u0E31\u0E27");
		lblProfile.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProfile.setBounds(28, 11, 80, 17);
		frmSmartCardRetrive.getContentPane().add(lblProfile);
		
		JLabel profileImage = new JLabel("");
		profileImage.setBounds(278, 116, 85, 103);
		frmSmartCardRetrive.getContentPane().add(profileImage);
		
		JLabel thID = new JLabel("\u0E40\u0E25\u0E02\u0E1B\u0E23\u0E30\u0E08\u0E33\u0E15\u0E31\u0E27\u0E1B\u0E23\u0E30\u0E0A\u0E32\u0E0A\u0E19");
		thID.setForeground(SystemColor.textHighlight);
		thID.setFont(new Font("Tahoma", Font.BOLD, 12));
		thID.setBounds(28, 39, 119, 14);
		frmSmartCardRetrive.getContentPane().add(thID);
		
		JLabel txtID = new JLabel("-");
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtID.setBounds(164, 39, 135, 14);
		frmSmartCardRetrive.getContentPane().add(txtID);
		
		JLabel thName = new JLabel("\u0E0A\u0E37\u0E48\u0E2D - \u0E2A\u0E01\u0E38\u0E25");
		thName.setForeground(SystemColor.textHighlight);
		thName.setFont(new Font("Tahoma", Font.BOLD, 12));
		thName.setBounds(28, 64, 54, 14);
		frmSmartCardRetrive.getContentPane().add(thName);
		
		JLabel txtPrefix = new JLabel("-");
		txtPrefix.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrefix.setBounds(95, 64, 31, 14);
		frmSmartCardRetrive.getContentPane().add(txtPrefix);
		
		JLabel txtName = new JLabel("-");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setBounds(149, 64, 62, 15);
		frmSmartCardRetrive.getContentPane().add(txtName);
		
		JLabel txtLastName = new JLabel("-");
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLastName.setBounds(234, 63, 129, 16);
		frmSmartCardRetrive.getContentPane().add(txtLastName);
		
		JLabel birthDate = new JLabel("\u0E40\u0E01\u0E34\u0E14\u0E27\u0E31\u0E19\u0E17\u0E35\u0E48");
		birthDate.setForeground(SystemColor.textHighlight);
		birthDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		birthDate.setBounds(28, 89, 43, 14);
		frmSmartCardRetrive.getContentPane().add(birthDate);
		
		JLabel txtBirthDate = new JLabel("-");
		txtBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBirthDate.setBounds(81, 89, 177, 14);
		frmSmartCardRetrive.getContentPane().add(txtBirthDate);
		
		JLabel age = new JLabel("\u0E2D\u0E32\u0E22\u0E38");
		age.setFont(new Font("Tahoma", Font.BOLD, 12));
		age.setForeground(SystemColor.textHighlight);
		age.setBounds(268, 89, 22, 14);
		frmSmartCardRetrive.getContentPane().add(age);
		
		JLabel txtAge = new JLabel("-");
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAge.setBounds(300, 89, 22, 14);
		frmSmartCardRetrive.getContentPane().add(txtAge);
		
		JLabel address = new JLabel("\u0E17\u0E35\u0E48\u0E2D\u0E22\u0E39\u0E48");
		address.setForeground(SystemColor.textHighlight);
		address.setFont(new Font("Tahoma", Font.BOLD, 12));
		address.setBounds(28, 115, 25, 14);
		frmSmartCardRetrive.getContentPane().add(address);
		
		JLabel txtNumber = new JLabel("-");
		txtNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNumber.setBounds(70, 115, 62, 14);
		frmSmartCardRetrive.getContentPane().add(txtNumber);
		
		JLabel Moo = new JLabel("\u0E2B\u0E21\u0E39\u0E48");
		Moo.setForeground(SystemColor.textHighlight);
		Moo.setFont(new Font("Tahoma", Font.BOLD, 12));
		Moo.setBounds(149, 114, 17, 17);
		frmSmartCardRetrive.getContentPane().add(Moo);
		
		JLabel txtMoo = new JLabel("-");
		txtMoo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMoo.setBounds(196, 115, 62, 14);
		frmSmartCardRetrive.getContentPane().add(txtMoo);
		
		JLabel alley = new JLabel("\u0E15\u0E23\u0E2D\u0E01");
		alley.setForeground(SystemColor.textHighlight);
		alley.setFont(new Font("Tahoma", Font.BOLD, 12));
		alley.setBounds(28, 140, 30, 14);
		frmSmartCardRetrive.getContentPane().add(alley);
		
		JLabel txtAlley = new JLabel("-");
		txtAlley.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAlley.setBounds(70, 140, 67, 14);
		frmSmartCardRetrive.getContentPane().add(txtAlley);
		
		JLabel soi = new JLabel("\u0E0B\u0E2D\u0E22");
		soi.setForeground(SystemColor.textHighlight);
		soi.setFont(new Font("Tahoma", Font.BOLD, 12));
		soi.setBounds(149, 140, 25, 14);
		frmSmartCardRetrive.getContentPane().add(soi);
		
		JLabel txtSoi = new JLabel("-");
		txtSoi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSoi.setBounds(196, 140, 62, 14);
		frmSmartCardRetrive.getContentPane().add(txtSoi);
		
		JLabel road = new JLabel("\u0E16\u0E19\u0E19");
		road.setForeground(SystemColor.textHighlight);
		road.setFont(new Font("Tahoma", Font.BOLD, 12));
		road.setBounds(30, 165, 25, 14);
		frmSmartCardRetrive.getContentPane().add(road);
		
		JLabel txtRoad = new JLabel("-");
		txtRoad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRoad.setBounds(70, 165, 62, 14);
		frmSmartCardRetrive.getContentPane().add(txtRoad);
		
		JLabel tumbol = new JLabel("\u0E15\u0E33\u0E1A\u0E25");
		tumbol.setForeground(SystemColor.textHighlight);
		tumbol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tumbol.setBounds(149, 165, 30, 14);
		frmSmartCardRetrive.getContentPane().add(tumbol);
		
		JLabel txtTumbol = new JLabel("-");
		txtTumbol.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTumbol.setBounds(196, 165, 67, 14);
		frmSmartCardRetrive.getContentPane().add(txtTumbol);
		
		JLabel amphur = new JLabel("\u0E2D\u0E33\u0E40\u0E20\u0E2D");
		amphur.setForeground(SystemColor.textHighlight);
		amphur.setFont(new Font("Tahoma", Font.BOLD, 12));
		amphur.setBounds(28, 190, 34, 14);
		frmSmartCardRetrive.getContentPane().add(amphur);
		
		JLabel txtAmphur = new JLabel("-");
		txtAmphur.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAmphur.setBounds(70, 190, 67, 14);
		frmSmartCardRetrive.getContentPane().add(txtAmphur);
		
		JLabel province = new JLabel("\u0E08\u0E31\u0E07\u0E2B\u0E27\u0E31\u0E14");
		province.setForeground(SystemColor.textHighlight);
		province.setFont(new Font("Tahoma", Font.BOLD, 12));
		province.setBounds(149, 190, 43, 14);
		frmSmartCardRetrive.getContentPane().add(province);
		
		JLabel txtProvince = new JLabel("-");
		txtProvince.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtProvince.setBounds(196, 190, 62, 14);
		frmSmartCardRetrive.getContentPane().add(txtProvince);
		
		JButton btnRetriveData = new JButton("Retrive Data");
		btnRetriveData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRetriveData.setBounds(135, 225, 108, 30);
		frmSmartCardRetrive.getContentPane().add(btnRetriveData);
		btnRetriveData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DOPAProfileBean profile;
				try {
					profile = ThaiSmartCard.readDOPAProfile(true);
			        txtID.setText(profile.getCitizenID());
			        byte[] img = profile.getImage();
			        ImageIcon image = new ImageIcon(img);
			        Image im = image.getImage();
			        Image myImg = im.getScaledInstance(profileImage.getWidth(), profileImage.getHeight(), Image.SCALE_SMOOTH);
			        ImageIcon newImage = new ImageIcon(myImg);
			        profileImage.setIcon(newImage);
			        txtPrefix.setText(profile.getNameEN_Prefix());
			        txtName.setText(profile.getNameEN_FirstName());
			        txtLastName.setText(profile.getNameEN_SurName());
			        txtBirthDate.setText(profile.getBirthDate().toString());
			        txtAge.setText(String.valueOf(profile.getAge()));
			        txtNumber.setText(profile.getAddress_No());
			        txtMoo.setText(profile.getAddress_Moo());
			        txtAlley.setText(profile.getAddress_Alley());
			        txtSoi.setText(profile.getAddress_Soi());
			        txtRoad.setText(profile.getAddress_Road());
			        txtTumbol.setText(profile.getAddress_Tumbol());
			        txtAmphur.setText(profile.getAddress_Amphur());
			        txtProvince.setText(profile.getAddress_Province());
				} catch (CardException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Please insert the card..");
					e.printStackTrace();
				} catch (DecoderException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		DOPAProfileBean profile;
		try {
			
			profile = ThaiSmartCard.readDOPAProfile(true);
	        txtID.setText(profile.getCitizenID());
	        byte[] img = profile.getImage();
	        ImageIcon image = new ImageIcon(img);
	        Image im = image.getImage();
	        Image myImg = im.getScaledInstance(profileImage.getWidth(), profileImage.getHeight(), Image.SCALE_SMOOTH);
	        ImageIcon newImage = new ImageIcon(myImg);
	        profileImage.setIcon(newImage);
	        txtPrefix.setText(profile.getNameEN_Prefix());
	        txtName.setText(profile.getNameEN_FirstName());
	        txtLastName.setText(profile.getNameEN_SurName());
	        txtBirthDate.setText(profile.getBirthDate().toString());
	        txtAge.setText(String.valueOf(profile.getAge()));
	        txtNumber.setText(profile.getAddress_No());
	        txtMoo.setText(profile.getAddress_Moo());
	        txtAlley.setText(profile.getAddress_Alley());
	        txtSoi.setText(profile.getAddress_Soi());
	        txtRoad.setText(profile.getAddress_Road());
	        txtTumbol.setText(profile.getAddress_Tumbol());
	        txtAmphur.setText(profile.getAddress_Amphur());
	        txtProvince.setText(profile.getAddress_Province());
	        
		} catch (CardException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Please insert the card..");
			e.printStackTrace();
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
