public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("João", "Silva", 3000.00);
        Employee emp2 = new Employee("Maria", "Souza", 4500.00);

        System.out.println(emp1.getFirstName() + ": R$ " + emp1.getAnnualSalary());
        System.out.println(emp2.getFirstName() + ": R$ " + emp2.getAnnualSalary());

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println(emp1.getFirstName() + ": R$ " + emp1.getAnnualSalary());
        System.out.println(emp2.getFirstName() + ": R$ " + emp2.getAnnualSalary());
    }
}