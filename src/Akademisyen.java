
public  abstract class Akademisyen extends Birey {
	private Araç arac;
	
	private double salary=17002;//Kullanıcı giricek

	public Akademisyen(String name, String surname, int age, int dohavealicense) {
		super(name, surname, age, dohavealicense);
		// TODO Auto-generated constructor stub
	}

	public Araç getArac() {
		return arac;
	}

	public void setArac(Araç arac) {
		this.arac = arac;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public abstract double MaasHesaplama();
	public abstract void aracAta(String aracisim,Araç arac);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nMaas:"+getSalary();


	}
	
;
}
