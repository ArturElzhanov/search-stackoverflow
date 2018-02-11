package ru.home.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.home.configuration.ApplicationConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] {ApplicationConfig.class };
  }

  protected Class<?>[] getServletConfigClasses() {
    return null;
  }

  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}