import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Application{

    public static void main(String[] args){
        // CustomerService service = new CustomerServiceImpl();

        // Initialize the application context
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println("First Name: " + service.findAll().get(0).getFirstName());
        //System.out.println("FirstName >> "+ ((CustomerServiceImpl) service).findAll().get(0).getFirstName());
    }
}
