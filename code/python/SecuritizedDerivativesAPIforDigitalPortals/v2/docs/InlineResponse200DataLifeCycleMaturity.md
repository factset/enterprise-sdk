# InlineResponse200DataLifeCycleMaturity

Maturity data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **date** | Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual. | [optional] 
**is_perpetual** | **bool** | If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null. | [optional] 
**is_callable** | **bool** | If true, the issuer may redeem the instrument prior to maturity. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


