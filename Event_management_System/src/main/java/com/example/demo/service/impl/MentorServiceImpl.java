package com.example.demo.service.impl;

import com.example.demo.entity.Mentor;
import com.example.demo.repository.MentorRepository;
import com.example.demo.service.MentorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MentorServiceImpl implements MentorService {
    private MentorRepository mentorRepository;

    public MentorServiceImpl(MentorRepository mentorRepository) {
        super();
        this.mentorRepository = mentorRepository;
    }

    @Override
    public List<Mentor>getAllMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    @Override
    public Mentor getMentorById(Long id) {
        return mentorRepository.findById(id).get();
    }

    @Override
    public Mentor updateMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    @Override
    public void deleteMentorById(Long id) {
        mentorRepository.deleteById(id);
    }
}
