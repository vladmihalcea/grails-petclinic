import spring.HypersistenceConfigurableLocalSessionFactoryBean

// Place your Spring DSL code here
beans = {
    sessionFactory(HypersistenceConfigurableLocalSessionFactoryBean) {
        dataSource = ref('dataSource')
        hibernateProperties = ref('hibernateProperties')
        grailsApplication = ref('grailsApplication')
    }
}
