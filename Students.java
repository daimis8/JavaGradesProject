public class Students {
    private String name;
    private int mathGrade;
    private int englishGrade;
    private int biologyGrade;
    private double avg;

    Students(String name, int mathGrade, int englishGrade, int biologyGrade, double avg) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.biologyGrade = biologyGrade;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }
    public int getMathGrade() {
        return mathGrade;
    }
    public int getEnglishGrade() {
        return englishGrade;
    }
    public int getBiologyGrade() {
        return biologyGrade;
    }
    public double getAvg() {
        return avg;
    }
    @Override
    public String toString() {
        return "\nStudent "+name+":\nMath grade: "+mathGrade+";\nEnglish grade: "+englishGrade+";\nBiology grade: "+biologyGrade+";\nAverage: "+avg+";\n";
    }



}
