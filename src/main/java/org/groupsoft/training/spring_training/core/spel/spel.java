package org.groupsoft.training.spring_training.core.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */ 
public class spel 
{
    public static void main( String[] args )
    {
    	String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/spel/spelconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
		Math math = context.getBean("math", Math.class);
        System.out.println(math);
        
       // How to create expression from SpelExpressionParser   
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("2+2");
        System.out.println(expression.getValue());
    }
}
