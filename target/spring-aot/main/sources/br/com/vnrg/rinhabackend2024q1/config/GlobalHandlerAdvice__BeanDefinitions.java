package br.com.vnrg.rinhabackend2024q1.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GlobalHandlerAdvice}.
 */
@Generated
public class GlobalHandlerAdvice__BeanDefinitions {
  /**
   * Get the bean definition for 'globalHandlerAdvice'.
   */
  public static BeanDefinition getGlobalHandlerAdviceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GlobalHandlerAdvice.class);
    beanDefinition.setInstanceSupplier(GlobalHandlerAdvice::new);
    return beanDefinition;
  }
}
