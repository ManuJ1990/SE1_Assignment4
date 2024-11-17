package at.mci.manueljunker.exercise3;

import java.util.Arrays;

/**
 * Main class to demonstrate the functionality of the MCI employee management system.
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of different types of employees
        Employee adminEmployee = new AdministrativeStaff(1, "Jane Doe", "HR", "Department 101", 2854.68f );
        Employee boardMember = new BoardMember(101, "Jon Doe", "CEO", "Department 201", 12564.42f);
        Employee researcher = new Researcher(201, "Hans Müller", "Department Forschung", "IT-Security", Arrays.asList("Save IOT", "cyber crime on the internet"));
        Employee technicalEmployee = new TechnicalStaff(301, "Jimmy Hendrix", "Department 301", "Network Administration", Arrays.asList("CCNA", "MCSE"));

        // Create a directory for MCI employees
        MCIDirectory mci = new MCIDirectory();

        // Add employees to the MCI directory
        mci.addEmployee(adminEmployee);
        mci.addEmployee(boardMember);
        mci.addEmployee(researcher);
        mci.addEmployee(technicalEmployee);

        // Print information of all employees in the MCI directory
        mci.printInformation();
    }
}