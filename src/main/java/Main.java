public class Main {
    public static void main(String args[]){
        String name="Vasya";
        Student newStudent= new Student(name);

        //newStudent.Print("Hello", true ,"HellO",true,"helLLo",25,newStudent.FirstName);
        newStudent.setFirstName("Vasya");
        StaticStudent.print();
    }
}
