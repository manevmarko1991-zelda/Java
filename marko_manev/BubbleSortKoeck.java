package marko_manev;


	public class BubbleSortKoeck {
	    

	    public static int[] bubblesorting (int[] array, boolean ascending) {

	        int laenge = array.length;
	        boolean swapped;
	        
	        int[] arr = array.clone();

	        if (ascending == true) {
	            for (int i = 0; i < laenge - 1; i++) {
	                swapped = false;
	                for (int j = 0; j < laenge - 1 - i; j++) {
	                    if (arr[j] > arr[j + 1]) {
	                        int temp = arr[j];
	                        arr[j] = arr[j + 1];
	                        arr[j + 1] = temp;
	                        swapped = true;
	                    }
	                }
	                if (swapped == false) {
	                        System.out.println("swapped");
	                        break;
	                    }
	            }
	        }
	        
	        else {

	            for (int i = 0; i < laenge - 1; i++) {
	                swapped = false;
	                for (int j = 0; j < laenge - 1 - i; j++) {
	                    if (arr[j] < arr[j + 1]) {
	                        int temp = arr[j];
	                        arr[j] = arr[j + 1];
	                        arr[j + 1] = temp;
	                        swapped = true;
	                    }
	                }
	                if (swapped == false) {
	                        System.out.println("swapped");
	                        break;
	                    }
	            }
	        }
	        return arr; //sortierte Kopie zurück
	    }

	    public static void printArray(int[] array) {
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        
	        int[] array = {3, 1, 8, 23, 17, 12, 22, 13, 5};
	        // int[] array2 = {3, 1, 8, 23, 17, 12, 22, 13, 5};

	        boolean aufsteigend = true;
	        boolean absteigend = false;

	        System.out.println("Unsortiert:");
	        printArray(array);
	        int[] sortedasc = bubblesorting(array, aufsteigend);
	        System.out.println("Aufsteigend sortiert:");
	        printArray(sortedasc);
	        
	        int[] sorteddesc = bubblesorting(array, absteigend);
	        System.out.println("Absteigend sortiert:");
	        printArray(sorteddesc);
	        
	        System.out.println("Urspruenglicches Array");
	        printArray(array);
	    }
	}
	 
	 

