/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ucll.reviewservice.services.recommendationRepository;

/**
 *
 * @author Nathan
 */
@RestController
public class ResourceController {

    private recommendationRepository iDataRepos = new recommendationRepository();
       
    @CrossOrigin
    @RequestMapping(value = "/movie")
    public Collection<String> getMovieRecommendation(@RequestParam(value = "id") String id) {
        
        try {
            return this.iDataRepos.getRecommendation(id);
        } catch (Exception e) {
            //return new ArrayList<>(Arrays.asList("Did not find any information for postal code: " + id));
            return null;
        }
    }
}