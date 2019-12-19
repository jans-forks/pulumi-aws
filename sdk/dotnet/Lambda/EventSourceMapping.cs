// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda
{
    /// <summary>
    /// Provides a Lambda event source mapping. This allows Lambda functions to get events from Kinesis, DynamoDB and SQS.
    /// 
    /// For information about Lambda and how to use it, see [What is AWS Lambda?][1].
    /// For information about event source mappings, see [CreateEventSourceMapping][2] in the API docs.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/lambda_event_source_mapping.html.markdown.
    /// </summary>
    public partial class EventSourceMapping : Pulumi.CustomResource
    {
        /// <summary>
        /// The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
        /// </summary>
        [Output("batchSize")]
        public Output<int?> BatchSize { get; private set; } = null!;

        /// <summary>
        /// Determines if the mapping will be enabled on creation. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
        /// </summary>
        [Output("eventSourceArn")]
        public Output<string> EventSourceArn { get; private set; } = null!;

        /// <summary>
        /// The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `function_name` above.)
        /// </summary>
        [Output("functionArn")]
        public Output<string> FunctionArn { get; private set; } = null!;

        /// <summary>
        /// The name or the ARN of the Lambda function that will be subscribing to events.
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// The date this resource was last modified.
        /// </summary>
        [Output("lastModified")]
        public Output<string> LastModified { get; private set; } = null!;

        /// <summary>
        /// The result of the last AWS Lambda invocation of your Lambda function.
        /// </summary>
        [Output("lastProcessingResult")]
        public Output<string> LastProcessingResult { get; private set; } = null!;

        /// <summary>
        /// The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximum_batching_window_in_seconds` expires or `batch_size` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
        /// </summary>
        [Output("maximumBatchingWindowInSeconds")]
        public Output<int?> MaximumBatchingWindowInSeconds { get; private set; } = null!;

        /// <summary>
        /// The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
        /// </summary>
        [Output("startingPosition")]
        public Output<string?> StartingPosition { get; private set; } = null!;

        /// <summary>
        /// A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
        /// </summary>
        [Output("startingPositionTimestamp")]
        public Output<string?> StartingPositionTimestamp { get; private set; } = null!;

        /// <summary>
        /// The state of the event source mapping.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The reason the event source mapping is in its current state.
        /// </summary>
        [Output("stateTransitionReason")]
        public Output<string> StateTransitionReason { get; private set; } = null!;

        /// <summary>
        /// The UUID of the created event source mapping.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a EventSourceMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventSourceMapping(string name, EventSourceMappingArgs args, CustomResourceOptions? options = null)
            : base("aws:lambda/eventSourceMapping:EventSourceMapping", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private EventSourceMapping(string name, Input<string> id, EventSourceMappingState? state = null, CustomResourceOptions? options = null)
            : base("aws:lambda/eventSourceMapping:EventSourceMapping", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventSourceMapping Get(string name, Input<string> id, EventSourceMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new EventSourceMapping(name, id, state, options);
        }
    }

    public sealed class EventSourceMappingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
        /// </summary>
        [Input("batchSize")]
        public Input<int>? BatchSize { get; set; }

        /// <summary>
        /// Determines if the mapping will be enabled on creation. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
        /// </summary>
        [Input("eventSourceArn", required: true)]
        public Input<string> EventSourceArn { get; set; } = null!;

        /// <summary>
        /// The name or the ARN of the Lambda function that will be subscribing to events.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        /// <summary>
        /// The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximum_batching_window_in_seconds` expires or `batch_size` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
        /// </summary>
        [Input("maximumBatchingWindowInSeconds")]
        public Input<int>? MaximumBatchingWindowInSeconds { get; set; }

        /// <summary>
        /// The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
        /// </summary>
        [Input("startingPosition")]
        public Input<string>? StartingPosition { get; set; }

        /// <summary>
        /// A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
        /// </summary>
        [Input("startingPositionTimestamp")]
        public Input<string>? StartingPositionTimestamp { get; set; }

        public EventSourceMappingArgs()
        {
        }
    }

    public sealed class EventSourceMappingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
        /// </summary>
        [Input("batchSize")]
        public Input<int>? BatchSize { get; set; }

        /// <summary>
        /// Determines if the mapping will be enabled on creation. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
        /// </summary>
        [Input("eventSourceArn")]
        public Input<string>? EventSourceArn { get; set; }

        /// <summary>
        /// The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `function_name` above.)
        /// </summary>
        [Input("functionArn")]
        public Input<string>? FunctionArn { get; set; }

        /// <summary>
        /// The name or the ARN of the Lambda function that will be subscribing to events.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// The date this resource was last modified.
        /// </summary>
        [Input("lastModified")]
        public Input<string>? LastModified { get; set; }

        /// <summary>
        /// The result of the last AWS Lambda invocation of your Lambda function.
        /// </summary>
        [Input("lastProcessingResult")]
        public Input<string>? LastProcessingResult { get; set; }

        /// <summary>
        /// The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximum_batching_window_in_seconds` expires or `batch_size` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
        /// </summary>
        [Input("maximumBatchingWindowInSeconds")]
        public Input<int>? MaximumBatchingWindowInSeconds { get; set; }

        /// <summary>
        /// The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
        /// </summary>
        [Input("startingPosition")]
        public Input<string>? StartingPosition { get; set; }

        /// <summary>
        /// A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
        /// </summary>
        [Input("startingPositionTimestamp")]
        public Input<string>? StartingPositionTimestamp { get; set; }

        /// <summary>
        /// The state of the event source mapping.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The reason the event source mapping is in its current state.
        /// </summary>
        [Input("stateTransitionReason")]
        public Input<string>? StateTransitionReason { get; set; }

        /// <summary>
        /// The UUID of the created event source mapping.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public EventSourceMappingState()
        {
        }
    }
}