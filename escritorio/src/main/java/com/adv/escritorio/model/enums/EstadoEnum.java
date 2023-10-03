package com.adv.escritorio.model.enums;

import com.adv.escritorio.config.exceptions.EnumException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum EstadoEnum {
    regular("R", "regular"),
    vencido("V", "vencido"),
    quitado("U", "quitado");

    private String code;
    private String description;

    EstadoEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static EstadoEnum getEnum(String code) {
        return Arrays.stream(EstadoEnum.values())
                .filter(x -> x.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(EnumException::new);
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
