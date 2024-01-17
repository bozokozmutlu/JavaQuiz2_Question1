
public class Docent extends Akademisyen {

	public Docent(String name, String surname, int age, int dohavealicense) {
		super(name, surname, age, dohavealicense);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double MaasHesaplama() {
		// TODO Auto-generated method stub
		  double newsalary=getSalary()*3;
		setSalary(newsalary);
		return  newsalary;
	}

	@Override
	public void aracAta(String aracisim, Araç arac) {
		if(aracisim.equals("Scooter")) {
			System.out.println(" Almak için Araştırma Görevlisi Olmanız lazım");
			
		}
		else if(aracisim.equals("Bisiklet")) {
			System.out.println(" Almak için Doktor Öğretim Üyesi olmanız lazım");		}
		else if(aracisim.equals("Motorsiklet")) {
			setArac(arac);
			System.out.println(" Motorsiklet Aracınız Tanımlanmıştır...");
		}else if(aracisim.equals("Otomobil")) {
			System.out.println("Sayın "+getName()+" "+getSurname()+ ",Profesör Olunca alırsınız...");
		}
	}		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Doçent\n"+super.toString();
	}

}
