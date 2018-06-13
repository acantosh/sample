package com.memo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.memo.domain.entity.Memo;
import com.memo.domain.repository.MemoRepository;

@RestController
public class MemoRestController {
  @Autowired
  private MemoRepository memoRepository;

  @RequestMapping(value = "/memos", method = RequestMethod.POST)
  @ResponseBody
  public Memo create(@RequestBody Memo memo) {
	  System.out.println("322222222222222222222222222222");
    memoRepository.saveAndFlush(memo);
    return memo;
  }
}
