import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
    private static SessionFactory factory;

    public Factory() {
        factory = new Configuration()
                .configure("config/hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static SessionFactory getFactory() {
        return factory;
    }

    public void shutdown() {
        factory.close();
    }

    public Session getSession() {
        return factory.getCurrentSession();
    }

}
