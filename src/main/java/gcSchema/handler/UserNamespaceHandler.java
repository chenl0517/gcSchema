package gcSchema.handler;

import gcSchema.beanPrase.UserBeanDefinationPrasor;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport{

	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinationPrasor());
      		
	}

}
