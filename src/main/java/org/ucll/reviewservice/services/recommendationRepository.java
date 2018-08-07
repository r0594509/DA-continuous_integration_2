/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Nathan
 */
public class recommendationRepository {
    
    private HashMap<String, ArrayList<String>> map;
    
    public recommendationRepository() {
        this.map = new HashMap<>();
        populateHashMap();
    }
    
    public void addRecommendation(String id, String info) {
        this.map.get(id).add(info);
    }
    
    public Collection<String> getRecommendation(String id) throws Exception {
        if (this.map.get(id) == null)
            throw new Exception();
        return this.map.get(id);
    }
    
    private void populateHashMap() {
        this.map.put("tt3896198", new ArrayList<>(
            Arrays.asList("Avengers")
        ));
        this.map.put("tt1707386", new ArrayList<>(
            Arrays.asList("The Phantom of the Opera")
        ));
        this.map.put("tt0084555", new ArrayList<>(
            Arrays.asList("Les bronzés font du ski",
                "La vérité si je mens!"
            )
        ));
        this.map.put("tt0111161", new ArrayList<>(
            Arrays.asList("Fight Club", "Pulp Fiction")
        ));
        this.map.put("tt0093300", new ArrayList<>(
            Arrays.asList("Jaws", "Jaws 2", "Jaws 3D")
        ));
    }
}