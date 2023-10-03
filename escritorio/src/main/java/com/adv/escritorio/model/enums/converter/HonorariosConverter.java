package com.adv.escritorio.model.enums.converter;

import com.adv.escritorio.model.enums.HonorariosEnum;
import jakarta.persistence.AttributeConverter;
import org.springframework.core.convert.converter.Converter;

public class HonorariosConverter implements AttributeConverter<HonorariosEnum, String>, Converter<String, HonorariosEnum> {

    @Override
    public String convertToDatabaseColumn(HonorariosEnum honorariosEnum) {
        return honorariosEnum.getCode();
    }

    @Override
    public HonorariosEnum convertToEntityAttribute(String code) {
        return HonorariosEnum.getEnum(code);
    }

    @Override
    public HonorariosEnum convert(String s) {
        return HonorariosEnum.getEnum(s);
    }
}
