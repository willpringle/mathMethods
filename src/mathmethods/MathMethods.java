/*
 * AUTHOR       Will Kantor Pringle
 * PROGRAM      MathMethods.java
 * PURPOSE      Presents math methods from the javadoc into a GUI
 */

// PACKAGE
package mathmethods;

/**
 * MAIN CLASS
 */
public class MathMethods {

    /**
     * MAIN METHOD FOR PR0GRAM
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SET UP THE GUI
        jframe form = new jframe(); 
        form.setVisible(true);
        form.setResizable(true);
    }
    
    /**
     * Void method that returns no value
     */
    public static void voidMethod(){
        // PRINT "Hello" ON THE LINE
        System.out.print("Hello");
    }
    
    /**
     * Boolean method that returns a boolean if called
     */
    public static boolean booleanMethod(){
        // DECLARE boolean AND INITIALIZE AS false
        boolean trueOrFalse=false;
        
        // RETURN boolean VALUE
        return trueOrFalse;
    }
    
}
