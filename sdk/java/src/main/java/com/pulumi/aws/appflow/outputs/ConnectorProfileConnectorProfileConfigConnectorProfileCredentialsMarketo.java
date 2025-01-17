// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo {
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return The identifier for the desired client.
     * 
     */
    private String clientId;
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    private String clientSecret;
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest oauthRequest;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo() {}
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The identifier for the desired client.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest oauthRequest;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.oauthRequest = defaults.oauthRequest;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo();
            o.accessToken = accessToken;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.oauthRequest = oauthRequest;
            return o;
        }
    }
}
