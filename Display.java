public class Display {

    public static void main(String[] args) {
        Department d1 = new Department(1,"Information Systems");

        SalarieEmployee se = new SalarieEmployee("Hamza","Rabat",Gender.male,200,500,50,1200);

        d1.add_employee(se);

        HourlyEmpoloyee he = new HourlyEmpoloyee("Boughanim","Rabat",Gender.male,50,4,40);

        d1.add_employee(he);

        CommissionEmployee cm = new CommissionEmployee("Nissrin","Kenitra",Gender.femal,50,1200,20);
        d1.add_employee(cm);


        System.out.println(d1.getEmployeeCount());

        d1.print_all_details();
        d1.print_pasic_data();


    }
    
}
