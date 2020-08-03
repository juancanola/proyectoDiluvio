package com.diluvio.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diluvio.attacks.Ataque;


@Controller
@RequestMapping("/diluvio")
public class DiluvioController {

	
	@GetMapping("/")
	public String menu() {
		return "index";
	}
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/dnsattack", produces=MediaType.APPLICATION_JSON_VALUE)
    public String dnsAttack(@RequestParam("ip") String ip)
	    {
		return Ataque.dnsAttack(ip);
	    }
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/synflood", produces=MediaType.APPLICATION_JSON_VALUE)
    public String synFlood(@RequestParam("ip") String ip)
	    {
		return Ataque.synFloodAttack(ip);
	    }
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/udpflood", produces=MediaType.APPLICATION_JSON_VALUE)
    public String udpFlood(@RequestParam("ip") String ip)
	    {
		return Ataque.udpFloodAttack(ip);
	    }
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/ntpattack", produces=MediaType.APPLICATION_JSON_VALUE)
    public String nptAttack(@RequestParam("ip") String ip)
	    {
		return Ataque.ntpAttack(ip);
	    }
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/icmpflood", produces=MediaType.APPLICATION_JSON_VALUE)
    public String icmpFlood(@RequestParam("ip") String ip)
	    {
		return Ataque.icmpFloodAttack(ip);
	    }
	
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/tcpflood", produces=MediaType.APPLICATION_JSON_VALUE)
    public String tcpConnectFlood(@RequestParam("ip") String ip)
	    {
		return Ataque.tcpConnectFlood(ip);
	    }
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST,
    path = "/slowhttp", produces=MediaType.APPLICATION_JSON_VALUE)
    public String slowhttpAttack(@RequestParam("ip") String ip)
	    {
		return Ataque.slowhttpAttack(ip);
	    }
}
