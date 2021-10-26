package com.biren.simpleruleengine.ruleset;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.biren.simpleruleengine.actions.Action;
import com.biren.simpleruleengine.actions.Notification;
import com.biren.simpleruleengine.rules.Rule;
import com.biren.simpleruleengine.rules.RuleContext;

public abstract class Ruleset {

    private List<Rule> rules;

    protected Ruleset() {
        rules = new ArrayList<>();
    }

    protected Ruleset addRule(Rule rule) {
        rules.add(rule);
        return this;
    }

    public List<Action> execute(RuleContext ruleContext) {
        return rules.stream()
               .filter(rule -> rule.execute(ruleContext))
               .map(rule -> new Notification(ruleContext, rule))
               .collect(Collectors.toList());

    }
    
}
