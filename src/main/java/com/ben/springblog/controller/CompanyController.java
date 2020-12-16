package com.ben.springblog.controller;

import com.ben.springblog.domain.Company;
import com.ben.springblog.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/company")
public class CompanyController
{
    @Resource(name = "companyService")
    private CompanyService csi;

    @PostMapping("/save")
    @ResponseBody
    public void save(Company company)
    {
        csi.save(company);
    }

    @GetMapping("/delete")
    @ResponseBody
    public void delete(@RequestParam String uuid)
    {
        csi.delete(uuid);
    }

    @PostMapping("/mlq")
    @ResponseBody
    public Map<String, Object> multiQuery(@RequestBody(required = false) Map<String, Object> reqMap)
    {
        String a1=reqMap.get("a1").toString();
        String a2=reqMap.get("a2").toString();

        return reqMap;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Company> findAll()
    {
        return csi.findAll();
    }

    @GetMapping("/get/{para}")
    @ResponseBody
    public  List<Company> findOne(@PathVariable String para)
    {
        return csi.findByNativeSQL(para);
    }
}
