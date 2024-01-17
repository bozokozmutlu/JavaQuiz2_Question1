
public class Birey {
 private String name,surname;
 private int age ;
 private boolean dohavealicense;
  public Birey(String name, String surname, int age, int dohavealicense) 
  {
	
	this.name = name;
	this.surname = surname;
	this.age = age;
	if(dohavealicense==1)
	  {
		setDohavealicense(true);
	  }
	else if (dohavealicense==0) 
	{
		setDohavealicense(false);
		
	}

  }
  public String getName() 
    {
	return name;

    }
  public void setName(String name)
  {
	this.name = name;
  }
  public String getSurname()
  {
	return surname;
  }
  public void setSurname(String surname)
  {
	this.surname = surname;
  }
  public int getAge() 
  {
	return age;
  }
  public void setAge(int age)
  {
	this.age = age;
  
  }
  public boolean isDohavealicense() 
  {
	return dohavealicense;
  }
  public void setDohavealicense(boolean dohavealicense) 
  {
	this.dohavealicense = dohavealicense;
  }
  public String EhliyetDurum(boolean license)  
  {
	String ehliyet = null;
    if(license==true) 
    {
		
	  ehliyet="Ehliyeti var";
		
	}
	else if(license==false) 
	{
	  ehliyet ="Ehliyeti yok";
		
	}
	
     return ehliyet;
     }
  

@Override
  public String toString() 
    {
		// TODO Auto-generated method stub
		return " İsim:"+getName()+"\n Soyisim:"+getSurname()+"\n Yas:"+getAge()+"\n Ehliyet: "+EhliyetDurum(isDohavealicense());
	}
}
