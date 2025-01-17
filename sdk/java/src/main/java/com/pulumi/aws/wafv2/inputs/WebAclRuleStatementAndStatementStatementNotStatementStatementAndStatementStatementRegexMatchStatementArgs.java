// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * String representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    @Import(name="regexString", required=true)
    private Output<String> regexString;

    /**
     * @return String representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    public Output<String> regexString() {
        return this.regexString;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.regexString = $.regexString;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param regexString String representing the regular expression. Minimum of `1` and maximum of `512` characters.
         * 
         * @return builder
         * 
         */
        public Builder regexString(Output<String> regexString) {
            $.regexString = regexString;
            return this;
        }

        /**
         * @param regexString String representing the regular expression. Minimum of `1` and maximum of `512` characters.
         * 
         * @return builder
         * 
         */
        public Builder regexString(String regexString) {
            return regexString(Output.of(regexString));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementArgs build() {
            $.regexString = Objects.requireNonNull($.regexString, "expected parameter 'regexString' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
