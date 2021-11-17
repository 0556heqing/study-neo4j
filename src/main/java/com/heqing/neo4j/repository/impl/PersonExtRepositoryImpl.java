package com.heqing.neo4j.repository.impl;

import com.heqing.neo4j.model.node.Person;
import com.heqing.neo4j.repository.PersonExtRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PersonExtRepositoryImpl extends BaseRepositoryImpl<Person, Long> implements PersonExtRepository {


}
