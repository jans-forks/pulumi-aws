// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect
{
    /// <summary>
    /// Provides an Amazon Connect Lambda Function Association. For more information see
    /// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Invoke AWS Lambda functions](https://docs.aws.amazon.com/connect/latest/adminguide/connect-lambda-functions.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Connect.LambdaFunctionAssociation("example", new Aws.Connect.LambdaFunctionAssociationArgs
    ///         {
    ///             FunctionArn = aws_lambda_function.Example.Arn,
    ///             InstanceId = aws_connect_instance.Example.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_connect_lambda_function_association` can be imported using the `instance_id` and `function_arn` separated by a comma (`,`) e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation example aaaaaaaa-bbbb-cccc-dddd-111111111111,arn:aws:lambda:us-west-2:123456789123:function:example
    /// ```
    /// </summary>
    [AwsResourceType("aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation")]
    public partial class LambdaFunctionAssociation : Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
        /// </summary>
        [Output("functionArn")]
        public Output<string> FunctionArn { get; private set; } = null!;

        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a LambdaFunctionAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LambdaFunctionAssociation(string name, LambdaFunctionAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation", name, args ?? new LambdaFunctionAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LambdaFunctionAssociation(string name, Input<string> id, LambdaFunctionAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LambdaFunctionAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LambdaFunctionAssociation Get(string name, Input<string> id, LambdaFunctionAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new LambdaFunctionAssociation(name, id, state, options);
        }
    }

    public sealed class LambdaFunctionAssociationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
        /// </summary>
        [Input("functionArn", required: true)]
        public Input<string> FunctionArn { get; set; } = null!;

        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public LambdaFunctionAssociationArgs()
        {
        }
    }

    public sealed class LambdaFunctionAssociationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
        /// </summary>
        [Input("functionArn")]
        public Input<string>? FunctionArn { get; set; }

        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        public LambdaFunctionAssociationState()
        {
        }
    }
}