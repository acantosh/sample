package com.memo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.memo.domain.entity.Memo;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long>{

}
