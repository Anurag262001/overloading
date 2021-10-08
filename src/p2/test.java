package p2;

public class test {
    public static void main(String[] args) {
        Exam obj1= new Exam();
        obj1.display();
        Exam obj2 = new Exam(20);
        obj2.display();
        Exam obj3 = new Exam(30, " llb", 70);
        obj3.display();
    }
}
