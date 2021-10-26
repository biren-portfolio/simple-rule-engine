package com.biren.simpleruleengine.rules;

import java.util.ArrayList;
import java.util.List;

public class Rule {

    private List<Condition> conditions;

    public Rule() {
        conditions = new ArrayList<>();
    }

    public boolean execute(RuleContext ruleContext) {
        return conditions.stream()
        .map(condition -> condition.test(ruleContext))
        .filter(Boolean::booleanValue)
        .findAny()
        .orElse(Boolean.FALSE);

    }

    public Rule addCondition(Condition condition) {
        conditions.add(condition);
        return this;
    }
    
}
