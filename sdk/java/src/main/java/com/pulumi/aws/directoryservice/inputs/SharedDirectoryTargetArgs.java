// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedDirectoryTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedDirectoryTargetArgs Empty = new SharedDirectoryTargetArgs();

    /**
     * Identifier of the directory consumer account.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Identifier of the directory consumer account.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Type of identifier to be used in the `id` field. Valid value is `ACCOUNT`. Default is `ACCOUNT`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of identifier to be used in the `id` field. Valid value is `ACCOUNT`. Default is `ACCOUNT`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SharedDirectoryTargetArgs() {}

    private SharedDirectoryTargetArgs(SharedDirectoryTargetArgs $) {
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedDirectoryTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedDirectoryTargetArgs $;

        public Builder() {
            $ = new SharedDirectoryTargetArgs();
        }

        public Builder(SharedDirectoryTargetArgs defaults) {
            $ = new SharedDirectoryTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Identifier of the directory consumer account.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the directory consumer account.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param type Type of identifier to be used in the `id` field. Valid value is `ACCOUNT`. Default is `ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of identifier to be used in the `id` field. Valid value is `ACCOUNT`. Default is `ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SharedDirectoryTargetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
