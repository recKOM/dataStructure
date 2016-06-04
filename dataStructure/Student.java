package dataStructure;

public class Student extends Person{
	String number;
	String speciality;
	 
	public Student(String name, int age,String number, String speciality){
		this.age = age;
		this.name = name;
		this.number = number;
		this.speciality = speciality;
	}
	public Student(){
		this.age = 0;
		this.name = "";
		this.number = "";
		this.speciality = "";
	}
	
	    public void setNumber(String number)                     
	    {
	        if (number==null)
	            this.number = "";
	        else
	            this.number = number;
	    }

	    public void setSpeciality(String speciality)             
	    {
	        if (speciality==null)
	            this.speciality = "";
	        else
	            this.speciality = speciality;
	    }
	    
	    public String getNumber()
	    {
	        return this.number;
	    }
	    
	    public String getSpeciality()                      
	    {
	        return this.speciality;
	    }
	    
	    public Student(int number){
	    	
	    }
	      public String toString()                    
   		{
        	return this.name+"\t"+this.age+"\t"+this.number+"\t"+this.speciality;
        }
        
      /*   public boolean equals(Object obj)                 
    	{
        if (obj  instanceof  Student) 
        {
            Student p2 = (Student)obj;
            return this.name.equals(p2.name) && this.age==p2.age && this.number.equals(p2.number) && this.speciality.equals(p2.speciality);
        }
        return false;
    	}*/

	    
}