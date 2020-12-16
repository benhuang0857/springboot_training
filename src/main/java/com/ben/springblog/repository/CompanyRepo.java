package com.ben.springblog.repository;

import com.ben.springblog.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String> {

    @Query(value = "select * from company where name = ?1", nativeQuery = true)
    List<Company> findByNativeSql(String comname);

    @Query(value = "select * from company where name like %?1%", nativeQuery = true)
    List<Company> findByNativeSql1(String comname);

    @Modifying
    @Query(value = "update company set name = ?1 ", nativeQuery = true)
    void updateByName(String comname);
}
