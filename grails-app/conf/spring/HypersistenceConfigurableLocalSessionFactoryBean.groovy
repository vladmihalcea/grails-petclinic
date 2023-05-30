package spring

import io.hypersistence.optimizer.hibernate.decorator.HypersistenceHibernatePersistenceProvider
import org.grails.orm.hibernate.ConfigurableLocalSessionFactoryBean
import org.hibernate.SessionFactory

/**
 * @author Vlad Mihalcea
 */
class HypersistenceConfigurableLocalSessionFactoryBean extends ConfigurableLocalSessionFactoryBean {

    @Override
    protected SessionFactory doBuildSessionFactory() {
        SessionFactory sessionFactory = super.doBuildSessionFactory()
        return HypersistenceHibernatePersistenceProvider.decorate(sessionFactory);
    }
}
