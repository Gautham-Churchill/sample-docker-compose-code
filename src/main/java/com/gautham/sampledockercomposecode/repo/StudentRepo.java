package com.gautham.sampledockercomposecode.repo;

import org.springframework.data.repository.ListCrudRepository;

public interface StudentRepo extends ListCrudRepository<Student, Integer> {
}
