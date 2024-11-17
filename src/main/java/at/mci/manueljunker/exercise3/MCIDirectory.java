package at.mci.manueljunker.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a directory of MCI employees.
 * This class acts as a composite, holding multiple employees (both individuals and groups).
 */
public class MCIDirectory implements Employee {
    private List<Employee> employees;

    /**
     * Constructor to initialize an empty MCI directory.
     */
    public MCIDirectory() {
        employees = new ArrayList<Employee>();
    }

    /**
     * Prints the information of all employees in the directory.
     */
    @Override
    public void printInformation() {
        for (Employee employee : employees) {
            employee.printInformation();
        }
    }

    /**
     * Adds an employee to the directory.
     *
     * @param employee the employee to add
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee from the directory.
     *
     * @param employee the employee to remove
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}