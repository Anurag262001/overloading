package p2;

public class Exam {
    int rollnum;
    String course;
    int marks;
    //over loading
    Exam()
    {
        rollnum = 10;
        course = "betch";
        marks= 90;
    }
    Exam (int rollnum, String course, int marks)
    {
        this.rollnum = rollnum;
        this.marks= marks;
        this.course=course;
    }
    Exam(int rollnum)
    {
        this.rollnum = rollnum;
        course = "mca";
        marks = 89;
    }
    public void display()
    {
        System.out.println( rollnum + " " + course + " " + marks);
    }
}
