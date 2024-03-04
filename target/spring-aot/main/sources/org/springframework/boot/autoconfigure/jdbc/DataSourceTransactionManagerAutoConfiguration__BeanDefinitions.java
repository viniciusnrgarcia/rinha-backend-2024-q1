package org.springframework.boot.autoconfigure.jdbc;

import javax.sql.DataSource;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Bean definitions for {@link DataSourceTransactionManagerAutoConfiguration}.
 */
@Generated
public class DataSourceTransactionManagerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceTransactionManagerAutoConfiguration'.
   */
  public static BeanDefinition getDataSourceTransactionManagerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceTransactionManagerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSourceTransactionManagerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration}.
   */
  @Generated
  public static class JdbcTransactionManagerConfiguration {
    /**
     * Get the bean definition for 'jdbcTransactionManagerConfiguration'.
     */
    public static BeanDefinition getJdbcTransactionManagerConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration.class);
      beanDefinition.setInstanceSupplier(DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'transactionManager'.
     */
    private static BeanInstanceSupplier<DataSourceTransactionManager> getTransactionManagerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataSourceTransactionManager>forFactoryMethod(DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration.class, "transactionManager", Environment.class, DataSource.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration.class).transactionManager(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'transactionManager'.
     */
    public static BeanDefinition getTransactionManagerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceTransactionManager.class);
      beanDefinition.setInstanceSupplier(getTransactionManagerInstanceSupplier());
      return beanDefinition;
    }
  }
}
