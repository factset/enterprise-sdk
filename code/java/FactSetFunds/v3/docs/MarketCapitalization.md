

# MarketCapitalization

Market capitalization breakdown showing portfolio allocation across large, mid, small, and micro-cap holdings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**analyticsType** | **MarketCapitalizationType** |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**largeCapPercent** | **Double** | Percentage of the aggregate that is composed of large-cap holdings. Large cap is defined as having a company market value greater than 12.9 billion USD |  [optional]
**midCapPercent** | **Double** | Percentage of the aggregate that is composed of Mid-cap holdings. Mid cap is defined as having a company market value greater than 2.7 billion USD but less than 12.9 billion USD. |  [optional]
**smallCapPercent** | **Double** | Percentage of the aggregate that is composed of Small-cap holdings. Small cap is defined as having a company market value greater than 600 million USD but less than 2.7 billion USD |  [optional]
**microCapPercent** | **Double** | Percentage of the aggregate that is composed of Micro-cap holdings. Micro cap is defined as having a company market value less than 600 million USD. |  [optional]


## Implemented Interfaces

* Serializable


