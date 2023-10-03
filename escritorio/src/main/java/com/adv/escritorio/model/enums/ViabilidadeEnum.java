package com.adv.escritorio.model.enums;

import com.adv.escritorio.config.exceptions.EnumException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum ViabilidadeEnum {
    viavel("V", "viavel"),
    inviavel("I", "inviavel"),
    indefinido("U", "indefinido");

    private String code;
    private String description;

    ViabilidadeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static ViabilidadeEnum getEnum(String code) {
        return Arrays.stream(ViabilidadeEnum.values())
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
