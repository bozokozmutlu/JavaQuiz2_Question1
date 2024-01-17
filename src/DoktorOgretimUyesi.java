
public class DoktorOgretimUyesi extends Akademisyen {

	public DoktorOgretimUyesi(String name, String surname, int age, int dohavealicense) {
		super(name, surname, age, dohavealicense);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double MaasHesaplama() 
	{
        double newsalary=getSalary()*2;
		setSalary(newsalary);
		return  newsalary;
	}

	
	public void aracAta(String aracisim, Araç arac) {
		if(aracisim.equals("Scooter")) {
			System.out.println(" Almak için Araştırma Görevlisi olmanız lazım");
			
		}
		else if(aracisim.equals("Bisiklet")) {
			setArac(arac);
			System.out.println(" Bisiklet Aracınız Tanımlanmıştır...");		}
		else if(aracisim.equals("Motorsiklet")) {
			System.out.println("Sayın "+getName()+" "+getSurname()+ ",Doçent Olunca alırsınız...");
		}else if(aracisim.equals("Otomobil")) {
			System.out.println("Sayın "+getName()+" "+getSurname()+ ",Profesör Olunca alırsınız...");
		}
	}		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Doktor Öğretim Üyesi\n"+super.toString();
	}
	

	
}
