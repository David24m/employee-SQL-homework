package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");

        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();

        Department.all();
//
//        department1.setTitle("Guidance");
//        department1.update();
//
//        Department.deleteAll();

        Department.search("Admin");

        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
        Employee employee3 = new Employee("Bruce Wayne", department3, 35000);
        Employee employee4 = new Employee("Cristiano Ronaldo", department4, 125000);
        Employee employee5 = new Employee("Jack Reacher", department5, 15000);
        Employee employee6 = new Employee("Simon Ferguson", department1, 25000);
        Employee employee7 = new Employee("Kirsty Love", department2, 50000);
        Employee employee8 = new Employee("Clark Kent", department3, 34000);
        Employee employee9 = new Employee("Lionel Messi", department4, 145000);
        Employee employee10 = new Employee("Jack Bauer", department5, 15750);

        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
        employee9.save();
        employee10.save();

        Employee.all();
        Employee.search("Suzie Smith");
//
//        employee1.setName("David Mulligan");
//        employee1.setDepartment(department2);
//        employee1.setSalary(55000);
//        employee1.update();
//
//        Employee.all();

    }
}
