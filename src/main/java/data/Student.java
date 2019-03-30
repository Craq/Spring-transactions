package data;

public class Student {
    private int studentId;
    private String pib;
    private int course;
    public Student(){

    }
    public Student(String pib,int course){
        this.pib = pib;
        this.course=course;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getPib(){
        return this.pib;
    }
    public int getCourse(){
        return this.course;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setPib(String pib){
        this.pib = pib;
    }
    public void setCourse(int course){
        this.course = course;
    }
}
