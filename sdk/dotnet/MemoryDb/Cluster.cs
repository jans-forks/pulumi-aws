// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MemoryDb
{
    /// <summary>
    /// Provides a MemoryDB Cluster.
    /// 
    /// More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
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
    ///         var example = new Aws.MemoryDb.Cluster("example", new Aws.MemoryDb.ClusterArgs
    ///         {
    ///             AclName = "open-access",
    ///             NodeType = "db.t4g.small",
    ///             NumShards = 2,
    ///             SecurityGroupIds = 
    ///             {
    ///                 aws_security_group.Example.Id,
    ///             },
    ///             SnapshotRetentionLimit = 7,
    ///             SubnetGroupName = aws_memorydb_subnet_group.Example.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Use the `name` to import a cluster. For example
    /// 
    /// ```sh
    ///  $ pulumi import aws:memorydb/cluster:Cluster example my-cluster
    /// ```
    /// </summary>
    [AwsResourceType("aws:memorydb/cluster:Cluster")]
    public partial class Cluster : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Access Control List to associate with the cluster.
        /// </summary>
        [Output("aclName")]
        public Output<string> AclName { get; private set; } = null!;

        /// <summary>
        /// The ARN of the cluster.
        /// * `cluster_endpoint`
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
        /// </summary>
        [Output("autoMinorVersionUpgrade")]
        public Output<bool?> AutoMinorVersionUpgrade { get; private set; } = null!;

        [Output("clusterEndpoints")]
        public Output<ImmutableArray<Outputs.ClusterClusterEndpoint>> ClusterEndpoints { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Patch version number of the Redis engine used by the cluster.
        /// </summary>
        [Output("enginePatchVersion")]
        public Output<string> EnginePatchVersion { get; private set; } = null!;

        /// <summary>
        /// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
        /// </summary>
        [Output("finalSnapshotName")]
        public Output<string?> FinalSnapshotName { get; private set; } = null!;

        /// <summary>
        /// ARN of the KMS key used to encrypt the cluster at rest.
        /// </summary>
        [Output("kmsKeyArn")]
        public Output<string?> KmsKeyArn { get; private set; } = null!;

        /// <summary>
        /// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
        /// </summary>
        [Output("maintenanceWindow")]
        public Output<string> MaintenanceWindow { get; private set; } = null!;

        /// <summary>
        /// Name of this node.
        /// * `endpoint`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
        /// </summary>
        [Output("nodeType")]
        public Output<string> NodeType { get; private set; } = null!;

        /// <summary>
        /// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
        /// </summary>
        [Output("numReplicasPerShard")]
        public Output<int?> NumReplicasPerShard { get; private set; } = null!;

        /// <summary>
        /// The number of shards in the cluster. Defaults to `1`.
        /// </summary>
        [Output("numShards")]
        public Output<int?> NumShards { get; private set; } = null!;

        /// <summary>
        /// The name of the parameter group associated with the cluster.
        /// </summary>
        [Output("parameterGroupName")]
        public Output<string> ParameterGroupName { get; private set; } = null!;

        /// <summary>
        /// The port number on which each of the nodes accepts connections. Defaults to `6379`.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// Set of VPC Security Group ID-s to associate with this cluster.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// Set of shards in this cluster.
        /// </summary>
        [Output("shards")]
        public Output<ImmutableArray<Outputs.ClusterShard>> Shards { get; private set; } = null!;

        /// <summary>
        /// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
        /// </summary>
        [Output("snapshotArns")]
        public Output<string?> SnapshotArns { get; private set; } = null!;

        /// <summary>
        /// The name of a snapshot from which to restore data into the new cluster.
        /// </summary>
        [Output("snapshotName")]
        public Output<string?> SnapshotName { get; private set; } = null!;

        /// <summary>
        /// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
        /// </summary>
        [Output("snapshotRetentionLimit")]
        public Output<int> SnapshotRetentionLimit { get; private set; } = null!;

        /// <summary>
        /// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
        /// </summary>
        [Output("snapshotWindow")]
        public Output<string> SnapshotWindow { get; private set; } = null!;

        /// <summary>
        /// ARN of the SNS topic to which cluster notifications are sent.
        /// </summary>
        [Output("snsTopicArn")]
        public Output<string?> SnsTopicArn { get; private set; } = null!;

        /// <summary>
        /// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
        /// </summary>
        [Output("subnetGroupName")]
        public Output<string> SubnetGroupName { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// A flag to enable in-transit encryption on the cluster. When set to `false`, the `acl_name` must be `open-access`. Defaults to `true`.
        /// </summary>
        [Output("tlsEnabled")]
        public Output<bool?> TlsEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("aws:memorydb/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:memorydb/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Access Control List to associate with the cluster.
        /// </summary>
        [Input("aclName", required: true)]
        public Input<string> AclName { get; set; } = null!;

        /// <summary>
        /// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
        /// </summary>
        [Input("autoMinorVersionUpgrade")]
        public Input<bool>? AutoMinorVersionUpgrade { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
        /// </summary>
        [Input("finalSnapshotName")]
        public Input<string>? FinalSnapshotName { get; set; }

        /// <summary>
        /// ARN of the KMS key used to encrypt the cluster at rest.
        /// </summary>
        [Input("kmsKeyArn")]
        public Input<string>? KmsKeyArn { get; set; }

        /// <summary>
        /// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
        /// </summary>
        [Input("maintenanceWindow")]
        public Input<string>? MaintenanceWindow { get; set; }

        /// <summary>
        /// Name of this node.
        /// * `endpoint`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
        /// </summary>
        [Input("nodeType", required: true)]
        public Input<string> NodeType { get; set; } = null!;

        /// <summary>
        /// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
        /// </summary>
        [Input("numReplicasPerShard")]
        public Input<int>? NumReplicasPerShard { get; set; }

        /// <summary>
        /// The number of shards in the cluster. Defaults to `1`.
        /// </summary>
        [Input("numShards")]
        public Input<int>? NumShards { get; set; }

        /// <summary>
        /// The name of the parameter group associated with the cluster.
        /// </summary>
        [Input("parameterGroupName")]
        public Input<string>? ParameterGroupName { get; set; }

        /// <summary>
        /// The port number on which each of the nodes accepts connections. Defaults to `6379`.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// Set of VPC Security Group ID-s to associate with this cluster.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
        /// </summary>
        [Input("snapshotArns")]
        public Input<string>? SnapshotArns { get; set; }

        /// <summary>
        /// The name of a snapshot from which to restore data into the new cluster.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        /// <summary>
        /// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
        /// </summary>
        [Input("snapshotRetentionLimit")]
        public Input<int>? SnapshotRetentionLimit { get; set; }

        /// <summary>
        /// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
        /// </summary>
        [Input("snapshotWindow")]
        public Input<string>? SnapshotWindow { get; set; }

        /// <summary>
        /// ARN of the SNS topic to which cluster notifications are sent.
        /// </summary>
        [Input("snsTopicArn")]
        public Input<string>? SnsTopicArn { get; set; }

        /// <summary>
        /// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
        /// </summary>
        [Input("subnetGroupName")]
        public Input<string>? SubnetGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// A flag to enable in-transit encryption on the cluster. When set to `false`, the `acl_name` must be `open-access`. Defaults to `true`.
        /// </summary>
        [Input("tlsEnabled")]
        public Input<bool>? TlsEnabled { get; set; }

        public ClusterArgs()
        {
        }
    }

    public sealed class ClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Access Control List to associate with the cluster.
        /// </summary>
        [Input("aclName")]
        public Input<string>? AclName { get; set; }

        /// <summary>
        /// The ARN of the cluster.
        /// * `cluster_endpoint`
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
        /// </summary>
        [Input("autoMinorVersionUpgrade")]
        public Input<bool>? AutoMinorVersionUpgrade { get; set; }

        [Input("clusterEndpoints")]
        private InputList<Inputs.ClusterClusterEndpointGetArgs>? _clusterEndpoints;
        public InputList<Inputs.ClusterClusterEndpointGetArgs> ClusterEndpoints
        {
            get => _clusterEndpoints ?? (_clusterEndpoints = new InputList<Inputs.ClusterClusterEndpointGetArgs>());
            set => _clusterEndpoints = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Patch version number of the Redis engine used by the cluster.
        /// </summary>
        [Input("enginePatchVersion")]
        public Input<string>? EnginePatchVersion { get; set; }

        /// <summary>
        /// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
        /// </summary>
        [Input("finalSnapshotName")]
        public Input<string>? FinalSnapshotName { get; set; }

        /// <summary>
        /// ARN of the KMS key used to encrypt the cluster at rest.
        /// </summary>
        [Input("kmsKeyArn")]
        public Input<string>? KmsKeyArn { get; set; }

        /// <summary>
        /// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
        /// </summary>
        [Input("maintenanceWindow")]
        public Input<string>? MaintenanceWindow { get; set; }

        /// <summary>
        /// Name of this node.
        /// * `endpoint`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
        /// </summary>
        [Input("nodeType")]
        public Input<string>? NodeType { get; set; }

        /// <summary>
        /// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
        /// </summary>
        [Input("numReplicasPerShard")]
        public Input<int>? NumReplicasPerShard { get; set; }

        /// <summary>
        /// The number of shards in the cluster. Defaults to `1`.
        /// </summary>
        [Input("numShards")]
        public Input<int>? NumShards { get; set; }

        /// <summary>
        /// The name of the parameter group associated with the cluster.
        /// </summary>
        [Input("parameterGroupName")]
        public Input<string>? ParameterGroupName { get; set; }

        /// <summary>
        /// The port number on which each of the nodes accepts connections. Defaults to `6379`.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// Set of VPC Security Group ID-s to associate with this cluster.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("shards")]
        private InputList<Inputs.ClusterShardGetArgs>? _shards;

        /// <summary>
        /// Set of shards in this cluster.
        /// </summary>
        public InputList<Inputs.ClusterShardGetArgs> Shards
        {
            get => _shards ?? (_shards = new InputList<Inputs.ClusterShardGetArgs>());
            set => _shards = value;
        }

        /// <summary>
        /// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
        /// </summary>
        [Input("snapshotArns")]
        public Input<string>? SnapshotArns { get; set; }

        /// <summary>
        /// The name of a snapshot from which to restore data into the new cluster.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        /// <summary>
        /// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
        /// </summary>
        [Input("snapshotRetentionLimit")]
        public Input<int>? SnapshotRetentionLimit { get; set; }

        /// <summary>
        /// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
        /// </summary>
        [Input("snapshotWindow")]
        public Input<string>? SnapshotWindow { get; set; }

        /// <summary>
        /// ARN of the SNS topic to which cluster notifications are sent.
        /// </summary>
        [Input("snsTopicArn")]
        public Input<string>? SnsTopicArn { get; set; }

        /// <summary>
        /// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
        /// </summary>
        [Input("subnetGroupName")]
        public Input<string>? SubnetGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// A flag to enable in-transit encryption on the cluster. When set to `false`, the `acl_name` must be `open-access`. Defaults to `true`.
        /// </summary>
        [Input("tlsEnabled")]
        public Input<bool>? TlsEnabled { get; set; }

        public ClusterState()
        {
        }
    }
}