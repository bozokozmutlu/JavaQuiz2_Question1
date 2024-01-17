
public class Bicycle extends Araç {

	public Bicycle(String tür,String model, String marka, int tekerleksayı, int hP) {
		super(tür,model, marka, tekerleksayı, hP);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String belirleyakıt() {
		setYakıtTuru("Yakıt İnsan Gücü:))");
		return getYakıtTuru();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bisiklet\n"+ super.toString()+"\nYakıt Türü:"+getYakıtTuru();
	}

}
