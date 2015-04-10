/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Point;

/**
 *
 * @author erik
 */
public class Magazijn {
    
    private final Package[][] packages = new Package[15][4];
    
    public void insert(Package pa, Point po) {
        packages[po.x][po.y] = pa;
    }
    
    public Package obtain(Point p) {
        Package msg = packages[p.x][p.y];
        packages[p.x][p.y] = null;
        return msg;
    }
    
}
