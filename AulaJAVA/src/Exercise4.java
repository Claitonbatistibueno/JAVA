import java.lang.classfile.attribute.InnerClassesAttribute;
public class Exercise4 {
    public static void main(String[] args) {
        //Abertura
        Employee obj1;
        obj1 = new Employee("Claiton", 29, 3600);
        obj1.displayInfo();
    }
}

//Atributos
class Employee1 {
    String name;
    int age;
    int salary;

    //Construtor
    public Employee1 (String inName, int inAge, int inSalary) {
        name = inName;
        age = inAge;
        salary = inSalary;

    }
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

        //Condicional
        if (salary > 3000) {
            System.out.println("Senior salary.");
        } else {
            System.out.println("Standard salary.");
        }
    }
}
