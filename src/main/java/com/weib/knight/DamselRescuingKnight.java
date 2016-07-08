/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.knight;

/**
 *
 * @author zhangjingwei
 */
public class DamselRescuingKnight implements Knight {
    private Quest quest;
    
    public DamselRescuingKnight(Quest quest){
        this.quest = quest;
    }
    
    public void embarkOnQuest(){
        this.quest.embark();
    }
}
