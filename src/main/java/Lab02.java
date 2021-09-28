public class Lab02 {
//     class Doubler(){

//     }
//     public void main (String [] args){

//         double[] Val = {1.0, 2.0, 3.0, 4.0, 5.0};
//         map(Val, new Doubler());
//     }
//     public static void map(double[] values, UnaryFunction single) {

//     }
//     public interface UnaryFunction {
//         double exec(double argument);
//     }
    //PART 2
    public static void main(String[] args) {
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
        Song one = new Song("Daft Punk", "One More Time", 322);

        Song.collectionName = "Randy's Collection";
        System.out.println("Collection: " + Song.collectionName);

        System.out.println(sed); // this will invoke the toString() function on the Song instance 'sed'
        System.out.println(one);
    }
}
