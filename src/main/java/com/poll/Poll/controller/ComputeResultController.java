package com.poll.Poll.controller;

import com.poll.Poll.dto.OptionCount;
import com.poll.Poll.dto.VoteResult;
import com.poll.Poll.model.Vote;
import com.poll.Poll.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ComputeResultController {

    @Autowired
    private VoteRepository voteRepository;

    @RequestMapping(value="/computeresult/{pollId}", method= RequestMethod.GET)
    public ResponseEntity<?> computeResult(@PathVariable Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findByPoll(pollId);

        int totalVotes = 0;

        Map<Long, OptionCount> tempMap = new HashMap<Long, OptionCount>();

        for (Vote v : allVotes) {
            totalVotes++;
            OptionCount optionCount = tempMap.get(v.getOption().getId());

            if (optionCount == null) {
                optionCount = new OptionCount();
                optionCount.setOptionId(v.getOption().getId());
                tempMap.put(v.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount() + 1);
        }
        voteResult.setTotalVotes(totalVotes);
        voteResult.setResults(tempMap.values());

        return new ResponseEntity<>(voteResult, HttpStatus.OK);
    }
}
