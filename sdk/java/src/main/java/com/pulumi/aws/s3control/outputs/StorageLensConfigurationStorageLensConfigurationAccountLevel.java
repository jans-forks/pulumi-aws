// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.aws.s3control.outputs.StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetrics;
import com.pulumi.aws.s3control.outputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevel;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageLensConfigurationStorageLensConfigurationAccountLevel {
    /**
     * @return S3 Storage Lens activity metrics. See Activity Metrics below for more details.
     * 
     */
    private @Nullable StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetrics activityMetrics;
    /**
     * @return S3 Storage Lens bucket-level configuration. See Bucket Level below for more details.
     * 
     */
    private StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevel bucketLevel;

    private StorageLensConfigurationStorageLensConfigurationAccountLevel() {}
    /**
     * @return S3 Storage Lens activity metrics. See Activity Metrics below for more details.
     * 
     */
    public Optional<StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetrics> activityMetrics() {
        return Optional.ofNullable(this.activityMetrics);
    }
    /**
     * @return S3 Storage Lens bucket-level configuration. See Bucket Level below for more details.
     * 
     */
    public StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevel bucketLevel() {
        return this.bucketLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensConfigurationStorageLensConfigurationAccountLevel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetrics activityMetrics;
        private StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevel bucketLevel;
        public Builder() {}
        public Builder(StorageLensConfigurationStorageLensConfigurationAccountLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityMetrics = defaults.activityMetrics;
    	      this.bucketLevel = defaults.bucketLevel;
        }

        @CustomType.Setter
        public Builder activityMetrics(@Nullable StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetrics activityMetrics) {
            this.activityMetrics = activityMetrics;
            return this;
        }
        @CustomType.Setter
        public Builder bucketLevel(StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevel bucketLevel) {
            this.bucketLevel = Objects.requireNonNull(bucketLevel);
            return this;
        }
        public StorageLensConfigurationStorageLensConfigurationAccountLevel build() {
            final var o = new StorageLensConfigurationStorageLensConfigurationAccountLevel();
            o.activityMetrics = activityMetrics;
            o.bucketLevel = bucketLevel;
            return o;
        }
    }
}
