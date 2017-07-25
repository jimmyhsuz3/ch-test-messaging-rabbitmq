package hello;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;
@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer{
	private ConfigurableEmbeddedServletContainer container;
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		System.out.println(new String("CustomizationBean.EmbeddedServletContainerCustomizer: " + container));
	}
	@Override
	public String toString() {
		return "CustomizationBean.EmbeddedServletContainerCustomizer: " + container;
	}
}