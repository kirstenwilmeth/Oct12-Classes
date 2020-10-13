public class Pet {
    
    
    private String Name;
    private int age;
    private String Location;
    private String Type;

 

    Pet pet = new Pet("Olive", 1, "Austin", "American Medium Hair");


    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return age;
    }
    public String getType()
    {
        return Type;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setLocation(String Location){
        this.Location = Location;
    }



    public Pet() {
        Name = "Tucker";
        age = 2;
        Location = "Lubbock";
        Type = "American Short Hair";
    }
    

    public Pet(String Name, int age, String Location, String Type){
        this.Name = "Name";
        this.age = age;
        this.Location = "Location";
        this.Type = "Type";
    }
}


    // pet.Name = "Olive";
    // pet.age = 1;
    // pet.Location = "Austin";
    // pet.Type = "American Medium Hair";

