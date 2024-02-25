public class BaseCommissionEmployee extends CommissionEmployee
{
    public BaseCommissionEmployee(String name, String address, Gender sex, int ssn, double gross_sales,
            double commission_rate) {
        super(name, address, sex, ssn, gross_sales, commission_rate);
    }

    double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double earnings()
    {
        return super.earnings() + base;
    }

    @Override
    public void Displayalldetails()
    {
        super.Displayalldetails();
        Displayearnings();
    }

    @Override
    public void Displayearnings()
    {

        System.out.println("Earnings = " + earnings());

    }
}