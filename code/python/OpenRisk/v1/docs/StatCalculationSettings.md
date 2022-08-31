# StatCalculationSettings

Settings to modify an individual statistic's calculation. See also [OA:17698](https://my.apps.factset.com/oa/pages/17698#risk) and [OA:16097](https://my.apps.factset.com/oa/pages/16097#cov2) for cov*2.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**use_absolute_weights_for_lot_expansion** | **bool** |  | [optional]  if omitted the server will use the default value of True
**covariance_times_two** | **bool** |  | [optional]  if omitted the server will use the default value of False
**covariance_times_two_term** | **bool** |  | [optional]  if omitted the server will use the default value of False
**correlated_specific_risk** | **bool** | When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR. | [optional]  if omitted the server will use the default value of False
**sparse** | **bool** | When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level. | [optional]  if omitted the server will use the default value of False
**horizon** | **float** |  | [optional] 
**days_per_year** | **float** |  | [optional] 
**confidence_level** | **float** |  | [optional] 
**lamda** | **float** |  | [optional] 
**specific_to_factor_ratio** | **float** |  | [optional] 
**rap_sys** | **float** |  | [optional] 
**rap_unsys** | **float** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


