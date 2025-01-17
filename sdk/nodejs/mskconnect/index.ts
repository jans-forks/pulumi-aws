// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ConnectorArgs, ConnectorState } from "./connector";
export type Connector = import("./connector").Connector;
export const Connector: typeof import("./connector").Connector = null as any;

export { CustomPluginArgs, CustomPluginState } from "./customPlugin";
export type CustomPlugin = import("./customPlugin").CustomPlugin;
export const CustomPlugin: typeof import("./customPlugin").CustomPlugin = null as any;

export { GetConnectorArgs, GetConnectorResult, GetConnectorOutputArgs } from "./getConnector";
export const getConnector: typeof import("./getConnector").getConnector = null as any;
export const getConnectorOutput: typeof import("./getConnector").getConnectorOutput = null as any;

export { GetCustomPluginArgs, GetCustomPluginResult, GetCustomPluginOutputArgs } from "./getCustomPlugin";
export const getCustomPlugin: typeof import("./getCustomPlugin").getCustomPlugin = null as any;
export const getCustomPluginOutput: typeof import("./getCustomPlugin").getCustomPluginOutput = null as any;

export { GetWorkerConfigurationArgs, GetWorkerConfigurationResult, GetWorkerConfigurationOutputArgs } from "./getWorkerConfiguration";
export const getWorkerConfiguration: typeof import("./getWorkerConfiguration").getWorkerConfiguration = null as any;
export const getWorkerConfigurationOutput: typeof import("./getWorkerConfiguration").getWorkerConfigurationOutput = null as any;

export { WorkerConfigurationArgs, WorkerConfigurationState } from "./workerConfiguration";
export type WorkerConfiguration = import("./workerConfiguration").WorkerConfiguration;
export const WorkerConfiguration: typeof import("./workerConfiguration").WorkerConfiguration = null as any;

utilities.lazyLoad(exports, ["Connector"], () => require("./connector"));
utilities.lazyLoad(exports, ["CustomPlugin"], () => require("./customPlugin"));
utilities.lazyLoad(exports, ["getConnector","getConnectorOutput"], () => require("./getConnector"));
utilities.lazyLoad(exports, ["getCustomPlugin","getCustomPluginOutput"], () => require("./getCustomPlugin"));
utilities.lazyLoad(exports, ["getWorkerConfiguration","getWorkerConfigurationOutput"], () => require("./getWorkerConfiguration"));
utilities.lazyLoad(exports, ["WorkerConfiguration"], () => require("./workerConfiguration"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:mskconnect/connector:Connector":
                return new Connector(name, <any>undefined, { urn })
            case "aws:mskconnect/customPlugin:CustomPlugin":
                return new CustomPlugin(name, <any>undefined, { urn })
            case "aws:mskconnect/workerConfiguration:WorkerConfiguration":
                return new WorkerConfiguration(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "mskconnect/connector", _module)
pulumi.runtime.registerResourceModule("aws", "mskconnect/customPlugin", _module)
pulumi.runtime.registerResourceModule("aws", "mskconnect/workerConfiguration", _module)
