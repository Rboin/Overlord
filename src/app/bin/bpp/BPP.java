/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bin.bpp;

import app.bin.Service;
import app.bin.algorithm.Worker;

/**
 *
 * @author erik
 */
public class BPP extends Service {
    
    private Worker[] workers = new Worker[3];

    public BPP() {
        workers[0] = new FirstFit();
        workers[1] = new MaxRest();
        workers[2] = new NextFit();
    }

    @Override
    public Package[] serve(Package[] order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
