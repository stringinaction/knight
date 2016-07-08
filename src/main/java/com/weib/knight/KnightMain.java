/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.knight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhangjingwei
 */
public class KnightMain {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;
        try {
            context = new AnnotationConfigApplicationContext(KnightConfig.class);
            Knight knight = context.getBean(Knight.class);
            Minstrel minstrel = context.getBean(Minstrel.class);
            minstrel.singBeforeQuest();
            knight.embarkOnQuest();
            minstrel.singAfterQuest();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(context != null){
                context.close();
            }
        }
    }
    
}
