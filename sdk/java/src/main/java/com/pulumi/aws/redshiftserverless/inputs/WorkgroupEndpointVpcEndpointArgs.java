// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless.inputs;

import com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointNetworkInterfaceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkgroupEndpointVpcEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkgroupEndpointVpcEndpointArgs Empty = new WorkgroupEndpointVpcEndpointArgs();

    /**
     * The network interfaces of the endpoint.. See `Network Interface` below.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<WorkgroupEndpointVpcEndpointNetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return The network interfaces of the endpoint.. See `Network Interface` below.
     * 
     */
    public Optional<Output<List<WorkgroupEndpointVpcEndpointNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * The DNS address of the VPC endpoint.
     * 
     */
    @Import(name="vpcEndpointId")
    private @Nullable Output<String> vpcEndpointId;

    /**
     * @return The DNS address of the VPC endpoint.
     * 
     */
    public Optional<Output<String>> vpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }

    /**
     * The port that Amazon Redshift Serverless listens on.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The port that Amazon Redshift Serverless listens on.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private WorkgroupEndpointVpcEndpointArgs() {}

    private WorkgroupEndpointVpcEndpointArgs(WorkgroupEndpointVpcEndpointArgs $) {
        this.networkInterfaces = $.networkInterfaces;
        this.vpcEndpointId = $.vpcEndpointId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkgroupEndpointVpcEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkgroupEndpointVpcEndpointArgs $;

        public Builder() {
            $ = new WorkgroupEndpointVpcEndpointArgs();
        }

        public Builder(WorkgroupEndpointVpcEndpointArgs defaults) {
            $ = new WorkgroupEndpointVpcEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkInterfaces The network interfaces of the endpoint.. See `Network Interface` below.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<WorkgroupEndpointVpcEndpointNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces The network interfaces of the endpoint.. See `Network Interface` below.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<WorkgroupEndpointVpcEndpointNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces The network interfaces of the endpoint.. See `Network Interface` below.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(WorkgroupEndpointVpcEndpointNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param vpcEndpointId The DNS address of the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            $.vpcEndpointId = vpcEndpointId;
            return this;
        }

        /**
         * @param vpcEndpointId The DNS address of the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(String vpcEndpointId) {
            return vpcEndpointId(Output.of(vpcEndpointId));
        }

        /**
         * @param vpcId The port that Amazon Redshift Serverless listens on.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The port that Amazon Redshift Serverless listens on.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public WorkgroupEndpointVpcEndpointArgs build() {
            return $;
        }
    }

}
