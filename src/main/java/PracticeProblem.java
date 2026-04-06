/*
Author: Alex Liang
Lesson: 3.3 - Else If
Date Created: April 6, 2026
Date Last Modified April 6, 2026
*/

public class PracticeProblem{
    
    public static void main (String[] args){
        
    }
    
    public static String evenOrOdd(int num){
        String result;
        if (num % 2 == 0 && num != 0){
            result = "Even";
        }
        else if (num == 0){
            result = "Zero";
        } else {
          result = "Odd";  
        }
    return result;
    }
    
    public static String positiveOrNegative(int num){
        String result;
        if (num > 0){
            result = "Positive";
        }
        else if (num == 0){
            result = "Zero";
        } else {
            result = "Negative";
        }
    return result;
    }
    
    public static String pluralize(String input){
        String result;
        input = input.toLowerCase();
        if (input.endsWith("ey")){
            result = "eys";
        }
        else if (input.endsWith("y")){
            result = "ies";
        }
        else if (input.endsWith("ife")){
            result = "ives";
        } else {
            result = "s";
        }
    return result;
    }
}

