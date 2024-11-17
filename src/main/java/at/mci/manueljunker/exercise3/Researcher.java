package at.mci.manueljunker.exercise3;

import java.util.List;

/**
 * Class representing a researcher in the organization.
 */
public class Researcher implements Employee {
    private int employeeID;
    private String name;
    private String department;
    private String researchArea;
    private List<String> publications;

    /**
     * Constructor to initialize a Researcher object.
     *
     * @param employeeID the unique ID of the employee
     * @param name the name of the researcher
     * @param department the department the researcher belongs to
     * @param researchArea the area of research
     * @param publications the list of publications by the researcher
     */
    public Researcher(int employeeID, String name, String department, String researchArea, List<String> publications) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.researchArea = researchArea;
        this.publications = publications;
    }

    /**
     * Prints the information of the researcher.
     */
    @Override
    public void printInformation() {
        System.out.println("Researcher: Employee-ID: " + employeeID + ", Name: " + name +
                ", Department: " + department + ", Research Area: " + researchArea + ", Publications: " + String.join(", ", publications) + ".");
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public List<String> getPublications() {
        return publications;
    }

    public void setPublications(List<String> publications) {
        this.publications = publications;
    }
}

