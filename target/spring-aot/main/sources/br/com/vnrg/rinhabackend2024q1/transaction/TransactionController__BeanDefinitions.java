package br.com.vnrg.rinhabackend2024q1.transaction;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TransactionController}.
 */
@Generated
public class TransactionController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'transactionController'.
   */
  private static BeanInstanceSupplier<TransactionController> getTransactionControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TransactionController>forConstructor(TransactionService.class)
            .withGenerator((registeredBean, args) -> new TransactionController(args.get(0)));
  }

  /**
   * Get the bean definition for 'transactionController'.
   */
  public static BeanDefinition getTransactionControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TransactionController.class);
    beanDefinition.setInstanceSupplier(getTransactionControllerInstanceSupplier());
    return beanDefinition;
  }
}
