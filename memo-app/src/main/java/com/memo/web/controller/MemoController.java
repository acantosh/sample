package com.memo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.memo.domain.entity.Memo;
import com.memo.domain.repository.MemoRepository;

@Controller
public class MemoController {
  @Autowired
  MemoRepository memoRepository;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Model model) {
    model.addAttribute("memos", memoRepository.findAll());
    return "index";
  }
  
 /* @RequestMapping(value = "/memos", method = RequestMethod.POST)
  public String create(@ModelAttribute("memo") Memo memo) {
    memoRepository.saveAndFlush(memo);
    return "redirect:/";
  }*/
}