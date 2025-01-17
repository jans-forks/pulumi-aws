// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningJobDestinationS3Args extends com.pulumi.resources.ResourceArgs {

    public static final SigningJobDestinationS3Args Empty = new SigningJobDestinationS3Args();

    /**
     * Name of the S3 bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Name of the S3 bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private SigningJobDestinationS3Args() {}

    private SigningJobDestinationS3Args(SigningJobDestinationS3Args $) {
        this.bucket = $.bucket;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningJobDestinationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningJobDestinationS3Args $;

        public Builder() {
            $ = new SigningJobDestinationS3Args();
        }

        public Builder(SigningJobDestinationS3Args defaults) {
            $ = new SigningJobDestinationS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Name of the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Name of the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param prefix An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public SigningJobDestinationS3Args build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
