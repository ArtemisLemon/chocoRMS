/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chocomodel;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.variables.IntVar;



public class App {
    RMSsolver rms;
    public static void main(String[] args) {
        Model model  = new Model("Hello Model");
        IntVar[] vs = model.intVarArray("vs", 5, 1, 5);

        model.allDifferent(vs).post();
        Solver solver = model.getSolver();
        if(solver.solve()){
            System.out.println(solver.getModelName());
        }else {
            System.out.println("mmh");
        }
    }
}
