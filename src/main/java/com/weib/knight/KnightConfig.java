/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zhangjingwei
 */
@Configuration
public class KnightConfig {
    
    @Bean
    public Quest quest(){
        return new RescueDamselQuest(System.out);
    }
    
    @Bean
    public Knight knight(){
        return new DamselRescuingKnight(quest());
    }
    
    /**
     *
     * @return
     */
    @Bean
    public Minstrel Minstrel(){
        return new Minstrel(System.out);
    }
}
