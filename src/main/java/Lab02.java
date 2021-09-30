public class Lab02 {
    public static double[] map(double[] values, UnaryFunction single) {
        double[] newArr= new double[values.length];
        for (int i = 0; i < values.length; i++){
            newArr[i] += single.exec(values[i]);
        }
        return newArr;
    }

    public static void main(String[] args) {
        //PART 1 MAIN
        double[] Val = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] mapArr = map(Val, new Doubler());
        System.out.print("[ ");
        for (int i = 0; i<mapArr.length; i++){
            System.out.print(mapArr[i]+" ");
        }
        System.out.println("]");
        //PART 2 MAIN
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
        Song one = new Song("Daft Punk", "One More Time", 322);

        Song.collectionName = "Randy's Collection";
        System.out.println("Collection: " + Song.collectionName);

        System.out.println(sed); // this will invoke the toString() function on the Song instance 'sed'
        System.out.println(one);
    }
}
