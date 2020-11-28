public class SimpleArray {
    public static void main(String[] args) {
        String [] movies = new String [5];
        movies [0]= "kot";
        movies [1]= "pies";
        movies [2]= "koń";
        movies [3]= "jeż";
        movies [4]= "papuga";
        String movie= movies [2];
        System.out.println(movie);
        int numberOfElement=movies.length;
        System.out.println(" Moja tablica zawiera 5 elementów");
    }
}