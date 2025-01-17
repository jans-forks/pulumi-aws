// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs;
import com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs;
import com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkforceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkforceArgs Empty = new WorkforceArgs();

    /**
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
     * 
     */
    @Import(name="cognitoConfig")
    private @Nullable Output<WorkforceCognitoConfigArgs> cognitoConfig;

    /**
     * @return Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
     * 
     */
    public Optional<Output<WorkforceCognitoConfigArgs>> cognitoConfig() {
        return Optional.ofNullable(this.cognitoConfig);
    }

    /**
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
     * 
     */
    @Import(name="oidcConfig")
    private @Nullable Output<WorkforceOidcConfigArgs> oidcConfig;

    /**
     * @return Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
     * 
     */
    public Optional<Output<WorkforceOidcConfigArgs>> oidcConfig() {
        return Optional.ofNullable(this.oidcConfig);
    }

    /**
     * A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
     * 
     */
    @Import(name="sourceIpConfig")
    private @Nullable Output<WorkforceSourceIpConfigArgs> sourceIpConfig;

    /**
     * @return A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
     * 
     */
    public Optional<Output<WorkforceSourceIpConfigArgs>> sourceIpConfig() {
        return Optional.ofNullable(this.sourceIpConfig);
    }

    /**
     * The name of the Workforce (must be unique).
     * 
     */
    @Import(name="workforceName", required=true)
    private Output<String> workforceName;

    /**
     * @return The name of the Workforce (must be unique).
     * 
     */
    public Output<String> workforceName() {
        return this.workforceName;
    }

    private WorkforceArgs() {}

    private WorkforceArgs(WorkforceArgs $) {
        this.cognitoConfig = $.cognitoConfig;
        this.oidcConfig = $.oidcConfig;
        this.sourceIpConfig = $.sourceIpConfig;
        this.workforceName = $.workforceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforceArgs $;

        public Builder() {
            $ = new WorkforceArgs();
        }

        public Builder(WorkforceArgs defaults) {
            $ = new WorkforceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
         * 
         * @return builder
         * 
         */
        public Builder cognitoConfig(@Nullable Output<WorkforceCognitoConfigArgs> cognitoConfig) {
            $.cognitoConfig = cognitoConfig;
            return this;
        }

        /**
         * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
         * 
         * @return builder
         * 
         */
        public Builder cognitoConfig(WorkforceCognitoConfigArgs cognitoConfig) {
            return cognitoConfig(Output.of(cognitoConfig));
        }

        /**
         * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
         * 
         * @return builder
         * 
         */
        public Builder oidcConfig(@Nullable Output<WorkforceOidcConfigArgs> oidcConfig) {
            $.oidcConfig = oidcConfig;
            return this;
        }

        /**
         * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
         * 
         * @return builder
         * 
         */
        public Builder oidcConfig(WorkforceOidcConfigArgs oidcConfig) {
            return oidcConfig(Output.of(oidcConfig));
        }

        /**
         * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpConfig(@Nullable Output<WorkforceSourceIpConfigArgs> sourceIpConfig) {
            $.sourceIpConfig = sourceIpConfig;
            return this;
        }

        /**
         * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpConfig(WorkforceSourceIpConfigArgs sourceIpConfig) {
            return sourceIpConfig(Output.of(sourceIpConfig));
        }

        /**
         * @param workforceName The name of the Workforce (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder workforceName(Output<String> workforceName) {
            $.workforceName = workforceName;
            return this;
        }

        /**
         * @param workforceName The name of the Workforce (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder workforceName(String workforceName) {
            return workforceName(Output.of(workforceName));
        }

        public WorkforceArgs build() {
            $.workforceName = Objects.requireNonNull($.workforceName, "expected parameter 'workforceName' to be non-null");
            return $;
        }
    }

}
