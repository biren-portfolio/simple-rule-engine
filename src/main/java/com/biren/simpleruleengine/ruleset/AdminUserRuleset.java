package com.biren.simpleruleengine.ruleset;

import com.biren.simpleruleengine.rules.Rule;

public class AdminUserRuleset extends Ruleset {

    public AdminUserRuleset() {
        super();
        addRule(addEntitlementCheck());
    }

    private Rule addEntitlementCheck() {
        Rule rule = new Rule();
        rule.addCondition( ruleContext -> "admin".equalsIgnoreCase(ruleContext.getRole()));
        return rule;
    }
    
}
