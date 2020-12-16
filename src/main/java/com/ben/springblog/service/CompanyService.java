package com.ben.springblog.service;
import com.ben.springblog.domain.Company;

import javax.transaction.Transactional;
import java.util.List;


public interface CompanyService {

    void save(Company company);

    @Transactional
    void delete(String uuid);

    @Transactional
    void update(Company company);

    List<Company> findAll();

    List<Company> findByNativeSQL(String comname);
}
