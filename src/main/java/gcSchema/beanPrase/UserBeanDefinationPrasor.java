package gcSchema.beanPrase;

import gcSchema.dto.User;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class UserBeanDefinationPrasor  extends AbstractSingleBeanDefinitionParser{
	@Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }
	
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
	        String name = element.getAttribute("name");
	        String sex = element.getAttribute("sex");
	        int age = Integer.parseInt(element.getAttribute("age"));

	        bean.addPropertyValue("name", name);
	        bean.addPropertyValue("sex", sex);
	        bean.addPropertyValue("age", age);
	}
	
	

}
