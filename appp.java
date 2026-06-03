import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class appp{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Menu");
        frame.setSize(400,400);
        frame.setVisible(true);
        JPanel mainPanel= new JPanel();
        frame.add(mainPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);
        
        JLabel firstNamelabel= new JLabel("first name:");
        JLabel lastNamelabel= new JLabel("last name:");

        JTextField firstNameTextField= new JTextField(15);
        JTextField lastNameTextField= new JTextField(15);

       JButton button = new JButton("Full name");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        mainPanel.add(firstNamelabel, gridBagConstraints); 

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        mainPanel.add(firstNameTextField, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        mainPanel.add(lastNamelabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        mainPanel.add(lastNameTextField, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        mainPanel.add(button, gridBagConstraints);
    }
}