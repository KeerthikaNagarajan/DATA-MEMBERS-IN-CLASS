public class Ex10
{
    public static void main(String[] args)
    {
        System.out.println("Employee Details: ");
        Employe emp = new Employe();
        emp.Name("Kaz");
        emp.Age(21);
        emp.PhoneNumber("9873321560");
        emp.Address("Pune");
        emp.printSalary(27000);
        emp.specialization("Software Designer");
        System.out.print("\n");
        System.out.println("Manager Details: ");
        Manager man = new Manager();
        man.Name("Inej");
        man.Age(23);
        man.PhoneNumber("7852291046");
        man.Address("Mumbai");
        man.printSalary(50000);
        man.Department("AI Developer");

    }
}
//
class Manager extends Member
{
    public void Department(String dept)
    {
        System.out.println(dept);
    }
}
//
class Employe extends Member
{
    public void specialization(String specialization)
    {
        System.out.println(specialization);
    }
}
//
class Member
{
    public void Name(String name)
    {
        System.out.println(name);
    }
    public void Age(int age)
    {
        System.out.println(age);
    }
    public void PhoneNumber(String num)
    {
        System.out.println(num);
    }
    public void Address(String adrs)
    {
        System.out.println(adrs);
    }
    public void printSalary(int salary)
    {
        System.out.println(salary);
    }
}
//