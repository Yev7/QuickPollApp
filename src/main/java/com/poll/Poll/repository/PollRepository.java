package com.poll.Poll.repository;

import com.poll.Poll.model.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {
}
