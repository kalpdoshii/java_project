import javax.swing.*;

public class RegisterCompounder extends JFrame {
    JTextField nameField, qualificationField, phoneField;
    
    public RegisterCompounder() {
        setTitle("Compounder Registration");
        setSize(500, 400);
        
        JLabel nameLabel = new JLabel("Name:");
        JLabel qualificationLabel = new JLabel("Qualification:");
        JLabel phoneLabel = new JLabel("Phone:");

        nameField = new JTextField(20);
        qualificationField = new JTextField(20);
        phoneField = new JTextField(20);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> registerCompounder());

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(qualificationLabel);
        panel.add(qualificationField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }

    private void registerCompounder() {
        String name = nameField.getText();
        String qualification = qualificationField.getText();
        String phone = phoneField.getText();

        ClinicManagementSystem.compounders.add("Name: " + name + ", Qualification: " + qualification + ", Phone: " + phone);
        JOptionPane.showMessageDialog(this, "Compounder Registered: \nName: " + name + "\nQualification: " + qualification + "\nPhone: " + phone);
    }
}
