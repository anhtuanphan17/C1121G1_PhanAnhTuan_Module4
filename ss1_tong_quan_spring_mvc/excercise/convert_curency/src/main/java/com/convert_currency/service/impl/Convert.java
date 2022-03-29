package com.convert_currency.service.impl;

import com.convert_currency.service.IConvert;
import org.springframework.stereotype.Service;

@Service
public class Convert implements IConvert {

    @Override
    public Double convert(Double usd) {
        return usd*23000;
    }
}
