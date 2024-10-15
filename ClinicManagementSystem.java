import javax.swing.*;
import java.util.ArrayList;

public class ClinicManagementSystem {
    public static ArrayList<String> patients = new ArrayList<>();
    public static ArrayList<String> compounders = new ArrayList<>();
    public static ArrayList<String> appointments = new ArrayList<>();

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Clinic Management System");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 800);
        
        JButton patientButton = new JButton("Register new Patient");
        JButton compounderButton = new JButton("Register Compounder");
        JButton appointmentButton = new JButton("Book Appointment");
        JButton viewButton = new JButton("View Registered Data and Appointment");

        patientButton.addActionListener(e -> new RegisterPatient());
        compounderButton.addActionListener(e -> new RegisterCompounder());  // Updated
        appointmentButton.addActionListener(e -> new BookAppointment());
        viewButton.addActionListener(e -> new ViewData());

        JPanel panel = new JPanel();
        panel.add(patientButton);
        panel.add(compounderButton);  // Updated
        panel.add(appointmentButton);
        panel.add(viewButton);

        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}
