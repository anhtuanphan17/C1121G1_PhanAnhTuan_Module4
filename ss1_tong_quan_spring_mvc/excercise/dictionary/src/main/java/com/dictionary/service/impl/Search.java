package com.dictionary.service.impl;

import com.dictionary.service.ISearch;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Search implements ISearch {

    @Override
    public Map<String,String> translate() {
        Map<String,String> dictionaryMap = new HashMap<>();
        dictionaryMap.put("Hello","Xin Chào");
        dictionaryMap.put("Goodbye", "Tạm Biệt");
        dictionaryMap.put("Amazing","Đáng Kinh Ngạc");
        dictionaryMap.put("Absolute","Hoàn toàn");

        return dictionaryMap ;
    }
}
