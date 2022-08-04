package FinalExam;

public class Algorithms {
    private int[] theArray = new int[50]; //Creating an array with 50 indexes
    private int arraySize = 10; // Elements in the array

    //Fill the Array with random values
    public void generateRandomValues(){
        for (int i = 0 ; i < arraySize; i++){
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
        System.out.println("-----------");
        for (int i=0; i< arraySize; i++){
            System.out.print("|  "+ i+ " |  ");
            System.out.println(theArray[i] + "  |");
            System.out.println("-----------");

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
        boolean valueInArray = false;
        for (int i= 0; i < arraySize; i++){
            if (theArray[i] == value) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    // Delete Array row for the index and move elements up
    public void deleteIndex(int index){
        if (index<arraySize){
            for (int i=index;i<(arraySize -1);i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    // Insert a value
    public void insertValue(int value){
        if (arraySize < 50){
            theArray[arraySize] = value;
            arraySize++;
        }
    }



    public static void main(String[] args){
        Algorithms newArray = new Algorithms();
        newArray.generateRandomValues();
        newArray.printArray();
        System.out.println(newArray.getValueByIndex(5));
        System.out.println(newArray.isValueInTheArray(15));
        newArray.deleteIndex(4);
        newArray.printArray();
    }

}
