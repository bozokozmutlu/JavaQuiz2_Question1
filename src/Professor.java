
public class Professor extends Akademisyen 
    {

    public Professor(String name, String surname, int age, int dohavealicense) {
		super(name, surname, age, dohavealicense);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double MaasHesaplama() 
	{
		double newsalary=getSalary()*5;
		setSalary(newsalary);
		return  newsalary;
	}

	@Override
	public void aracAta(String aracisim, Araç arac)
	{
		if(aracisim.equals("Scooter")) 
		{
		System.out.println("Almak için Araştırma Görevlisi olmanız lazım:");

			
		}
		else if(aracisim.equals("Bisiklet"))
		{
			
			System.out.println("Almak için Doktor Öğretim Üyesi olmanız lazım");		}
		else if(aracisim.equals("Motorsiklet"))
		{
			System.out.println("Almak için Doçent olmanız lazım");
		}
		else if(aracisim.equals("Otomobil")) {
			setArac(arac);
			System.out.println(" Otomobil Aracınız Tanımlanmıştır...");
			
		}
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return"Profesör\n"+ super.toString();
    }
}
