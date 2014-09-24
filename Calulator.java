/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulator;

/**
 *
 * @author sstoneman1
 */
public class Calulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcController controller = new CalcController(view,model);
    }
    
}
