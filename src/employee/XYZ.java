package employee;
interface Taxable {
    double SALES_TAX_RATE = 0.07;
    double INCOME_TAX_RATE = 0.105;

    double calcTax();
}
class Employee implements Taxable {
    private String empId;
    private String name;
    private double salary;

    public Employee(String empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public double calcTax() {
        return salary * INCOME_TAX_RATE;
    }

    public String getName() {
        return name;
    }
}
class Product implements Taxable {
    private String pid;
    private double price;
    private int quantity;

    public Product(String pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public double calcTax() {
        return price * SALES_TAX_RATE * quantity;
    }

    public String getPid() {
        return pid;
    }

    }

public class XYZ {

	public static void main(String[] args) {
		 Employee employee = acceptEmployeeInfo();
	        Product product = acceptProductInfo();
	        double incomeTax = employee.calcTax();
	        System.out.println("Income Tax for " + employee.getName() + ": $" + incomeTax);
	        double salesTax = product.calcTax();
	        System.out.println("Sales Tax for Product ID " + product.getPid() + ": $" + salesTax);
	    }

	    private static Employee acceptEmployeeInfo() {
	        return new Employee("E001", "John Doe", 60000);
	    }

	    private static Product acceptProductInfo() {
	        return new Product("P001", 20.0, 5);
	}

}
