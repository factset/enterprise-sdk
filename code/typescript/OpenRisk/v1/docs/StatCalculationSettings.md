# openrisk.StatCalculationSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useAbsoluteWeightsForLotExpansion** | **Boolean** |  | [optional] [default to true]
**covarianceTimesTwo** | **Boolean** |  | [optional] [default to false]
**covarianceTimesTwoTerm** | **Boolean** |  | [optional] [default to false]
**correlatedSpecificRisk** | **Boolean** | When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR. | [optional] [default to false]
**sparse** | **Boolean** | When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level. | [optional] [default to false]
**horizon** | **Number** |  | [optional] 
**daysPerYear** | **Number** |  | [optional] 
**confidenceLevel** | **Number** |  | [optional] 
**lamda** | **Number** |  | [optional] 
**specificToFactorRatio** | **Number** |  | [optional] 
**rapSys** | **Number** |  | [optional] 
**rapUnsys** | **Number** |  | [optional] 


