
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woohoo
 */
public class Points {
    private List<Integer> points;
    private List<Integer> pointsWithPassingGrade;
    private List<Integer> gradesList;

    public Points() {
        this.points = new ArrayList<>();
        this.pointsWithPassingGrade = new ArrayList<>();
        this.gradesList = new ArrayList<>();
    }
    
    public void addPoint(int point) {
        this.points.add(point);
        if (point >= 50) {
            this.pointsWithPassingGrade.add(point);
        }
        addGrade(point);
    }
    
    public double getAverageOfAll() {
        int total = getAll();
        double average = (1.0 * total) / this.points.size();
        return average;
    }
    
    public double getAverageOfPassingGrades() {
        int total = getAllWithPassingGrade();
        double average = (1.0 * total) / this.pointsWithPassingGrade.size();
        return average;
    }    
    
    public int getAll() {
        int total = 0;
        for (Integer i : this.points) {
            total += i;
        }
        return total;
    }
    
    public int getAllWithPassingGrade() {
        int total = 0;
        for (Integer i : this.pointsWithPassingGrade) {
            total += i;
        }
        return total;
    }
    
    public double getPassPercentage() {
        double percentage = (100.0 * this.pointsWithPassingGrade.size()) / this.points.size();
        return percentage;
    }
    
    @Override
    public String toString() {
        String printout = "";
        printout += "Point average (all): " + this.getAverageOfAll() + "\n";
        printout += "Point average (passing): "; 
        if (this.pointsWithPassingGrade.size() == 0) {
            printout += "-\n";
        } else {
            printout += this.getAverageOfPassingGrades() + "\n";
        }
        printout += "Pass percentage: " + this.getPassPercentage() + "\n";
        printout += "Grade distribution:\n";
        printout += this.getGradeDistributionString();
        return printout;
    }
    private void addGrade(int point) {
        if (point < 50) {
            this.gradesList.add(0);
            System.out.println("Adding 0");
        } else if (point < 60) {
            this.gradesList.add(1);
            System.out.println("Adding 1");
        } else if (point < 70) {
            this.gradesList.add(2);
            System.out.println("Adding 2");
        } else if (point < 80) {
            this.gradesList.add(3);
            System.out.println("Adding 3");
        } else if (point < 90) {
            this.gradesList.add(4);
            System.out.println("Adding 4");
        } else if (point >= 90) {
            this.gradesList.add(5);
            System.out.println("Adding 5");
        }
    }
    
    public String getGradeDistributionString() {
        String gradeString = "";
        int grade = 5;
        int starsCounter = 0;
        while (grade >= 0) {
            for (Integer g : this.gradesList) {
                if (g == grade) {
                   starsCounter++; 
                }
            }
            
            gradeString += grade + ": ";
            while (starsCounter > 0) {
                gradeString += "*";
                starsCounter--;
            }
            gradeString += "\n";
            grade--;
        }
        return gradeString;
    }

    
    
}
