// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Outputs
{

    [OutputType]
    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData
    {
        /// <summary>
        /// Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
        /// </summary>
        public readonly Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig? ErrorHandlingConfig;
        /// <summary>
        /// Name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete.
        /// </summary>
        public readonly ImmutableArray<string> IdFieldNames;
        /// <summary>
        /// Object path specified in the SAPOData flow source.
        /// </summary>
        public readonly string ObjectPath;
        /// <summary>
        /// Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
        /// </summary>
        public readonly Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig? SuccessResponseHandlingConfig;
        /// <summary>
        /// This specifies the type of write operation to be performed in Zendesk. When the value is `UPSERT`, then `id_field_names` is required. Valid values are `INSERT`, `UPSERT`, `UPDATE`, and `DELETE`.
        /// </summary>
        public readonly string? WriteOperationType;

        [OutputConstructor]
        private FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData(
            Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig? errorHandlingConfig,

            ImmutableArray<string> idFieldNames,

            string objectPath,

            Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig? successResponseHandlingConfig,

            string? writeOperationType)
        {
            ErrorHandlingConfig = errorHandlingConfig;
            IdFieldNames = idFieldNames;
            ObjectPath = objectPath;
            SuccessResponseHandlingConfig = successResponseHandlingConfig;
            WriteOperationType = writeOperationType;
        }
    }
}
