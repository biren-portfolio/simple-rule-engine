package com.biren.simpleruleengine.actions;

import com.biren.simpleruleengine.rules.Rule;
import com.biren.simpleruleengine.rules.RuleContext;

public abstract class Action {

    private Rule rule;
    private RuleContext ruleContext;
    
    protected Action(RuleContext ruleContext, Rule rule) {
        this.rule = rule;
        this.ruleContext = ruleContext;
    }

}
