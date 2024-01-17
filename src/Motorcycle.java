import java.util.Random;

public class Motorcycle extends Araç{

	public Motorcycle(String tür,String model, String marka, int tekerleksayı, int hP) {
		super(tür,model, marka, tekerleksayı, hP);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String belirleyakıt() {
		Random r=new Random();
		int secim=r.nextInt(1,2);
		if (secim==1) {
			setYakıtTuru("Elektrik");
			
		}
		else if (secim==2) {
			setYakıtTuru("Benzin");
		}
		
		return getYakıtTuru();	
		}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Motorsiklet\n"+super.toString()+"Yakıt Türü:"+getYakıtTuru();
}
}
