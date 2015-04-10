/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bin.algorithm;

/**
 *
 * @author erik
 */
public abstract class Worker<T> {
    
    public abstract T[] doWork(T[] order);
    
}
