//package com.poll.Poll.services;
//import com.poll.Poll.model.Poll;
//import com.poll.Poll.repository.PollRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PollService {
//    @Autowired
//    private PollRepository pollRepository;
//
//    public void addPoll(Poll poll) {
//        pollRepository.save(poll);
//    }
//
//        public List<Poll> getPollList() {
//        List<Poll> polls = new ArrayList<>();
//        pollRepository.findAll().forEach(polls::add);
//        return polls;
//    }
//    public Poll updatePoll(Long pollId, Poll poll){
//        for (Poll p: getPollList()){
//            if (p.getId().equals(pollId)){
//                pollRepository.save(poll);
//            }
//        }
//        return poll;
//    }
//    public void deletePoll(Long id) {
//        pollRepository.deleteById(id);
//    }
//
//
//    public Optional<Poll> getById(Long pollId){
//        return pollRepository.findById(pollId);
//    }
//    public boolean idExists(Long pollId){
//        return pollRepository.existsById(pollId);
//    }
//
//}
//
////    void updatePoll(Poll poll);
//
//    public List<Poll> getPollList() {
//        pollRepository.findAll().forEach(polls::add);
//        return polls;
//    }
//
////    Poll getPollById(Long id);
////
////    void removePoll(Long id);
//}
////@Service
////public class PollService {
////    @Autowired
////    private PollRepository pollRepository;
////
////    public void savePoll(Poll poll){
////        pollRepository.save(poll);
////    }
////}
