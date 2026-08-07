

# Metric

Definition and metadata for a single available metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** | Metric code identifier |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Primary category of the metric |  [optional]
**subcategory** | [**SubcategoryEnum**](#SubcategoryEnum) | Sub-category classification |  [optional]
**dataType** | [**DataTypeEnum**](#DataTypeEnum) | Data type of metric values |  [optional]
**description** | **String** | Detailed description of the metric |  [optional]
**oaPageId** | **String** | Online Assistant page ID for methodology |  [optional]
**oaUrl** | **String** | Online Assistant URL for methodology |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
FINANCIALS | &quot;FINANCIALS&quot;
FILINGS | &quot;FILINGS&quot;
PERFORMANCE | &quot;PERFORMANCE&quot;
EXPOSURE | &quot;EXPOSURE&quot;



## Enum: SubcategoryEnum

Name | Value
---- | -----
US | &quot;US&quot;
CANADA | &quot;CANADA&quot;
AUSTRALIA | &quot;AUSTRALIA&quot;
CREDIT_UNION | &quot;CREDIT_UNION&quot;
INDUSTRY | &quot;INDUSTRY&quot;
SPECIALTY_FINANCE | &quot;SPECIALTY_FINANCE&quot;
TEN_D | &quot;TEN_D&quot;
UBPR | &quot;UBPR&quot;
COUNTRY | &quot;COUNTRY&quot;



## Enum: DataTypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
NUMBER | &quot;number&quot;
DATE | &quot;date&quot;
BOOLEAN | &quot;boolean&quot;


## Implemented Interfaces

* Serializable


