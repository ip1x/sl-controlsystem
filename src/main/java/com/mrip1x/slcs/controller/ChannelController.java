package com.mrip1x.slcs.controller;

import com.mrip1x.slcs.model.Channel;
import com.mrip1x.slcs.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/channel")
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @RequestMapping(value = "/{id:[\\d]+}", method = RequestMethod.GET)
    public ModelAndView getChannels(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("channel");
        Channel channel = channelService.findChannelById(id);
        if(channel == null){
            //TODO
        }
        modelAndView.addObject("channel", channel);
        return modelAndView;
    }

}
