package br.com.vnrg.rinhabackend2024q1.transaction;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TransactionService}.
 */
@Generated
public class TransactionService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'transactionService'.
   */
  private static BeanInstanceSupplier<TransactionService> getTransactionServiceInstanceSupplier() {
    return BeanInstanceSupplier.<TransactionService>forConstructor(TransactionRepository.class, CustomerRepository.class)
            .withGenerator((registeredBean, args) -> new TransactionService(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'transactionService'.
   */
  public static BeanDefinition getTransactionServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TransactionService.class);
    beanDefinition.setInstanceSupplier(getTransactionServiceInstanceSupplier());
    return beanDefinition;
  }
}
