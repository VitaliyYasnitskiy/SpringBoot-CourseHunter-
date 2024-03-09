package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args){
    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Detail.class)
            .buildSessionFactory();

       try {
           Session session = factory.getCurrentSession();
           Employee employee = new Employee("Zaur","Tregubov"
                   ,"IT",500);
           Detail detail = new Detail("Baku",
                   "12345678","zaurtregubov@gmail.com");
         employee.setEmpDetail(detail);
         session.beginTransaction();
  //       session.save(employee);
        session.persist(employee);
           session.getTransaction().commit();
           System.out.println("Done!");
//           System.out.println(emp);
       }
       finally {
           factory.close();
       }

    }
}
