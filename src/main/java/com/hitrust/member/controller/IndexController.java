package com.hitrust.member.controller;

import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.w3c.dom.Document;

import com.hitrust.member.common.E3Result;
import com.hitrust.member.common.MD5Utils;
import com.hitrust.member.entity.Member;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/*@Controller*/
@RestController
@RequestMapping("/")
public class IndexController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private MessageSource messageSource;

	@PostMapping("findAll")
	public String findAll(Model model, @RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "5") Integer size, Member member) {
		Member list = this.restTemplate.getForObject("http://127.0.0.1:8888/user/",
				Member.class);
		  System.out.println(list);
		  model.addAttribute("HitrustList",list);
		/* i18n¹ú¼Ê»¯ */
		getMessage(model);
		 /*Page<Member> pagin = memberService.findMemberCriteria(page, size, member);
		model.addAttribute("TotalPages", pagin.getTotalPages());
		model.addAttribute("TotalElements", pagin.getTotalElements());
		model.addAttribute("pageNumShown", pagin.getNumber());
		model.addAttribute("NumberOfElements", pagin.getNumberOfElements());
		model.addAttribute("HitrustList", pagin.getContent());*/
		return "list";
	}
	
	public Model getMessage(Model model) {
		Locale locale = LocaleContextHolder.getLocale();
		/* Map<String , String> messgeMap=new HashMap<>(); */
		model.addAttribute("username", messageSource.getMessage("messages.messages.username", null, locale));
		model.addAttribute("password", messageSource.getMessage("messages.messages.password", null, locale));
		model.addAttribute("sex", messageSource.getMessage("messages.messages.sex", null, locale));
		model.addAttribute("nick_name", messageSource.getMessage("messages.messages.nick_name", null, locale));
		model.addAttribute("phone", messageSource.getMessage("messages.messages.phone", null, locale));
		model.addAttribute("user_level", messageSource.getMessage("messages.messages.user_level", null, locale));
		model.addAttribute("experience_value",messageSource.getMessage("messages.messages.experience_value", null, locale));
		model.addAttribute("btn", messageSource.getMessage("messages.messages.btn", null, locale));
		model.addAttribute("Query", messageSource.getMessage("messages.messages.Query", null, locale));
		model.addAttribute("Addition", messageSource.getMessage("messages.messages.Addition", null, locale));
		model.addAttribute("Batch_Deleting", messageSource.getMessage("messages.messages.Batch_Deleting", null, locale));
		model.addAttribute("Edit", messageSource.getMessage("messages.messages.Edit", null, locale));
		model.addAttribute("Number", messageSource.getMessage("messages.messages.Number", null, locale));
		model.addAttribute("Delete", messageSource.getMessage("messages.messages.Delete", null, locale));
		model.addAttribute("Welcome", messageSource.getMessage("messages.messages.Welcome", null, locale));
		model.addAttribute("User_LevelId", messageSource.getMessage("messages.messages.User_LevelId", null, locale));
		model.addAttribute("Login", messageSource.getMessage("messages.messages.Login", null, locale));
		model.addAttribute("Safe_Exit", messageSource.getMessage("messages.messages.Safe_Exit", null, locale));
		model.addAttribute("WelcomeUser", messageSource.getMessage("messages.messages.WelcomeUser", null, locale));
		return model;
	}
}