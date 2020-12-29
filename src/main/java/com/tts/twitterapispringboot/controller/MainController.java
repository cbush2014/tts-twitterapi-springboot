package com.tts.twitterapispringboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.twitterapispringboot.service.Twitter4j;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

@Controller
@ControllerAdvice
public class MainController {
	
	@Autowired
	private Twitter4j apiService;	

	@GetMapping("/")
//	public String main(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	public String main(Model model) throws TwitterException {
		
		Map<String, String> tweets1 = Twitter4j.getTimeLineByUsername2Map("@ChicagoBears");
		model.addAttribute("tweets1", tweets1);

		Map<String, String> tweets2 = Twitter4j.getTimeLineByUsername2Map("@Cubs");
		model.addAttribute("tweets2", tweets2);

		Map<String, String> tweets3 = Twitter4j.getTimeLineByUsername2Map("@NHLBlackhawks");
		model.addAttribute("tweets3", tweets3);

		List<String> myFollowers = Twitter4j.getListofFollowerNames("@cbush13");
		model.addAttribute("followers", myFollowers);

		return "index";		   		
		
	}
	
		
	
    @GetMapping("/about")
    public String about() {
    	return "about";
	}	
    
//    @GetMapping("/buses")
//    public String getBusesPage(Model model){
//        model.addAttribute("request", new BusRequest());
//        return "index";
//    }
	
	
}
