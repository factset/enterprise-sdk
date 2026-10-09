

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
**subsidiary** | **Boolean** | Whether this metric requires a subsidiary entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct subsidiary identifier if true.  |  [optional]
**holding** | **Boolean** | Whether this metric requires a holding company (parent) entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct holding company identifier if true.  |  [optional]



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
TEN_D_AUTO_LOAN | &quot;TEN_D_AUTO_LOAN&quot;
TEN_D_CREDIT_CARD | &quot;TEN_D_CREDIT_CARD&quot;
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


