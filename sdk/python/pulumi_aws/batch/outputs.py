# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'ComputeEnvironmentComputeResources',
    'ComputeEnvironmentComputeResourcesEc2Configuration',
    'ComputeEnvironmentComputeResourcesLaunchTemplate',
    'JobDefinitionRetryStrategy',
    'JobDefinitionRetryStrategyEvaluateOnExit',
    'JobDefinitionTimeout',
    'SchedulingPolicyFairSharePolicy',
    'SchedulingPolicyFairSharePolicyShareDistribution',
    'GetJobQueueComputeEnvironmentOrderResult',
    'GetSchedulingPolicyFairSharePolicyResult',
    'GetSchedulingPolicyFairSharePolicyShareDistributionResult',
]

@pulumi.output_type
class ComputeEnvironmentComputeResources(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "maxVcpus":
            suggest = "max_vcpus"
        elif key == "securityGroupIds":
            suggest = "security_group_ids"
        elif key == "allocationStrategy":
            suggest = "allocation_strategy"
        elif key == "bidPercentage":
            suggest = "bid_percentage"
        elif key == "desiredVcpus":
            suggest = "desired_vcpus"
        elif key == "ec2Configuration":
            suggest = "ec2_configuration"
        elif key == "ec2KeyPair":
            suggest = "ec2_key_pair"
        elif key == "imageId":
            suggest = "image_id"
        elif key == "instanceRole":
            suggest = "instance_role"
        elif key == "instanceTypes":
            suggest = "instance_types"
        elif key == "launchTemplate":
            suggest = "launch_template"
        elif key == "minVcpus":
            suggest = "min_vcpus"
        elif key == "spotIamFleetRole":
            suggest = "spot_iam_fleet_role"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ComputeEnvironmentComputeResources. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ComputeEnvironmentComputeResources.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ComputeEnvironmentComputeResources.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 max_vcpus: int,
                 security_group_ids: Sequence[str],
                 subnets: Sequence[str],
                 type: str,
                 allocation_strategy: Optional[str] = None,
                 bid_percentage: Optional[int] = None,
                 desired_vcpus: Optional[int] = None,
                 ec2_configuration: Optional['outputs.ComputeEnvironmentComputeResourcesEc2Configuration'] = None,
                 ec2_key_pair: Optional[str] = None,
                 image_id: Optional[str] = None,
                 instance_role: Optional[str] = None,
                 instance_types: Optional[Sequence[str]] = None,
                 launch_template: Optional['outputs.ComputeEnvironmentComputeResourcesLaunchTemplate'] = None,
                 min_vcpus: Optional[int] = None,
                 spot_iam_fleet_role: Optional[str] = None,
                 tags: Optional[Mapping[str, str]] = None):
        """
        :param int max_vcpus: The maximum number of EC2 vCPUs that an environment can reach.
        :param Sequence[str] security_group_ids: A list of EC2 security group that are associated with instances launched in the compute environment.
        :param Sequence[str] subnets: A list of VPC subnets into which the compute resources are launched.
        :param str type: The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
        :param str allocation_strategy: The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param int bid_percentage: Integer of maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. If you leave this field empty, the default value is 100% of the On-Demand price. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param int desired_vcpus: The desired number of EC2 vCPUS in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param 'ComputeEnvironmentComputeResourcesEc2ConfigurationArgs' ec2_configuration: Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.
        :param str ec2_key_pair: The EC2 key pair that is used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param str image_id: The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified. (Deprecated, use `ec2_configuration` `image_id_override` instead)
        :param str instance_role: The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param Sequence[str] instance_types: A list of instance types that may be launched. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param 'ComputeEnvironmentComputeResourcesLaunchTemplateArgs' launch_template: The launch template to use for your compute resources. See details below. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param int min_vcpus: The minimum number of EC2 vCPUs that an environment should maintain. For `EC2` or `SPOT` compute environments, if the parameter is not explicitly defined, a `0` default value will be set. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param str spot_iam_fleet_role: The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        :param Mapping[str, str] tags: Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        pulumi.set(__self__, "max_vcpus", max_vcpus)
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        pulumi.set(__self__, "subnets", subnets)
        pulumi.set(__self__, "type", type)
        if allocation_strategy is not None:
            pulumi.set(__self__, "allocation_strategy", allocation_strategy)
        if bid_percentage is not None:
            pulumi.set(__self__, "bid_percentage", bid_percentage)
        if desired_vcpus is not None:
            pulumi.set(__self__, "desired_vcpus", desired_vcpus)
        if ec2_configuration is not None:
            pulumi.set(__self__, "ec2_configuration", ec2_configuration)
        if ec2_key_pair is not None:
            pulumi.set(__self__, "ec2_key_pair", ec2_key_pair)
        if image_id is not None:
            pulumi.set(__self__, "image_id", image_id)
        if instance_role is not None:
            pulumi.set(__self__, "instance_role", instance_role)
        if instance_types is not None:
            pulumi.set(__self__, "instance_types", instance_types)
        if launch_template is not None:
            pulumi.set(__self__, "launch_template", launch_template)
        if min_vcpus is not None:
            pulumi.set(__self__, "min_vcpus", min_vcpus)
        if spot_iam_fleet_role is not None:
            pulumi.set(__self__, "spot_iam_fleet_role", spot_iam_fleet_role)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="maxVcpus")
    def max_vcpus(self) -> int:
        """
        The maximum number of EC2 vCPUs that an environment can reach.
        """
        return pulumi.get(self, "max_vcpus")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        A list of EC2 security group that are associated with instances launched in the compute environment.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter
    def subnets(self) -> Sequence[str]:
        """
        A list of VPC subnets into which the compute resources are launched.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="allocationStrategy")
    def allocation_strategy(self) -> Optional[str]:
        """
        The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "allocation_strategy")

    @property
    @pulumi.getter(name="bidPercentage")
    def bid_percentage(self) -> Optional[int]:
        """
        Integer of maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. If you leave this field empty, the default value is 100% of the On-Demand price. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "bid_percentage")

    @property
    @pulumi.getter(name="desiredVcpus")
    def desired_vcpus(self) -> Optional[int]:
        """
        The desired number of EC2 vCPUS in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "desired_vcpus")

    @property
    @pulumi.getter(name="ec2Configuration")
    def ec2_configuration(self) -> Optional['outputs.ComputeEnvironmentComputeResourcesEc2Configuration']:
        """
        Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "ec2_configuration")

    @property
    @pulumi.getter(name="ec2KeyPair")
    def ec2_key_pair(self) -> Optional[str]:
        """
        The EC2 key pair that is used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "ec2_key_pair")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> Optional[str]:
        """
        The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified. (Deprecated, use `ec2_configuration` `image_id_override` instead)
        """
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="instanceRole")
    def instance_role(self) -> Optional[str]:
        """
        The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "instance_role")

    @property
    @pulumi.getter(name="instanceTypes")
    def instance_types(self) -> Optional[Sequence[str]]:
        """
        A list of instance types that may be launched. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "instance_types")

    @property
    @pulumi.getter(name="launchTemplate")
    def launch_template(self) -> Optional['outputs.ComputeEnvironmentComputeResourcesLaunchTemplate']:
        """
        The launch template to use for your compute resources. See details below. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "launch_template")

    @property
    @pulumi.getter(name="minVcpus")
    def min_vcpus(self) -> Optional[int]:
        """
        The minimum number of EC2 vCPUs that an environment should maintain. For `EC2` or `SPOT` compute environments, if the parameter is not explicitly defined, a `0` default value will be set. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "min_vcpus")

    @property
    @pulumi.getter(name="spotIamFleetRole")
    def spot_iam_fleet_role(self) -> Optional[str]:
        """
        The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "spot_iam_fleet_role")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
        """
        return pulumi.get(self, "tags")


@pulumi.output_type
class ComputeEnvironmentComputeResourcesEc2Configuration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "imageIdOverride":
            suggest = "image_id_override"
        elif key == "imageType":
            suggest = "image_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ComputeEnvironmentComputeResourcesEc2Configuration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ComputeEnvironmentComputeResourcesEc2Configuration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ComputeEnvironmentComputeResourcesEc2Configuration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 image_id_override: Optional[str] = None,
                 image_type: Optional[str] = None):
        """
        :param str image_id_override: The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the `image_id` argument in the `compute_resources` block.
        :param str image_type: The image type to match with the instance type to select an AMI. If the `image_id_override` parameter isn't specified, then a recent [Amazon ECS-optimized Amazon Linux 2 AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (`ECS_AL2`) is used.
        """
        if image_id_override is not None:
            pulumi.set(__self__, "image_id_override", image_id_override)
        if image_type is not None:
            pulumi.set(__self__, "image_type", image_type)

    @property
    @pulumi.getter(name="imageIdOverride")
    def image_id_override(self) -> Optional[str]:
        """
        The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the `image_id` argument in the `compute_resources` block.
        """
        return pulumi.get(self, "image_id_override")

    @property
    @pulumi.getter(name="imageType")
    def image_type(self) -> Optional[str]:
        """
        The image type to match with the instance type to select an AMI. If the `image_id_override` parameter isn't specified, then a recent [Amazon ECS-optimized Amazon Linux 2 AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (`ECS_AL2`) is used.
        """
        return pulumi.get(self, "image_type")


@pulumi.output_type
class ComputeEnvironmentComputeResourcesLaunchTemplate(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "launchTemplateId":
            suggest = "launch_template_id"
        elif key == "launchTemplateName":
            suggest = "launch_template_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ComputeEnvironmentComputeResourcesLaunchTemplate. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ComputeEnvironmentComputeResourcesLaunchTemplate.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ComputeEnvironmentComputeResourcesLaunchTemplate.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 launch_template_id: Optional[str] = None,
                 launch_template_name: Optional[str] = None,
                 version: Optional[str] = None):
        """
        :param str launch_template_id: ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
        :param str launch_template_name: Name of the launch template.
        :param str version: The version number of the launch template. Default: The default version of the launch template.
        """
        if launch_template_id is not None:
            pulumi.set(__self__, "launch_template_id", launch_template_id)
        if launch_template_name is not None:
            pulumi.set(__self__, "launch_template_name", launch_template_name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="launchTemplateId")
    def launch_template_id(self) -> Optional[str]:
        """
        ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
        """
        return pulumi.get(self, "launch_template_id")

    @property
    @pulumi.getter(name="launchTemplateName")
    def launch_template_name(self) -> Optional[str]:
        """
        Name of the launch template.
        """
        return pulumi.get(self, "launch_template_name")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        """
        The version number of the launch template. Default: The default version of the launch template.
        """
        return pulumi.get(self, "version")


@pulumi.output_type
class JobDefinitionRetryStrategy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "evaluateOnExits":
            suggest = "evaluate_on_exits"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in JobDefinitionRetryStrategy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        JobDefinitionRetryStrategy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        JobDefinitionRetryStrategy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 attempts: Optional[int] = None,
                 evaluate_on_exits: Optional[Sequence['outputs.JobDefinitionRetryStrategyEvaluateOnExit']] = None):
        """
        :param int attempts: The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
        :param Sequence['JobDefinitionRetryStrategyEvaluateOnExitArgs'] evaluate_on_exits: The evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
        """
        if attempts is not None:
            pulumi.set(__self__, "attempts", attempts)
        if evaluate_on_exits is not None:
            pulumi.set(__self__, "evaluate_on_exits", evaluate_on_exits)

    @property
    @pulumi.getter
    def attempts(self) -> Optional[int]:
        """
        The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
        """
        return pulumi.get(self, "attempts")

    @property
    @pulumi.getter(name="evaluateOnExits")
    def evaluate_on_exits(self) -> Optional[Sequence['outputs.JobDefinitionRetryStrategyEvaluateOnExit']]:
        """
        The evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
        """
        return pulumi.get(self, "evaluate_on_exits")


@pulumi.output_type
class JobDefinitionRetryStrategyEvaluateOnExit(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "onExitCode":
            suggest = "on_exit_code"
        elif key == "onReason":
            suggest = "on_reason"
        elif key == "onStatusReason":
            suggest = "on_status_reason"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in JobDefinitionRetryStrategyEvaluateOnExit. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        JobDefinitionRetryStrategyEvaluateOnExit.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        JobDefinitionRetryStrategyEvaluateOnExit.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 action: str,
                 on_exit_code: Optional[str] = None,
                 on_reason: Optional[str] = None,
                 on_status_reason: Optional[str] = None):
        """
        :param str action: Specifies the action to take if all of the specified conditions are met. The values are not case sensitive. Valid values: `RETRY`, `EXIT`.
        :param str on_exit_code: A glob pattern to match against the decimal representation of the exit code returned for a job.
        :param str on_reason: A glob pattern to match against the reason returned for a job.
        :param str on_status_reason: A glob pattern to match against the status reason returned for a job.
        """
        pulumi.set(__self__, "action", action)
        if on_exit_code is not None:
            pulumi.set(__self__, "on_exit_code", on_exit_code)
        if on_reason is not None:
            pulumi.set(__self__, "on_reason", on_reason)
        if on_status_reason is not None:
            pulumi.set(__self__, "on_status_reason", on_status_reason)

    @property
    @pulumi.getter
    def action(self) -> str:
        """
        Specifies the action to take if all of the specified conditions are met. The values are not case sensitive. Valid values: `RETRY`, `EXIT`.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="onExitCode")
    def on_exit_code(self) -> Optional[str]:
        """
        A glob pattern to match against the decimal representation of the exit code returned for a job.
        """
        return pulumi.get(self, "on_exit_code")

    @property
    @pulumi.getter(name="onReason")
    def on_reason(self) -> Optional[str]:
        """
        A glob pattern to match against the reason returned for a job.
        """
        return pulumi.get(self, "on_reason")

    @property
    @pulumi.getter(name="onStatusReason")
    def on_status_reason(self) -> Optional[str]:
        """
        A glob pattern to match against the status reason returned for a job.
        """
        return pulumi.get(self, "on_status_reason")


@pulumi.output_type
class JobDefinitionTimeout(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "attemptDurationSeconds":
            suggest = "attempt_duration_seconds"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in JobDefinitionTimeout. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        JobDefinitionTimeout.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        JobDefinitionTimeout.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 attempt_duration_seconds: Optional[int] = None):
        """
        :param int attempt_duration_seconds: The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
        """
        if attempt_duration_seconds is not None:
            pulumi.set(__self__, "attempt_duration_seconds", attempt_duration_seconds)

    @property
    @pulumi.getter(name="attemptDurationSeconds")
    def attempt_duration_seconds(self) -> Optional[int]:
        """
        The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
        """
        return pulumi.get(self, "attempt_duration_seconds")


@pulumi.output_type
class SchedulingPolicyFairSharePolicy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "computeReservation":
            suggest = "compute_reservation"
        elif key == "shareDecaySeconds":
            suggest = "share_decay_seconds"
        elif key == "shareDistributions":
            suggest = "share_distributions"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SchedulingPolicyFairSharePolicy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SchedulingPolicyFairSharePolicy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SchedulingPolicyFairSharePolicy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 compute_reservation: Optional[int] = None,
                 share_decay_seconds: Optional[int] = None,
                 share_distributions: Optional[Sequence['outputs.SchedulingPolicyFairSharePolicyShareDistribution']] = None):
        """
        :param int compute_reservation: A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
        :param Sequence['SchedulingPolicyFairSharePolicyShareDistributionArgs'] share_distributions: One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
        """
        if compute_reservation is not None:
            pulumi.set(__self__, "compute_reservation", compute_reservation)
        if share_decay_seconds is not None:
            pulumi.set(__self__, "share_decay_seconds", share_decay_seconds)
        if share_distributions is not None:
            pulumi.set(__self__, "share_distributions", share_distributions)

    @property
    @pulumi.getter(name="computeReservation")
    def compute_reservation(self) -> Optional[int]:
        """
        A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
        """
        return pulumi.get(self, "compute_reservation")

    @property
    @pulumi.getter(name="shareDecaySeconds")
    def share_decay_seconds(self) -> Optional[int]:
        return pulumi.get(self, "share_decay_seconds")

    @property
    @pulumi.getter(name="shareDistributions")
    def share_distributions(self) -> Optional[Sequence['outputs.SchedulingPolicyFairSharePolicyShareDistribution']]:
        """
        One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
        """
        return pulumi.get(self, "share_distributions")


@pulumi.output_type
class SchedulingPolicyFairSharePolicyShareDistribution(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "shareIdentifier":
            suggest = "share_identifier"
        elif key == "weightFactor":
            suggest = "weight_factor"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SchedulingPolicyFairSharePolicyShareDistribution. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SchedulingPolicyFairSharePolicyShareDistribution.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SchedulingPolicyFairSharePolicyShareDistribution.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 share_identifier: str,
                 weight_factor: Optional[float] = None):
        """
        :param str share_identifier: A fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        :param float weight_factor: The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        """
        pulumi.set(__self__, "share_identifier", share_identifier)
        if weight_factor is not None:
            pulumi.set(__self__, "weight_factor", weight_factor)

    @property
    @pulumi.getter(name="shareIdentifier")
    def share_identifier(self) -> str:
        """
        A fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        """
        return pulumi.get(self, "share_identifier")

    @property
    @pulumi.getter(name="weightFactor")
    def weight_factor(self) -> Optional[float]:
        """
        The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        """
        return pulumi.get(self, "weight_factor")


@pulumi.output_type
class GetJobQueueComputeEnvironmentOrderResult(dict):
    def __init__(__self__, *,
                 compute_environment: str,
                 order: int):
        pulumi.set(__self__, "compute_environment", compute_environment)
        pulumi.set(__self__, "order", order)

    @property
    @pulumi.getter(name="computeEnvironment")
    def compute_environment(self) -> str:
        return pulumi.get(self, "compute_environment")

    @property
    @pulumi.getter
    def order(self) -> int:
        return pulumi.get(self, "order")


@pulumi.output_type
class GetSchedulingPolicyFairSharePolicyResult(dict):
    def __init__(__self__, *,
                 compute_reservation: int,
                 share_decay_seconds: int,
                 share_distributions: Sequence['outputs.GetSchedulingPolicyFairSharePolicyShareDistributionResult']):
        """
        :param int compute_reservation: Value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
        :param Sequence['GetSchedulingPolicyFairSharePolicyShareDistributionArgs'] share_distributions: One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
        """
        pulumi.set(__self__, "compute_reservation", compute_reservation)
        pulumi.set(__self__, "share_decay_seconds", share_decay_seconds)
        pulumi.set(__self__, "share_distributions", share_distributions)

    @property
    @pulumi.getter(name="computeReservation")
    def compute_reservation(self) -> int:
        """
        Value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
        """
        return pulumi.get(self, "compute_reservation")

    @property
    @pulumi.getter(name="shareDecaySeconds")
    def share_decay_seconds(self) -> int:
        return pulumi.get(self, "share_decay_seconds")

    @property
    @pulumi.getter(name="shareDistributions")
    def share_distributions(self) -> Sequence['outputs.GetSchedulingPolicyFairSharePolicyShareDistributionResult']:
        """
        One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
        """
        return pulumi.get(self, "share_distributions")


@pulumi.output_type
class GetSchedulingPolicyFairSharePolicyShareDistributionResult(dict):
    def __init__(__self__, *,
                 share_identifier: str,
                 weight_factor: float):
        """
        :param str share_identifier: Fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        :param float weight_factor: Weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        """
        pulumi.set(__self__, "share_identifier", share_identifier)
        pulumi.set(__self__, "weight_factor", weight_factor)

    @property
    @pulumi.getter(name="shareIdentifier")
    def share_identifier(self) -> str:
        """
        Fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        """
        return pulumi.get(self, "share_identifier")

    @property
    @pulumi.getter(name="weightFactor")
    def weight_factor(self) -> float:
        """
        Weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
        """
        return pulumi.get(self, "weight_factor")


