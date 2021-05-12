package com.bibliohome.biblioweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bibliohome.biblioweb.bibliothecaire;

@Controller
@RequestMapping(path = "/")
public class homeController {
    @Autowired
    private librarianRepository lRepository;
    @GetMapping(path="/all")
  public @ResponseBody Iterable<bibliothecaire> getAllLibrarians() {
    // This returns a JSON or XML with the users
    return lRepository.findAll();
  }
}
