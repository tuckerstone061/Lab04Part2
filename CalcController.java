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
 * CalcView.java
 *
 * This represents the View which is an output representation of the data.
 *
 * The view is how the user sees the representation of the data.
 */


import java.awt.event.*;

public class CalcController{
  
  // There is a reference to both the view and the model
  private static CalcView view;
  private static CalcModel model;
  

    
    /**
     * Create and set the listeners to the view
     */
  public CalcController(CalcView theView, CalcModel theModel)
  {
      this.view = theView;
      this.model = theModel;
      
       view.setAddListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
        view.setResult(model.addValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });

    view.setSubtractListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e){
        view.setResult(model.subtractValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
    
    view.setMultiplyListener(new ActionListener()
    {
    public void actionPerformed(ActionEvent e){
        view.setResult(model.multiplyValues(
        view.getOperand1(),
        view.getOperand2()));
        }
    });
    view.setDivideListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        if(view.getOperand2() != 0){
            view.setResult(model.divideValues(
            view.getOperand1(),
            view.getOperand2()));
        }
        else {
            view.setError("ERR");
        }
    }
    });
  
  }
}