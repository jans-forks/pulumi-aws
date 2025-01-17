// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectSecondarySourceAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSecondarySourceAuthArgs Empty = new ProjectSecondarySourceAuthArgs();

    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Output<String> type() {
        return this.type;
    }

    private ProjectSecondarySourceAuthArgs() {}

    private ProjectSecondarySourceAuthArgs(ProjectSecondarySourceAuthArgs $) {
        this.resource = $.resource;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSecondarySourceAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSecondarySourceAuthArgs $;

        public Builder() {
            $ = new ProjectSecondarySourceAuthArgs();
        }

        public Builder(ProjectSecondarySourceAuthArgs defaults) {
            $ = new ProjectSecondarySourceAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resource Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_codebuild_source_credential resource instead
         * 
         */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_codebuild_source_credential resource instead
         * 
         */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_codebuild_source_credential resource instead
         * 
         */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_codebuild_source_credential resource instead
         * 
         */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProjectSecondarySourceAuthArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
