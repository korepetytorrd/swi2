package org.example;

public class MergeSort {
    public static void main(String[] args) {
        int[] array= {12, 11, 13, 5, 6,7};
        margeSort(array, 0, array.length-1);

        printarray(array);
    }



    //głowna funkcja sortujaca tablice na podanym zakresie
    public static void margeSort(int[] array, int left, int right){
        if (left<right) {
            //znajdz srodek
            int middle = (left + right)/2;

            //posortuj lewa czesc
            margeSort(array, left, middle);
            //posortuj prawa czesc
            margeSort(array, middle+1, right);

            //Scla posortowane czesci
            merge(array, left, right, middle);
        }

    }


    //łaczy dwie podtablice
    public static void merge(int[] array, int left, int right, int middle){
        //znajdz rozmiary dwóch podtablic do scalnie 
        int n1 = middle-left+1;
        int n2 = right-middle;

        //tablice tymczasowe
        int [] L = new int[n1];
        int [] R = new int[n2];

        //kopiuj dane do tymczasowej tablicy
        for(int i =0; i<n1;i++){
            L[i]=array[left+i];
        }
        for(int j = 0; j<n2;j++){
            R[j]=array[middle+j+1];
        }

        //Scal tablice
        int i=0, j=0;

        //poczatkowy indeks scalonej tablicy
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <=R[j]) {
                array[k]=L[i];
                i++;
            }else{
                array[k]=R[j];
                j++;
            }
            k++;
        }
        //skopiowanie pozostałych elementów z L[], jeśli istnieja
        while (i<n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        //skopiowanie pozostałych elementów z R[], jeśli istnieja
        while (j<n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    } 
    public static void printarray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}

