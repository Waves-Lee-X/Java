import java.util.Scanner;

public class StudyJava01 {
    public static void main(String args[]){
        System.out.println("请输入你的成绩");
        Scanner scanner =new Scanner(System.in);
        int score = scanner.nextInt();
        if(score==100) {
            System.out.println("BMW");
        }
        else if(score<100&&score>80){
            System.out.println("iPhone 13 Pro");
        }
        else if(score<=80&&score>=60){
            System.out.println("iPad");
        }
        else System.out.println("nothing");
    }

}
