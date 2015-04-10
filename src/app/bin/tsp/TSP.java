/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bin.tsp;

import app.bin.Service;
import app.bin.algorithm.Worker;

/**
 *
 * @author erik
 */
public class TSP extends Service {
    
    private final Worker[] workers = new Worker[3];

    public TSP() {
        workers[0] = new BruteForce();
        workers[1] = new FarthestInsertion();
        workers[2] = new NearestNeightbour();
    }

    @Override
    public Package[] serve(Package[] order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
