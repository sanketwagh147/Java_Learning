package com.old;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(12, 2002));
        
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year > 9999){
        return false;
        }

        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
        }
    


    public static int getDaysInMonth(int month, int year){
        if ((month >12) || (month <1) || (year < 1) || (year > 9999)){
            return -1;
        }
        switch(month){
            case 1: return 31;
            case 2: {
                if (isLeapYear(year)){
                    return 29;
                }
                return 28;
            }
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return -1;
            }
        }


    } 
    
    
