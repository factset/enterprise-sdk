# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse200DataLifeCycleMaturity
Maturity data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **DateTime** | Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual. | [optional] 
**IsPerpetual** | **bool** | If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null. | [optional] 
**IsCallable** | **bool** | If true, the issuer may redeem the instrument prior to maturity. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

