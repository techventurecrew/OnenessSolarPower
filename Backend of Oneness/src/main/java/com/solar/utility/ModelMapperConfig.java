package com.solar.utility;

import java.util.Base64;

import org.modelmapper.AbstractConverter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        // Converter to map Base64 string to byte[] (for ProfileDto to Profile conversion)
        modelMapper.addConverter(new AbstractConverter<String, byte[]>() {
            protected byte[] convert(String source) {
                return source != null ? Base64.getDecoder().decode(source) : null;
            }
        });

        // Converter to map byte[] to Base64 string (for Profile to ProfileDto conversion) 
        modelMapper.addConverter(new AbstractConverter<byte[], String>() {
            protected String convert(byte[] source) {
                return source != null ? Base64.getEncoder().encodeToString(source) : null;
            }
        });

        return modelMapper;
    }

   
}
