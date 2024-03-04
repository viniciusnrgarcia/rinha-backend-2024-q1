package br.com.vnrg.rinhabackend2024q1.transaction;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * Bean definitions for {@link CustomerRepository}.
 */
@Generated
public class CustomerRepository__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'customerRepository'.
   */
  private static BeanInstanceSupplier<CustomerRepository> getCustomerRepositoryInstanceSupplier() {
    return BeanInstanceSupplier.<CustomerRepository>forConstructor(JdbcClient.class)
            .withGenerator((registeredBean, args) -> new CustomerRepository(args.get(0)));
  }

  /**
   * Get the bean definition for 'customerRepository'.
   */
  public static BeanDefinition getCustomerRepositoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CustomerRepository.class);
    beanDefinition.setInstanceSupplier(getCustomerRepositoryInstanceSupplier());
    return beanDefinition;
  }
}
