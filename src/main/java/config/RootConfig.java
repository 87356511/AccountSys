package config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Configurable
@Import(DataConfig.class)
@ComponentScan("servic")
public class RootConfig {
}
