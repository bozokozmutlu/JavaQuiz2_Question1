import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Akademisyen academians[]=new Akademisyen[7];
		academians[0]=new ArastırmaGorevlis("Mustafa", "Burma", 20,0);
		academians[1]=new DoktorOgretimUyesi("Galeep", "Openhand", 21,1);
		academians[2]=new DoktorOgretimUyesi("Yasin Baran", "Kaplan", 22,0);
		academians[3]=new DoktorOgretimUyesi("Dorukhan", "Ozmutlu", 33,1);
		academians[4]=new Docent("Bozok", "Ozmutlu", 21,1);
		academians[5]=new Docent("Hakan", "Loyan", 20,1);
		academians[6]=new Professor("Tan", "Aytok", 22,1);
		Random r=new Random();
		int rastgele=r.nextInt(0,7);
		
	
	   Araç araclar[]=new Araç[7];
	   araclar[0]=new Car("Otomobil","A3","Audi ",4,150);
	   araclar[1]=new Car("Otomobil","Rs7","Audi",4,600);
	   araclar[2]=new Motorcycle("Motorsiklet","RS32","Bmw ",2,150);
	   araclar[3]=new Bicycle("Bisiklet","BX4","Salcano",2,0);
	   araclar[4]=new Motorcycle("Motorsiklet","Vespa","italinao ",2,50);
	   araclar[5]=new Bicycle("Bisiklet","BX7","Salcano",2,0);
	   araclar[6]=new Scooter("Scoter","Scooter","Toyota",2,0);
	   
	   for(int i=0;i<7;i++) {
		   araclar[i].belirleyakıt();
	   }
	   
	   for(Akademisyen aks: academians) {
		   
		   if(aks instanceof Akademisyen) {
			   aks.MaasHesaplama();
			   System.out.println("Bu kişi Bir Akademisyendir...");
			    aks.aracAta(araclar[rastgele].getTür(), araclar[rastgele]);
			  System.out.println(aks.toString());
			   System.out.println(araclar[rastgele].toString());
			  
		   }
		   else {
			      aks.toString();
		   }
	   }
	   
			 


}}
	 


