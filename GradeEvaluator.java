import java.io.*;

public class Prob1_GradeEvaluator {
    public static void main(String[] args) throws IOException {
        double dblPrelimGrade, dblMidtermGrade, dblFinalGrade, dblFinalAve;
        
        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nFinal Average Calculator.\n\n\tEnter your Prelim, Midterm, and Final grades to compute for your final average.");
        
        System.out.print("\n\t\tPrelim Grade:\t");
        dblPrelimGrade = Double.parseDouble(buffread.readLine());

        System.out.print("\t\tMidterm Grade:\t");
        dblMidtermGrade = Double.parseDouble(buffread.readLine());

        System.out.print("\t\tFinal Grade:\t");
        dblFinalGrade = Double.parseDouble(buffread.readLine());

        //Computation
        dblFinalAve = (0.15 * dblPrelimGrade) + (0.3 * dblMidtermGrade) + (0.5 * dblFinalGrade);

        //Evaluation
        if(dblFinalAve > 75.0) {
            System.out.println("\n\tResult: Passed\n");
        }
        else {
            System.out.println("\n\tResult: Failed\n");
        }
    }
}