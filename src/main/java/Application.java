import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CustomerService;

public class Application{

    public static void main(String[] args){
        // CustomerService service = new CustomerServiceImpl();

        // Initialize the application context
        //ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext   appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // The string passed lookis for the name of the bean
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service); // Print the location of the service

        CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service2); // Print the location of the service




        System.out.println("First Name: " + service.findAll().get(0).getFirstName());
        //System.out.println("FirstName >> "+ ((CustomerServiceImpl) service).findAll().get(0).getFirstName());
    }
}
