

# StatCalculationSettings

Settings to modify an individual statistic's calculation. See also [OA:17698](https://my.apps.factset.com/oa/pages/17698#risk) and [OA:16097](https://my.apps.factset.com/oa/pages/16097#cov2) for cov*2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useAbsoluteWeightsForLotExpansion** | **Boolean** |  |  [optional]
**covarianceTimesTwo** | **Boolean** |  |  [optional]
**covarianceTimesTwoTerm** | **Boolean** |  |  [optional]
**correlatedSpecificRisk** | **Boolean** | When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR. |  [optional]
**sparse** | **Boolean** | When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level. |  [optional]
**horizon** | **BigDecimal** |  |  [optional]
**daysPerYear** | **BigDecimal** |  |  [optional]
**confidenceLevel** | **BigDecimal** |  |  [optional]
**lamda** | **BigDecimal** |  |  [optional]
**specificToFactorRatio** | **BigDecimal** |  |  [optional]
**rapSys** | **BigDecimal** |  |  [optional]
**rapUnsys** | **BigDecimal** |  |  [optional]


## Implemented Interfaces

* Serializable


