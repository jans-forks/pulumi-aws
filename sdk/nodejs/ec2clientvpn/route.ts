// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides additional routes for AWS Client VPN endpoints. For more information on usage, please see the
 * [AWS Client VPN Administrator's Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleEndpoint = new aws.ec2clientvpn.Endpoint("exampleEndpoint", {
 *     description: "Example Client VPN endpoint",
 *     serverCertificateArn: aws_acm_certificate.example.arn,
 *     clientCidrBlock: "10.0.0.0/16",
 *     authenticationOptions: [{
 *         type: "certificate-authentication",
 *         rootCertificateChainArn: aws_acm_certificate.example.arn,
 *     }],
 *     connectionLogOptions: {
 *         enabled: false,
 *     },
 * });
 * const exampleNetworkAssociation = new aws.ec2clientvpn.NetworkAssociation("exampleNetworkAssociation", {
 *     clientVpnEndpointId: exampleEndpoint.id,
 *     subnetId: aws_subnet.example.id,
 * });
 * const exampleRoute = new aws.ec2clientvpn.Route("exampleRoute", {
 *     clientVpnEndpointId: exampleEndpoint.id,
 *     destinationCidrBlock: "0.0.0.0/0",
 *     targetVpcSubnetId: exampleNetworkAssociation.subnetId,
 * });
 * ```
 */
export class Route extends pulumi.CustomResource {
    /**
     * Get an existing Route resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteState, opts?: pulumi.CustomResourceOptions): Route {
        return new Route(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2clientvpn/route:Route';

    /**
     * Returns true if the given object is an instance of Route.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Route {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Route.__pulumiType;
    }

    /**
     * The ID of the Client VPN endpoint.
     */
    public readonly clientVpnEndpointId!: pulumi.Output<string>;
    /**
     * A brief description of the authorization rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     */
    public readonly destinationCidrBlock!: pulumi.Output<string>;
    /**
     * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
     */
    public /*out*/ readonly origin!: pulumi.Output<string>;
    /**
     * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     */
    public readonly targetVpcSubnetId!: pulumi.Output<string>;
    /**
     * The type of the route.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a Route resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteArgs | RouteState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RouteState | undefined;
            inputs["clientVpnEndpointId"] = state ? state.clientVpnEndpointId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["destinationCidrBlock"] = state ? state.destinationCidrBlock : undefined;
            inputs["origin"] = state ? state.origin : undefined;
            inputs["targetVpcSubnetId"] = state ? state.targetVpcSubnetId : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as RouteArgs | undefined;
            if (!args || args.clientVpnEndpointId === undefined) {
                throw new Error("Missing required property 'clientVpnEndpointId'");
            }
            if (!args || args.destinationCidrBlock === undefined) {
                throw new Error("Missing required property 'destinationCidrBlock'");
            }
            if (!args || args.targetVpcSubnetId === undefined) {
                throw new Error("Missing required property 'targetVpcSubnetId'");
            }
            inputs["clientVpnEndpointId"] = args ? args.clientVpnEndpointId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["destinationCidrBlock"] = args ? args.destinationCidrBlock : undefined;
            inputs["targetVpcSubnetId"] = args ? args.targetVpcSubnetId : undefined;
            inputs["origin"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Route.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Route resources.
 */
export interface RouteState {
    /**
     * The ID of the Client VPN endpoint.
     */
    readonly clientVpnEndpointId?: pulumi.Input<string>;
    /**
     * A brief description of the authorization rule.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     */
    readonly destinationCidrBlock?: pulumi.Input<string>;
    /**
     * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
     */
    readonly origin?: pulumi.Input<string>;
    /**
     * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     */
    readonly targetVpcSubnetId?: pulumi.Input<string>;
    /**
     * The type of the route.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Route resource.
 */
export interface RouteArgs {
    /**
     * The ID of the Client VPN endpoint.
     */
    readonly clientVpnEndpointId: pulumi.Input<string>;
    /**
     * A brief description of the authorization rule.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     */
    readonly destinationCidrBlock: pulumi.Input<string>;
    /**
     * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     */
    readonly targetVpcSubnetId: pulumi.Input<string>;
}