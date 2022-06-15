public class Loops {
    public static void main(String[] args){
        boolean keepGoing = true;
        int count = 5;
        do{
            System.out.println(count);
            count--;
            if(count == 2) keepGoing = false;

        }while(count > 0 && keepGoing);
        String[] cars = {"Volvo", "BMW", "Ford", "KIA", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }


//    end class
}
