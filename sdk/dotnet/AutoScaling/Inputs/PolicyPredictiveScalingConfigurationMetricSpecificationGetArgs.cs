// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The load metric specification.
        /// </summary>
        [Input("predefinedLoadMetricSpecification")]
        public Input<Inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs>? PredefinedLoadMetricSpecification { get; set; }

        /// <summary>
        /// The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
        /// </summary>
        [Input("predefinedMetricPairSpecification")]
        public Input<Inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs>? PredefinedMetricPairSpecification { get; set; }

        /// <summary>
        /// The scaling metric specification.
        /// </summary>
        [Input("predefinedScalingMetricSpecification")]
        public Input<Inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs>? PredefinedScalingMetricSpecification { get; set; }

        /// <summary>
        /// The target value for the metric.
        /// </summary>
        [Input("targetValue", required: true)]
        public Input<int> TargetValue { get; set; } = null!;

        public PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs()
        {
        }
    }
}