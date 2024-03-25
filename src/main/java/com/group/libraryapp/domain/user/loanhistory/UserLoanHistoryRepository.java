package com.group.libraryapp.domain.user.loanhistory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoanHistoryRepository extends JpaRepository<javaUserLoanHistory, Long> {

  javaUserLoanHistory findByBookNameAndIsReturn(String bookName, boolean isReturn);

}
