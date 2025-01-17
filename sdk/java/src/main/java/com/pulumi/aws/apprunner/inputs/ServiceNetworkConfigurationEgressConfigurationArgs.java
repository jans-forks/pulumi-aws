// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationEgressConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationEgressConfigurationArgs Empty = new ServiceNetworkConfigurationEgressConfigurationArgs();

    /**
     * Type of egress configuration.Set to DEFAULT for access to resources hosted on public networks.Set to VPC to associate your service to a custom VPC specified by VpcConnectorArn.
     * 
     */
    @Import(name="egressType")
    private @Nullable Output<String> egressType;

    /**
     * @return Type of egress configuration.Set to DEFAULT for access to resources hosted on public networks.Set to VPC to associate your service to a custom VPC specified by VpcConnectorArn.
     * 
     */
    public Optional<Output<String>> egressType() {
        return Optional.ofNullable(this.egressType);
    }

    /**
     * ARN of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when EgressType = VPC.
     * 
     */
    @Import(name="vpcConnectorArn")
    private @Nullable Output<String> vpcConnectorArn;

    /**
     * @return ARN of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when EgressType = VPC.
     * 
     */
    public Optional<Output<String>> vpcConnectorArn() {
        return Optional.ofNullable(this.vpcConnectorArn);
    }

    private ServiceNetworkConfigurationEgressConfigurationArgs() {}

    private ServiceNetworkConfigurationEgressConfigurationArgs(ServiceNetworkConfigurationEgressConfigurationArgs $) {
        this.egressType = $.egressType;
        this.vpcConnectorArn = $.vpcConnectorArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNetworkConfigurationEgressConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNetworkConfigurationEgressConfigurationArgs $;

        public Builder() {
            $ = new ServiceNetworkConfigurationEgressConfigurationArgs();
        }

        public Builder(ServiceNetworkConfigurationEgressConfigurationArgs defaults) {
            $ = new ServiceNetworkConfigurationEgressConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egressType Type of egress configuration.Set to DEFAULT for access to resources hosted on public networks.Set to VPC to associate your service to a custom VPC specified by VpcConnectorArn.
         * 
         * @return builder
         * 
         */
        public Builder egressType(@Nullable Output<String> egressType) {
            $.egressType = egressType;
            return this;
        }

        /**
         * @param egressType Type of egress configuration.Set to DEFAULT for access to resources hosted on public networks.Set to VPC to associate your service to a custom VPC specified by VpcConnectorArn.
         * 
         * @return builder
         * 
         */
        public Builder egressType(String egressType) {
            return egressType(Output.of(egressType));
        }

        /**
         * @param vpcConnectorArn ARN of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when EgressType = VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorArn(@Nullable Output<String> vpcConnectorArn) {
            $.vpcConnectorArn = vpcConnectorArn;
            return this;
        }

        /**
         * @param vpcConnectorArn ARN of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when EgressType = VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorArn(String vpcConnectorArn) {
            return vpcConnectorArn(Output.of(vpcConnectorArn));
        }

        public ServiceNetworkConfigurationEgressConfigurationArgs build() {
            return $;
        }
    }

}
