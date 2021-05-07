// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Route 53 Resolver DNS Firewall rule resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleResolverFirewallDomainList = new aws.route53.ResolverFirewallDomainList("exampleResolverFirewallDomainList", {
 *     domains: ["example.com"],
 *     tags: {},
 * });
 * const exampleResolverFirewallRuleGroup = new aws.route53.ResolverFirewallRuleGroup("exampleResolverFirewallRuleGroup", {tags: {}});
 * const exampleResolverFirewallRule = new aws.route53.ResolverFirewallRule("exampleResolverFirewallRule", {
 *     action: "BLOCK",
 *     blockOverrideDnsType: "CNAME",
 *     blockOverrideDomain: "example.com",
 *     blockOverrideTtl: 1,
 *     blockResponse: "OVERRIDE",
 *     firewallDomainListId: exampleResolverFirewallDomainList.id,
 *     firewallRuleGroupId: exampleResolverFirewallRuleGroup.id,
 *     priority: 100,
 * });
 * ```
 *
 * ## Import
 *
 *  Route 53 Resolver DNS Firewall rules can be imported using the Route 53 Resolver DNS Firewall rule group ID and domain list ID separated by ':', e.g.
 *
 * ```sh
 *  $ pulumi import aws:route53/resolverFirewallRule:ResolverFirewallRule example rslvr-frg-0123456789abcdef:rslvr-fdl-0123456789abcdef
 * ```
 */
export class ResolverFirewallRule extends pulumi.CustomResource {
    /**
     * Get an existing ResolverFirewallRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResolverFirewallRuleState, opts?: pulumi.CustomResourceOptions): ResolverFirewallRule {
        return new ResolverFirewallRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53/resolverFirewallRule:ResolverFirewallRule';

    /**
     * Returns true if the given object is an instance of ResolverFirewallRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResolverFirewallRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResolverFirewallRule.__pulumiType;
    }

    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     */
    public readonly blockOverrideDnsType!: pulumi.Output<string | undefined>;
    /**
     * The custom DNS record to send back in response to the query.
     */
    public readonly blockOverrideDomain!: pulumi.Output<string | undefined>;
    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     */
    public readonly blockOverrideTtl!: pulumi.Output<number | undefined>;
    /**
     * The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     */
    public readonly blockResponse!: pulumi.Output<string | undefined>;
    /**
     * The ID of the domain list that you want to use in the rule.
     */
    public readonly firewallDomainListId!: pulumi.Output<string>;
    /**
     * The unique identifier of the firewall rule group where you want to create the rule.
     */
    public readonly firewallRuleGroupId!: pulumi.Output<string>;
    /**
     * A name that lets you identify the rule, to manage and use it.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     */
    public readonly priority!: pulumi.Output<number>;

    /**
     * Create a ResolverFirewallRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResolverFirewallRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResolverFirewallRuleArgs | ResolverFirewallRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResolverFirewallRuleState | undefined;
            inputs["action"] = state ? state.action : undefined;
            inputs["blockOverrideDnsType"] = state ? state.blockOverrideDnsType : undefined;
            inputs["blockOverrideDomain"] = state ? state.blockOverrideDomain : undefined;
            inputs["blockOverrideTtl"] = state ? state.blockOverrideTtl : undefined;
            inputs["blockResponse"] = state ? state.blockResponse : undefined;
            inputs["firewallDomainListId"] = state ? state.firewallDomainListId : undefined;
            inputs["firewallRuleGroupId"] = state ? state.firewallRuleGroupId : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["priority"] = state ? state.priority : undefined;
        } else {
            const args = argsOrState as ResolverFirewallRuleArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.firewallDomainListId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallDomainListId'");
            }
            if ((!args || args.firewallRuleGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallRuleGroupId'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            inputs["action"] = args ? args.action : undefined;
            inputs["blockOverrideDnsType"] = args ? args.blockOverrideDnsType : undefined;
            inputs["blockOverrideDomain"] = args ? args.blockOverrideDomain : undefined;
            inputs["blockOverrideTtl"] = args ? args.blockOverrideTtl : undefined;
            inputs["blockResponse"] = args ? args.blockResponse : undefined;
            inputs["firewallDomainListId"] = args ? args.firewallDomainListId : undefined;
            inputs["firewallRuleGroupId"] = args ? args.firewallRuleGroupId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["priority"] = args ? args.priority : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ResolverFirewallRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResolverFirewallRule resources.
 */
export interface ResolverFirewallRuleState {
    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     */
    readonly action?: pulumi.Input<string>;
    /**
     * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     */
    readonly blockOverrideDnsType?: pulumi.Input<string>;
    /**
     * The custom DNS record to send back in response to the query.
     */
    readonly blockOverrideDomain?: pulumi.Input<string>;
    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     */
    readonly blockOverrideTtl?: pulumi.Input<number>;
    /**
     * The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     */
    readonly blockResponse?: pulumi.Input<string>;
    /**
     * The ID of the domain list that you want to use in the rule.
     */
    readonly firewallDomainListId?: pulumi.Input<string>;
    /**
     * The unique identifier of the firewall rule group where you want to create the rule.
     */
    readonly firewallRuleGroupId?: pulumi.Input<string>;
    /**
     * A name that lets you identify the rule, to manage and use it.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     */
    readonly priority?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ResolverFirewallRule resource.
 */
export interface ResolverFirewallRuleArgs {
    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     */
    readonly action: pulumi.Input<string>;
    /**
     * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     */
    readonly blockOverrideDnsType?: pulumi.Input<string>;
    /**
     * The custom DNS record to send back in response to the query.
     */
    readonly blockOverrideDomain?: pulumi.Input<string>;
    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     */
    readonly blockOverrideTtl?: pulumi.Input<number>;
    /**
     * The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     */
    readonly blockResponse?: pulumi.Input<string>;
    /**
     * The ID of the domain list that you want to use in the rule.
     */
    readonly firewallDomainListId: pulumi.Input<string>;
    /**
     * The unique identifier of the firewall rule group where you want to create the rule.
     */
    readonly firewallRuleGroupId: pulumi.Input<string>;
    /**
     * A name that lets you identify the rule, to manage and use it.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     */
    readonly priority: pulumi.Input<number>;
}