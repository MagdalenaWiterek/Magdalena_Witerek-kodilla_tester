public class Grades {
    private int[] grades;
    private int size;
    private int value;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.value = value;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getValue() {
        return value;
    }

    public double getAverage(int i) {
        double sum = 0;
        for ( i= 0; i < this.size; i++){
    }

    sum +=this.grades [i];
    return sum/this. size;


    }
}
