abstract class Employee {

    String firstName;
    String lastName;
    String cpf;

    Employee(String f, String l, String c) {
        firstName = f;
        lastName = l;
        cpf = c;
    }

    abstract double earnings();
}

class SalariedEmployee extends Employee {

    double salary;

    SalariedEmployee(String f, String l, String c, double s) {
        super(f, l, c);
        salary = s;
    }

    double earnings() {
        return salary;
    }
}

class HourlyEmployee extends Employee {

    double wage;
    double hours;

    HourlyEmployee(String f, String l, String c, double wage, double hours) {
        super(f, l, c);
        this.wage = wage;
        this.hours = hours;
    }

    double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }
}

public class PayrollTest {

    public static void main(String[] args) {

        Employee e1 = new SalariedEmployee("João", "Silva", "123", 1000);
        Employee e2 = new HourlyEmployee("Maria", "Souza", "456", 50, 45);

        System.out.println(e1.earnings());
        System.out.println(e2.earnings());
    }
}