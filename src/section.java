public class section {

    private teacher teacher;
    private student[] students = new student[50];
    private String name;
    private int currentSize = 0;

    public section(String name){
        this.name = name;
    }

    public teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(teacher t){
        this.teacher = t;
    }

    public student[] getStudents(){
        return this.students;
    }

    public void addStudent(student s){
        this.students[currentSize] = s;
        this.currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void toStr(){
        String studentList = "";
        for(int i =0; i < currentSize; i++){
            studentList += students[i].getName();
            if(i < currentSize-1){
                studentList += ", ";
            }
        }
        System.out.println("This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + studentList);
    }

}
