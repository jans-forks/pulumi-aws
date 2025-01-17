// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { CustomDataIdentifierArgs, CustomDataIdentifierState } from "./customDataIdentifier";
export type CustomDataIdentifier = import("./customDataIdentifier").CustomDataIdentifier;
export const CustomDataIdentifier: typeof import("./customDataIdentifier").CustomDataIdentifier = null as any;

export { FindingsFilterArgs, FindingsFilterState } from "./findingsFilter";
export type FindingsFilter = import("./findingsFilter").FindingsFilter;
export const FindingsFilter: typeof import("./findingsFilter").FindingsFilter = null as any;

export { MemberAccountAssociationArgs, MemberAccountAssociationState } from "./memberAccountAssociation";
export type MemberAccountAssociation = import("./memberAccountAssociation").MemberAccountAssociation;
export const MemberAccountAssociation: typeof import("./memberAccountAssociation").MemberAccountAssociation = null as any;

export { S3BucketAssociationArgs, S3BucketAssociationState } from "./s3bucketAssociation";
export type S3BucketAssociation = import("./s3bucketAssociation").S3BucketAssociation;
export const S3BucketAssociation: typeof import("./s3bucketAssociation").S3BucketAssociation = null as any;

utilities.lazyLoad(exports, ["CustomDataIdentifier"], () => require("./customDataIdentifier"));
utilities.lazyLoad(exports, ["FindingsFilter"], () => require("./findingsFilter"));
utilities.lazyLoad(exports, ["MemberAccountAssociation"], () => require("./memberAccountAssociation"));
utilities.lazyLoad(exports, ["S3BucketAssociation"], () => require("./s3bucketAssociation"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:macie/customDataIdentifier:CustomDataIdentifier":
                return new CustomDataIdentifier(name, <any>undefined, { urn })
            case "aws:macie/findingsFilter:FindingsFilter":
                return new FindingsFilter(name, <any>undefined, { urn })
            case "aws:macie/memberAccountAssociation:MemberAccountAssociation":
                return new MemberAccountAssociation(name, <any>undefined, { urn })
            case "aws:macie/s3BucketAssociation:S3BucketAssociation":
                return new S3BucketAssociation(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "macie/customDataIdentifier", _module)
pulumi.runtime.registerResourceModule("aws", "macie/findingsFilter", _module)
pulumi.runtime.registerResourceModule("aws", "macie/memberAccountAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "macie/s3BucketAssociation", _module)
