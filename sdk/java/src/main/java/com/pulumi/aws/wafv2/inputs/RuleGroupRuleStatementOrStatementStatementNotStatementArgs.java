// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementOrStatementStatementNotStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementNotStatementArgs Empty = new RuleGroupRuleStatementOrStatementStatementNotStatementArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementArgs>> statements;

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementArgs>> statements() {
        return this.statements;
    }

    private RuleGroupRuleStatementOrStatementStatementNotStatementArgs() {}

    private RuleGroupRuleStatementOrStatementStatementNotStatementArgs(RuleGroupRuleStatementOrStatementStatementNotStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementOrStatementStatementNotStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementOrStatementStatementNotStatementArgs();
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatementArgs defaults) {
            $ = new RuleGroupRuleStatementOrStatementStatementNotStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(RuleGroupRuleStatementOrStatementStatementNotStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public RuleGroupRuleStatementOrStatementStatementNotStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
