package com.example.demo.service;

import com.example.demo.entity.Mentor;

import java.util.List;

public interface MentorService {
    default List<Mentor> getAllMentors() {
        return null;
    }

    default Mentor saveMentor(Mentor mentor) {
        return null;
    }
    Mentor getMentorById(Long id);

    Mentor updateMentor(Mentor mentor);
    void deleteMentorById(Long id);
}
