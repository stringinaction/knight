/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.knight;

import java.io.PrintStream;

/**
 *
 * @author zhangjingwei
 */
public class Minstrel {
    
    private PrintStream stream;
    
    public Minstrel(PrintStream stream){
        this.stream = stream;
    }
    
    public void singBeforeQuest(){
        stream.println("Fa la la!!!!!");
    }
    
    public void singAfterQuest(){
        stream.println("Tee hee hee!!!!!");
    }
    
}
