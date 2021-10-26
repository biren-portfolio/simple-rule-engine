package com.biren.simpleruleengine.ruleset;

import com.biren.simpleruleengine.rules.Rule;

public class RegularUserRuleset extends Ruleset {

    public RegularUserRuleset() {
        super();
        addRule(addEntitlementCheck());
    }

    private Rule addEntitlementCheck() {
        Rule rule = new Rule();
        rule.addCondition( ruleContext -> "regular".equalsIgnoreCase(ruleContext.getRole()));
        return rule;
    }
    
}
