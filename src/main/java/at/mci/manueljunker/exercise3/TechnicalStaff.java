package at.mci.manueljunker.exercise3;

import java.util.List;

/**
 * Class representing a technical staff member in the organization.
 */
public class TechnicalStaff implements Employee {
    private int employeeID;
    private String name;
    private String department;
    private String expertiseArea;
    private List<String> certifications;

    /**
     * Constructor to initialize a TechnicalStaff object.
     *
     * @param employeeID the unique ID of the employee
     * @param name the name of the technical staff member
     * @param department the department the technical staff member belongs to
     * @param expertiseArea the area of expertise of the technical staff member
     * @param certifications the list of certifications of the technical staff member
     */
    public TechnicalStaff(int employeeID, String name, String department, String expertiseArea, List<String> certifications) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.expertiseArea = expertiseArea;
        this.certifications = certifications;
    }

    /**
     * Prints the information of the technical staff member.
     */
    @Override
    public void printInformation() {
        System.out.println("Technical Staff: Employee-ID: " + employeeID + ", Name: " + name +
                ", Department: " + department + ", Expertise Area: " + expertiseArea + ", Certifications: " + String.join(", ", certifications) + ".");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }
}
