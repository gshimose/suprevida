package com.suprevida.viacep.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Properties {

	@Value("${viacep}")
	private String URL_VIACEP;

}
