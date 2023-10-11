import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
  final private Font mainFont= new Font("segoe print", Font.BOLD, 18);
  JTextField tfFirstName, tfLastName;
  JLabel IbWelcome;

  public void initialize(){
/*****form panel****/
JLabel IbFirstName= new JLabel("FirstName");
IbFirstName.setFont(mainFont);

tfFirstName= new JTextField();
tfFirstName.setFont(mainFont);

JLabel IbLastName= new JLabel("LastName");
IbLastName.setFont(mainFont);

tfLastName= new JTextField();
tfLastName.setFont(mainFont);

JPanel formPanel = new JPanel();
formPanel.setLayout(new GridLayout(4, 1, 5, 5));
formPanel.setOpaque(false);
formPanel.add(IbFirstName);
formPanel.add(tfFirstName);
formPanel.add(IbLastName);
formPanel.add(tfLastName);

/*Welcome Label */
IbWelcome = new JLabel();
IbWelcome.setFont(mainFont);

/*Button */
JButton btn1 = new JButton("OK");
btn1.setFont(mainFont);
btn1.addActionListener(new ActionListener() {

  @Override
  public void actionPerformed(ActionEvent e) {
    
    String firstName = tfFirstName.getText();
    String lastName = tfLastName.getText();
    IbWelcome.setText("Welcome" +" " + firstName + " " + lastName);
  }
  
});

JButton btnClear = new JButton("Clear");
btnClear.setFont(mainFont);
btnClear.addActionListener(new ActionListener() {

  @Override
  public void actionPerformed(ActionEvent e) {
    
    tfFirstName.setText("");
    tfLastName.setText("");
    IbWelcome.setText("");
  }
  
});

JPanel buttonsJPanel = new JPanel();
buttonsJPanel.setLayout(new GridLayout(1, 2, 5, 5));
buttonsJPanel.setOpaque(false);
buttonsJPanel.add(btn1);
buttonsJPanel.add(btnClear);



JPanel mainPanel = new JPanel();
mainPanel.setLayout(new BorderLayout());
mainPanel.setBackground(new Color(179, 63, 38));
mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
mainPanel.add(formPanel, BorderLayout.NORTH);
mainPanel.add(IbWelcome, BorderLayout.CENTER);
mainPanel.add(buttonsJPanel, BorderLayout.SOUTH);

add(mainPanel);

    setTitle("Welcome");
    setSize(500, 600);
    setMinimumSize(new Dimension(300, 400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  

}
