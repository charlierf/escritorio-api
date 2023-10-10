package com.adv.escritorio.model.enums.converter;

import com.adv.escritorio.model.enums.ViabilidadeEnum;
import jakarta.persistence.AttributeConverter;
import org.springframework.core.convert.converter.Converter;

public class ViabilidadeEnumConverter implements AttributeConverter<ViabilidadeEnum, String>, Converter<String, ViabilidadeEnum> {

    @Override
    public String convertToDatabaseColumn(ViabilidadeEnum viabilidadeEnum) {
        return viabilidadeEnum.getCode();
    }

    @Override
    public ViabilidadeEnum convertToEntityAttribute(String code) {
        return ViabilidadeEnum.getEnum(code);
    }

    @Override
    public ViabilidadeEnum convert(String s) {
        return ViabilidadeEnum.getEnum(s);
}
}