package com.dictionary.controller;

import com.dictionary.service.ISearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DictionaryController {
    
    @Autowired
    private ISearch search;

    @GetMapping("/search")
    public String dictionarySearch() {
        return "search";
    }

    @PostMapping("/search")
    public String result(@RequestParam String searchWord, Model model) {
        String result = null;
        Map<String, String> stringMap = this.search.translate();
        result = stringMap.get(searchWord);
        model.addAttribute("result",result);

        return "search";

    }
}
