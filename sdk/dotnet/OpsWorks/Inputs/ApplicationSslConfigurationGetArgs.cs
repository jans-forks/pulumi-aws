// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpsWorks.Inputs
{

    public sealed class ApplicationSslConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The contents of the certificate's domain.crt file.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// Can be used to specify an intermediate certificate authority key or client authentication.
        /// </summary>
        [Input("chain")]
        public Input<string>? Chain { get; set; }

        /// <summary>
        /// The private key; the contents of the certificate's domain.key file.
        /// </summary>
        [Input("privateKey", required: true)]
        public Input<string> PrivateKey { get; set; } = null!;

        public ApplicationSslConfigurationGetArgs()
        {
        }
        public static new ApplicationSslConfigurationGetArgs Empty => new ApplicationSslConfigurationGetArgs();
    }
}
