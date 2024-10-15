import javax.swing.*;

public class BookAppointment extends JFrame {
    JTextField patientNameField, doctorNameField, dateField;
    
    public BookAppointment() {
        setTitle("Book Appointment");
        setSize(500, 400);
        
        JLabel patientNameLabel = new JLabel("Patient Name:");
        JLabel dateLabel = new JLabel("Date:");

        patientNameField = new JTextField(20);
        doctorNameField = new JTextField(20);
        dateField = new JTextField(20);

        JButton bookButton = new JButton("Book Appointment");
        bookButton.addActionListener(e -> bookAppointment());

        JPanel panel = new JPanel();
        panel.add(patientNameLabel);
        panel.add(patientNameField);
        
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(bookButton);

        add(panel);
        setVisible(true);
    }

    private void bookAppointment() {
        String patientName = patientNameField.getText();
        String date = dateField.getText();

        ClinicManagementSystem.appointments.add("Patient: " + patientName + ", Date: " + date);
        JOptionPane.showMessageDialog(this, "Appointment Booked: \nPatient: " + patientName + "\nDate: " + date);
    }
}
