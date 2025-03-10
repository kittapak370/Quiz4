package quiz4a;


// (1.1) เขียน Java Docs

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    /**
     * สร้าง object ของ class employee กำหนดค่า employeed name salary ผ่าน contructor
     * เเล้วจะส่งตั้งค่าเป็น 0
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    /**
     * Method calculateSaraly() จะคืนค่าเงินเดือนที่ถูกกำหนดให้ตัวเเปร salaray  มีการสร้าง object ของ employee
     */
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    /**
     * Methodสำหรับเเสดงข้อมูลพนักงานส่งออก
     * @return
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    /**
     * Getter เเละ setter สำหรับการเข้าถึงข้อมูลเเละรับข้อมูล
     * @return
     */
    public String getName() {
        return name;
    }
}
