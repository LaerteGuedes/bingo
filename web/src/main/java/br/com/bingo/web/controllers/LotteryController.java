package br.com.bingo.web.controllers;

import br.com.bingo.core.services.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laerteguedes on 19/11/17.
 */
@Controller
@RequestMapping("/lotteries")
public class LotteryController{

    @Autowired
    private LotteryService service;

    @GetMapping("/")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("/lotteries/list");

        return mv;
    }

    @GetMapping("/{id}")
    public ModelAndView details(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("/lotteries/details");

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView mv = new ModelAndView("/lotteries/add");

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("/lotteries/list");

        return mv;
    }

    @PostMapping("/")
    public ModelAndView save(){
        return list();
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id){
        return list();
    }
}
