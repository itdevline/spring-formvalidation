package com.springvalidation.controller;

import com.springvalidation.model.FormValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by David on 2017.04.30..
 */
@Controller
@RequestMapping("/")
public class FormController
    {

    @RequestMapping(value = "/form")
    public String form(Model model)
        {
        model.addAttribute("formValidation", new FormValidation());
        return "formvalidation";
        }

    @RequestMapping(value = "/success")
    public String success()
        {
        return "success";
        }


    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String formvalidation(@Valid FormValidation formValidation, BindingResult bindingResult)
        {

        if(bindingResult.hasErrors())
            {
                return "formvalidation";
            }


        return "redirect:/success";

        }

    }
