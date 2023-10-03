package com.adv.escritorio.model.enums;

import com.adv.escritorio.config.exceptions.EnumException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum HonorariosEnum {
    viavel("s", "sucumbencial"),
    inviavel("c", "contratual"),
    indefinido("o", "outro");

    private String code;
    private String description;

    HonorariosEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static HonorariosEnum getEnum(String code) {
        return Arrays.stream(HonorariosEnum.values())
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
