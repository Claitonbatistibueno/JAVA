public class Exercise3 {
    public static void main(String[] args) {
        //Abertura
        //Crio o objeto 01, ou 02, depois crio um novo, atribuo dados ( IN, STRING ).
        //obj1.displayInfo() trago o methodo que criei para imprimir
        Employee obj1;
        Employee obj2;
        Employee obj3;
        obj1 = new Employee("Claiton", 28, 3000);
        obj2 = new Employee("Jhon", 2, 3000);
        obj3 = new Employee("James", 26, 3500);
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
    }
}

//Atributos da class
class Employee {
    String name;
    int age;
    double salary;

    //Contrutor
    public Employee(String inName, int inAge, double inSalary) {
        name = inName;
        age = inAge;
        salary = inSalary;
    }

    //Methodo display
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("_______________________");
    }
}
