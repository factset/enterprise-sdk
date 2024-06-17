# openrisk.StatCalculationSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useAbsoluteWeightsForLotExpansion** | **Boolean** | When this is set to true, use absolute value weights for multi-lot expansion, otherwise use the actual value weights. | [optional] [default to true]
**covarianceTimesTwo** | **Boolean** | When this is set to true, calculate covariance multiplied by two. | [optional] [default to false]
**covarianceTimesTwoTerm** | **Boolean** | When this is set to true, calculate covariance multiplied by two term (Cov*2 term). | [optional] [default to false]
**correlatedSpecificRisk** | **Boolean** | When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR. | [optional] [default to false]
**sparse** | **Boolean** | When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level. | [optional] [default to false]
**horizon** | **Number** | Horizon (in days) to use in Value at Risk (VaR) stat calculations. | [optional] 
**daysPerYear** | **Number** | Number of days per year (e.g. 250 or 365) to use in Value at Risk (VaR) stat calculations. | [optional] 
**confidenceLevel** | **Number** | Confidence level to use in Value at Risk (VaR) stat calculations. | [optional] 
**lamda** | **Number** | Lamda value to use in Implied Alpha Lamda stat calculations. | [optional] 
**specificToFactorRatio** | **Number** | Specific risk to factor risk ratio value to use in Implied Alpha stat calculations. | [optional] 
**rapSys** | **Number** | Systematic RAP value to use in Implied Alpha RAP stat calculations. | [optional] 
**rapUnsys** | **Number** | Unsystematic RAP value to use in Implied Alpha RAP stat calculations. | [optional] 


