/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulator;

/**
 *
 * @author Tucker Stone 
 * @version 9/24/14
 */

/**
 * Demonstration of MVC pattern.
 *
 * CalcModel.java
 *
 * This represents the Model which is a representation of the data
 * and its state. This may also include logic, functions, business
 * rules, etc.
 */

public class CalcModel{
  // add two values
  public double addValues(double op1, double op2){
    return op1 + op2;
  }
    
  // subtract two values
  public double subtractValues(double op1, double op2){
    return op1 - op2;
  }
    
  // multiply two values
  public double multiplyValues(double op1, double op2){
    return op1 * op2;
  }
  
  public double divideValues(double op1, double op2){
     return op1 / op2;
  }
    
}