import java.util.Random;

public class Car extends Araç{

	public Car(String tür,String model, String marka, int tekerleksayı, int hP) {
		super(tür,model, marka, tekerleksayı, hP);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String belirleyakıt() {
		Random r=new Random();
		int secim=r.nextInt(1,3);
		if (secim==1) {
			setYakıtTuru("Elektrik");
			
		}
		else if (secim==2) {
			setYakıtTuru("Benzin");
		}
		else if (secim==3) {
			
			setYakıtTuru("LPG");
		}
		
		return getYakıtTuru();	
		}
	@Override
	public String toString() {
		return"Otomobil\n"+ super.toString()+"\nYakıt Türü:"+getYakıtTuru();
		
	}
	}



