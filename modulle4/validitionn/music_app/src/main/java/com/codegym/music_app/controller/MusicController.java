package com.codegym.music_app.controller;


import com.codegym.music_app.model.Music;
import com.codegym.music_app.service.IMusicService;
import com.codegym.music_app.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

@GetMapping("/music")
    public ModelAndView list(Pageable pageable){
    Page<Music> customers = musicService.findAll(pageable);
    ModelAndView modelAndView = new ModelAndView("/list");
    modelAndView.addObject("music",customers);
    return modelAndView;
}
@GetMapping("/create-music")
    public ModelAndView formCreate(){
    ModelAndView modelAndView = new ModelAndView("/create");
    modelAndView.addObject("music",new Music());
    return modelAndView;
}
@GetMapping("/edit-music/{id}")
    public ModelAndView formEdit(@PathVariable int id){
    ModelAndView modelAndView = new ModelAndView("/edit");
    modelAndView.addObject("music",musicService.findById(id));
    return modelAndView;
}
@GetMapping("/delete-music/{id}")
public ModelAndView fromDelete(@PathVariable int id){
    Optional<Music> music = musicService.findById(id);
    ModelAndView modelAndView = new ModelAndView("/delete");
    modelAndView.addObject("p",music.get());
    return modelAndView;
}
@PostMapping("/delete-music")
public String delete(@ModelAttribute("music") Music music){
    musicService.remove(music.getId());
    return "redirect:music";
}

@PostMapping("/edit-music")
public ModelAndView edit(@ModelAttribute("music") Music music){
    musicService.save(music);
    ModelAndView modelAndView = new ModelAndView("/edit");
    modelAndView.addObject("message", "Customer updated successfully");
    return modelAndView;
}

@PostMapping("/create-music")
    public ModelAndView create(@ModelAttribute("music") Music music){
    musicService.save(music);
    ModelAndView modelAndView = new ModelAndView("/create");
//    modelAndView.addObject("music",music);
    modelAndView.addObject("message", "Customer updated successfully");
    return modelAndView;
}


}
