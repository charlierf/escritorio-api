package com.adv.escritorio.model.enums.converter;

import com.adv.escritorio.model.Processo;
import com.adv.escritorio.model.enums.HonorariosEnum;
import com.adv.escritorio.model.enums.ProcessoEnum;
import jakarta.persistence.AttributeConverter;
import org.springframework.core.convert.converter.Converter;

public class ProcessoConverter implements AttributeConverter<ProcessoEnum, String>, Converter<String, ProcessoEnum> {

    @Override
    public String convertToDatabaseColumn(ProcessoEnum processoEnum) {
        return processoEnum.getCode();
    }

    @Override
    public ProcessoEnum convertToEntityAttribute(String code) {
        return ProcessoEnum.getEnum(code);
    }

    @Override
    public ProcessoEnum convert(String s) {
        return ProcessoEnum.getEnum(s);
    }
}
