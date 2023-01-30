package exam;
import java.util.Scanner;
public class Exam {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        double score1,score2,score3;
        System.out.println("Enter three test score");
        System.out.print("Enter the first score:");
        score1=keyboard.nextDouble();
        System.out.print("Enter the second score:");
        score2=keyboard.nextDouble();
        System.out.print("Enter the third score:");
        score3=keyboard.nextDouble();
        System.out.println();
        System.out.println("summary of result:");
        double average=calcAverage(score1,score2,score3);
        char letergrade=determineGrade(average);
        double max=findMaxGrade(score1,score2,score3);
        display(average,letergrade,max);
    }
    public static double calcAverage(double s1,double s2,double s3){
        double avg=(s1+s2+s3)/3;
        return avg;
    }
    public static char determineGrade(double average){
        if(average>=90 && average<=100){
            return 'A';
        }
        else if(average>=80 && average<=89){
            return 'B';
        }
        else if(average>=70 && average<=79){
            return 'C';
        }
        else if(average>=60 && average<=69){
            return 'D';
        }
        else{
            return 'F';
        }
    }
        public static double findMaxGrade(double s1,double s2,double s3){
           double max=s1; 
           if(max<s2){ 
               max=s2;
           }
           if(max<s3){
               max=s3;
           }
           return max;
        }
        public static void display(double aveg,char grade,double max){
            System.out.println("the average is:"+aveg);
            System.out.println("your grade is:"+grade);
            System.out.println("the maxium value is:"+max);
        }
        
}
