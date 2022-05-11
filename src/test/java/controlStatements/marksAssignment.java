package controlStatements;

import org.junit.jupiter.api.Test;

public class marksAssignment {
    int marks = 68;
//giving the conditions to check weather marks are in which state.
    @Test
    public void ForLoopStatements() {
        if (marks <= 40) {
            System.out.println(marks+ "Fail");
        } else
            if (marks>40 & marks<=60){
                System.out.println(marks+ "pass");
            } else
                if (marks>60 & marks<=80){
                    System.out.println(marks +"first class");
                } else
                    if (marks>80 & marks<=100){
                        System.out.println(marks +"distinction");
                    } else
                        if(marks<0 & marks>100) {
                            System.out.println("invalid" + marks);
                        }
    }
}
