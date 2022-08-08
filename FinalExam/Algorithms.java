package FinalExam;

public class Algorithms {
    //Creating an array with 50 indexes
    public int[] theArray = new int[50];
    // Elements in the array
    public int arraySize = 10;
    //Fill the Array with random values
    public void generateRandomValues(){
        for (int i= 0; i< arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }
    public int[] getTheArray(){
        return theArray;
    }
    public int getArraySize(){
        return arraySize;
    }
    // Prints the Array on the screen in a grid
    public void printArray(){
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++){
            System.out.print(" | " + i+ "  |");
            System.out.println(theArray[i] + "  | ");
            System.out.println("---------");
        }
    }
    // Gets value at provided index
    public int getValueByIndex(int index){
        if (index < arraySize){
            return theArray[index];
        }
        return 0;
    }
    // Returns true or false if a value is in the Array
    public boolean isValueInTheArray(int value){
        boolean valueInTheArray = false;
        for (int i=0; i < arraySize; i++){
            if (theArray[i] == value){
                valueInTheArray = true;
            }
        }

        return valueInTheArray;
    }

    // Delete Array row for the index and move elements up
    public void deleteIndex(int index){
        if (index < arraySize){
            for (int i= index ;i< (index -1); i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    // Insert a value
    public void insertValue(int value){
        if (arraySize <50){
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearch(int value){
        boolean valueInArray = false;
        String indexWithValues = "";
        System.out.println("The values was found in the following");

        for (int i =0; i< arraySize; i++ ){
            if (theArray[i] == value){
                valueInArray = true;
                System.out.println(i + " ");
                indexWithValues += i + " ";
            }
        }
        if (!valueInArray){
            indexWithValues = "None";
            System.out.print(indexWithValues);
        }

        System.out.println();

        return  indexWithValues;

    };



    public static void main(String[] args){
        Algorithms newArray = new Algorithms();
        newArray.generateRandomValues();
        newArray.printArray();
        System.out.println(newArray.getValueByIndex(5));
        System.out.println(newArray.isValueInTheArray(15));
        newArray.deleteIndex(4);
        newArray.printArray();
        newArray.insertValue(24);
        newArray.printArray();
        newArray.linearSearch(15);
    }
}
