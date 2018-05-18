import service.CustomerService;
import service.CustomerServiceImpl;

public class Application{

    public static void main(String[] args){
        CustomerService service = new CustomerServiceImpl();

        System.out.println("First Name: " + service.findAll().get(0).getFirstName());
        //System.out.println("FirstName >> "+ ((CustomerServiceImpl) service).findAll().get(0).getFirstName());
    }
}
