// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs;
import com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationState Empty = new BucketIntelligentTieringConfigurationState();

    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter;

    /**
     * @return A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    public Optional<Output<BucketIntelligentTieringConfigurationFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @Import(name="tierings")
    private @Nullable Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings;

    /**
     * @return The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    public Optional<Output<List<BucketIntelligentTieringConfigurationTieringArgs>>> tierings() {
        return Optional.ofNullable(this.tierings);
    }

    private BucketIntelligentTieringConfigurationState() {}

    private BucketIntelligentTieringConfigurationState(BucketIntelligentTieringConfigurationState $) {
        this.bucket = $.bucket;
        this.filter = $.filter;
        this.name = $.name;
        this.status = $.status;
        this.tierings = $.tierings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketIntelligentTieringConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIntelligentTieringConfigurationState $;

        public Builder() {
            $ = new BucketIntelligentTieringConfigurationState();
        }

        public Builder(BucketIntelligentTieringConfigurationState defaults) {
            $ = new BucketIntelligentTieringConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket this intelligent tiering configuration is associated with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket this intelligent tiering configuration is associated with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param filter A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(BucketIntelligentTieringConfigurationFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tierings The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder tierings(@Nullable Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings) {
            $.tierings = tierings;
            return this;
        }

        /**
         * @param tierings The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder tierings(List<BucketIntelligentTieringConfigurationTieringArgs> tierings) {
            return tierings(Output.of(tierings));
        }

        /**
         * @param tierings The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder tierings(BucketIntelligentTieringConfigurationTieringArgs... tierings) {
            return tierings(List.of(tierings));
        }

        public BucketIntelligentTieringConfigurationState build() {
            return $;
        }
    }

}
