package br.com.vnrg.rinhabackend2024q1.transaction;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * Bean definitions for {@link TransactionRepository}.
 */
@Generated
public class TransactionRepository__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'transactionRepository'.
   */
  private static BeanInstanceSupplier<TransactionRepository> getTransactionRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TransactionRepository>forConstructor(JdbcClient.class)
            .withGenerator((registeredBean, args) -> new TransactionRepository(args.get(0)));
  }

  /**
   * Get the bean definition for 'transactionRepository'.
   */
  public static BeanDefinition getTransactionRepositoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TransactionRepository.class);
    beanDefinition.setInstanceSupplier(getTransactionRepositoryInstanceSupplier());
    return beanDefinition;
  }
}
