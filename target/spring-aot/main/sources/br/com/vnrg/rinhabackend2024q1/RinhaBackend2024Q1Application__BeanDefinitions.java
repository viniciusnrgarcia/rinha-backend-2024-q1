package br.com.vnrg.rinhabackend2024q1;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link RinhaBackend2024Q1Application}.
 */
@Generated
public class RinhaBackend2024Q1Application__BeanDefinitions {
  /**
   * Get the bean definition for 'rinhaBackend2024Q1Application'.
   */
  public static BeanDefinition getRinhaBackendQApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RinhaBackend2024Q1Application.class);
    beanDefinition.setTargetType(RinhaBackend2024Q1Application.class);
    ConfigurationClassUtils.initializeConfigurationClass(RinhaBackend2024Q1Application.class);
    beanDefinition.setInstanceSupplier(RinhaBackend2024Q1Application$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
