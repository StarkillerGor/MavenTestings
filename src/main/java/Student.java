public class Student {

    private String FirstName;
    public String LastName;
    public int age;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student(String Name){
        FirstName=Name;
    }

    public boolean passExam(String subject){
        return true;
    }
    public void Print(){
        System.out.println(FirstName);
    }


  /*  public void Print(String badword){
        System.out.println(FirstName+" "+badword);
    }
    public void Print(String badword,Object... messages){
        System.out.println(badword);
        for(Object msg:messages)
        {
            System.out.println(msg);
        }
    }*/



}
