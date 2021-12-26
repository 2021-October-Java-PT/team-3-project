package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.models.Country;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private CountryRepository countryRepo;

    @Override
    public void run(String... args) throws Exception {



    }

}