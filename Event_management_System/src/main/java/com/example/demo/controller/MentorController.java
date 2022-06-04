package com.example.demo.controller;

import com.example.demo.entity.Mentor;
import com.example.demo.service.MentorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MentorController {
    private MentorService mentorService;

    public MentorController(MentorService mentorService) {
        super();
        this.mentorService = mentorService;
    }
    @GetMapping("/mentors")
    public String listMentors(Model model){
        model.addAttribute("mentors",mentorService.getAllMentors());
        return "mentors";

    }
    @GetMapping("/mentors/new")
    public String createMentorform(Model model){
        Mentor mentor=new Mentor();
        model.addAttribute("mentor",mentor);
        return "create_mentor";
    }
    @PostMapping("/mentors")
    public String saveMentor(@ModelAttribute("mentor") Mentor mentor)
    {
        mentorService.saveMentor(mentor);
        return "redirect:/mentors";

    }
    @GetMapping("/mentors/edit/{id}")
    public String editStudentForm(@PathVariable Long id,Model model){
        model.addAttribute("mentor",mentorService.getMentorById(id));
        return "edit_mentor";
    }
    @PostMapping("/mentors/{id}")
    public String updatrMentor(@PathVariable Long id,
    @ModelAttribute("mentor") Mentor mentor,
                               Model model){
        Mentor existingMentor = mentorService.getMentorById(id);
        existingMentor.setId(id);
        existingMentor.setName(mentor.getName());
        existingMentor.setEventName(mentor.getEventName());
        existingMentor.setDate(mentor.getDate());
        existingMentor.setDuration(mentor.getDuration());
        existingMentor.setEmail(mentor.getEmail());

        mentorService.updateMentor(existingMentor);
        return "redirect:/mentors";

    }
    @GetMapping("/mentors/{id}")
    public  String deleteMentor(@PathVariable Long id){
        mentorService.deleteMentorById(id);
        return "redirect:/mentors";

    }
}
