package com.bridgelabz;



public class SumOfCLAandInvalidInteger {
    public static void main(String[] values)  {  
       int sum=0;
       System.out.println("calculate sum of below integers:");
       for(int i=0;i<values.length;i++) {
    	   System.out.println(values[i]);
    	   try {
    		   sum=sum+Integer.parseInt(values[i]);
    	   }
    	   catch(NumberFormatException e) {
    		   System.out.println("Invalid Integer: "+e.toString());
    		   
    	   }
    	   }
       System.out.println("sum:"+sum);
       }
}

