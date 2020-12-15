package ZadanieDwaCztery;

public class Grades {

    int[] grades;
    private int size;



    public Grades() {

        this.grades = new int[10];
        this.size = 0;


    }

    public void add(int value) {
        if (this.size == 10)
            return ;

        this.grades[this.size] = value;
        this.size++;
    }
    public int lastAddedGrades() {

        return this.grades[this.size];
    }
    public double getAverage(){
        double sum=0;
        for( int i=0; i< this.size;i++){
            sum+=this.grades[i];
        }
         double average= sum/this.size;
        return average ;
    }

    }

























