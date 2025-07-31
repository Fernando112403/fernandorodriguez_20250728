/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Main {
    
public static String names="Fernando Elias"; // names of the person
public static String surnames="Rodriguez Molina"; // surnames of the person
public static int year_of_birth=2000; // year of birth of the person
public static int month_of_birth=9; // month of birth os the person
public static float stature=1.89f; //stature in meters
public static float weight=149.9f;    //weigth in pounds
public static char gender='M'; // gender of the person
public static String family_status="Soltero"; // family status of the person
public static double monthly_salary=365.43d; // monthly salary of the person

    public static void main(String[] args) {
        double imc=0.0D; // initialize variable
        float tasa_kg=0.453592f;// one pound equals to 0.453592
        int bussines_days=22; // bussiness day in a month
        int working_hours=8; // working hours in a day
        
      // convert weith lb to kg
   float weight_kg = Main.weight * tasa_kg; // convert pound to kilograms
   float height_squared = Main.stature*Main.stature; // 
   
   imc = weight/height_squared;// calculate imc
   
   double daily_salary= Main.monthly_salary/bussines_days;
   double hourly_salary= daily_salary/working_hours;
   
////Data output.

System.out.println("Saludos "+Main.names+" "+Main.surnames); //welcome
System.out.println("Su peso en lb es: "+Main.weight+" pero en KG es: "+weight_kg); 
System.out.println("Su imc es: "+imc);
System.out.println("Su salario mensual es : "+Main.monthly_salary);
System.out.println("Su salario Diario es :"+daily_salary);
System.out.println("Su salario por hora es: "+hourly_salary);
      
      
    }
    
}
