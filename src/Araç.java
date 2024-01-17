
public abstract class Araç {
	private String tür,model,marka,yakıtTuru;
	public String getTür() {
		return tür;
	}
	public void setTür(String tür) {
		this.tür = tür;
	}
	private int tekerleksayı,HP;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getYakıtTuru() {
		return yakıtTuru;
	}
	public void setYakıtTuru(String yakıtTuru) {
		this.yakıtTuru = yakıtTuru;
	}
	public int getTekerleksayı() {
		return tekerleksayı;
	}
	public void setTekerleksayı(int tekerleksayı) {
		this.tekerleksayı = tekerleksayı;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public Araç(String tür,String model, String marka, int tekerleksayı, int hP) {
		super();
		this.tür=tür;
		this.model = model;
		this.marka = marka;
		this.tekerleksayı = tekerleksayı;
		HP = hP;
	}
	public abstract String belirleyakıt();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Araba Markası:"+getMarka()+"\nAraba Modeli:"+getModel()+"\nArabanın Gücü:"+getHP();
	

}}
