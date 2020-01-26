class Student{
    int id;
    String name;
    String sex;
     
}
class GetStudent{
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.id=209;
        s1.name="Makori";
        s1.sex = "Male";
        System.out.println(s1.id+" " +s1.sex +s1.name+" "); //this line should print the id and name of student 

        
    }
}