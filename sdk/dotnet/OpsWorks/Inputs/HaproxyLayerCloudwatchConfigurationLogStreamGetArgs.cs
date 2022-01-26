// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpsWorks.Inputs
{

    public sealed class HaproxyLayerCloudwatchConfigurationLogStreamGetArgs : Pulumi.ResourceArgs
    {
        [Input("batchCount")]
        public Input<int>? BatchCount { get; set; }

        [Input("batchSize")]
        public Input<int>? BatchSize { get; set; }

        [Input("bufferDuration")]
        public Input<int>? BufferDuration { get; set; }

        [Input("datetimeFormat")]
        public Input<string>? DatetimeFormat { get; set; }

        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        [Input("file", required: true)]
        public Input<string> File { get; set; } = null!;

        [Input("fileFingerprintLines")]
        public Input<string>? FileFingerprintLines { get; set; }

        [Input("initialPosition")]
        public Input<string>? InitialPosition { get; set; }

        [Input("logGroupName", required: true)]
        public Input<string> LogGroupName { get; set; } = null!;

        [Input("multilineStartPattern")]
        public Input<string>? MultilineStartPattern { get; set; }

        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public HaproxyLayerCloudwatchConfigurationLogStreamGetArgs()
        {
        }
    }
}