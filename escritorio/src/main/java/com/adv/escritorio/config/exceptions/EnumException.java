package com.adv.escritorio.config.exceptions;

import com.adv.escritorio.config.utils.MessageUtils;

public class EnumException extends RuntimeException {

        public EnumException(){
            super(MessageUtils.NO_VALUE_ENUM);
        }

}
