package minggu5;

import java.util.Arrays;

public class showroom {
    String  
        merk,
        tipe,
        tahun;

    int
        topAcc,
        topPower;

    static showroom[] BfDescending(showroom [] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].topAcc < arr[j].topAcc) {
                    showroom temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    static showroom[] DcDescending(showroom [] arr){
        showroom max;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean tukar = false;
            max = arr[i];
            index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (max.topAcc < arr[j].topAcc) {
                    max = arr[j];
                    index = j;
                    tukar = true;
                }
            }
            if (tukar == true) {
                arr[index] = arr[i];
                arr[i] = max;
            }
        }
        return arr;
    }


    static showroom[] BfAscending(showroom [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].topAcc > arr[j].topAcc) {
                    showroom temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static showroom[] DcAscending(showroom [] arr){
        showroom max;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean tukar = false;
            max = arr[i];
            index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (max.topAcc > arr[j].topAcc) {
                    max = arr[j];
                    index = j;
                    tukar = true;
                }
            }
            if (tukar == true) {
                arr[index] = arr[i];
                arr[i] = max;
            }
        }
        return arr;
    }

    static double rataRataPower(showroom [] arr){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].topPower;
        }
        return total / arr.length;
    }
}