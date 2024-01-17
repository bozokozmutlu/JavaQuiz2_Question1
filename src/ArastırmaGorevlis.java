
public class ArastırmaGorevlis extends Akademisyen{

	public ArastırmaGorevlis(String name, String surname, int age, int dohavealicense) {
		super(name, surname, age, dohavealicense);
		
	}

	@Override
	public double MaasHesaplama() 
	{
        double newsalary=getSalary()*1.5;
		setSalary(newsalary);
		return  newsalary;
	}
	
	public void aracAta(String aracisim,Araç arac) {
		if(aracisim.equals("Scooter")) {
			setArac(arac);
			System.out.println("Aracınız Tanımlanmıştır...");
			
		}
		else if(aracisim.equals("Bisiklet")) {
			
			System.out.println("Sayın "+getName()+" "+getSurname()+ ",Doktor Öğretim Üyesi Olunca alırsınız...");
		}
		else if(aracisim.equals("Motorsiklet")) {
			

			System.out.println("Sayın "+getName()+" "+getSurname()+ ",Doçent Olunca alırsınız...");
		}else if(aracisim.equals("Otomobil")) {
			

			System.out.println("Sayın "+getName()+" "+getSurname()+ ",Profesör Olunca alırsınız...");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "ArastırmaGörevlisi\n"+super.toString();	}


}
