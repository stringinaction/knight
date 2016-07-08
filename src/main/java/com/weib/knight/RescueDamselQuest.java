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
public class RescueDamselQuest implements Quest {
    
    private PrintStream stream;
    
    public RescueDamselQuest(PrintStream stream){
        this.stream = stream;
    }
    
    public void embark(){
        stream.println("RescueDamselQuest embark");
    }
}
