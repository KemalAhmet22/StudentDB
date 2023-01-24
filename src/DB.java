import java.util.ArrayList;
import java.util.Scanner;

public class DB {


    public ArrayList<char[]> Students = new ArrayList<char[]>();

    public char[] Student_info = new char[4];

    public DB(ArrayList<char[]> dbStudents, char[] dbStudent_info) {
        this.Students = dbStudents;
        this.Student_info = dbStudent_info;
        Scanner();
        Display();
    }

    public ArrayList Scanner(){
        Scanner sc= new Scanner(System.in);
        System.out.println("DataBase'e girilecek öğrenci sayısını giriniz");
        int a= sc.nextInt();

        for (int i=0;i<a;i++){
            System.out.println(i+"Numaralı öğrencinin adını giriniz");
            char studentname = sc.next().charAt();
            Student_info[1] = studentname;
            System.out.println(a+"Numaralı öğrencinin eğitim yılını giriniz");
            int b= sc.nextInt();
            Student_info[2] = (char)b;
            Students.add(Student_info);
        }
        System.out.println("Öğrenci : ");
        for (char[] dd : Students){

            System.out.println(" : "+Students);

        }
        return Students;
    }

    public void Display(){

    }


}
