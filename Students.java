public class Students {
    String name;
    int mathGrade;
    int englishGrade;
    int biologyGrade;
    double avg;

    Students(String name, int mathGrade, int englishGrade, int biologyGrade, double avg) {
        this.name = getName();
        this.mathGrade = getMathGrade();
        this.englishGrade = getEnglishGrade();
        this.biologyGrade = getBiologyGrade();
        this.avg = getAvg();
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


}
