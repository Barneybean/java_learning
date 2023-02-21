package utils;
/*Represents a customer of a bank*/
public class Customer {
    //instance vars
    //name of customer//
     String name;
     String address;

     //*******
     //constructor: has to have the same name as the class, no void or return type needed 
     public Customer(String name){
         this.name = name;
     }
 
     //methods: Sets the address of customer to be given address. 
     public void setAddress(String address) { // void means it does not return anything
         this.address = address;
     }
 
     //methods: return customer's name
     public String getName(){
         return this.name;
     }
 
     //methods: return customer's address
     public String getAddress(){
         return this.address;
     }
 
 }
 
 
