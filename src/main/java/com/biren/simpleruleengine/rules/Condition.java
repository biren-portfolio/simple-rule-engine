package com.biren.simpleruleengine.rules;

@FunctionalInterface
public interface Condition {

    boolean test(RuleContext ruleContext);
    
}
