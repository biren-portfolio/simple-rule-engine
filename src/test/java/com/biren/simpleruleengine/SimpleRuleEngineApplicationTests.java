package com.biren.simpleruleengine;

import com.biren.simpleruleengine.rules.RuleContext;
import com.biren.simpleruleengine.ruleset.AdminUserRuleset;
import com.biren.simpleruleengine.ruleset.RegularUserRuleset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleRuleEngineApplicationTests {	

	@Test
	public void testRegularUserRulesetTriggered() {
		RegularUserRuleset regularUserRuleset = new RegularUserRuleset();
		RuleContext ruleContext = new RuleContext();
		ruleContext.setRole("regular");
		Assertions.assertTrue(regularUserRuleset.execute(ruleContext).size() == 1);
	}

	@Test
	public void testRegularUserRulesetNotTriggered() {
		RegularUserRuleset regularUserRuleset = new RegularUserRuleset();
		RuleContext ruleContext = new RuleContext();
		ruleContext.setRole("admin");
		Assertions.assertTrue(regularUserRuleset.execute(ruleContext).size() == 0);
	}

	@Test
	public void testAdminUserRulesetTriggered() {
		AdminUserRuleset adminUserRuleset = new AdminUserRuleset();
		RuleContext ruleContext = new RuleContext();
		ruleContext.setRole("admin");
		Assertions.assertTrue(adminUserRuleset.execute(ruleContext).size() == 1);
	}

	@Test
	public void testAdminUserRulesetNotTriggered() {
		AdminUserRuleset adminUserRuleset = new AdminUserRuleset();
		RuleContext ruleContext = new RuleContext();
		ruleContext.setRole("regular");
		Assertions.assertTrue(adminUserRuleset.execute(ruleContext).size() == 0);
	}
}
