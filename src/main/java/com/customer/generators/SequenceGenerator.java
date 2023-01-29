package com.customer.generators;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

public class SequenceGenerator extends  SequenceStyleGenerator {
	
	public static final String  Number_Format_Parameter = "numberFormat";
	public static final  String Number_Format_Default = "%016d";
	
	private String numberFormat;
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return String.format(numberFormat, super.generate(session, object));
		
	}


	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		super.configure(LongType.INSTANCE, params, serviceRegistry);
		
		numberFormat = ConfigurationHelper.getString(Number_Format_Parameter, params, Number_Format_Default);
	}
	
	
	
	
}
