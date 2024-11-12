/*. 5.Define the local and Global variables with the same name and print both variables and 
understand the scope of the variables  
package basics;*/



package basics;
public class Global5 
{
    int a = 11;
    void localVariable() 
    {
        //Local variables are declared in methods, constructors, or blocks.
        int a = 22;
        System.out.println("Local variable a : " + a);
    }
    public static void main(String[] args) 
    {
        Global5 obj = new Global5();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();
}

}