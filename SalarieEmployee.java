public class SalarieEmployee extends Employee implements Displayable 
{
    double salary;
    double bonus;
    double deductions;

    
    public SalarieEmployee() 
    {

    }

    public SalarieEmployee(String name, String address, Gender sex, int ssn, double salary, double bonus, double deductions)
    {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public void Displayalldetails() {

        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void Displayearnings() {

        System.out.println(earnings());
    }

    @Override
    public double earnings() {

        return (salary + bonus) - deductions;
    }

    @Override
    public String toString() {
        return "SalarieEmployee [salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + "]";
    }

    
    
}
