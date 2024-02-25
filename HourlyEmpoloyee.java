public class HourlyEmpoloyee extends Employee implements Displayable 
{
    private double hour_rate;
    private int no_of_hours;


    public HourlyEmpoloyee() {

    }

    public HourlyEmpoloyee(String name, String address, Gender sex, int ssn, double hour_rate, int no_of_hours) {
        super(name, address, ssn, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
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
        return no_of_hours * hour_rate;
    }

    @Override
    public String toString() {
        return "HourlyEmpoloyee [hour_rate=" + hour_rate + ", no_of_hours=" + no_of_hours + "]";
    }

    
    
}
