package com.poll.Poll.repository;

import com.poll.Poll.model.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
    @Query(value="select v.* from Options o, Votes v where o.POLL_ID = ?1 and v.OPTION_ID = o.OPTION_ID", nativeQuery = true)
            public Iterable<Vote> findByPoll(Long pollId);
}
