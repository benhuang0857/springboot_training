package com.ben.springblog.service.impl;

import com.ben.springblog.domain.Company;
import com.ben.springblog.repository.CompanyRepo;
import com.ben.springblog.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public void save(Company company) {
        companyRepo.save(company);
    }

    @Transactional
    @Override
    public void delete(String uuid) {
        companyRepo.deleteById(uuid);
    }

    @Transactional
    @Override
    public void update(Company company) {
        companyRepo.save(company);
    }

    @Override
    public List<Company> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public List<Company> findByNativeSQL(String comname) {
        return companyRepo.findByNativeSql(comname);
    }
}
