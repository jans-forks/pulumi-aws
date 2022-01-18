// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Connect Lambda Function Association.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/connect"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := connect.LookupLambdaFunctionAssociation(ctx, &connect.LookupLambdaFunctionAssociationArgs{
// 			FunctionArn: "arn:aws:lambda:us-west-2:123456789123:function:abcdefg",
// 			InstanceId:  "aaaaaaaa-bbbb-cccc-dddd-111111111111",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupLambdaFunctionAssociation(ctx *pulumi.Context, args *LookupLambdaFunctionAssociationArgs, opts ...pulumi.InvokeOption) (*LookupLambdaFunctionAssociationResult, error) {
	var rv LookupLambdaFunctionAssociationResult
	err := ctx.Invoke("aws:connect/getLambdaFunctionAssociation:getLambdaFunctionAssociation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLambdaFunctionAssociation.
type LookupLambdaFunctionAssociationArgs struct {
	// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	FunctionArn string `pulumi:"functionArn"`
	// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
	InstanceId string `pulumi:"instanceId"`
}

// A collection of values returned by getLambdaFunctionAssociation.
type LookupLambdaFunctionAssociationResult struct {
	FunctionArn string `pulumi:"functionArn"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	InstanceId string `pulumi:"instanceId"`
}

func LookupLambdaFunctionAssociationOutput(ctx *pulumi.Context, args LookupLambdaFunctionAssociationOutputArgs, opts ...pulumi.InvokeOption) LookupLambdaFunctionAssociationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLambdaFunctionAssociationResult, error) {
			args := v.(LookupLambdaFunctionAssociationArgs)
			r, err := LookupLambdaFunctionAssociation(ctx, &args, opts...)
			return *r, err
		}).(LookupLambdaFunctionAssociationResultOutput)
}

// A collection of arguments for invoking getLambdaFunctionAssociation.
type LookupLambdaFunctionAssociationOutputArgs struct {
	// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	FunctionArn pulumi.StringInput `pulumi:"functionArn"`
	// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
}

func (LookupLambdaFunctionAssociationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLambdaFunctionAssociationArgs)(nil)).Elem()
}

// A collection of values returned by getLambdaFunctionAssociation.
type LookupLambdaFunctionAssociationResultOutput struct{ *pulumi.OutputState }

func (LookupLambdaFunctionAssociationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLambdaFunctionAssociationResult)(nil)).Elem()
}

func (o LookupLambdaFunctionAssociationResultOutput) ToLookupLambdaFunctionAssociationResultOutput() LookupLambdaFunctionAssociationResultOutput {
	return o
}

func (o LookupLambdaFunctionAssociationResultOutput) ToLookupLambdaFunctionAssociationResultOutputWithContext(ctx context.Context) LookupLambdaFunctionAssociationResultOutput {
	return o
}

func (o LookupLambdaFunctionAssociationResultOutput) FunctionArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLambdaFunctionAssociationResult) string { return v.FunctionArn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLambdaFunctionAssociationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLambdaFunctionAssociationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLambdaFunctionAssociationResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLambdaFunctionAssociationResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLambdaFunctionAssociationResultOutput{})
}