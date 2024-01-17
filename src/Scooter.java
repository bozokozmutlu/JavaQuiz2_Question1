
public class Scooter extends Araç {

	
	public Scooter(String tür,String model, String marka, int tekerleksayı, int hP) {
		super(tür,model, marka, tekerleksayı, hP);
		// TODO Auto-generated constructor stub
	}
	

	public String belirleyakıt() {
		setYakıtTuru("Elektrik");
		return getYakıtTuru();
	}
	@Override
	public String toString() {
		return "Scooter\n"+super.toString()+"Yakıt Türü:"+getYakıtTuru();
		
	}

}
