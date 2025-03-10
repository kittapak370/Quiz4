package quiz4a;

// 2.1
/**
 *   manager สืบทอดจาก employee ใช้extends 
 *  Private จะบอกว่า Class ของเรานั้นมี Attribute อะไรบ้าง
*/

public class Manager extends Employee { 
    private String department;
    private double bonus;

    
    // 2.2
    /**
     *  managerเป็น Subclass ของ employee ใช้subber เพื่อเรียก contructor ของ employee
     *  มีตัวเเปรเพิ่มคือ department เเละ bonus ใช้ this.department = department เเละ this.bonus = bonus;
     *  เพื่อกำหนดตัวเเปร Manager
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3
    /**
     *  method displayDetails() ใช้สำหรับเเสดงรายระเอียดของพนักงาน โดยสร้าง Array Details
     *  รหัสพนักงงาน เงินเดือน เเผนก โบนัส จากผู้ใช้ลูป for-each เพื่อพิมพ์ข้อมูลส่งออก
     */
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4
    /** 
     * ใช้เเสดงรายละเอียดของพนักงาน ถ้า condition เป็น "Full" พิมพ์ข้อมูลทั้งหมด
    */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}