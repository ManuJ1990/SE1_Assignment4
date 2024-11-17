package at.mci.manueljunker.exercise3;

/**
 * Class representing a board member of the organization.
 */
public class BoardMember implements Employee {
    private int employeeID;
    private String name;
    private String position;
    private String department;
    private float yearlyBonus;

    /**
     * Constructor to initialize a BoardMember object.
     *
     * @param employeeID the unique ID of the employee
     * @param name the name of the board member
     * @param position the position of the board member
     * @param department the department the board member belongs to
     * @param yearlyBonus the yearly bonus of the board member
     */
    public BoardMember(int employeeID, String name, String position, String department, float yearlyBonus) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.department = department;
        this.yearlyBonus = yearlyBonus;
    }

    /**
     * Prints the information of the board member.
     */
    @Override
    public void printInformation() {
        System.out.println("Board Member: Employee-ID: " + employeeID + ", Name: " + name +
                ", Position: " + position + ", Department: " + department  + ", Yearly Bonus: " + yearlyBonus + "€.");
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public float getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
}
