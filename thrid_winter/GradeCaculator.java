import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class GradeCaculator {
    public static void main(String[] args) {

        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("A+", 4.5);
        scoreMap.put("A0", 4.0);
        scoreMap.put("B+", 3.5);
        scoreMap.put("B0", 3.0);
        scoreMap.put("C+", 2.5);
        scoreMap.put("C0", 2.0);
        scoreMap.put("D+", 1.5);
        scoreMap.put("D0", 1.0);
        scoreMap.put("F", 0.0);

        Scanner sc = new Scanner(System.in);
        double scoreSum = 0;
        double creditSum = 0;
        for(int i=0; i<20; i++){
            Grade line = new Grade();
            line.subject = sc.next();
            line.credit = sc.nextDouble();
            line.grade = sc.next();
            if(!line.grade.equals("P")){
                scoreSum += scoreMap.get(line.grade) * line.credit;
                creditSum += line.credit;
            }
        }
        double finalGrade = scoreSum / creditSum;
        System.out.printf("%.6f", finalGrade);
        sc.close();
    }
}
class Grade{
    String subject;
    Double credit;
    String grade;
}
