public class Person implements Comparable
{
    private String name;
    
    public Person(String personName)
    {
        name = personName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int compareTo(Object otherObject)
    {
        Person other = (Person) otherObject;
        String otherName = other.getName();
        return
        /*
        if (otherName.equals(this.name)){
            return 1;
        } else {
            return 0;
        }*/
    }   
}
