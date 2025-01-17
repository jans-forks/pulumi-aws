// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AcceleratorArgs, AcceleratorState } from "./accelerator";
export type Accelerator = import("./accelerator").Accelerator;
export const Accelerator: typeof import("./accelerator").Accelerator = null as any;

export { EndpointGroupArgs, EndpointGroupState } from "./endpointGroup";
export type EndpointGroup = import("./endpointGroup").EndpointGroup;
export const EndpointGroup: typeof import("./endpointGroup").EndpointGroup = null as any;

export { GetAcceleratorArgs, GetAcceleratorResult, GetAcceleratorOutputArgs } from "./getAccelerator";
export const getAccelerator: typeof import("./getAccelerator").getAccelerator = null as any;
export const getAcceleratorOutput: typeof import("./getAccelerator").getAcceleratorOutput = null as any;

export { ListenerArgs, ListenerState } from "./listener";
export type Listener = import("./listener").Listener;
export const Listener: typeof import("./listener").Listener = null as any;

utilities.lazyLoad(exports, ["Accelerator"], () => require("./accelerator"));
utilities.lazyLoad(exports, ["EndpointGroup"], () => require("./endpointGroup"));
utilities.lazyLoad(exports, ["getAccelerator","getAcceleratorOutput"], () => require("./getAccelerator"));
utilities.lazyLoad(exports, ["Listener"], () => require("./listener"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:globalaccelerator/accelerator:Accelerator":
                return new Accelerator(name, <any>undefined, { urn })
            case "aws:globalaccelerator/endpointGroup:EndpointGroup":
                return new EndpointGroup(name, <any>undefined, { urn })
            case "aws:globalaccelerator/listener:Listener":
                return new Listener(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "globalaccelerator/accelerator", _module)
pulumi.runtime.registerResourceModule("aws", "globalaccelerator/endpointGroup", _module)
pulumi.runtime.registerResourceModule("aws", "globalaccelerator/listener", _module)
