public class Operator_Assignment2 {
    int first_number;
    int second_number;

    public int sum(int x, int y) {
        this.first_number = x;
        this.second_number = y;
        int add = first_number + second_number;
        return add;
    }

    public int diffTwoNumber(int x, int y) {
        this.first_number = x;
        this.second_number = y;
        int difference = x - y;
        return difference;
    }

    public double divideNumber(int x, int y) {
         this.first_number = x;
         this.second_number = y;
         //double num1= x;
         //double num2= y;
        double divide = (double)(x)/(double)(y);
        return divide;
    }

    public int multiply(int x, int y) {
        this.first_number = x;
        this.second_number = y;
        int multiple = x * y;
        return multiple;
    }

    public int incrementDecrement(int x, int y) {
        x += 5;
        y -= 3;
        int z = x + y;
        return z;

    }

    public Boolean notEqualOperator(int x, int y) {
        boolean comparison1 = x != y;
        return comparison1;

    }

    public Boolean equalOperator(int x, int y) {
        boolean comparison = x == y;
        return comparison;

    }

     public void logicOperator(int x) {
        if (x > 3 && x < 10) {
            System.out.println("number greater than three but less than 10");
        }

        else if(x < 3 || x == 0){
            System.out.println("number is pretty small");
        }
             else {
            System.out.println("number is not equal to zero");
        }


    }


        public void calculateLargerOrSmallerNumber(){
        int[]array_number= {4,5,7,8,3,9,15,16};
        int smallest= array_number[0];
        int largest= array_number[0];

            for(int i=0; i<array_number.length; i++){
            if (array_number[i] > largest)
                largest = array_number[i];
            else if (array_number[i] < smallest)
                smallest = array_number[i];
                System.out.println("Largest Number is : " + largest);
                System.out.println("Smallest Number is : " + smallest);
        }


        }
       public void relationalOperator(){
        int x= 5;
        int y= 10;
        System.out.println(x>= y);
        System.out.println(x==y);
        System.out.println(x==y);
        System.out.println(x<y);
        System.out.println(x!=y);
        System.out.println(x <= y);


       }

        public static void main(String[] args) {
        Operator_Assignment2 obj= new Operator_Assignment2();
        System.out.println(obj.sum(5,6));
        System.out.println(obj.diffTwoNumber(10,9));
        System.out.println(obj.divideNumber(15,30));
        System.out.println(obj.multiply(5,6));
        System.out.println(obj.incrementDecrement(4,5));
        System.out.println(obj.notEqualOperator(5,6));
        System.out.println(obj.equalOperator(5,6));
         obj.logicOperator(5);

       // System.out.println(obj.relationalOperator());
        //System.out.println(obj.calculateLargerOrSmallerNumber());

    }

}

