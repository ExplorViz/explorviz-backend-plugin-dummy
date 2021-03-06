package net.explorviz.extension.dummy.main;

import javax.inject.Singleton;
import net.explorviz.extension.dummy.services.DummyService;
import net.explorviz.extension.dummy.services.KafkaLandscapeExchangeService;
import net.explorviz.extension.dummy.services.LandscapeSerializationHelper;
import net.explorviz.shared.common.injection.CommonDependencyInjectionBinder;

/**
 * The DependencyInjectionBinder is used to register Contexts and Dependency Injection (CDI) aspects
 * for this application.
 */
public class DependencyInjectionBinder extends CommonDependencyInjectionBinder {

  @Override
  public void configure() {

    // Common DI
    super.configure();

    // Service-specific DI
    
    this.bind(DummyService.class).to(DummyService.class).in(Singleton.class);

    this.bind(KafkaLandscapeExchangeService.class).to(KafkaLandscapeExchangeService.class)
        .in(Singleton.class);

    this.bind(LandscapeSerializationHelper.class).to(LandscapeSerializationHelper.class)
        .in(Singleton.class);

  }
}
