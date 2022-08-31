# FactSet.SDK.OpenRisk.Model.StatCalculationSettings
Settings to modify an individual statistic's calculation. See also [OA:17698](https://my.apps.factset.com/oa/pages/17698#risk) and [OA:16097](https://my.apps.factset.com/oa/pages/16097#cov2) for cov*2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UseAbsoluteWeightsForLotExpansion** | **bool** |  | [optional] [default to true]
**CovarianceTimesTwo** | **bool** |  | [optional] [default to false]
**CovarianceTimesTwoTerm** | **bool** |  | [optional] [default to false]
**CorrelatedSpecificRisk** | **bool** | When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR. | [optional] [default to false]
**Sparse** | **bool** | When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level. | [optional] [default to false]
**Horizon** | **decimal** |  | [optional] 
**DaysPerYear** | **decimal** |  | [optional] 
**ConfidenceLevel** | **decimal** |  | [optional] 
**Lamda** | **decimal** |  | [optional] 
**SpecificToFactorRatio** | **decimal** |  | [optional] 
**RapSys** | **decimal** |  | [optional] 
**RapUnsys** | **decimal** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

