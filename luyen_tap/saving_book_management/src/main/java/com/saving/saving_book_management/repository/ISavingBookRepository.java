package com.saving.saving_book_management.repository;

import com.saving.saving_book_management.model.SavingBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ISavingBookRepository extends JpaRepository<SavingBook, Integer> {

    Page<SavingBook> findAllByCustomer_CustomerNameContainingOrderByStartDay(String keyWordValue, Pageable pageable);

    @Query(value = " select saving_book.* from saving_book " +
            "join customer " +
            "on saving_book.customer_id = customer.customer_id " +
            " where (customer.customer_name like concat('%',:customerNameValue,'%')) and (start_day between :depositDatevalue and :maturityDateValue) ",nativeQuery = true)
    Page<SavingBook> findAllByCustomerNameAndDepositDateAndMaturiryDate(@Param("customerNameValue") String customerNameValue, @Param("depositDate") String depositDatevalue, @Param("maturityDate") String maturityDateValue, Pageable pageable);
}
