package at.mci.manueljunker.exercise3;

/**
 * Class representing an administrative staff member.
 */
public class AdministrativeStaff implements Employee {
    private int employeeID;
    private String name;
    private String jobTitle;
    private String department;
    private float salary;

    /**
     * Constructor to initialize an AdministrativeStaff object.
     *
     * @param employeeID the unique ID of the employee
     * @param name the name of the employee
     * @param jobTitle the job title of the employee
     * @param department the department the employee works in
     * @param salary the salary of the employee
     */
    public AdministrativeStaff(int employeeID, String name, String jobTitle, String department, float salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.jobTitle = jobTitle;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Prints the information of the administrative staff.
     */
    @Override
    public void printInformation() {
        System.out.println("Administrative Staff: Employee-ID: " + employeeID + ", Name: " + name +
                ", Role: " + jobTitle + ", Department: " + department + ", Salary: " + salary + "€.");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
