// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    private @Nullable List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeader> headers;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchUriPath uriPath;

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchCookies cookies;
        private @Nullable List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeader> headers;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchJsonBody jsonBody;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatch build() {
            final var o = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.cookies = cookies;
            o.headers = headers;
            o.jsonBody = jsonBody;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}
