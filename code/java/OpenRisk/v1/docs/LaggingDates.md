

# LaggingDates

Risk model lagging dates for data items to fetch and use. This field can be utilized to isolate each data item's impact on risk calculation. A typical use case is to analyze the risk change from one day to the other by fixing the risk model data date to one date while moving the portfolio holdings data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exposureDate** | [**ExposureDateFormatConvention**](ExposureDateFormatConvention.md) |  |  [optional]
**covarianceDate** | [**CovarianceDateFormatConvention**](CovarianceDateFormatConvention.md) |  |  [optional]
**ssrDateIs** | [**SsrDateIsEnum**](#SsrDateIsEnum) | Stock specific risk (SSR) date can take one of the other lagging dates |  [optional]



## Enum: SsrDateIsEnum

Name | Value
---- | -----
EXPOSUREDATE | &quot;ExposureDate&quot;
COVARIANCEDATE | &quot;CovarianceDate&quot;


## Implemented Interfaces

* Serializable


