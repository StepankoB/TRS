
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {


    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager( new SecurityManager());

        }
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        MatrixSolver solver = new MatrixSolverImpl();

        try {
            MatrixSolver stub = (MatrixSolver) UnicastRemoteObject.exportObject(solver, 0);//прокидання портів
            Registry registry = LocateRegistry.createRegistry(1011);
            registry.bind("MatrixEquationSolver", stub);
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}


