import javax.swing.*;

public class ViewData extends JFrame {
    public ViewData() {
        setTitle("View Registered Data");
        setSize(600, 600);

        JTextArea dataArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(dataArea);

        StringBuilder data = new StringBuilder();
        
        data.append("Registered Patients:\n");
        for (String patient : ClinicManagementSystem.patients) {
            data.append(patient).append("\n");
        }

        data.append("\nRegistered Doctors:\n");
        for (String doctor : ClinicManagementSystem.compounders) {
            data.append(doctor).append("\n");
        }

        data.append("\nBooked Appointments:\n");
        for (String appointment : ClinicManagementSystem.appointments) {
            data.append(appointment).append("\n");
        }

        dataArea.setText(data.toString());
        dataArea.setEditable(false);

        add(scrollPane);
        setVisible(true);
    }
}

