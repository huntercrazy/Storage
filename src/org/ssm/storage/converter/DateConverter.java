package org.ssm.storage.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Date convert(String content) {
		try {
			return sdf.parse(content);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
