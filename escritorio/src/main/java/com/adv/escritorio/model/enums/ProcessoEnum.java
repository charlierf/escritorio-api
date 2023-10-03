package com.adv.escritorio.model.enums;

import com.adv.escritorio.config.exceptions.EnumException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum ProcessoEnum {
    PROCEDENTE_TOTAL("T", "procedente total"),
    PROCEDENTE_PARCIAL("P", "procedente parcial"),
    IMPROCEDENTE("I", "improcedente"),
    NAO_SE_APLICA("N", "não se aplica");

    private String code;
    private String description;

    ProcessoEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static ProcessoEnum getEnum(String code) {
        return Arrays.stream(ProcessoEnum.values())
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
