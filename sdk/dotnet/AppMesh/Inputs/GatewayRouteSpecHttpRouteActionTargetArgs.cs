// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecHttpRouteActionTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Virtual service gateway route target.
        /// </summary>
        [Input("virtualService", required: true)]
        public Input<Inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> VirtualService { get; set; } = null!;

        public GatewayRouteSpecHttpRouteActionTargetArgs()
        {
        }
        public static new GatewayRouteSpecHttpRouteActionTargetArgs Empty => new GatewayRouteSpecHttpRouteActionTargetArgs();
    }
}
