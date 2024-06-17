

# StatCalculationSettings

Settings to modify an individual statistic's calculation. See also [OA:17698](https://my.apps.factset.com/oa/pages/17698#risk) and [OA:16097](https://my.apps.factset.com/oa/pages/16097#cov2) for cov*2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useAbsoluteWeightsForLotExpansion** | **Boolean** | When this is set to true, use absolute value weights for multi-lot expansion, otherwise use the actual value weights. |  [optional]
**covarianceTimesTwo** | **Boolean** | When this is set to true, calculate covariance multiplied by two. |  [optional]
**covarianceTimesTwoTerm** | **Boolean** | When this is set to true, calculate covariance multiplied by two term (Cov*2 term). |  [optional]
**correlatedSpecificRisk** | **Boolean** | When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR. |  [optional]
**sparse** | **Boolean** | When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level. |  [optional]
**horizon** | **BigDecimal** | Horizon (in days) to use in Value at Risk (VaR) stat calculations. |  [optional]
**daysPerYear** | **BigDecimal** | Number of days per year (e.g. 250 or 365) to use in Value at Risk (VaR) stat calculations. |  [optional]
**confidenceLevel** | **BigDecimal** | Confidence level to use in Value at Risk (VaR) stat calculations. |  [optional]
**lamda** | **BigDecimal** | Lamda value to use in Implied Alpha Lamda stat calculations. |  [optional]
**specificToFactorRatio** | **BigDecimal** | Specific risk to factor risk ratio value to use in Implied Alpha stat calculations. |  [optional]
**rapSys** | **BigDecimal** | Systematic RAP value to use in Implied Alpha RAP stat calculations. |  [optional]
**rapUnsys** | **BigDecimal** | Unsystematic RAP value to use in Implied Alpha RAP stat calculations. |  [optional]


## Implemented Interfaces

* Serializable


