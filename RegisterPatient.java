import javax.swing.*;

public class RegisterPatient extends JFrame {
    JTextField nameField, ageField, phoneField;
    
    public RegisterPatient() {
        setTitle("Patient Registration");
        setSize(500, 400);
        
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel phoneLabel = new JLabel("Phone:");

        nameField = new JTextField(20);
        ageField = new JTextField(20);
        phoneField = new JTextField(20);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> registerPatient());

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }

    private void registerPatient() {
        String name = nameField.getText();
        String age = ageField.getText();
        String phone = phoneField.getText();

        ClinicManagementSystem.patients.add("Name: " + name + ", Age: " + age + ", Phone: " + phone);
        JOptionPane.showMessageDialog(this, "Patient Registered: \nName: " + name + "\nAge: " + age + "\nPhone: " + phone);
    }
}
